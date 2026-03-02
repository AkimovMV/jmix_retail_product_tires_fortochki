
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import java.math.BigDecimal;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Goods complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Goods">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="gtin_list" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         <element name="marking_is_required" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="orderProductID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="price" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="priceIn" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="price_rozn" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="price_satellite" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="product_brand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="product_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="product_type" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="quantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="wrh" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="wrh_short_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Goods", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo2", propOrder = {
    "code",
    "gtinList",
    "markingIsRequired",
    "orderProductID",
    "price",
    "priceIn",
    "priceRozn",
    "priceSatellite",
    "productBrand",
    "productName",
    "productType",
    "quantity",
    "wrh",
    "wrhShortName"
})
public class Goods2 {

    @XmlElementRef(name = "code", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> code;
    @XmlElementRef(name = "gtin_list", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo2", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> gtinList;
    @XmlElement(name = "marking_is_required")
    protected Boolean markingIsRequired;
    protected Integer orderProductID;
    protected BigDecimal price;
    protected BigDecimal priceIn;
    @XmlElement(name = "price_rozn")
    protected BigDecimal priceRozn;
    @XmlElement(name = "price_satellite")
    protected BigDecimal priceSatellite;
    @XmlElementRef(name = "product_brand", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productBrand;
    @XmlElementRef(name = "product_name", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productName;
    @XmlElement(name = "product_type")
    protected Integer productType;
    protected Integer quantity;
    protected Integer wrh;
    @XmlElementRef(name = "wrh_short_name", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> wrhShortName;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCode(JAXBElement<String> value) {
        this.code = value;
    }

    /**
     * Gets the value of the gtinList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getGtinList() {
        return gtinList;
    }

    /**
     * Sets the value of the gtinList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setGtinList(JAXBElement<ArrayOfstring> value) {
        this.gtinList = value;
    }

    /**
     * Gets the value of the markingIsRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMarkingIsRequired() {
        return markingIsRequired;
    }

    /**
     * Sets the value of the markingIsRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMarkingIsRequired(Boolean value) {
        this.markingIsRequired = value;
    }

    /**
     * Gets the value of the orderProductID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrderProductID() {
        return orderProductID;
    }

    /**
     * Sets the value of the orderProductID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrderProductID(Integer value) {
        this.orderProductID = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrice(BigDecimal value) {
        this.price = value;
    }

    /**
     * Gets the value of the priceIn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceIn() {
        return priceIn;
    }

    /**
     * Sets the value of the priceIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceIn(BigDecimal value) {
        this.priceIn = value;
    }

    /**
     * Gets the value of the priceRozn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceRozn() {
        return priceRozn;
    }

    /**
     * Sets the value of the priceRozn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceRozn(BigDecimal value) {
        this.priceRozn = value;
    }

    /**
     * Gets the value of the priceSatellite property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceSatellite() {
        return priceSatellite;
    }

    /**
     * Sets the value of the priceSatellite property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceSatellite(BigDecimal value) {
        this.priceSatellite = value;
    }

    /**
     * Gets the value of the productBrand property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductBrand() {
        return productBrand;
    }

    /**
     * Sets the value of the productBrand property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductBrand(JAXBElement<String> value) {
        this.productBrand = value;
    }

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductName(JAXBElement<String> value) {
        this.productName = value;
    }

    /**
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProductType(Integer value) {
        this.productType = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantity(Integer value) {
        this.quantity = value;
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

    /**
     * Gets the value of the wrhShortName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWrhShortName() {
        return wrhShortName;
    }

    /**
     * Sets the value of the wrhShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWrhShortName(JAXBElement<String> value) {
        this.wrhShortName = value;
    }

}
