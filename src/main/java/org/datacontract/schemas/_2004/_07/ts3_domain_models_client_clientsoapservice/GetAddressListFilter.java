
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAddressListFilter complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="getAddressListFilter">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="addressIdList" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         <element name="isDefaultAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="orderID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="paymentType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAddressListFilter", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetAddressList", propOrder = {
    "addressIdList",
    "isDefaultAddress",
    "orderID",
    "paymentType"
})
public class GetAddressListFilter {

    @XmlElementRef(name = "addressIdList", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetAddressList", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> addressIdList;
    @XmlElementRef(name = "isDefaultAddress", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetAddressList", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isDefaultAddress;
    @XmlElementRef(name = "orderID", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetAddressList", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> orderID;
    protected Integer paymentType;

    /**
     * Gets the value of the addressIdList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getAddressIdList() {
        return addressIdList;
    }

    /**
     * Sets the value of the addressIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setAddressIdList(JAXBElement<ArrayOfint> value) {
        this.addressIdList = value;
    }

    /**
     * Gets the value of the isDefaultAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsDefaultAddress() {
        return isDefaultAddress;
    }

    /**
     * Sets the value of the isDefaultAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsDefaultAddress(JAXBElement<Boolean> value) {
        this.isDefaultAddress = value;
    }

    /**
     * Gets the value of the orderID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOrderID() {
        return orderID;
    }

    /**
     * Sets the value of the orderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOrderID(JAXBElement<Integer> value) {
        this.orderID = value;
    }

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaymentType(Integer value) {
        this.paymentType = value;
    }

}
