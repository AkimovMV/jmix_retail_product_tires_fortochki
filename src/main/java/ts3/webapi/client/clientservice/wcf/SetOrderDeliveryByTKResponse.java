
package ts3.webapi.client.clientservice.wcf;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.SetOrderDeliveryByTKResult;


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
 *         <element name="SetOrderDeliveryByTKResult" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SetOrderDeliveryByTK}SetOrderDeliveryByTKResult" minOccurs="0"/>
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
    "setOrderDeliveryByTKResult"
})
@XmlRootElement(name = "SetOrderDeliveryByTKResponse")
public class SetOrderDeliveryByTKResponse {

    @XmlElementRef(name = "SetOrderDeliveryByTKResult", namespace = "Wcf.ClientService.Client.WebAPI.TS3", type = JAXBElement.class, required = false)
    protected JAXBElement<SetOrderDeliveryByTKResult> setOrderDeliveryByTKResult;

    /**
     * Gets the value of the setOrderDeliveryByTKResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SetOrderDeliveryByTKResult }{@code >}
     *     
     */
    public JAXBElement<SetOrderDeliveryByTKResult> getSetOrderDeliveryByTKResult() {
        return setOrderDeliveryByTKResult;
    }

    /**
     * Sets the value of the setOrderDeliveryByTKResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SetOrderDeliveryByTKResult }{@code >}
     *     
     */
    public void setSetOrderDeliveryByTKResult(JAXBElement<SetOrderDeliveryByTKResult> value) {
        this.setOrderDeliveryByTKResult = value;
    }

}
