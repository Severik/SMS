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
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="all" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="query" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "phone",
        "id",
        "all",
        "query"
})
@XmlRootElement(name = "status2")
public class Status2 {

    @XmlElement(required = true)
    protected String login;
    @XmlElement(required = true)
    protected String psw;
    @XmlElement(required = true)
    protected String phone;
    @XmlElement(required = true)
    protected String id;
    protected String all;
    @XmlElement(required = true)
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
     * Gets the value of the all property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAll() {
        return all;
    }

    /**
     * Sets the value of the all property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAll(String value) {
        this.all = value;
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
