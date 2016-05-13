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
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "login",
        "psw"
})
@XmlRootElement(name = "balance")
public class Balance {

    @XmlElement(required = true)
    protected String login;
    @XmlElement(required = true)
    protected String psw;

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

}
