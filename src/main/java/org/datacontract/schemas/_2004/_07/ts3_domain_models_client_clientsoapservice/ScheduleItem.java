
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScheduleItem complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ScheduleItem">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="dayOfWeek" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/>
 *         <element name="hourFrom" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/>
 *         <element name="hourTo" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/>
 *         <element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduleItem", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetAddressList", propOrder = {
    "dayOfWeek",
    "hourFrom",
    "hourTo",
    "enabled"
})
public class ScheduleItem {

    @XmlSchemaType(name = "unsignedByte")
    protected Short dayOfWeek;
    @XmlSchemaType(name = "unsignedByte")
    protected Short hourFrom;
    @XmlSchemaType(name = "unsignedByte")
    protected Short hourTo;
    @XmlElementRef(name = "enabled", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetAddressList", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> enabled;

    /**
     * Gets the value of the dayOfWeek property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getDayOfWeek() {
        return dayOfWeek;
    }

    /**
     * Sets the value of the dayOfWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setDayOfWeek(Short value) {
        this.dayOfWeek = value;
    }

    /**
     * Gets the value of the hourFrom property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getHourFrom() {
        return hourFrom;
    }

    /**
     * Sets the value of the hourFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setHourFrom(Short value) {
        this.hourFrom = value;
    }

    /**
     * Gets the value of the hourTo property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getHourTo() {
        return hourTo;
    }

    /**
     * Sets the value of the hourTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setHourTo(Short value) {
        this.hourTo = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setEnabled(JAXBElement<Boolean> value) {
        this.enabled = value;
    }

}
