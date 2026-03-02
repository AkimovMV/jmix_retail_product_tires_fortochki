
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetOrderListResultItem complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GetOrderListResultItem">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="deliveryState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="hasItem" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="isPaidDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="isSatelliteOrder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="orderID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="orderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="parent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="price" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="statusID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="statusSatellite" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="userAddressID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="warehouses" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderList}ArrayOfWarehouseDetails" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetOrderListResultItem", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderList", propOrder = {
    "createdDate",
    "deliveryState",
    "hasItem",
    "isPaidDelivery",
    "isSatelliteOrder",
    "orderID",
    "orderNumber",
    "parent",
    "price",
    "statusID",
    "statusSatellite",
    "userAddressID",
    "warehouses"
})
public class GetOrderListResultItem {

    @XmlElementRef(name = "createdDate", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderList", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> createdDate;
    @XmlElementRef(name = "deliveryState", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderList", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deliveryState;
    protected Boolean hasItem;
    protected Boolean isPaidDelivery;
    protected Boolean isSatelliteOrder;
    protected Integer orderID;
    @XmlElementRef(name = "orderNumber", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderList", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderNumber;
    @XmlElementRef(name = "parent", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderList", type = JAXBElement.class, required = false)
    protected JAXBElement<String> parent;
    protected BigDecimal price;
    protected Integer statusID;
    protected Integer statusSatellite;
    @XmlElementRef(name = "userAddressID", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderList", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> userAddressID;
    @XmlElementRef(name = "warehouses", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderList", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfWarehouseDetails> warehouses;

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCreatedDate(JAXBElement<XMLGregorianCalendar> value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the deliveryState property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeliveryState() {
        return deliveryState;
    }

    /**
     * Sets the value of the deliveryState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeliveryState(JAXBElement<String> value) {
        this.deliveryState = value;
    }

    /**
     * Gets the value of the hasItem property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasItem() {
        return hasItem;
    }

    /**
     * Sets the value of the hasItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasItem(Boolean value) {
        this.hasItem = value;
    }

    /**
     * Gets the value of the isPaidDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPaidDelivery() {
        return isPaidDelivery;
    }

    /**
     * Sets the value of the isPaidDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPaidDelivery(Boolean value) {
        this.isPaidDelivery = value;
    }

    /**
     * Gets the value of the isSatelliteOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSatelliteOrder() {
        return isSatelliteOrder;
    }

    /**
     * Sets the value of the isSatelliteOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSatelliteOrder(Boolean value) {
        this.isSatelliteOrder = value;
    }

    /**
     * Gets the value of the orderID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrderID() {
        return orderID;
    }

    /**
     * Sets the value of the orderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrderID(Integer value) {
        this.orderID = value;
    }

    /**
     * Gets the value of the orderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderNumber() {
        return orderNumber;
    }

    /**
     * Sets the value of the orderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderNumber(JAXBElement<String> value) {
        this.orderNumber = value;
    }

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParent(JAXBElement<String> value) {
        this.parent = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrice(BigDecimal value) {
        this.price = value;
    }

    /**
     * Gets the value of the statusID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatusID() {
        return statusID;
    }

    /**
     * Sets the value of the statusID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatusID(Integer value) {
        this.statusID = value;
    }

    /**
     * Gets the value of the statusSatellite property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatusSatellite() {
        return statusSatellite;
    }

    /**
     * Sets the value of the statusSatellite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatusSatellite(Integer value) {
        this.statusSatellite = value;
    }

    /**
     * Gets the value of the userAddressID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUserAddressID() {
        return userAddressID;
    }

    /**
     * Sets the value of the userAddressID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUserAddressID(JAXBElement<Integer> value) {
        this.userAddressID = value;
    }

    /**
     * Gets the value of the warehouses property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfWarehouseDetails }{@code >}
     *     
     */
    public JAXBElement<ArrayOfWarehouseDetails> getWarehouses() {
        return warehouses;
    }

    /**
     * Sets the value of the warehouses property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfWarehouseDetails }{@code >}
     *     
     */
    public void setWarehouses(JAXBElement<ArrayOfWarehouseDetails> value) {
        this.warehouses = value;
    }

}
