
package org.datacontract.schemas._2004._07.ts3_domain_models_client;

import java.math.BigDecimal;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wh_price_rest complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="wh_price_rest">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="price" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="price_rozn" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="rest" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="wrh" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wh_price_rest", propOrder = {
    "price",
    "priceRozn",
    "rest",
    "wrh"
})
public class WhPriceRest {

    @XmlElementRef(name = "price", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> price;
    @XmlElementRef(name = "price_rozn", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> priceRozn;
    protected Integer rest;
    protected Integer wrh;

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPrice(JAXBElement<BigDecimal> value) {
        this.price = value;
    }

    /**
     * Gets the value of the priceRozn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPriceRozn() {
        return priceRozn;
    }

    /**
     * Sets the value of the priceRozn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPriceRozn(JAXBElement<BigDecimal> value) {
        this.priceRozn = value;
    }

    /**
     * Gets the value of the rest property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRest() {
        return rest;
    }

    /**
     * Sets the value of the rest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRest(Integer value) {
        this.rest = value;
    }

    /**
     * Gets the value of the wrh property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWrh() {
        return wrh;
    }

    /**
     * Sets the value of the wrh property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWrh(Integer value) {
        this.wrh = value;
    }

}
