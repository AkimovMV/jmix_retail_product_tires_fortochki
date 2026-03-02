
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice_tirecalc;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TireCalcSize complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TireCalcSize">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="diameter" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="height" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="outer_diameter" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="width" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TireCalcSize", propOrder = {
    "diameter",
    "height",
    "outerDiameter",
    "width"
})
public class TireCalcSize {

    protected Double diameter;
    protected Double height;
    @XmlElementRef(name = "outer_diameter", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.TireCalc.Parameters", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> outerDiameter;
    protected Double width;

    /**
     * Gets the value of the diameter property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDiameter() {
        return diameter;
    }

    /**
     * Sets the value of the diameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDiameter(Double value) {
        this.diameter = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHeight(Double value) {
        this.height = value;
    }

    /**
     * Gets the value of the outerDiameter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getOuterDiameter() {
        return outerDiameter;
    }

    /**
     * Sets the value of the outerDiameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setOuterDiameter(JAXBElement<Double> value) {
        this.outerDiameter = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWidth(Double value) {
        this.width = value;
    }

}
