
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for movementInfoContainer complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="movementInfoContainer">
 *   <complexContent>
 *     <extension base="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.CreateMovement}Result">
 *       <sequence>
 *         <element name="MX1_Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="MX1_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="MX3_Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="MX3_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="guid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="idStoreFrom" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="idStoreTo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="markCodeList" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetMovementInfo}ArrayOfMarkCodeContainer" minOccurs="0"/>
 *         <element name="statusID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "movementInfoContainer", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetMovementInfo", propOrder = {
    "mx1Date",
    "mx1Number",
    "mx3Date",
    "mx3Number",
    "date",
    "guid",
    "idStoreFrom",
    "idStoreTo",
    "markCodeList",
    "statusID"
})
public class MovementInfoContainer
    extends Result2
{

    @XmlElementRef(name = "MX1_Date", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetMovementInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> mx1Date;
    @XmlElementRef(name = "MX1_Number", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetMovementInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mx1Number;
    @XmlElementRef(name = "MX3_Date", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetMovementInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> mx3Date;
    @XmlElementRef(name = "MX3_Number", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetMovementInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mx3Number;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    @XmlElementRef(name = "guid", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetMovementInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> guid;
    protected Integer idStoreFrom;
    protected Integer idStoreTo;
    @XmlElementRef(name = "markCodeList", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetMovementInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfMarkCodeContainer> markCodeList;
    protected Integer statusID;

    /**
     * Gets the value of the mx1Date property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getMX1Date() {
        return mx1Date;
    }

    /**
     * Sets the value of the mx1Date property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setMX1Date(JAXBElement<XMLGregorianCalendar> value) {
        this.mx1Date = value;
    }

    /**
     * Gets the value of the mx1Number property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMX1Number() {
        return mx1Number;
    }

    /**
     * Sets the value of the mx1Number property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMX1Number(JAXBElement<String> value) {
        this.mx1Number = value;
    }

    /**
     * Gets the value of the mx3Date property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getMX3Date() {
        return mx3Date;
    }

    /**
     * Sets the value of the mx3Date property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setMX3Date(JAXBElement<XMLGregorianCalendar> value) {
        this.mx3Date = value;
    }

    /**
     * Gets the value of the mx3Number property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMX3Number() {
        return mx3Number;
    }

    /**
     * Sets the value of the mx3Number property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMX3Number(JAXBElement<String> value) {
        this.mx3Number = value;
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
     * Gets the value of the guid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGuid() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGuid(JAXBElement<String> value) {
        this.guid = value;
    }

    /**
     * Gets the value of the idStoreFrom property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdStoreFrom() {
        return idStoreFrom;
    }

    /**
     * Sets the value of the idStoreFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdStoreFrom(Integer value) {
        this.idStoreFrom = value;
    }

    /**
     * Gets the value of the idStoreTo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdStoreTo() {
        return idStoreTo;
    }

    /**
     * Sets the value of the idStoreTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdStoreTo(Integer value) {
        this.idStoreTo = value;
    }

    /**
     * Gets the value of the markCodeList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMarkCodeContainer }{@code >}
     *     
     */
    public JAXBElement<ArrayOfMarkCodeContainer> getMarkCodeList() {
        return markCodeList;
    }

    /**
     * Sets the value of the markCodeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMarkCodeContainer }{@code >}
     *     
     */
    public void setMarkCodeList(JAXBElement<ArrayOfMarkCodeContainer> value) {
        this.markCodeList = value;
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

}
