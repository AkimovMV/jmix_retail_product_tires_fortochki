
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for yearAvto complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="yearAvto">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="year_begin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="year_end" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "yearAvto", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetAutoYears", propOrder = {
    "yearBegin",
    "yearEnd"
})
public class YearAvto {

    @XmlElement(name = "year_begin")
    protected Integer yearBegin;
    @XmlElement(name = "year_end")
    protected Integer yearEnd;

    /**
     * Gets the value of the yearBegin property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getYearBegin() {
        return yearBegin;
    }

    /**
     * Sets the value of the yearBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setYearBegin(Integer value) {
        this.yearBegin = value;
    }

    /**
     * Gets the value of the yearEnd property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getYearEnd() {
        return yearEnd;
    }

    /**
     * Sets the value of the yearEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setYearEnd(Integer value) {
        this.yearEnd = value;
    }

}
