
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import java.math.BigDecimal;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FindWheelFilterTireContainer complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FindWheelFilterTireContainer">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="width_min" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="width_max" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="height_min" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="height_max" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="diameter_min" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="diameter_max" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="axis_apply" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         <element name="code_list" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         <element name="brand_list" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         <element name="camera" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="reinforced" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="runflat" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="model_list" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         <element name="vendor_codes" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         <element name="quality" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="season_list" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         <element name="thorn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="load_index" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         <element name="speed_index" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         <element name="sloy_list" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         <element name="retread" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindWheelFilterTireContainer", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetFindWheel", propOrder = {
    "widthMin",
    "widthMax",
    "heightMin",
    "heightMax",
    "diameterMin",
    "diameterMax",
    "axisApply",
    "codeList",
    "brandList",
    "camera",
    "reinforced",
    "runflat",
    "modelList",
    "vendorCodes",
    "quality",
    "seasonList",
    "thorn",
    "loadIndex",
    "speedIndex",
    "sloyList",
    "retread"
})
public class FindWheelFilterTireContainer {

    @XmlElement(name = "width_min")
    protected BigDecimal widthMin;
    @XmlElement(name = "width_max")
    protected BigDecimal widthMax;
    @XmlElement(name = "height_min")
    protected BigDecimal heightMin;
    @XmlElement(name = "height_max")
    protected BigDecimal heightMax;
    @XmlElement(name = "diameter_min")
    protected BigDecimal diameterMin;
    @XmlElement(name = "diameter_max")
    protected BigDecimal diameterMax;
    @XmlElementRef(name = "axis_apply", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetFindWheel", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> axisApply;
    @XmlElementRef(name = "code_list", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetFindWheel", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> codeList;
    @XmlElementRef(name = "brand_list", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetFindWheel", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> brandList;
    @XmlElementRef(name = "camera", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetFindWheel", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> camera;
    @XmlElementRef(name = "reinforced", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetFindWheel", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> reinforced;
    @XmlElementRef(name = "runflat", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetFindWheel", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> runflat;
    @XmlElementRef(name = "model_list", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetFindWheel", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> modelList;
    @XmlElementRef(name = "vendor_codes", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetFindWheel", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> vendorCodes;
    @XmlElementRef(name = "quality", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetFindWheel", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> quality;
    @XmlElementRef(name = "season_list", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetFindWheel", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> seasonList;
    @XmlElementRef(name = "thorn", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetFindWheel", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> thorn;
    @XmlElementRef(name = "load_index", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetFindWheel", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> loadIndex;
    @XmlElementRef(name = "speed_index", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetFindWheel", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> speedIndex;
    @XmlElementRef(name = "sloy_list", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetFindWheel", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> sloyList;
    @XmlElementRef(name = "retread", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetFindWheel", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> retread;

    /**
     * Gets the value of the widthMin property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWidthMin() {
        return widthMin;
    }

    /**
     * Sets the value of the widthMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWidthMin(BigDecimal value) {
        this.widthMin = value;
    }

    /**
     * Gets the value of the widthMax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWidthMax() {
        return widthMax;
    }

    /**
     * Sets the value of the widthMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWidthMax(BigDecimal value) {
        this.widthMax = value;
    }

    /**
     * Gets the value of the heightMin property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHeightMin() {
        return heightMin;
    }

    /**
     * Sets the value of the heightMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHeightMin(BigDecimal value) {
        this.heightMin = value;
    }

    /**
     * Gets the value of the heightMax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHeightMax() {
        return heightMax;
    }

    /**
     * Sets the value of the heightMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHeightMax(BigDecimal value) {
        this.heightMax = value;
    }

    /**
     * Gets the value of the diameterMin property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiameterMin() {
        return diameterMin;
    }

    /**
     * Sets the value of the diameterMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiameterMin(BigDecimal value) {
        this.diameterMin = value;
    }

    /**
     * Gets the value of the diameterMax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiameterMax() {
        return diameterMax;
    }

    /**
     * Sets the value of the diameterMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiameterMax(BigDecimal value) {
        this.diameterMax = value;
    }

    /**
     * Gets the value of the axisApply property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getAxisApply() {
        return axisApply;
    }

    /**
     * Sets the value of the axisApply property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setAxisApply(JAXBElement<ArrayOfstring> value) {
        this.axisApply = value;
    }

    /**
     * Gets the value of the codeList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getCodeList() {
        return codeList;
    }

    /**
     * Sets the value of the codeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setCodeList(JAXBElement<ArrayOfstring> value) {
        this.codeList = value;
    }

    /**
     * Gets the value of the brandList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getBrandList() {
        return brandList;
    }

    /**
     * Sets the value of the brandList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setBrandList(JAXBElement<ArrayOfstring> value) {
        this.brandList = value;
    }

    /**
     * Gets the value of the camera property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCamera() {
        return camera;
    }

    /**
     * Sets the value of the camera property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCamera(JAXBElement<Integer> value) {
        this.camera = value;
    }

    /**
     * Gets the value of the reinforced property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getReinforced() {
        return reinforced;
    }

    /**
     * Sets the value of the reinforced property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setReinforced(JAXBElement<Boolean> value) {
        this.reinforced = value;
    }

    /**
     * Gets the value of the runflat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRunflat() {
        return runflat;
    }

    /**
     * Sets the value of the runflat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRunflat(JAXBElement<Boolean> value) {
        this.runflat = value;
    }

    /**
     * Gets the value of the modelList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getModelList() {
        return modelList;
    }

    /**
     * Sets the value of the modelList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setModelList(JAXBElement<ArrayOfstring> value) {
        this.modelList = value;
    }

    /**
     * Gets the value of the vendorCodes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getVendorCodes() {
        return vendorCodes;
    }

    /**
     * Sets the value of the vendorCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setVendorCodes(JAXBElement<ArrayOfstring> value) {
        this.vendorCodes = value;
    }

    /**
     * Gets the value of the quality property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getQuality() {
        return quality;
    }

    /**
     * Sets the value of the quality property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setQuality(JAXBElement<Integer> value) {
        this.quality = value;
    }

    /**
     * Gets the value of the seasonList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getSeasonList() {
        return seasonList;
    }

    /**
     * Sets the value of the seasonList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setSeasonList(JAXBElement<ArrayOfstring> value) {
        this.seasonList = value;
    }

    /**
     * Gets the value of the thorn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getThorn() {
        return thorn;
    }

    /**
     * Sets the value of the thorn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setThorn(JAXBElement<Boolean> value) {
        this.thorn = value;
    }

    /**
     * Gets the value of the loadIndex property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getLoadIndex() {
        return loadIndex;
    }

    /**
     * Sets the value of the loadIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setLoadIndex(JAXBElement<ArrayOfstring> value) {
        this.loadIndex = value;
    }

    /**
     * Gets the value of the speedIndex property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getSpeedIndex() {
        return speedIndex;
    }

    /**
     * Sets the value of the speedIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setSpeedIndex(JAXBElement<ArrayOfstring> value) {
        this.speedIndex = value;
    }

    /**
     * Gets the value of the sloyList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getSloyList() {
        return sloyList;
    }

    /**
     * Sets the value of the sloyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setSloyList(JAXBElement<ArrayOfint> value) {
        this.sloyList = value;
    }

    /**
     * Gets the value of the retread property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRetread() {
        return retread;
    }

    /**
     * Sets the value of the retread property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRetread(JAXBElement<Boolean> value) {
        this.retread = value;
    }

}
