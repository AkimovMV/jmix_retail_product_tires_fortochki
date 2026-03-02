
package ts3.webapi.client.clientservice.wcf;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetDeliveryPeriodResult;


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
 *         <element name="GetDeliveryPeriodResult" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetDeliveryPeriod}GetDeliveryPeriodResult" minOccurs="0"/>
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
    "getDeliveryPeriodResult"
})
@XmlRootElement(name = "GetDeliveryPeriodResponse")
public class GetDeliveryPeriodResponse {

    @XmlElementRef(name = "GetDeliveryPeriodResult", namespace = "Wcf.ClientService.Client.WebAPI.TS3", type = JAXBElement.class, required = false)
    protected JAXBElement<GetDeliveryPeriodResult> getDeliveryPeriodResult;

    /**
     * Gets the value of the getDeliveryPeriodResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GetDeliveryPeriodResult }{@code >}
     *     
     */
    public JAXBElement<GetDeliveryPeriodResult> getGetDeliveryPeriodResult() {
        return getDeliveryPeriodResult;
    }

    /**
     * Sets the value of the getDeliveryPeriodResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GetDeliveryPeriodResult }{@code >}
     *     
     */
    public void setGetDeliveryPeriodResult(JAXBElement<GetDeliveryPeriodResult> value) {
        this.getDeliveryPeriodResult = value;
    }

}
