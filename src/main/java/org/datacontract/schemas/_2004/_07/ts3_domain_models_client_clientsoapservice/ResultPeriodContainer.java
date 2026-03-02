
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
 * <p>Java class for Result.PeriodContainer complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Result.PeriodContainer">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="IntervalString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="IntervalId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="IntervalEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="IntervalStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Result.PeriodContainer", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetDeliveryPeriod", propOrder = {
    "date",
    "intervalString",
    "intervalId",
    "intervalEnd",
    "intervalStart"
})
public class ResultPeriodContainer {

    @XmlElement(name = "Date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    @XmlElementRef(name = "IntervalString", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetDeliveryPeriod", type = JAXBElement.class, required = false)
    protected JAXBElement<String> intervalString;
    @XmlElement(name = "IntervalId")
    protected Long intervalId;
    @XmlElementRef(name = "IntervalEnd", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetDeliveryPeriod", type = JAXBElement.class, required = false)
    protected JAXBElement<String> intervalEnd;
    @XmlElementRef(name = "IntervalStart", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetDeliveryPeriod", type = JAXBElement.class, required = false)
    protected JAXBElement<String> intervalStart;

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
     * Gets the value of the intervalString property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIntervalString() {
        return intervalString;
    }

    /**
     * Sets the value of the intervalString property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIntervalString(JAXBElement<String> value) {
        this.intervalString = value;
    }

    /**
     * Gets the value of the intervalId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIntervalId() {
        return intervalId;
    }

    /**
     * Sets the value of the intervalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIntervalId(Long value) {
        this.intervalId = value;
    }

    /**
     * Gets the value of the intervalEnd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIntervalEnd() {
        return intervalEnd;
    }

    /**
     * Sets the value of the intervalEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIntervalEnd(JAXBElement<String> value) {
        this.intervalEnd = value;
    }

    /**
     * Gets the value of the intervalStart property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIntervalStart() {
        return intervalStart;
    }

    /**
     * Sets the value of the intervalStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIntervalStart(JAXBElement<String> value) {
        this.intervalStart = value;
    }

}
