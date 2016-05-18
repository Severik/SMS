package ua.gotsman.sms;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * Информация о клиенте и услуге, исходя из сформированного коммерческого предложения 1С.
 */
class Info {

    private String firstName;              //Имя клиента
    private String lastName;               //Фамилия клиента
    private String phoneNumber;            //Телефонный номер
    private String proposal;               //Коммерческое предложение номер и дата
    private ArrayList<String> service;     //Список с наименованиями услуг
    private ArrayList<Double> amount;      //Список с количеством услуг
    private ArrayList<Double> price;       //Список с общими ценами за услуги
    private double total;                  //Общая сумма

    String getFirstName() {
        return firstName;
    }

    private void setFirstName(Cell cell) {
        String[] temp = cell.getContents().split(" ");
        firstName = temp[1];
    }

    String getLastName() {
        return lastName;
    }

    private void setLastName(Cell cell) {
        String[] temp = cell.getContents().split(" ");
        lastName = temp[0];
    }

    String getPhoneNumber() {
        return phoneNumber;
    }

    private void setPhoneNumber(Cell cell) {
        phoneNumber = cell.getContents().substring(5, 15);
    }

    String getProposal() {
        return proposal;
    }

    private void setProposal(Cell cell) {
        proposal = cell.getContents().trim();
    }

    ArrayList<String> getService() {
        return service;
    }

    private void setService(ArrayList<String> service, Cell cell) {
        this.service = service;
        service.add(cell.getContents().trim());
    }

    ArrayList<Double> getAmount() {
        return amount;
    }

    private void setAmount(ArrayList<Double> amount, Cell cell) {
        this.amount = amount;
        amount.add(Double.valueOf(cell.getContents().replaceAll(",", ".")));
    }

    private ArrayList<Double> getPrice() {
        return price;
    }

    private void setPrice(ArrayList<Double> price, Cell cell) {
        this.price = price;
        price.add(Double.valueOf(cell.getContents().replaceAll(",", ".")));
    }

    double getTotal() {
        for (Double d : getPrice()) {
            total += d;
        }
        return total;
    }

    void loadFromXls(InputStream inputStream) throws IOException, BiffException {
        Workbook workbook = Workbook.getWorkbook(inputStream);
        Sheet sheet = workbook.getSheet(0);
        setFirstName(sheet.getCell(2, 1));
        setLastName(sheet.getCell(2, 1));
        setPhoneNumber(sheet.getCell(2, 2));
        setProposal(sheet.getCell(1, 4));
        service = new ArrayList<>();
        amount = new ArrayList<>();
        price = new ArrayList<>();
        Cell[] cells = sheet.getColumn(0);
        for (Cell c : cells) {
            if (c.getContents().matches("\\d+")) {
                setService(service, sheet.getCell(2, c.getRow()));
                setAmount(amount, sheet.getCell(6, c.getRow()));
                setPrice(price, sheet.getCell(8, c.getRow()));
            }
        }
    }
}
