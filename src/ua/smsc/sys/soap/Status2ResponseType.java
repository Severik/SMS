package ua.smsc.sys.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Status2ResponseType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="Status2ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="last_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="last_timestamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="err" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="send_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="send_timestamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sender_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Status2ResponseType", propOrder = {
        "status",
        "lastDate",
        "lastTimestamp",
        "err",
        "error",
        "sendDate",
        "sendTimestamp",
        "phone",
        "cost",
        "senderId",
        "statusName",
        "message",
        "operator",
        "region"
})
public class Status2ResponseType {

    protected String status;
    @XmlElement(name = "last_date")
    protected String lastDate;
    @XmlElement(name = "last_timestamp")
    protected String lastTimestamp;
    protected String err;
    protected String error;
    @XmlElement(name = "send_date")
    protected String sendDate;
    @XmlElement(name = "send_timestamp")
    protected String sendTimestamp;
    protected String phone;
    protected String cost;
    @XmlElement(name = "sender_id")
    protected String senderId;
    @XmlElement(name = "status_name")
    protected String statusName;
    protected String message;
    protected String operator;
    protected String region;

    /**
     * Gets the value of the status property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the lastDate property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLastDate() {
        return lastDate;
    }

    /**
     * Sets the value of the lastDate property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLastDate(String value) {
        this.lastDate = value;
    }

    /**
     * Gets the value of the lastTimestamp property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLastTimestamp() {
        return lastTimestamp;
    }

    /**
     * Sets the value of the lastTimestamp property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLastTimestamp(String value) {
        this.lastTimestamp = value;
    }

    /**
     * Gets the value of the err property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getErr() {
        return err;
    }

    /**
     * Sets the value of the err property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setErr(String value) {
        this.err = value;
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

    /**
     * Gets the value of the sendDate property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSendDate() {
        return sendDate;
    }

    /**
     * Sets the value of the sendDate property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSendDate(String value) {
        this.sendDate = value;
    }

    /**
     * Gets the value of the sendTimestamp property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSendTimestamp() {
        return sendTimestamp;
    }

    /**
     * Sets the value of the sendTimestamp property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSendTimestamp(String value) {
        this.sendTimestamp = value;
    }

    /**
     * Gets the value of the phone property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPhone(String value) {
        this.phone = value;
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
     * Gets the value of the senderId property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSenderId() {
        return senderId;
    }

    /**
     * Sets the value of the senderId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSenderId(String value) {
        this.senderId = value;
    }

    /**
     * Gets the value of the statusName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getStatusName() {
        return statusName;
    }

    /**
     * Sets the value of the statusName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStatusName(String value) {
        this.statusName = value;
    }

    /**
     * Gets the value of the message property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the operator property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOperator(String value) {
        this.operator = value;
    }

    /**
     * Gets the value of the region property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRegion(String value) {
        this.region = value;
    }

}
