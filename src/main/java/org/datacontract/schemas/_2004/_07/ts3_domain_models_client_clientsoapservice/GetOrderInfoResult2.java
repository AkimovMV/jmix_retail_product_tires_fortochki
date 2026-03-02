
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import javax.xml.datatype.XMLGregorianCalendar;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ts3_domain_models_client.Error;


/**
 * <p>Java class for GetOrderInfoResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GetOrderInfoResult">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="addressId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="base_order" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.CreateOrder}BaseOrder" minOccurs="0"/>
 *         <element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="corps" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="customerId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="customerIsLegal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="customerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="deliveryAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="deliveryContactName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="deliveryContactPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="deliveryIntervalEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="deliveryIntervalId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="deliveryIntervalStart" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="deliveryNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="driverNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="emailReceipt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="error" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService}Error" minOccurs="0"/>
 *         <element name="fio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="goods" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo2}ArrayOfGoods" minOccurs="0"/>
 *         <element name="house" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="manager" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="markCodeList" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo2}ArrayOfClientSoapResultDM.MarkCodeContainer" minOccurs="0"/>
 *         <element name="needDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="office" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="orderNotes" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo2}ArrayOfnote" minOccurs="0"/>
 *         <element name="parent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="payBefore" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="payFormaKey" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="payFormaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="phoneReceipt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pickupUserID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="pickupWarehouseAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pickupWarehouseId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="pickupWarehouseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="rtu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="shipmentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="shipmentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="statusKey" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="statusName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="subOrders" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         <element name="timeTypeKey" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="timeTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="tkId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="tkName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="tkTerminalAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="tkTerminalCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="tkTerminalId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="userBusinessmanID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="userID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="verificationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="verificationQR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetOrderInfoResult", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo2", propOrder = {
    "addressId",
    "baseOrder",
    "city",
    "corps",
    "customerId",
    "customerIsLegal",
    "customerName",
    "date",
    "deliveryAddress",
    "deliveryContactName",
    "deliveryContactPhone",
    "deliveryIntervalEnd",
    "deliveryIntervalId",
    "deliveryIntervalStart",
    "deliveryNote",
    "driverNote",
    "emailReceipt",
    "error",
    "fio",
    "goods",
    "house",
    "manager",
    "markCodeList",
    "needDelivery",
    "office",
    "orderNotes",
    "parent",
    "payBefore",
    "payFormaKey",
    "payFormaName",
    "phone",
    "phoneReceipt",
    "pickupUserID",
    "pickupWarehouseAddress",
    "pickupWarehouseId",
    "pickupWarehouseName",
    "rtu",
    "shipmentDate",
    "shipmentType",
    "statusKey",
    "statusName",
    "street",
    "subOrders",
    "timeTypeKey",
    "timeTypeName",
    "tkId",
    "tkName",
    "tkTerminalAddress",
    "tkTerminalCity",
    "tkTerminalId",
    "userBusinessmanID",
    "userID",
    "verificationCode",
    "verificationQR"
})
public class GetOrderInfoResult2 {

    @XmlElementRef(name = "addressId", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo2", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> addressId;
    @XmlElementRef(name = "base_order", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo2", type = JAXBElement.class, required = false)
    protected JAXBElement<BaseOrder> baseOrder;
    @XmlElementRef(name = "city", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> city;
    @XmlElementRef(name = "corps", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> corps;
    protected Integer customerId;
    @XmlElementRef(name = "customerIsLegal", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo2", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> customerIsLegal;
    @XmlElementRef(name = "customerName", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customerName;
    @XmlElementRef(name = "date", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo2", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> date;
    @XmlElementRef(name = "deliveryAddress", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deliveryAddress;
    @XmlElementRef(name = "deliveryContactName", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deliveryContactName;
    @XmlElementRef(name = "deliveryContactPhone", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deliveryContactPhone;
    @XmlElementRef(name = "deliveryIntervalEnd", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo2", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> deliveryIntervalEnd;
    @XmlElementRef(name = "deliveryIntervalId", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo2", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> deliveryIntervalId;
    @XmlElementRef(name = "deliveryIntervalStart", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo2", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> deliveryIntervalStart;
    @XmlElementRef(name = "deliveryNote", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deliveryNote;
    @XmlElementRef(name = "driverNote", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> driverNote;
    @XmlElementRef(name = "emailReceipt", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> emailReceipt;
    @XmlElementRef(name = "error", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo2", type = JAXBElement.class, required = false)
    protected JAXBElement<Error> error;
    @XmlElementRef(name = "fio", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fio;
    @XmlElementRef(name = "goods", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo2", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGoods2> goods;
    @XmlElementRef(name = "house", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> house;
    @XmlElementRef(name = "manager", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> manager;
    @XmlElementRef(name = "markCodeList", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo2", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfClientSoapResultDMMarkCodeContainer2> markCodeList;
    protected Boolean needDelivery;
    @XmlElementRef(name = "office", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> office;
    @XmlElementRef(name = "orderNotes", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo2", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfnote2> orderNotes;
    @XmlElementRef(name = "parent", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> parent;
    @XmlElementRef(name = "payBefore", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo2", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> payBefore;
    @XmlElementRef(name = "payFormaKey", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo2", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> payFormaKey;
    @XmlElementRef(name = "payFormaName", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> payFormaName;
    @XmlElementRef(name = "phone", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> phone;
    @XmlElementRef(name = "phoneReceipt", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> phoneReceipt;
    @XmlElementRef(name = "pickupUserID", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo2", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> pickupUserID;
    @XmlElementRef(name = "pickupWarehouseAddress", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pickupWarehouseAddress;
    protected Integer pickupWarehouseId;
    @XmlElementRef(name = "pickupWarehouseName", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pickupWarehouseName;
    @XmlElementRef(name = "rtu", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rtu;
    @XmlElementRef(name = "shipmentDate", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo2", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> shipmentDate;
    @XmlElementRef(name = "shipmentType", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shipmentType;
    protected Integer statusKey;
    @XmlElementRef(name = "statusName", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> statusName;
    @XmlElementRef(name = "street", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> street;
    @XmlElementRef(name = "subOrders", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo2", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> subOrders;
    @XmlElementRef(name = "timeTypeKey", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo2", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> timeTypeKey;
    @XmlElementRef(name = "timeTypeName", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timeTypeName;
    @XmlElementRef(name = "tkId", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo2", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> tkId;
    @XmlElementRef(name = "tkName", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tkName;
    @XmlElementRef(name = "tkTerminalAddress", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tkTerminalAddress;
    @XmlElementRef(name = "tkTerminalCity", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tkTerminalCity;
    @XmlElementRef(name = "tkTerminalId", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo2", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> tkTerminalId;
    protected Integer userBusinessmanID;
    protected Integer userID;
    @XmlElementRef(name = "verificationCode", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> verificationCode;
    @XmlElementRef(name = "verificationQR", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> verificationQR;

    /**
     * Gets the value of the addressId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAddressId() {
        return addressId;
    }

    /**
     * Sets the value of the addressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAddressId(JAXBElement<Integer> value) {
        this.addressId = value;
    }

    /**
     * Gets the value of the baseOrder property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BaseOrder }{@code >}
     *     
     */
    public JAXBElement<BaseOrder> getBaseOrder() {
        return baseOrder;
    }

    /**
     * Sets the value of the baseOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BaseOrder }{@code >}
     *     
     */
    public void setBaseOrder(JAXBElement<BaseOrder> value) {
        this.baseOrder = value;
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
     * Gets the value of the corps property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorps() {
        return corps;
    }

    /**
     * Sets the value of the corps property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorps(JAXBElement<String> value) {
        this.corps = value;
    }

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustomerId(Integer value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the customerIsLegal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCustomerIsLegal() {
        return customerIsLegal;
    }

    /**
     * Sets the value of the customerIsLegal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCustomerIsLegal(JAXBElement<Boolean> value) {
        this.customerIsLegal = value;
    }

    /**
     * Gets the value of the customerName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerName(JAXBElement<String> value) {
        this.customerName = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDate(JAXBElement<XMLGregorianCalendar> value) {
        this.date = value;
    }

    /**
     * Gets the value of the deliveryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeliveryAddress() {
        return deliveryAddress;
    }

    /**
     * Sets the value of the deliveryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeliveryAddress(JAXBElement<String> value) {
        this.deliveryAddress = value;
    }

    /**
     * Gets the value of the deliveryContactName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeliveryContactName() {
        return deliveryContactName;
    }

    /**
     * Sets the value of the deliveryContactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeliveryContactName(JAXBElement<String> value) {
        this.deliveryContactName = value;
    }

    /**
     * Gets the value of the deliveryContactPhone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeliveryContactPhone() {
        return deliveryContactPhone;
    }

    /**
     * Sets the value of the deliveryContactPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeliveryContactPhone(JAXBElement<String> value) {
        this.deliveryContactPhone = value;
    }

    /**
     * Gets the value of the deliveryIntervalEnd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDeliveryIntervalEnd() {
        return deliveryIntervalEnd;
    }

    /**
     * Sets the value of the deliveryIntervalEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDeliveryIntervalEnd(JAXBElement<XMLGregorianCalendar> value) {
        this.deliveryIntervalEnd = value;
    }

    /**
     * Gets the value of the deliveryIntervalId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDeliveryIntervalId() {
        return deliveryIntervalId;
    }

    /**
     * Sets the value of the deliveryIntervalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDeliveryIntervalId(JAXBElement<Integer> value) {
        this.deliveryIntervalId = value;
    }

    /**
     * Gets the value of the deliveryIntervalStart property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDeliveryIntervalStart() {
        return deliveryIntervalStart;
    }

    /**
     * Sets the value of the deliveryIntervalStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDeliveryIntervalStart(JAXBElement<XMLGregorianCalendar> value) {
        this.deliveryIntervalStart = value;
    }

    /**
     * Gets the value of the deliveryNote property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeliveryNote() {
        return deliveryNote;
    }

    /**
     * Sets the value of the deliveryNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeliveryNote(JAXBElement<String> value) {
        this.deliveryNote = value;
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
     * Gets the value of the emailReceipt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmailReceipt() {
        return emailReceipt;
    }

    /**
     * Sets the value of the emailReceipt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmailReceipt(JAXBElement<String> value) {
        this.emailReceipt = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Error }{@code >}
     *     
     */
    public JAXBElement<Error> getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Error }{@code >}
     *     
     */
    public void setError(JAXBElement<Error> value) {
        this.error = value;
    }

    /**
     * Gets the value of the fio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFio() {
        return fio;
    }

    /**
     * Sets the value of the fio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFio(JAXBElement<String> value) {
        this.fio = value;
    }

    /**
     * Gets the value of the goods property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGoods2 }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGoods2> getGoods() {
        return goods;
    }

    /**
     * Sets the value of the goods property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGoods2 }{@code >}
     *     
     */
    public void setGoods(JAXBElement<ArrayOfGoods2> value) {
        this.goods = value;
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
     * Gets the value of the manager property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getManager() {
        return manager;
    }

    /**
     * Sets the value of the manager property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setManager(JAXBElement<String> value) {
        this.manager = value;
    }

    /**
     * Gets the value of the markCodeList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfClientSoapResultDMMarkCodeContainer2 }{@code >}
     *     
     */
    public JAXBElement<ArrayOfClientSoapResultDMMarkCodeContainer2> getMarkCodeList() {
        return markCodeList;
    }

    /**
     * Sets the value of the markCodeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfClientSoapResultDMMarkCodeContainer2 }{@code >}
     *     
     */
    public void setMarkCodeList(JAXBElement<ArrayOfClientSoapResultDMMarkCodeContainer2> value) {
        this.markCodeList = value;
    }

    /**
     * Gets the value of the needDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNeedDelivery() {
        return needDelivery;
    }

    /**
     * Sets the value of the needDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNeedDelivery(Boolean value) {
        this.needDelivery = value;
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
     * Gets the value of the orderNotes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfnote2 }{@code >}
     *     
     */
    public JAXBElement<ArrayOfnote2> getOrderNotes() {
        return orderNotes;
    }

    /**
     * Sets the value of the orderNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfnote2 }{@code >}
     *     
     */
    public void setOrderNotes(JAXBElement<ArrayOfnote2> value) {
        this.orderNotes = value;
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
     * Gets the value of the payBefore property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPayBefore() {
        return payBefore;
    }

    /**
     * Sets the value of the payBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPayBefore(JAXBElement<XMLGregorianCalendar> value) {
        this.payBefore = value;
    }

    /**
     * Gets the value of the payFormaKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPayFormaKey() {
        return payFormaKey;
    }

    /**
     * Sets the value of the payFormaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPayFormaKey(JAXBElement<Integer> value) {
        this.payFormaKey = value;
    }

    /**
     * Gets the value of the payFormaName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPayFormaName() {
        return payFormaName;
    }

    /**
     * Sets the value of the payFormaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPayFormaName(JAXBElement<String> value) {
        this.payFormaName = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhone(JAXBElement<String> value) {
        this.phone = value;
    }

    /**
     * Gets the value of the phoneReceipt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhoneReceipt() {
        return phoneReceipt;
    }

    /**
     * Sets the value of the phoneReceipt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhoneReceipt(JAXBElement<String> value) {
        this.phoneReceipt = value;
    }

    /**
     * Gets the value of the pickupUserID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPickupUserID() {
        return pickupUserID;
    }

    /**
     * Sets the value of the pickupUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPickupUserID(JAXBElement<Integer> value) {
        this.pickupUserID = value;
    }

    /**
     * Gets the value of the pickupWarehouseAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPickupWarehouseAddress() {
        return pickupWarehouseAddress;
    }

    /**
     * Sets the value of the pickupWarehouseAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPickupWarehouseAddress(JAXBElement<String> value) {
        this.pickupWarehouseAddress = value;
    }

    /**
     * Gets the value of the pickupWarehouseId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPickupWarehouseId() {
        return pickupWarehouseId;
    }

    /**
     * Sets the value of the pickupWarehouseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPickupWarehouseId(Integer value) {
        this.pickupWarehouseId = value;
    }

    /**
     * Gets the value of the pickupWarehouseName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPickupWarehouseName() {
        return pickupWarehouseName;
    }

    /**
     * Sets the value of the pickupWarehouseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPickupWarehouseName(JAXBElement<String> value) {
        this.pickupWarehouseName = value;
    }

    /**
     * Gets the value of the rtu property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRtu() {
        return rtu;
    }

    /**
     * Sets the value of the rtu property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRtu(JAXBElement<String> value) {
        this.rtu = value;
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
     * Gets the value of the shipmentType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShipmentType() {
        return shipmentType;
    }

    /**
     * Sets the value of the shipmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShipmentType(JAXBElement<String> value) {
        this.shipmentType = value;
    }

    /**
     * Gets the value of the statusKey property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatusKey() {
        return statusKey;
    }

    /**
     * Sets the value of the statusKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatusKey(Integer value) {
        this.statusKey = value;
    }

    /**
     * Gets the value of the statusName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatusName() {
        return statusName;
    }

    /**
     * Sets the value of the statusName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatusName(JAXBElement<String> value) {
        this.statusName = value;
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
     * Gets the value of the subOrders property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getSubOrders() {
        return subOrders;
    }

    /**
     * Sets the value of the subOrders property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setSubOrders(JAXBElement<ArrayOfstring> value) {
        this.subOrders = value;
    }

    /**
     * Gets the value of the timeTypeKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTimeTypeKey() {
        return timeTypeKey;
    }

    /**
     * Sets the value of the timeTypeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTimeTypeKey(JAXBElement<Integer> value) {
        this.timeTypeKey = value;
    }

    /**
     * Gets the value of the timeTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimeTypeName() {
        return timeTypeName;
    }

    /**
     * Sets the value of the timeTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimeTypeName(JAXBElement<String> value) {
        this.timeTypeName = value;
    }

    /**
     * Gets the value of the tkId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTkId() {
        return tkId;
    }

    /**
     * Sets the value of the tkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTkId(JAXBElement<Integer> value) {
        this.tkId = value;
    }

    /**
     * Gets the value of the tkName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTkName() {
        return tkName;
    }

    /**
     * Sets the value of the tkName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTkName(JAXBElement<String> value) {
        this.tkName = value;
    }

    /**
     * Gets the value of the tkTerminalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTkTerminalAddress() {
        return tkTerminalAddress;
    }

    /**
     * Sets the value of the tkTerminalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTkTerminalAddress(JAXBElement<String> value) {
        this.tkTerminalAddress = value;
    }

    /**
     * Gets the value of the tkTerminalCity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTkTerminalCity() {
        return tkTerminalCity;
    }

    /**
     * Sets the value of the tkTerminalCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTkTerminalCity(JAXBElement<String> value) {
        this.tkTerminalCity = value;
    }

    /**
     * Gets the value of the tkTerminalId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTkTerminalId() {
        return tkTerminalId;
    }

    /**
     * Sets the value of the tkTerminalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTkTerminalId(JAXBElement<Integer> value) {
        this.tkTerminalId = value;
    }

    /**
     * Gets the value of the userBusinessmanID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUserBusinessmanID() {
        return userBusinessmanID;
    }

    /**
     * Sets the value of the userBusinessmanID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUserBusinessmanID(Integer value) {
        this.userBusinessmanID = value;
    }

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUserID(Integer value) {
        this.userID = value;
    }

    /**
     * Gets the value of the verificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVerificationCode() {
        return verificationCode;
    }

    /**
     * Sets the value of the verificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVerificationCode(JAXBElement<String> value) {
        this.verificationCode = value;
    }

    /**
     * Gets the value of the verificationQR property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVerificationQR() {
        return verificationQR;
    }

    /**
     * Sets the value of the verificationQR property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVerificationQR(JAXBElement<String> value) {
        this.verificationQR = value;
    }

}
