package ua.smsc.sys.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SendResponseType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="SendResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="balance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cnt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendResponseType", propOrder = {
        "id",
        "balance",
        "cost",
        "cnt",
        "error"
})
public class SendResponseType {

    protected String id;
    protected String balance;
    protected String cost;
    protected String cnt;
    protected String error;

    /**
     * Gets the value of the id property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the balance property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBalance(String value) {
        this.balance = value;
    }

    /**
     * Gets the value of the cost property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCost() {
        return cost;
    }

    /**
     * Sets the value of the cost property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCost(String value) {
        this.cost = value;
    }

    /**
     * Gets the value of the cnt property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCnt() {
        return cnt;
    }

    /**
     * Sets the value of the cnt property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCnt(String value) {
        this.cnt = value;
    }

    /**
     * Gets the value of the error property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setError(String value) {
        this.error = value;
    }

}
