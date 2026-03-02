
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ts3_domain_models_client.ClientServiceResult;


/**
 * <p>Java class for GetDeliveryPeriodResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GetDeliveryPeriodResult">
 *   <complexContent>
 *     <extension base="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService}ClientServiceResult">
 *       <sequence>
 *         <element name="GetDeliveryPeriodItems" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetDeliveryPeriod}ArrayOfResult.GetDeliveryPeriodItem" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDeliveryPeriodResult", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetDeliveryPeriod", propOrder = {
    "getDeliveryPeriodItems"
})
public class GetDeliveryPeriodResult
    extends ClientServiceResult
{

    @XmlElementRef(name = "GetDeliveryPeriodItems", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetDeliveryPeriod", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfResultGetDeliveryPeriodItem> getDeliveryPeriodItems;

    /**
     * Gets the value of the getDeliveryPeriodItems property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfResultGetDeliveryPeriodItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfResultGetDeliveryPeriodItem> getGetDeliveryPeriodItems() {
        return getDeliveryPeriodItems;
    }

    /**
     * Sets the value of the getDeliveryPeriodItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfResultGetDeliveryPeriodItem }{@code >}
     *     
     */
    public void setGetDeliveryPeriodItems(JAXBElement<ArrayOfResultGetDeliveryPeriodItem> value) {
        this.getDeliveryPeriodItems = value;
    }

}
