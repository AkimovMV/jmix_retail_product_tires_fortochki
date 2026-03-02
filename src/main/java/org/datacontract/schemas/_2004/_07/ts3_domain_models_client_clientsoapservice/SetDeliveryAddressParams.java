
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SetDeliveryAddressParams complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SetDeliveryAddressParams">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OrderNumberList" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         <element name="DeliveryAddressItem" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SetDeliveryAddress}DeliveryAddress" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetDeliveryAddressParams", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SetDeliveryAddress", propOrder = {
    "orderNumberList",
    "deliveryAddressItem"
})
public class SetDeliveryAddressParams {

    @XmlElementRef(name = "OrderNumberList", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SetDeliveryAddress", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> orderNumberList;
    @XmlElementRef(name = "DeliveryAddressItem", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SetDeliveryAddress", type = JAXBElement.class, required = false)
    protected JAXBElement<DeliveryAddress> deliveryAddressItem;

    /**
     * Gets the value of the orderNumberList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getOrderNumberList() {
        return orderNumberList;
    }

    /**
     * Sets the value of the orderNumberList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setOrderNumberList(JAXBElement<ArrayOfstring> value) {
        this.orderNumberList = value;
    }

    /**
     * Gets the value of the deliveryAddressItem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DeliveryAddress }{@code >}
     *     
     */
    public JAXBElement<DeliveryAddress> getDeliveryAddressItem() {
        return deliveryAddressItem;
    }

    /**
     * Sets the value of the deliveryAddressItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DeliveryAddress }{@code >}
     *     
     */
    public void setDeliveryAddressItem(JAXBElement<DeliveryAddress> value) {
        this.deliveryAddressItem = value;
    }

}
