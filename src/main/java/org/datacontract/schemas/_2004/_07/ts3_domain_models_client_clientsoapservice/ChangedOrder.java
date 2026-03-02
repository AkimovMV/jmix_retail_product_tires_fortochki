
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangedOrder complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ChangedOrder">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="changed" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="isArchive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="orderDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="orderNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="productVersion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="serviceAccess" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="statusID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="statusSatelliteID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="userBusinessmanID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="userID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangedOrder", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetChangedOrders", propOrder = {
    "changed",
    "isArchive",
    "orderDate",
    "orderNumber",
    "productVersion",
    "serviceAccess",
    "statusID",
    "statusSatelliteID",
    "userBusinessmanID",
    "userID"
})
public class ChangedOrder {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar changed;
    protected boolean isArchive;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orderDate;
    @XmlElement(required = true, nillable = true)
    protected String orderNumber;
    protected int productVersion;
    @XmlElementRef(name = "serviceAccess", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetChangedOrders", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> serviceAccess;
    protected int statusID;
    @XmlElementRef(name = "statusSatelliteID", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetChangedOrders", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> statusSatelliteID;
    protected Integer userBusinessmanID;
    protected int userID;

    /**
     * Gets the value of the changed property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChanged() {
        return changed;
    }

    /**
     * Sets the value of the changed property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChanged(XMLGregorianCalendar value) {
        this.changed = value;
    }

    /**
     * Gets the value of the isArchive property.
     * 
     */
    public boolean isIsArchive() {
        return isArchive;
    }

    /**
     * Sets the value of the isArchive property.
     * 
     */
    public void setIsArchive(boolean value) {
        this.isArchive = value;
    }

    /**
     * Gets the value of the orderDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderDate() {
        return orderDate;
    }

    /**
     * Sets the value of the orderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderDate(XMLGregorianCalendar value) {
        this.orderDate = value;
    }

    /**
     * Gets the value of the orderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * Sets the value of the orderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderNumber(String value) {
        this.orderNumber = value;
    }

    /**
     * Gets the value of the productVersion property.
     * 
     */
    public int getProductVersion() {
        return productVersion;
    }

    /**
     * Sets the value of the productVersion property.
     * 
     */
    public void setProductVersion(int value) {
        this.productVersion = value;
    }

    /**
     * Gets the value of the serviceAccess property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getServiceAccess() {
        return serviceAccess;
    }

    /**
     * Sets the value of the serviceAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setServiceAccess(JAXBElement<Integer> value) {
        this.serviceAccess = value;
    }

    /**
     * Gets the value of the statusID property.
     * 
     */
    public int getStatusID() {
        return statusID;
    }

    /**
     * Sets the value of the statusID property.
     * 
     */
    public void setStatusID(int value) {
        this.statusID = value;
    }

    /**
     * Gets the value of the statusSatelliteID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getStatusSatelliteID() {
        return statusSatelliteID;
    }

    /**
     * Sets the value of the statusSatelliteID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setStatusSatelliteID(JAXBElement<Integer> value) {
        this.statusSatelliteID = value;
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
     */
    public int getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     */
    public void setUserID(int value) {
        this.userID = value;
    }

}
