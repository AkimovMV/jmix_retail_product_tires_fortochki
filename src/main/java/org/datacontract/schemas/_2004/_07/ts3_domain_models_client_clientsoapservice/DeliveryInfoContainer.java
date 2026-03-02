
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ts3_domain_models_client.CoordinatesAsDouble;


/**
 * <p>Java class for DeliveryInfoContainer complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DeliveryInfoContainer">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="addressId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="building" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="building2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="contact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="deliveryData" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.CreateOrder}deliveryDatePeriod" minOccurs="0"/>
 *         <element name="house" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="office" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="paymentType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="telephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="coordinates" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService}CoordinatesAsDouble" minOccurs="0"/>
 *         <element name="consigneeId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryInfoContainer", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.CreateOrder", propOrder = {
    "addressId",
    "building",
    "building2",
    "city",
    "contact",
    "deliveryData",
    "house",
    "note",
    "office",
    "paymentType",
    "street",
    "telephone",
    "coordinates",
    "consigneeId"
})
public class DeliveryInfoContainer {

    protected Integer addressId;
    @XmlElementRef(name = "building", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.CreateOrder", type = JAXBElement.class, required = false)
    protected JAXBElement<String> building;
    @XmlElementRef(name = "building2", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.CreateOrder", type = JAXBElement.class, required = false)
    protected JAXBElement<String> building2;
    @XmlElementRef(name = "city", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.CreateOrder", type = JAXBElement.class, required = false)
    protected JAXBElement<String> city;
    @XmlElementRef(name = "contact", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.CreateOrder", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contact;
    @XmlElementRef(name = "deliveryData", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.CreateOrder", type = JAXBElement.class, required = false)
    protected JAXBElement<DeliveryDatePeriod> deliveryData;
    @XmlElementRef(name = "house", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.CreateOrder", type = JAXBElement.class, required = false)
    protected JAXBElement<String> house;
    @XmlElementRef(name = "note", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.CreateOrder", type = JAXBElement.class, required = false)
    protected JAXBElement<String> note;
    @XmlElementRef(name = "office", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.CreateOrder", type = JAXBElement.class, required = false)
    protected JAXBElement<String> office;
    protected Integer paymentType;
    @XmlElementRef(name = "street", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.CreateOrder", type = JAXBElement.class, required = false)
    protected JAXBElement<String> street;
    @XmlElementRef(name = "telephone", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.CreateOrder", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telephone;
    @XmlElementRef(name = "coordinates", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.CreateOrder", type = JAXBElement.class, required = false)
    protected JAXBElement<CoordinatesAsDouble> coordinates;
    @XmlElementRef(name = "consigneeId", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.CreateOrder", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> consigneeId;

    /**
     * Gets the value of the addressId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAddressId() {
        return addressId;
    }

    /**
     * Sets the value of the addressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAddressId(Integer value) {
        this.addressId = value;
    }

    /**
     * Gets the value of the building property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBuilding() {
        return building;
    }

    /**
     * Sets the value of the building property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBuilding(JAXBElement<String> value) {
        this.building = value;
    }

    /**
     * Gets the value of the building2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBuilding2() {
        return building2;
    }

    /**
     * Sets the value of the building2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBuilding2(JAXBElement<String> value) {
        this.building2 = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCity(JAXBElement<String> value) {
        this.city = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContact(JAXBElement<String> value) {
        this.contact = value;
    }

    /**
     * Gets the value of the deliveryData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DeliveryDatePeriod }{@code >}
     *     
     */
    public JAXBElement<DeliveryDatePeriod> getDeliveryData() {
        return deliveryData;
    }

    /**
     * Sets the value of the deliveryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DeliveryDatePeriod }{@code >}
     *     
     */
    public void setDeliveryData(JAXBElement<DeliveryDatePeriod> value) {
        this.deliveryData = value;
    }

    /**
     * Gets the value of the house property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHouse() {
        return house;
    }

    /**
     * Sets the value of the house property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHouse(JAXBElement<String> value) {
        this.house = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNote(JAXBElement<String> value) {
        this.note = value;
    }

    /**
     * Gets the value of the office property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOffice() {
        return office;
    }

    /**
     * Sets the value of the office property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOffice(JAXBElement<String> value) {
        this.office = value;
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

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStreet(JAXBElement<String> value) {
        this.street = value;
    }

    /**
     * Gets the value of the telephone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTelephone() {
        return telephone;
    }

    /**
     * Sets the value of the telephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTelephone(JAXBElement<String> value) {
        this.telephone = value;
    }

    /**
     * Gets the value of the coordinates property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CoordinatesAsDouble }{@code >}
     *     
     */
    public JAXBElement<CoordinatesAsDouble> getCoordinates() {
        return coordinates;
    }

    /**
     * Sets the value of the coordinates property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CoordinatesAsDouble }{@code >}
     *     
     */
    public void setCoordinates(JAXBElement<CoordinatesAsDouble> value) {
        this.coordinates = value;
    }

    /**
     * Gets the value of the consigneeId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConsigneeId() {
        return consigneeId;
    }

    /**
     * Sets the value of the consigneeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConsigneeId(JAXBElement<Integer> value) {
        this.consigneeId = value;
    }

}
