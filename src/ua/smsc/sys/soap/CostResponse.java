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
 *         &lt;element name="costresult" type="{http://smsc.ua/sys/soap.php}CostResponseType"/>
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
@XmlRootElement(name = "CostResponse")
public class CostResponse {

    @XmlElement(required = true)
    protected CostResponseType costresult;

    /**
     * Gets the value of the costresult property.
     *
     * @return possible object is
     * {@link CostResponseType }
     */
    public CostResponseType getCostresult() {
        return costresult;
    }

    /**
     * Sets the value of the costresult property.
     *
     * @param value allowed object is
     *              {@link CostResponseType }
     */
    public void setCostresult(CostResponseType value) {
        this.costresult = value;
    }

}
