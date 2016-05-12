package ua.smsc.sys.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Cost2ResponseType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="Cost2ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
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
@XmlType(name = "Cost2ResponseType", propOrder = {
        "cost",
        "cnt",
        "error"
})
public class Cost2ResponseType {

    protected String cost;
    protected String cnt;
    protected String error;

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
