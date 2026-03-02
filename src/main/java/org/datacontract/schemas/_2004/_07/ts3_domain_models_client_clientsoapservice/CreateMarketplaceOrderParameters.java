
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateMarketplaceOrderParameters complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CreateMarketplaceOrderParameters">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="contact" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.CreateMarketplaceOrder}CreateMarketplaceOrderContactParameters" minOccurs="0"/>
 *         <element name="delivery" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.CreateMarketplaceOrder}CreateMarketplaceOrderDeliveryParameters" minOccurs="0"/>
 *         <element name="items" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.CreateMarketplaceOrder}ArrayOfCreateMarketplaceOrderItem" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateMarketplaceOrderParameters", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.CreateMarketplaceOrder", propOrder = {
    "contact",
    "delivery",
    "items"
})
public class CreateMarketplaceOrderParameters {

    @XmlElementRef(name = "contact", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.CreateMarketplaceOrder", type = JAXBElement.class, required = false)
    protected JAXBElement<CreateMarketplaceOrderContactParameters> contact;
    @XmlElementRef(name = "delivery", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.CreateMarketplaceOrder", type = JAXBElement.class, required = false)
    protected JAXBElement<CreateMarketplaceOrderDeliveryParameters> delivery;
    @XmlElementRef(name = "items", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.CreateMarketplaceOrder", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCreateMarketplaceOrderItem> items;

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreateMarketplaceOrderContactParameters }{@code >}
     *     
     */
    public JAXBElement<CreateMarketplaceOrderContactParameters> getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreateMarketplaceOrderContactParameters }{@code >}
     *     
     */
    public void setContact(JAXBElement<CreateMarketplaceOrderContactParameters> value) {
        this.contact = value;
    }

    /**
     * Gets the value of the delivery property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreateMarketplaceOrderDeliveryParameters }{@code >}
     *     
     */
    public JAXBElement<CreateMarketplaceOrderDeliveryParameters> getDelivery() {
        return delivery;
    }

    /**
     * Sets the value of the delivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreateMarketplaceOrderDeliveryParameters }{@code >}
     *     
     */
    public void setDelivery(JAXBElement<CreateMarketplaceOrderDeliveryParameters> value) {
        this.delivery = value;
    }

    /**
     * Gets the value of the items property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCreateMarketplaceOrderItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCreateMarketplaceOrderItem> getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCreateMarketplaceOrderItem }{@code >}
     *     
     */
    public void setItems(JAXBElement<ArrayOfCreateMarketplaceOrderItem> value) {
        this.items = value;
    }

}
