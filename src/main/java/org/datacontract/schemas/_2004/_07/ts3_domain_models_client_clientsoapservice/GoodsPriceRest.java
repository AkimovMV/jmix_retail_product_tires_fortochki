
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ts3_domain_models_client.ArrayOfwhPriceRest;


/**
 * <p>Java class for goods_price_rest complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="goods_price_rest">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="color" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="img_big_my" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="img_big_pish" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="img_small" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="marka" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="saleId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="season" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="thorn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="whpr" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService}ArrayOfwh_price_rest" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "goods_price_rest", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsBySpecs", propOrder = {
    "code",
    "color",
    "imgBigMy",
    "imgBigPish",
    "imgSmall",
    "marka",
    "model",
    "name",
    "saleId",
    "season",
    "thorn",
    "type",
    "whpr"
})
public class GoodsPriceRest {

    @XmlElementRef(name = "code", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsBySpecs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> code;
    @XmlElementRef(name = "color", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsBySpecs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> color;
    @XmlElementRef(name = "img_big_my", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsBySpecs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> imgBigMy;
    @XmlElementRef(name = "img_big_pish", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsBySpecs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> imgBigPish;
    @XmlElementRef(name = "img_small", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsBySpecs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> imgSmall;
    @XmlElementRef(name = "marka", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsBySpecs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> marka;
    @XmlElementRef(name = "model", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsBySpecs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> model;
    @XmlElementRef(name = "name", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsBySpecs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "saleId", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsBySpecs", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> saleId;
    @XmlElementRef(name = "season", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsBySpecs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> season;
    protected Boolean thorn;
    @XmlElementRef(name = "type", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsBySpecs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> type;
    @XmlElementRef(name = "whpr", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsBySpecs", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfwhPriceRest> whpr;

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
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setColor(JAXBElement<String> value) {
        this.color = value;
    }

    /**
     * Gets the value of the imgBigMy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getImgBigMy() {
        return imgBigMy;
    }

    /**
     * Sets the value of the imgBigMy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setImgBigMy(JAXBElement<String> value) {
        this.imgBigMy = value;
    }

    /**
     * Gets the value of the imgBigPish property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getImgBigPish() {
        return imgBigPish;
    }

    /**
     * Sets the value of the imgBigPish property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setImgBigPish(JAXBElement<String> value) {
        this.imgBigPish = value;
    }

    /**
     * Gets the value of the imgSmall property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getImgSmall() {
        return imgSmall;
    }

    /**
     * Sets the value of the imgSmall property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setImgSmall(JAXBElement<String> value) {
        this.imgSmall = value;
    }

    /**
     * Gets the value of the marka property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarka() {
        return marka;
    }

    /**
     * Sets the value of the marka property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarka(JAXBElement<String> value) {
        this.marka = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setModel(JAXBElement<String> value) {
        this.model = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

    /**
     * Gets the value of the saleId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSaleId() {
        return saleId;
    }

    /**
     * Sets the value of the saleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSaleId(JAXBElement<Integer> value) {
        this.saleId = value;
    }

    /**
     * Gets the value of the season property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSeason() {
        return season;
    }

    /**
     * Sets the value of the season property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSeason(JAXBElement<String> value) {
        this.season = value;
    }

    /**
     * Gets the value of the thorn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isThorn() {
        return thorn;
    }

    /**
     * Sets the value of the thorn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setThorn(Boolean value) {
        this.thorn = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setType(JAXBElement<String> value) {
        this.type = value;
    }

    /**
     * Gets the value of the whpr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfwhPriceRest }{@code >}
     *     
     */
    public JAXBElement<ArrayOfwhPriceRest> getWhpr() {
        return whpr;
    }

    /**
     * Sets the value of the whpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfwhPriceRest }{@code >}
     *     
     */
    public void setWhpr(JAXBElement<ArrayOfwhPriceRest> value) {
        this.whpr = value;
    }

}
