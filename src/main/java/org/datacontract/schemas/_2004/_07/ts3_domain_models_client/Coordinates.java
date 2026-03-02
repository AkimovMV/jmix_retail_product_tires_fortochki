
package org.datacontract.schemas._2004._07.ts3_domain_models_client;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Coordinates complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Coordinates">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="latitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="longtitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Coordinates", propOrder = {
    "latitude",
    "longtitude"
})
public class Coordinates {

    @XmlElementRef(name = "latitude", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> latitude;
    @XmlElementRef(name = "longtitude", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> longtitude;

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLatitude(JAXBElement<String> value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longtitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLongtitude() {
        return longtitude;
    }

    /**
     * Sets the value of the longtitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLongtitude(JAXBElement<String> value) {
        this.longtitude = value;
    }

}
