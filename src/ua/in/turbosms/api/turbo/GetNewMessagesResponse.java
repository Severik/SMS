import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetNewMessagesResult" type="{http://turbosms.in.ua/api/Turbo}ArrayOfString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getNewMessagesResult"
})
@XmlRootElement(name = "GetNewMessagesResponse")
public class GetNewMessagesResponse {

    @XmlElement(name = "GetNewMessagesResult")
    protected ArrayOfString getNewMessagesResult;

    /**
     * Gets the value of the getNewMessagesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getGetNewMessagesResult() {
        return getNewMessagesResult;
    }

    /**
     * Sets the value of the getNewMessagesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setGetNewMessagesResult(ArrayOfString value) {
        this.getNewMessagesResult = value;
    }

}
