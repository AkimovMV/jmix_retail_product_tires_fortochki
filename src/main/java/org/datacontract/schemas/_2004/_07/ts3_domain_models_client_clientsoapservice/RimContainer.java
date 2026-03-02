
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import java.math.BigDecimal;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RimContainer complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RimContainer">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="avto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="base_color" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="bolt_spacing2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="bolts_count" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="bolts_spacing" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="brand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="color" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="dia" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="diameter" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="et" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="img_big" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="img_big_my" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="img_big_pish" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="img_small" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="inset_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="logo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="marka_html" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="marka_logo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="model_html" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="mount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="mount_note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="producer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="rim_vid_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="type" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="use_ck" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="volume" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="weight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="width" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RimContainer", propOrder = {
    "avto",
    "baseColor",
    "boltSpacing2",
    "boltsCount",
    "boltsSpacing",
    "brand",
    "code",
    "color",
    "dia",
    "diameter",
    "et",
    "imgBig",
    "imgBigMy",
    "imgBigPish",
    "imgSmall",
    "insetType",
    "logo",
    "markaHtml",
    "markaLogo",
    "model",
    "modelHtml",
    "mount",
    "mountNote",
    "name",
    "producer",
    "rimVidName",
    "type",
    "useCk",
    "volume",
    "weight",
    "width"
})
public class RimContainer {

    @XmlElementRef(name = "avto", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> avto;
    @XmlElementRef(name = "base_color", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> baseColor;
    @XmlElement(name = "bolt_spacing2")
    protected BigDecimal boltSpacing2;
    @XmlElement(name = "bolts_count")
    protected Integer boltsCount;
    @XmlElement(name = "bolts_spacing")
    protected BigDecimal boltsSpacing;
    @XmlElementRef(name = "brand", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> brand;
    @XmlElementRef(name = "code", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> code;
    @XmlElementRef(name = "color", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> color;
    protected BigDecimal dia;
    protected BigDecimal diameter;
    protected BigDecimal et;
    @XmlElementRef(name = "img_big", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> imgBig;
    @XmlElementRef(name = "img_big_my", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> imgBigMy;
    @XmlElementRef(name = "img_big_pish", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> imgBigPish;
    @XmlElementRef(name = "img_small", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> imgSmall;
    @XmlElementRef(name = "inset_type", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> insetType;
    @XmlElementRef(name = "logo", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> logo;
    @XmlElementRef(name = "marka_html", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> markaHtml;
    @XmlElementRef(name = "marka_logo", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> markaLogo;
    @XmlElementRef(name = "model", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> model;
    @XmlElementRef(name = "model_html", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> modelHtml;
    @XmlElementRef(name = "mount", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mount;
    @XmlElementRef(name = "mount_note", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mountNote;
    @XmlElementRef(name = "name", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "producer", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> producer;
    @XmlElementRef(name = "rim_vid_name", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rimVidName;
    @XmlElementRef(name = "type", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> type;
    @XmlElementRef(name = "use_ck", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> useCk;
    @XmlElementRef(name = "volume", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> volume;
    @XmlElementRef(name = "weight", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> weight;
    protected BigDecimal width;

    /**
     * Gets the value of the avto property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAvto() {
        return avto;
    }

    /**
     * Sets the value of the avto property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAvto(JAXBElement<String> value) {
        this.avto = value;
    }

    /**
     * Gets the value of the baseColor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBaseColor() {
        return baseColor;
    }

    /**
     * Sets the value of the baseColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBaseColor(JAXBElement<String> value) {
        this.baseColor = value;
    }

    /**
     * Gets the value of the boltSpacing2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBoltSpacing2() {
        return boltSpacing2;
    }

    /**
     * Sets the value of the boltSpacing2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBoltSpacing2(BigDecimal value) {
        this.boltSpacing2 = value;
    }

    /**
     * Gets the value of the boltsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBoltsCount() {
        return boltsCount;
    }

    /**
     * Sets the value of the boltsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBoltsCount(Integer value) {
        this.boltsCount = value;
    }

    /**
     * Gets the value of the boltsSpacing property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBoltsSpacing() {
        return boltsSpacing;
    }

    /**
     * Sets the value of the boltsSpacing property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBoltsSpacing(BigDecimal value) {
        this.boltsSpacing = value;
    }

    /**
     * Gets the value of the brand property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBrand() {
        return brand;
    }

    /**
     * Sets the value of the brand property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBrand(JAXBElement<String> value) {
        this.brand = value;
    }

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
     * Gets the value of the dia property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDia() {
        return dia;
    }

    /**
     * Sets the value of the dia property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDia(BigDecimal value) {
        this.dia = value;
    }

    /**
     * Gets the value of the diameter property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiameter() {
        return diameter;
    }

    /**
     * Sets the value of the diameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiameter(BigDecimal value) {
        this.diameter = value;
    }

    /**
     * Gets the value of the et property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEt() {
        return et;
    }

    /**
     * Sets the value of the et property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEt(BigDecimal value) {
        this.et = value;
    }

    /**
     * Gets the value of the imgBig property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getImgBig() {
        return imgBig;
    }

    /**
     * Sets the value of the imgBig property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setImgBig(JAXBElement<String> value) {
        this.imgBig = value;
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
     * Gets the value of the insetType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInsetType() {
        return insetType;
    }

    /**
     * Sets the value of the insetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInsetType(JAXBElement<String> value) {
        this.insetType = value;
    }

    /**
     * Gets the value of the logo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLogo() {
        return logo;
    }

    /**
     * Sets the value of the logo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLogo(JAXBElement<String> value) {
        this.logo = value;
    }

    /**
     * Gets the value of the markaHtml property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarkaHtml() {
        return markaHtml;
    }

    /**
     * Sets the value of the markaHtml property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarkaHtml(JAXBElement<String> value) {
        this.markaHtml = value;
    }

    /**
     * Gets the value of the markaLogo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarkaLogo() {
        return markaLogo;
    }

    /**
     * Sets the value of the markaLogo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarkaLogo(JAXBElement<String> value) {
        this.markaLogo = value;
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
     * Gets the value of the modelHtml property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getModelHtml() {
        return modelHtml;
    }

    /**
     * Sets the value of the modelHtml property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setModelHtml(JAXBElement<String> value) {
        this.modelHtml = value;
    }

    /**
     * Gets the value of the mount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMount() {
        return mount;
    }

    /**
     * Sets the value of the mount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMount(JAXBElement<String> value) {
        this.mount = value;
    }

    /**
     * Gets the value of the mountNote property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMountNote() {
        return mountNote;
    }

    /**
     * Sets the value of the mountNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMountNote(JAXBElement<String> value) {
        this.mountNote = value;
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
     * Gets the value of the producer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProducer() {
        return producer;
    }

    /**
     * Sets the value of the producer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProducer(JAXBElement<String> value) {
        this.producer = value;
    }

    /**
     * Gets the value of the rimVidName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRimVidName() {
        return rimVidName;
    }

    /**
     * Sets the value of the rimVidName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRimVidName(JAXBElement<String> value) {
        this.rimVidName = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setType(JAXBElement<Integer> value) {
        this.type = value;
    }

    /**
     * Gets the value of the useCk property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUseCk() {
        return useCk;
    }

    /**
     * Sets the value of the useCk property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUseCk(JAXBElement<String> value) {
        this.useCk = value;
    }

    /**
     * Gets the value of the volume property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setVolume(JAXBElement<BigDecimal> value) {
        this.volume = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setWeight(JAXBElement<BigDecimal> value) {
        this.weight = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWidth(BigDecimal value) {
        this.width = value;
    }

}
