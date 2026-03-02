
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
 *         <element name="base_order" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.CreateOrder}BaseOrder" minOccurs="0"/>
 *         <element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="corps" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="driverNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="error" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService}Error" minOccurs="0"/>
 *         <element name="fio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="goods" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.CreateOrder}ArrayOfGoods" minOccurs="0"/>
 *         <element name="house" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="manager" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="markCodeList" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo}ArrayOfClientSoapResultDM.MarkCodeContainer" minOccurs="0"/>
 *         <element name="mergedOrders" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         <element name="mergedTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="needDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="office" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="orderNotes" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo}ArrayOfnote" minOccurs="0"/>
 *         <element name="parent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="payFormaKey" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="payFormaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="rtu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="shipmentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="statusKey" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="statusName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="subOrders" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         <element name="timeTypeKey" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="timeTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="tkId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="tkTerminalId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="userBusinessmanID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="userID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="verificationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetOrderInfoResult", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo", propOrder = {
    "baseOrder",
    "city",
    "corps",
    "date",
    "driverNote",
    "error",
    "fio",
    "goods",
    "house",
    "manager",
    "markCodeList",
    "mergedOrders",
    "mergedTo",
    "needDelivery",
    "office",
    "orderNotes",
    "parent",
    "payFormaKey",
    "payFormaName",
    "phone",
    "rtu",
    "shipmentDate",
    "statusKey",
    "statusName",
    "street",
    "subOrders",
    "timeTypeKey",
    "timeTypeName",
    "tkId",
    "tkTerminalId",
    "userBusinessmanID",
    "userID",
    "verificationCode"
})
public class GetOrderInfoResult {

    @XmlElementRef(name = "base_order", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<BaseOrder> baseOrder;
    @XmlElementRef(name = "city", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> city;
    @XmlElementRef(name = "corps", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> corps;
    @XmlElementRef(name = "date", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> date;
    @XmlElementRef(name = "driverNote", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> driverNote;
    @XmlElementRef(name = "error", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<Error> error;
    @XmlElementRef(name = "fio", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fio;
    @XmlElementRef(name = "goods", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGoods> goods;
    @XmlElementRef(name = "house", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> house;
    @XmlElementRef(name = "manager", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> manager;
    @XmlElementRef(name = "markCodeList", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfClientSoapResultDMMarkCodeContainer> markCodeList;
    @XmlElementRef(name = "mergedOrders", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> mergedOrders;
    @XmlElementRef(name = "mergedTo", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mergedTo;
    protected Boolean needDelivery;
    @XmlElementRef(name = "office", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> office;
    @XmlElementRef(name = "orderNotes", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfnote> orderNotes;
    @XmlElementRef(name = "parent", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> parent;
    @XmlElementRef(name = "payFormaKey", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> payFormaKey;
    @XmlElementRef(name = "payFormaName", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> payFormaName;
    @XmlElementRef(name = "phone", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> phone;
    @XmlElementRef(name = "rtu", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rtu;
    @XmlElementRef(name = "shipmentDate", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> shipmentDate;
    protected Integer statusKey;
    @XmlElementRef(name = "statusName", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> statusName;
    @XmlElementRef(name = "street", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> street;
    @XmlElementRef(name = "subOrders", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> subOrders;
    @XmlElementRef(name = "timeTypeKey", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> timeTypeKey;
    @XmlElementRef(name = "timeTypeName", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timeTypeName;
    @XmlElementRef(name = "tkId", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> tkId;
    @XmlElementRef(name = "tkTerminalId", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> tkTerminalId;
    protected Integer userBusinessmanID;
    protected Integer userID;
    @XmlElementRef(name = "verificationCode", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> verificationCode;

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
     *     {@link JAXBElement }{@code <}{@link ArrayOfGoods }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGoods> getGoods() {
        return goods;
    }

    /**
     * Sets the value of the goods property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGoods }{@code >}
     *     
     */
    public void setGoods(JAXBElement<ArrayOfGoods> value) {
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
     *     {@link JAXBElement }{@code <}{@link ArrayOfClientSoapResultDMMarkCodeContainer }{@code >}
     *     
     */
    public JAXBElement<ArrayOfClientSoapResultDMMarkCodeContainer> getMarkCodeList() {
        return markCodeList;
    }

    /**
     * Sets the value of the markCodeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfClientSoapResultDMMarkCodeContainer }{@code >}
     *     
     */
    public void setMarkCodeList(JAXBElement<ArrayOfClientSoapResultDMMarkCodeContainer> value) {
        this.markCodeList = value;
    }

    /**
     * Gets the value of the mergedOrders property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getMergedOrders() {
        return mergedOrders;
    }

    /**
     * Sets the value of the mergedOrders property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setMergedOrders(JAXBElement<ArrayOfstring> value) {
        this.mergedOrders = value;
    }

    /**
     * Gets the value of the mergedTo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMergedTo() {
        return mergedTo;
    }

    /**
     * Sets the value of the mergedTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMergedTo(JAXBElement<String> value) {
        this.mergedTo = value;
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
     *     {@link JAXBElement }{@code <}{@link ArrayOfnote }{@code >}
     *     
     */
    public JAXBElement<ArrayOfnote> getOrderNotes() {
        return orderNotes;
    }

    /**
     * Sets the value of the orderNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfnote }{@code >}
     *     
     */
    public void setOrderNotes(JAXBElement<ArrayOfnote> value) {
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

}
