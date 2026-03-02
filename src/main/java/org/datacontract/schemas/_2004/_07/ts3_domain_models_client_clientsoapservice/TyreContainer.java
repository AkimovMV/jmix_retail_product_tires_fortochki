
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import java.math.BigDecimal;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TyreContainer complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TyreContainer">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="aquaplaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="axle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="brand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="camera" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="comfort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="constr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="diameter" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="diameter_out" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="grip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="height" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="img_big" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="img_big_my" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="img_big_pish" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="img_small" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="initial_tread_depth" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="load_index" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="marka_html" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="marka_logo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="marker_color" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="model_html" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="moto_use" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="noise" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="number_layers_treadmill" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="omolog" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="passability" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="protection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="protector_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="puncture" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="season" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="side" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="sloy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="softness" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="speed_index" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="strengthening" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="sub_diameter" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="sub_diameter_out" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="subheight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="subwidth" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="tech" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="thorn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="thorn_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="tonnage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="tread_width" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="usa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="use_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="volume" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="wear_index" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "TyreContainer", propOrder = {
    "aquaplaning",
    "axle",
    "brand",
    "camera",
    "code",
    "comfort",
    "constr",
    "diameter",
    "diameterOut",
    "grip",
    "height",
    "imgBig",
    "imgBigMy",
    "imgBigPish",
    "imgSmall",
    "initialTreadDepth",
    "loadIndex",
    "markaHtml",
    "markaLogo",
    "markerColor",
    "model",
    "modelHtml",
    "motoUse",
    "name",
    "noise",
    "numberLayersTreadmill",
    "omolog",
    "passability",
    "protection",
    "protectorType",
    "puncture",
    "season",
    "side",
    "sloy",
    "softness",
    "speedIndex",
    "strengthening",
    "subDiameter",
    "subDiameterOut",
    "subheight",
    "subwidth",
    "tech",
    "thorn",
    "thornType",
    "tonnage",
    "treadWidth",
    "type",
    "usa",
    "useType",
    "volume",
    "wearIndex",
    "weight",
    "width"
})
public class TyreContainer {

    @XmlElementRef(name = "aquaplaning", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> aquaplaning;
    @XmlElementRef(name = "axle", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> axle;
    @XmlElementRef(name = "brand", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> brand;
    @XmlElementRef(name = "camera", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> camera;
    @XmlElementRef(name = "code", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> code;
    @XmlElementRef(name = "comfort", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> comfort;
    @XmlElementRef(name = "constr", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> constr;
    @XmlElementRef(name = "diameter", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> diameter;
    @XmlElementRef(name = "diameter_out", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> diameterOut;
    @XmlElementRef(name = "grip", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> grip;
    @XmlElementRef(name = "height", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> height;
    @XmlElementRef(name = "img_big", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> imgBig;
    @XmlElementRef(name = "img_big_my", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> imgBigMy;
    @XmlElementRef(name = "img_big_pish", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> imgBigPish;
    @XmlElementRef(name = "img_small", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> imgSmall;
    @XmlElementRef(name = "initial_tread_depth", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> initialTreadDepth;
    @XmlElementRef(name = "load_index", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> loadIndex;
    @XmlElementRef(name = "marka_html", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> markaHtml;
    @XmlElementRef(name = "marka_logo", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> markaLogo;
    @XmlElementRef(name = "marker_color", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> markerColor;
    @XmlElementRef(name = "model", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> model;
    @XmlElementRef(name = "model_html", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> modelHtml;
    @XmlElementRef(name = "moto_use", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> motoUse;
    @XmlElementRef(name = "name", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "noise", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> noise;
    @XmlElementRef(name = "number_layers_treadmill", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numberLayersTreadmill;
    @XmlElementRef(name = "omolog", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> omolog;
    @XmlElementRef(name = "passability", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> passability;
    @XmlElementRef(name = "protection", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> protection;
    @XmlElementRef(name = "protector_type", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> protectorType;
    @XmlElementRef(name = "puncture", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> puncture;
    @XmlElementRef(name = "season", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> season;
    @XmlElementRef(name = "side", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> side;
    @XmlElementRef(name = "sloy", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sloy;
    @XmlElementRef(name = "softness", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> softness;
    @XmlElementRef(name = "speed_index", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> speedIndex;
    @XmlElementRef(name = "strengthening", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> strengthening;
    @XmlElementRef(name = "sub_diameter", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> subDiameter;
    @XmlElementRef(name = "sub_diameter_out", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> subDiameterOut;
    @XmlElementRef(name = "subheight", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> subheight;
    @XmlElementRef(name = "subwidth", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> subwidth;
    @XmlElementRef(name = "tech", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tech;
    protected Boolean thorn;
    @XmlElementRef(name = "thorn_type", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> thornType;
    @XmlElementRef(name = "tonnage", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tonnage;
    @XmlElementRef(name = "tread_width", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> treadWidth;
    @XmlElementRef(name = "type", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> type;
    @XmlElementRef(name = "usa", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> usa;
    @XmlElementRef(name = "use_type", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> useType;
    @XmlElementRef(name = "volume", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> volume;
    @XmlElementRef(name = "wear_index", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> wearIndex;
    @XmlElementRef(name = "weight", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> weight;
    @XmlElementRef(name = "width", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> width;

    /**
     * Gets the value of the aquaplaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAquaplaning() {
        return aquaplaning;
    }

    /**
     * Sets the value of the aquaplaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAquaplaning(JAXBElement<String> value) {
        this.aquaplaning = value;
    }

    /**
     * Gets the value of the axle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAxle() {
        return axle;
    }

    /**
     * Sets the value of the axle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAxle(JAXBElement<String> value) {
        this.axle = value;
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
     * Gets the value of the camera property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCamera() {
        return camera;
    }

    /**
     * Sets the value of the camera property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCamera(JAXBElement<String> value) {
        this.camera = value;
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
     * Gets the value of the comfort property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComfort() {
        return comfort;
    }

    /**
     * Sets the value of the comfort property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComfort(JAXBElement<String> value) {
        this.comfort = value;
    }

    /**
     * Gets the value of the constr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConstr() {
        return constr;
    }

    /**
     * Sets the value of the constr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConstr(JAXBElement<String> value) {
        this.constr = value;
    }

    /**
     * Gets the value of the diameter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDiameter() {
        return diameter;
    }

    /**
     * Sets the value of the diameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDiameter(JAXBElement<BigDecimal> value) {
        this.diameter = value;
    }

    /**
     * Gets the value of the diameterOut property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDiameterOut() {
        return diameterOut;
    }

    /**
     * Sets the value of the diameterOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDiameterOut(JAXBElement<BigDecimal> value) {
        this.diameterOut = value;
    }

    /**
     * Gets the value of the grip property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGrip() {
        return grip;
    }

    /**
     * Sets the value of the grip property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGrip(JAXBElement<String> value) {
        this.grip = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setHeight(JAXBElement<BigDecimal> value) {
        this.height = value;
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
     * Gets the value of the initialTreadDepth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getInitialTreadDepth() {
        return initialTreadDepth;
    }

    /**
     * Sets the value of the initialTreadDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setInitialTreadDepth(JAXBElement<BigDecimal> value) {
        this.initialTreadDepth = value;
    }

    /**
     * Gets the value of the loadIndex property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLoadIndex() {
        return loadIndex;
    }

    /**
     * Sets the value of the loadIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLoadIndex(JAXBElement<String> value) {
        this.loadIndex = value;
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
     * Gets the value of the markerColor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarkerColor() {
        return markerColor;
    }

    /**
     * Sets the value of the markerColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarkerColor(JAXBElement<String> value) {
        this.markerColor = value;
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
     * Gets the value of the motoUse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMotoUse() {
        return motoUse;
    }

    /**
     * Sets the value of the motoUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMotoUse(JAXBElement<String> value) {
        this.motoUse = value;
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
     * Gets the value of the noise property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNoise() {
        return noise;
    }

    /**
     * Sets the value of the noise property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNoise(JAXBElement<String> value) {
        this.noise = value;
    }

    /**
     * Gets the value of the numberLayersTreadmill property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumberLayersTreadmill() {
        return numberLayersTreadmill;
    }

    /**
     * Sets the value of the numberLayersTreadmill property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumberLayersTreadmill(JAXBElement<Integer> value) {
        this.numberLayersTreadmill = value;
    }

    /**
     * Gets the value of the omolog property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOmolog() {
        return omolog;
    }

    /**
     * Sets the value of the omolog property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOmolog(JAXBElement<String> value) {
        this.omolog = value;
    }

    /**
     * Gets the value of the passability property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPassability() {
        return passability;
    }

    /**
     * Sets the value of the passability property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPassability(JAXBElement<String> value) {
        this.passability = value;
    }

    /**
     * Gets the value of the protection property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProtection() {
        return protection;
    }

    /**
     * Sets the value of the protection property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProtection(JAXBElement<String> value) {
        this.protection = value;
    }

    /**
     * Gets the value of the protectorType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProtectorType() {
        return protectorType;
    }

    /**
     * Sets the value of the protectorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProtectorType(JAXBElement<String> value) {
        this.protectorType = value;
    }

    /**
     * Gets the value of the puncture property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPuncture() {
        return puncture;
    }

    /**
     * Sets the value of the puncture property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPuncture(JAXBElement<String> value) {
        this.puncture = value;
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
     * Gets the value of the side property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSide() {
        return side;
    }

    /**
     * Sets the value of the side property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSide(JAXBElement<String> value) {
        this.side = value;
    }

    /**
     * Gets the value of the sloy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSloy() {
        return sloy;
    }

    /**
     * Sets the value of the sloy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSloy(JAXBElement<String> value) {
        this.sloy = value;
    }

    /**
     * Gets the value of the softness property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSoftness() {
        return softness;
    }

    /**
     * Sets the value of the softness property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSoftness(JAXBElement<String> value) {
        this.softness = value;
    }

    /**
     * Gets the value of the speedIndex property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpeedIndex() {
        return speedIndex;
    }

    /**
     * Sets the value of the speedIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpeedIndex(JAXBElement<String> value) {
        this.speedIndex = value;
    }

    /**
     * Gets the value of the strengthening property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getStrengthening() {
        return strengthening;
    }

    /**
     * Sets the value of the strengthening property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setStrengthening(JAXBElement<Boolean> value) {
        this.strengthening = value;
    }

    /**
     * Gets the value of the subDiameter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSubDiameter() {
        return subDiameter;
    }

    /**
     * Sets the value of the subDiameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSubDiameter(JAXBElement<BigDecimal> value) {
        this.subDiameter = value;
    }

    /**
     * Gets the value of the subDiameterOut property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSubDiameterOut() {
        return subDiameterOut;
    }

    /**
     * Sets the value of the subDiameterOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSubDiameterOut(JAXBElement<BigDecimal> value) {
        this.subDiameterOut = value;
    }

    /**
     * Gets the value of the subheight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSubheight() {
        return subheight;
    }

    /**
     * Sets the value of the subheight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSubheight(JAXBElement<BigDecimal> value) {
        this.subheight = value;
    }

    /**
     * Gets the value of the subwidth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSubwidth() {
        return subwidth;
    }

    /**
     * Sets the value of the subwidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSubwidth(JAXBElement<BigDecimal> value) {
        this.subwidth = value;
    }

    /**
     * Gets the value of the tech property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTech() {
        return tech;
    }

    /**
     * Sets the value of the tech property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTech(JAXBElement<String> value) {
        this.tech = value;
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
     * Gets the value of the thornType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getThornType() {
        return thornType;
    }

    /**
     * Sets the value of the thornType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setThornType(JAXBElement<String> value) {
        this.thornType = value;
    }

    /**
     * Gets the value of the tonnage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTonnage() {
        return tonnage;
    }

    /**
     * Sets the value of the tonnage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTonnage(JAXBElement<String> value) {
        this.tonnage = value;
    }

    /**
     * Gets the value of the treadWidth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTreadWidth() {
        return treadWidth;
    }

    /**
     * Sets the value of the treadWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTreadWidth(JAXBElement<Integer> value) {
        this.treadWidth = value;
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
     * Gets the value of the usa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUsa() {
        return usa;
    }

    /**
     * Sets the value of the usa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUsa(JAXBElement<String> value) {
        this.usa = value;
    }

    /**
     * Gets the value of the useType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUseType() {
        return useType;
    }

    /**
     * Sets the value of the useType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUseType(JAXBElement<String> value) {
        this.useType = value;
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
     * Gets the value of the wearIndex property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getWearIndex() {
        return wearIndex;
    }

    /**
     * Sets the value of the wearIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setWearIndex(JAXBElement<Integer> value) {
        this.wearIndex = value;
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
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setWidth(JAXBElement<BigDecimal> value) {
        this.width = value;
    }

}
