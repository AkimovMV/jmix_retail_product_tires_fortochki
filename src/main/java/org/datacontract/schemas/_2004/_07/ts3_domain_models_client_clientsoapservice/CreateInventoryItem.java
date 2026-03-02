
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateInventoryItem complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CreateInventoryItem">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="beginDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="guid" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         <element name="markCodeList" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetInventoryInfo}ArrayOfMarkCodeContainer" minOccurs="0"/>
 *         <element name="number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="productList" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.CreateInventory}ArrayOfInventoryProduct" minOccurs="0"/>
 *         <element name="responsiblePerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="scannerType" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/>
 *         <element name="statusID" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/>
 *         <element name="warehouseID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateInventoryItem", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.CreateInventory", propOrder = {
    "beginDate",
    "date",
    "endDate",
    "guid",
    "markCodeList",
    "number",
    "productList",
    "responsiblePerson",
    "scannerType",
    "statusID",
    "warehouseID"
})
public class CreateInventoryItem {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar beginDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    protected String guid;
    @XmlElementRef(name = "markCodeList", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.CreateInventory", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfMarkCodeContainer5> markCodeList;
    @XmlElementRef(name = "number", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.CreateInventory", type = JAXBElement.class, required = false)
    protected JAXBElement<String> number;
    @XmlElementRef(name = "productList", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.CreateInventory", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfInventoryProduct2> productList;
    @XmlElementRef(name = "responsiblePerson", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.CreateInventory", type = JAXBElement.class, required = false)
    protected JAXBElement<String> responsiblePerson;
    @XmlSchemaType(name = "unsignedByte")
    protected Short scannerType;
    @XmlSchemaType(name = "unsignedByte")
    protected Short statusID;
    protected Integer warehouseID;

    /**
     * Gets the value of the beginDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBeginDate() {
        return beginDate;
    }

    /**
     * Sets the value of the beginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBeginDate(XMLGregorianCalendar value) {
        this.beginDate = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the guid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuid() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuid(String value) {
        this.guid = value;
    }

    /**
     * Gets the value of the markCodeList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMarkCodeContainer5 }{@code >}
     *     
     */
    public JAXBElement<ArrayOfMarkCodeContainer5> getMarkCodeList() {
        return markCodeList;
    }

    /**
     * Sets the value of the markCodeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMarkCodeContainer5 }{@code >}
     *     
     */
    public void setMarkCodeList(JAXBElement<ArrayOfMarkCodeContainer5> value) {
        this.markCodeList = value;
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
     * Gets the value of the productList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInventoryProduct2 }{@code >}
     *     
     */
    public JAXBElement<ArrayOfInventoryProduct2> getProductList() {
        return productList;
    }

    /**
     * Sets the value of the productList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInventoryProduct2 }{@code >}
     *     
     */
    public void setProductList(JAXBElement<ArrayOfInventoryProduct2> value) {
        this.productList = value;
    }

    /**
     * Gets the value of the responsiblePerson property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResponsiblePerson() {
        return responsiblePerson;
    }

    /**
     * Sets the value of the responsiblePerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResponsiblePerson(JAXBElement<String> value) {
        this.responsiblePerson = value;
    }

    /**
     * Gets the value of the scannerType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getScannerType() {
        return scannerType;
    }

    /**
     * Sets the value of the scannerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setScannerType(Short value) {
        this.scannerType = value;
    }

    /**
     * Gets the value of the statusID property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getStatusID() {
        return statusID;
    }

    /**
     * Sets the value of the statusID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setStatusID(Short value) {
        this.statusID = value;
    }

    /**
     * Gets the value of the warehouseID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWarehouseID() {
        return warehouseID;
    }

    /**
     * Sets the value of the warehouseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWarehouseID(Integer value) {
        this.warehouseID = value;
    }

}
