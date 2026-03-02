
package ts3.webapi.client.clientservice.wcf;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.ArrayOfGetOrderStatusResult;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="GetOrderStatusResult" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderStatus}ArrayOfGetOrderStatusResult" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getOrderStatusResult"
})
@XmlRootElement(name = "GetOrderStatusResponse")
public class GetOrderStatusResponse {

    @XmlElementRef(name = "GetOrderStatusResult", namespace = "Wcf.ClientService.Client.WebAPI.TS3", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGetOrderStatusResult> getOrderStatusResult;

    /**
     * Gets the value of the getOrderStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGetOrderStatusResult }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGetOrderStatusResult> getGetOrderStatusResult() {
        return getOrderStatusResult;
    }

    /**
     * Sets the value of the getOrderStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGetOrderStatusResult }{@code >}
     *     
     */
    public void setGetOrderStatusResult(JAXBElement<ArrayOfGetOrderStatusResult> value) {
        this.getOrderStatusResult = value;
    }

}
