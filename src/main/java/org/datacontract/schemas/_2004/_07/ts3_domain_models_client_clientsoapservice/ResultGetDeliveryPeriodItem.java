
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Result.GetDeliveryPeriodItem complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Result.GetDeliveryPeriodItem">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="GetDeliveryPeriodContainer" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetDeliveryPeriod}ArrayOfResult.PeriodContainer" minOccurs="0"/>
 *         <element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Result.GetDeliveryPeriodItem", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetDeliveryPeriod", propOrder = {
    "getDeliveryPeriodContainer",
    "message"
})
public class ResultGetDeliveryPeriodItem {

    @XmlElementRef(name = "GetDeliveryPeriodContainer", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetDeliveryPeriod", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfResultPeriodContainer> getDeliveryPeriodContainer;
    @XmlElementRef(name = "Message", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetDeliveryPeriod", type = JAXBElement.class, required = false)
    protected JAXBElement<String> message;

    /**
     * Gets the value of the getDeliveryPeriodContainer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfResultPeriodContainer }{@code >}
     *     
     */
    public JAXBElement<ArrayOfResultPeriodContainer> getGetDeliveryPeriodContainer() {
        return getDeliveryPeriodContainer;
    }

    /**
     * Sets the value of the getDeliveryPeriodContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfResultPeriodContainer }{@code >}
     *     
     */
    public void setGetDeliveryPeriodContainer(JAXBElement<ArrayOfResultPeriodContainer> value) {
        this.getDeliveryPeriodContainer = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMessage(JAXBElement<String> value) {
        this.message = value;
    }

}
