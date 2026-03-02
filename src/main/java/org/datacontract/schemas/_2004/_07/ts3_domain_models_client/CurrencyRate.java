
package org.datacontract.schemas._2004._07.ts3_domain_models_client;

import java.math.BigDecimal;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyRate complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CurrencyRate">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="charCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="nominal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="numCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="value" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyRate", propOrder = {
    "charCode",
    "nominal",
    "numCode",
    "value"
})
public class CurrencyRate {

    @XmlElementRef(name = "charCode", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> charCode;
    protected Integer nominal;
    protected Integer numCode;
    protected BigDecimal value;

    /**
     * Gets the value of the charCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCharCode() {
        return charCode;
    }

    /**
     * Sets the value of the charCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCharCode(JAXBElement<String> value) {
        this.charCode = value;
    }

    /**
     * Gets the value of the nominal property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNominal() {
        return nominal;
    }

    /**
     * Sets the value of the nominal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNominal(Integer value) {
        this.nominal = value;
    }

    /**
     * Gets the value of the numCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumCode() {
        return numCode;
    }

    /**
     * Sets the value of the numCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumCode(Integer value) {
        this.numCode = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

}
