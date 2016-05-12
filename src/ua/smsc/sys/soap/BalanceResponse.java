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
 *         &lt;element name="balanceresult" type="{http://smsc.ua/sys/soap.php}BalanceResponseType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "balanceresult"
})
@XmlRootElement(name = "BalanceResponse")
public class BalanceResponse {

    @XmlElement(required = true)
    protected BalanceResponseType balanceresult;

    /**
     * Gets the value of the balanceresult property.
     *
     * @return possible object is
     * {@link BalanceResponseType }
     */
    public BalanceResponseType getBalanceresult() {
        return balanceresult;
    }

    /**
     * Sets the value of the balanceresult property.
     *
     * @param value allowed object is
     *              {@link BalanceResponseType }
     */
    public void setBalanceresult(BalanceResponseType value) {
        this.balanceresult = value;
    }

}
