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
 *         &lt;element name="sendresult" type="{http://smsc.ua/sys/soap.php}Send2ResponseType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "sendresult"
})
@XmlRootElement(name = "Send2Response")
public class Send2Response {

    @XmlElement(required = true)
    protected Send2ResponseType sendresult;

    /**
     * Gets the value of the sendresult property.
     *
     * @return possible object is
     * {@link Send2ResponseType }
     */
    public Send2ResponseType getSendresult() {
        return sendresult;
    }

    /**
     * Sets the value of the sendresult property.
     *
     * @param value allowed object is
     *              {@link Send2ResponseType }
     */
    public void setSendresult(Send2ResponseType value) {
        this.sendresult = value;
    }

}
