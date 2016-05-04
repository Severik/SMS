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
 *         &lt;element name="costresult" type="{http://smsc.ua/sys/soap.php}Cost2ResponseType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "costresult"
})
@XmlRootElement(name = "Cost2Response")
public class Cost2Response {

    @XmlElement(required = true)
    protected Cost2ResponseType costresult;

    /**
     * Gets the value of the costresult property.
     *
     * @return possible object is
     * {@link Cost2ResponseType }
     */
    public Cost2ResponseType getCostresult() {
        return costresult;
    }

    /**
     * Sets the value of the costresult property.
     *
     * @param value allowed object is
     *              {@link Cost2ResponseType }
     */
    public void setCostresult(Cost2ResponseType value) {
        this.costresult = value;
    }

}
