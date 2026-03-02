
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import javax.xml.datatype.XMLGregorianCalendar;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetStoOrderListFilter complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GetStoOrderListFilter">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="dStart" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="dEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="shipmentDateStart" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="shipmentDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="alreadyShipped" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="orderNumbers" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         <element name="productCodes" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         <element name="statusList" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         <element name="viewArchive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="warehouses" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetStoOrderListFilter", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetStoOrderList", propOrder = {
    "dStart",
    "dEnd",
    "shipmentDateStart",
    "shipmentDateEnd",
    "alreadyShipped",
    "orderNumbers",
    "productCodes",
    "statusList",
    "viewArchive",
    "warehouses"
})
public class GetStoOrderListFilter {

    @XmlElementRef(name = "dStart", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetStoOrderList", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dStart;
    @XmlElementRef(name = "dEnd", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetStoOrderList", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dEnd;
    @XmlElementRef(name = "shipmentDateStart", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetStoOrderList", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> shipmentDateStart;
    @XmlElementRef(name = "shipmentDateEnd", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetStoOrderList", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> shipmentDateEnd;
    @XmlElementRef(name = "alreadyShipped", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetStoOrderList", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> alreadyShipped;
    @XmlElementRef(name = "orderNumbers", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetStoOrderList", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> orderNumbers;
    @XmlElementRef(name = "productCodes", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetStoOrderList", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> productCodes;
    @XmlElementRef(name = "statusList", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetStoOrderList", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> statusList;
    @XmlElementRef(name = "viewArchive", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetStoOrderList", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> viewArchive;
    @XmlElementRef(name = "warehouses", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetStoOrderList", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> warehouses;

    /**
     * Gets the value of the dStart property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDStart() {
        return dStart;
    }

    /**
     * Sets the value of the dStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDStart(JAXBElement<XMLGregorianCalendar> value) {
        this.dStart = value;
    }

    /**
     * Gets the value of the dEnd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDEnd() {
        return dEnd;
    }

    /**
     * Sets the value of the dEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDEnd(JAXBElement<XMLGregorianCalendar> value) {
        this.dEnd = value;
    }

    /**
     * Gets the value of the shipmentDateStart property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getShipmentDateStart() {
        return shipmentDateStart;
    }

    /**
     * Sets the value of the shipmentDateStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setShipmentDateStart(JAXBElement<XMLGregorianCalendar> value) {
        this.shipmentDateStart = value;
    }

    /**
     * Gets the value of the shipmentDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getShipmentDateEnd() {
        return shipmentDateEnd;
    }

    /**
     * Sets the value of the shipmentDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setShipmentDateEnd(JAXBElement<XMLGregorianCalendar> value) {
        this.shipmentDateEnd = value;
    }

    /**
     * Gets the value of the alreadyShipped property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAlreadyShipped() {
        return alreadyShipped;
    }

    /**
     * Sets the value of the alreadyShipped property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAlreadyShipped(JAXBElement<Boolean> value) {
        this.alreadyShipped = value;
    }

    /**
     * Gets the value of the orderNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getOrderNumbers() {
        return orderNumbers;
    }

    /**
     * Sets the value of the orderNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setOrderNumbers(JAXBElement<ArrayOfstring> value) {
        this.orderNumbers = value;
    }

    /**
     * Gets the value of the productCodes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getProductCodes() {
        return productCodes;
    }

    /**
     * Sets the value of the productCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setProductCodes(JAXBElement<ArrayOfstring> value) {
        this.productCodes = value;
    }

    /**
     * Gets the value of the statusList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getStatusList() {
        return statusList;
    }

    /**
     * Sets the value of the statusList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setStatusList(JAXBElement<ArrayOfint> value) {
        this.statusList = value;
    }

    /**
     * Gets the value of the viewArchive property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getViewArchive() {
        return viewArchive;
    }

    /**
     * Sets the value of the viewArchive property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setViewArchive(JAXBElement<Boolean> value) {
        this.viewArchive = value;
    }

    /**
     * Gets the value of the warehouses property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getWarehouses() {
        return warehouses;
    }

    /**
     * Sets the value of the warehouses property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setWarehouses(JAXBElement<ArrayOfint> value) {
        this.warehouses = value;
    }

}
