
package org.datacontract.schemas._2004._07.ts3_domain_models_client;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for saleInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="saleInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="saleId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="saleText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saleInfo", propOrder = {
    "saleId",
    "saleText"
})
public class SaleInfo {

    protected Integer saleId;
    @XmlElementRef(name = "saleText", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> saleText;

    /**
     * Gets the value of the saleId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSaleId() {
        return saleId;
    }

    /**
     * Sets the value of the saleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSaleId(Integer value) {
        this.saleId = value;
    }

    /**
     * Gets the value of the saleText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSaleText() {
        return saleText;
    }

    /**
     * Sets the value of the saleText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSaleText(JAXBElement<String> value) {
        this.saleText = value;
    }

}
