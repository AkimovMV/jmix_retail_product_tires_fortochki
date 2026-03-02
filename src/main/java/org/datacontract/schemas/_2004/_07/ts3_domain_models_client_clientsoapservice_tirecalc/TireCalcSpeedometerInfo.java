
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice_tirecalc;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TireCalcSpeedometerInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TireCalcSpeedometerInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="clearence_change" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="current" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="difference" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="real" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TireCalcSpeedometerInfo", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.TireCalc.Result", propOrder = {
    "clearenceChange",
    "current",
    "difference",
    "real"
})
public class TireCalcSpeedometerInfo {

    @XmlElement(name = "clearence_change")
    protected Double clearenceChange;
    protected Double current;
    protected Double difference;
    protected Double real;

    /**
     * Gets the value of the clearenceChange property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getClearenceChange() {
        return clearenceChange;
    }

    /**
     * Sets the value of the clearenceChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setClearenceChange(Double value) {
        this.clearenceChange = value;
    }

    /**
     * Gets the value of the current property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCurrent() {
        return current;
    }

    /**
     * Sets the value of the current property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCurrent(Double value) {
        this.current = value;
    }

    /**
     * Gets the value of the difference property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDifference() {
        return difference;
    }

    /**
     * Sets the value of the difference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDifference(Double value) {
        this.difference = value;
    }

    /**
     * Gets the value of the real property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getReal() {
        return real;
    }

    /**
     * Sets the value of the real property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setReal(Double value) {
        this.real = value;
    }

}
