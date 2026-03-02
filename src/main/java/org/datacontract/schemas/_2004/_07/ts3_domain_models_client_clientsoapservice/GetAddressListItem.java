
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ts3_domain_models_client.Coordinates;


/**
 * <p>Java class for getAddressListItem complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="getAddressListItem">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="addressId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="addressName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="building" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="cityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="contactName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="coordinates" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService}Coordinates" minOccurs="0"/>
 *         <element name="customerId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="driverNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="houseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="housing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="isDefaultAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="office" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="paymentType" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/>
 *         <element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="schedule" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetAddressList}ArrayOfScheduleItem" minOccurs="0"/>
 *         <element name="streetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAddressListItem", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetAddressList", propOrder = {
    "addressId",
    "addressName",
    "building",
    "cityName",
    "contactName",
    "coordinates",
    "customerId",
    "driverNote",
    "houseNumber",
    "housing",
    "isDefaultAddress",
    "office",
    "paymentType",
    "phoneNumber",
    "schedule",
    "streetName"
})
public class GetAddressListItem {

    protected Integer addressId;
    @XmlElementRef(name = "addressName", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetAddressList", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressName;
    @XmlElementRef(name = "building", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetAddressList", type = JAXBElement.class, required = false)
    protected JAXBElement<String> building;
    @XmlElementRef(name = "cityName", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetAddressList", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cityName;
    @XmlElementRef(name = "contactName", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetAddressList", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contactName;
    @XmlElementRef(name = "coordinates", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetAddressList", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinates> coordinates;
    @XmlElementRef(name = "customerId", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetAddressList", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> customerId;
    @XmlElementRef(name = "driverNote", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetAddressList", type = JAXBElement.class, required = false)
    protected JAXBElement<String> driverNote;
    @XmlElementRef(name = "houseNumber", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetAddressList", type = JAXBElement.class, required = false)
    protected JAXBElement<String> houseNumber;
    @XmlElementRef(name = "housing", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetAddressList", type = JAXBElement.class, required = false)
    protected JAXBElement<String> housing;
    protected Boolean isDefaultAddress;
    @XmlElementRef(name = "office", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetAddressList", type = JAXBElement.class, required = false)
    protected JAXBElement<String> office;
    @XmlElementRef(name = "paymentType", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetAddressList", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> paymentType;
    @XmlElementRef(name = "phoneNumber", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetAddressList", type = JAXBElement.class, required = false)
    protected JAXBElement<String> phoneNumber;
    @XmlElementRef(name = "schedule", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetAddressList", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfScheduleItem> schedule;
    @XmlElementRef(name = "streetName", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetAddressList", type = JAXBElement.class, required = false)
    protected JAXBElement<String> streetName;

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
     * Gets the value of the addressName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressName() {
        return addressName;
    }

    /**
     * Sets the value of the addressName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressName(JAXBElement<String> value) {
        this.addressName = value;
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
     * Gets the value of the cityName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCityName() {
        return cityName;
    }

    /**
     * Sets the value of the cityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCityName(JAXBElement<String> value) {
        this.cityName = value;
    }

    /**
     * Gets the value of the contactName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContactName() {
        return contactName;
    }

    /**
     * Sets the value of the contactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContactName(JAXBElement<String> value) {
        this.contactName = value;
    }

    /**
     * Gets the value of the coordinates property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Coordinates }{@code >}
     *     
     */
    public JAXBElement<Coordinates> getCoordinates() {
        return coordinates;
    }

    /**
     * Sets the value of the coordinates property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Coordinates }{@code >}
     *     
     */
    public void setCoordinates(JAXBElement<Coordinates> value) {
        this.coordinates = value;
    }

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCustomerId(JAXBElement<Integer> value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the driverNote property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDriverNote() {
        return driverNote;
    }

    /**
     * Sets the value of the driverNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDriverNote(JAXBElement<String> value) {
        this.driverNote = value;
    }

    /**
     * Gets the value of the houseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHouseNumber() {
        return houseNumber;
    }

    /**
     * Sets the value of the houseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHouseNumber(JAXBElement<String> value) {
        this.houseNumber = value;
    }

    /**
     * Gets the value of the housing property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHousing() {
        return housing;
    }

    /**
     * Sets the value of the housing property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHousing(JAXBElement<String> value) {
        this.housing = value;
    }

    /**
     * Gets the value of the isDefaultAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDefaultAddress() {
        return isDefaultAddress;
    }

    /**
     * Sets the value of the isDefaultAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDefaultAddress(Boolean value) {
        this.isDefaultAddress = value;
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
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPaymentType(JAXBElement<Short> value) {
        this.paymentType = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhoneNumber(JAXBElement<String> value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the schedule property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfScheduleItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfScheduleItem> getSchedule() {
        return schedule;
    }

    /**
     * Sets the value of the schedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfScheduleItem }{@code >}
     *     
     */
    public void setSchedule(JAXBElement<ArrayOfScheduleItem> value) {
        this.schedule = value;
    }

    /**
     * Gets the value of the streetName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStreetName() {
        return streetName;
    }

    /**
     * Sets the value of the streetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStreetName(JAXBElement<String> value) {
        this.streetName = value;
    }

}
