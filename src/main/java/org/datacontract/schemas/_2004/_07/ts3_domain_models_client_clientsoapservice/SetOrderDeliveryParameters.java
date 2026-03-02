
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SetOrderDeliveryParameters complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SetOrderDeliveryParameters">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SetOrderDeliveryPeriodList" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SetOrderDelivery}ArrayOfSetOrderDeliveryPeriodContainer" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetOrderDeliveryParameters", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SetOrderDelivery", propOrder = {
    "setOrderDeliveryPeriodList"
})
public class SetOrderDeliveryParameters {

    @XmlElementRef(name = "SetOrderDeliveryPeriodList", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SetOrderDelivery", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSetOrderDeliveryPeriodContainer> setOrderDeliveryPeriodList;

    /**
     * Gets the value of the setOrderDeliveryPeriodList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSetOrderDeliveryPeriodContainer }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSetOrderDeliveryPeriodContainer> getSetOrderDeliveryPeriodList() {
        return setOrderDeliveryPeriodList;
    }

    /**
     * Sets the value of the setOrderDeliveryPeriodList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSetOrderDeliveryPeriodContainer }{@code >}
     *     
     */
    public void setSetOrderDeliveryPeriodList(JAXBElement<ArrayOfSetOrderDeliveryPeriodContainer> value) {
        this.setOrderDeliveryPeriodList = value;
    }

}
