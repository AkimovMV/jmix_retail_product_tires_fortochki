
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetStoOrderListResult.GetStoOrderListResultItem complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GetStoOrderListResult.GetStoOrderListResultItem">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="createDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="orderID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="recipient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="shipmentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="statusId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="totalPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
@XmlType(name = "GetStoOrderListResult.GetStoOrderListResultItem", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetStoOrderList", propOrder = {
    "createDate",
    "number",
    "orderID",
    "recipient",
    "shipmentDate",
    "statusId",
    "totalPrice",
    "userAddressID",
    "warehouses"
})
public class GetStoOrderListResultGetStoOrderListResultItem {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    @XmlElementRef(name = "number", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetStoOrderList", type = JAXBElement.class, required = false)
    protected JAXBElement<String> number;
    protected Integer orderID;
    @XmlElementRef(name = "recipient", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetStoOrderList", type = JAXBElement.class, required = false)
    protected JAXBElement<String> recipient;
    @XmlElementRef(name = "shipmentDate", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetStoOrderList", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> shipmentDate;
    protected Integer statusId;
    protected BigDecimal totalPrice;
    @XmlElementRef(name = "userAddressID", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetStoOrderList", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> userAddressID;
    @XmlElementRef(name = "warehouses", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetStoOrderList", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfWarehouseDetails> warehouses;

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDate(XMLGregorianCalendar value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumber(JAXBElement<String> value) {
        this.number = value;
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
     * Gets the value of the recipient property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRecipient() {
        return recipient;
    }

    /**
     * Sets the value of the recipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRecipient(JAXBElement<String> value) {
        this.recipient = value;
    }

    /**
     * Gets the value of the shipmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getShipmentDate() {
        return shipmentDate;
    }

    /**
     * Sets the value of the shipmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setShipmentDate(JAXBElement<XMLGregorianCalendar> value) {
        this.shipmentDate = value;
    }

    /**
     * Gets the value of the statusId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatusId() {
        return statusId;
    }

    /**
     * Sets the value of the statusId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatusId(Integer value) {
        this.statusId = value;
    }

    /**
     * Gets the value of the totalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the value of the totalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalPrice(BigDecimal value) {
        this.totalPrice = value;
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
