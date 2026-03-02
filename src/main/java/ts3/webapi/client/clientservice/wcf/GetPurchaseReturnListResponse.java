
package ts3.webapi.client.clientservice.wcf;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetPurchaseReturnListResult;


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
 *         <element name="GetPurchaseReturnListResult" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetPurchaseReturnList}GetPurchaseReturnListResult" minOccurs="0"/>
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
    "getPurchaseReturnListResult"
})
@XmlRootElement(name = "GetPurchaseReturnListResponse")
public class GetPurchaseReturnListResponse {

    @XmlElementRef(name = "GetPurchaseReturnListResult", namespace = "Wcf.ClientService.Client.WebAPI.TS3", type = JAXBElement.class, required = false)
    protected JAXBElement<GetPurchaseReturnListResult> getPurchaseReturnListResult;

    /**
     * Gets the value of the getPurchaseReturnListResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GetPurchaseReturnListResult }{@code >}
     *     
     */
    public JAXBElement<GetPurchaseReturnListResult> getGetPurchaseReturnListResult() {
        return getPurchaseReturnListResult;
    }

    /**
     * Sets the value of the getPurchaseReturnListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GetPurchaseReturnListResult }{@code >}
     *     
     */
    public void setGetPurchaseReturnListResult(JAXBElement<GetPurchaseReturnListResult> value) {
        this.getPurchaseReturnListResult = value;
    }

}
