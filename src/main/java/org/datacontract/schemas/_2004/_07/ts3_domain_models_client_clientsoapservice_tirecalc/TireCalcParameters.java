
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice_tirecalc;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TireCalcParameters complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TireCalcParameters">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="new_size" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.TireCalc.Parameters}TireCalcSize" minOccurs="0"/>
 *         <element name="old_size" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.TireCalc.Parameters}TireCalcSize" minOccurs="0"/>
 *         <element name="old_speed" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TireCalcParameters", propOrder = {
    "newSize",
    "oldSize",
    "oldSpeed"
})
public class TireCalcParameters {

    @XmlElementRef(name = "new_size", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.TireCalc.Parameters", type = JAXBElement.class, required = false)
    protected JAXBElement<TireCalcSize> newSize;
    @XmlElementRef(name = "old_size", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.TireCalc.Parameters", type = JAXBElement.class, required = false)
    protected JAXBElement<TireCalcSize> oldSize;
    @XmlElement(name = "old_speed")
    protected Double oldSpeed;

    /**
     * Gets the value of the newSize property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TireCalcSize }{@code >}
     *     
     */
    public JAXBElement<TireCalcSize> getNewSize() {
        return newSize;
    }

    /**
     * Sets the value of the newSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TireCalcSize }{@code >}
     *     
     */
    public void setNewSize(JAXBElement<TireCalcSize> value) {
        this.newSize = value;
    }

    /**
     * Gets the value of the oldSize property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TireCalcSize }{@code >}
     *     
     */
    public JAXBElement<TireCalcSize> getOldSize() {
        return oldSize;
    }

    /**
     * Sets the value of the oldSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TireCalcSize }{@code >}
     *     
     */
    public void setOldSize(JAXBElement<TireCalcSize> value) {
        this.oldSize = value;
    }

    /**
     * Gets the value of the oldSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOldSpeed() {
        return oldSpeed;
    }

    /**
     * Sets the value of the oldSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOldSpeed(Double value) {
        this.oldSpeed = value;
    }

}
