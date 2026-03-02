
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for movementInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="movementInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="guid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="idStoreFrom" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="idStoreTo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="statusID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "movementInfo", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetMovementList", propOrder = {
    "date",
    "guid",
    "idStoreFrom",
    "idStoreTo",
    "number",
    "statusID"
})
public class MovementInfo {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    @XmlElementRef(name = "guid", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetMovementList", type = JAXBElement.class, required = false)
    protected JAXBElement<String> guid;
    protected Integer idStoreFrom;
    protected Integer idStoreTo;
    @XmlElementRef(name = "number", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetMovementList", type = JAXBElement.class, required = false)
    protected JAXBElement<String> number;
    protected Integer statusID;

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
