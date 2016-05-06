package ua.smsc.sys.soap;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="login" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="psw" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="phones" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="query" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "login",
        "psw",
        "phones",
        "mes",
        "id",
        "sender",
        "time",
        "query"
})
@XmlRootElement(name = "send2")
public class Send2 {

    @XmlElement(required = true)
    protected String login;
    @XmlElement(required = true)
    protected String psw;
    @XmlElement(required = true)
    protected String phones;
    @XmlElement(required = true)
    protected String mes;
    protected String id;
    protected String sender;
    protected String time;
    protected String query;

    /**
     * Gets the value of the login property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLogin() {
        return login;
    }

    /**
     * Sets the value of the login property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLogin(String value) {
        this.login = value;
    }

    /**
     * Gets the value of the psw property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPsw() {
        return psw;
    }

    /**
     * Sets the value of the psw property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPsw(String value) {
        this.psw = value;
    }

    /**
     * Gets the value of the phones property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPhones() {
        return phones;
    }

    /**
     * Sets the value of the phones property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPhones(String value) {
        this.phones = value;
    }

    /**
     * Gets the value of the mes property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMes() {
        return mes;
    }

    /**
     * Sets the value of the mes property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMes(String value) {
        this.mes = value;
    }

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
     * Gets the value of the sender property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSender(String value) {
        this.sender = value;
    }

    /**
     * Gets the value of the time property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTime(String value) {
        this.time = value;
    }

    /**
     * Gets the value of the query property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setQuery(String value) {
        this.query = value;
    }

}
