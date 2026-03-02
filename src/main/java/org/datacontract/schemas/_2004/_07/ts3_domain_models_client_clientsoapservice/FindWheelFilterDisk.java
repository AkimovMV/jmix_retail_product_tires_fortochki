
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
 * <p>Java class for FindWheelFilterDisk complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FindWheelFilterDisk">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="bolts_count_max" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="bolts_count_min" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="bolts_spacing_max" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="bolts_spacing_min" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="brand_list" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         <element name="code_list" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         <element name="color_list" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         <element name="dia_max" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="dia_min" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="diameter_max" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="diameter_min" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="et_max" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="et_min" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="width_max" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="width_min" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="type_list" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         <element name="model_list" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         <element name="vendor_codes" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         <element name="rim_vid_name_list" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         <element name="quality" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindWheelFilterDisk", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetFindWheel", propOrder = {
    "boltsCountMax",
    "boltsCountMin",
    "boltsSpacingMax",
    "boltsSpacingMin",
    "brandList",
    "codeList",
    "colorList",
    "diaMax",
    "diaMin",
    "diameterMax",
    "diameterMin",
    "etMax",
    "etMin",
    "widthMax",
    "widthMin",
    "typeList",
    "modelList",
    "vendorCodes",
    "rimVidNameList",
    "quality"
})
public class FindWheelFilterDisk {

    @XmlElement(name = "bolts_count_max")
    protected Integer boltsCountMax;
    @XmlElement(name = "bolts_count_min")
    protected Integer boltsCountMin;
    @XmlElement(name = "bolts_spacing_max")
    protected BigDecimal boltsSpacingMax;
    @XmlElement(name = "bolts_spacing_min")
    protected BigDecimal boltsSpacingMin;
    @XmlElementRef(name = "brand_list", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetFindWheel", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> brandList;
    @XmlElementRef(name = "code_list", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetFindWheel", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> codeList;
    @XmlElementRef(name = "color_list", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetFindWheel", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> colorList;
    @XmlElement(name = "dia_max")
    protected BigDecimal diaMax;
    @XmlElement(name = "dia_min")
    protected BigDecimal diaMin;
    @XmlElement(name = "diameter_max")
    protected Integer diameterMax;
    @XmlElement(name = "diameter_min")
    protected Integer diameterMin;
    @XmlElement(name = "et_max")
    protected BigDecimal etMax;
    @XmlElement(name = "et_min")
    protected BigDecimal etMin;
    @XmlElement(name = "width_max")
    protected BigDecimal widthMax;
    @XmlElement(name = "width_min")
    protected BigDecimal widthMin;
    @XmlElementRef(name = "type_list", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetFindWheel", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> typeList;
    @XmlElementRef(name = "model_list", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetFindWheel", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> modelList;
    @XmlElementRef(name = "vendor_codes", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetFindWheel", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> vendorCodes;
    @XmlElementRef(name = "rim_vid_name_list", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetFindWheel", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> rimVidNameList;
    @XmlElementRef(name = "quality", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetFindWheel", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> quality;

    /**
     * Gets the value of the boltsCountMax property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBoltsCountMax() {
        return boltsCountMax;
    }

    /**
     * Sets the value of the boltsCountMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBoltsCountMax(Integer value) {
        this.boltsCountMax = value;
    }

    /**
     * Gets the value of the boltsCountMin property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBoltsCountMin() {
        return boltsCountMin;
    }

    /**
     * Sets the value of the boltsCountMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBoltsCountMin(Integer value) {
        this.boltsCountMin = value;
    }

    /**
     * Gets the value of the boltsSpacingMax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBoltsSpacingMax() {
        return boltsSpacingMax;
    }

    /**
     * Sets the value of the boltsSpacingMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBoltsSpacingMax(BigDecimal value) {
        this.boltsSpacingMax = value;
    }

    /**
     * Gets the value of the boltsSpacingMin property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBoltsSpacingMin() {
        return boltsSpacingMin;
    }

    /**
     * Sets the value of the boltsSpacingMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBoltsSpacingMin(BigDecimal value) {
        this.boltsSpacingMin = value;
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
     * Gets the value of the colorList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getColorList() {
        return colorList;
    }

    /**
     * Sets the value of the colorList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setColorList(JAXBElement<ArrayOfstring> value) {
        this.colorList = value;
    }

    /**
     * Gets the value of the diaMax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiaMax() {
        return diaMax;
    }

    /**
     * Sets the value of the diaMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiaMax(BigDecimal value) {
        this.diaMax = value;
    }

    /**
     * Gets the value of the diaMin property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiaMin() {
        return diaMin;
    }

    /**
     * Sets the value of the diaMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiaMin(BigDecimal value) {
        this.diaMin = value;
    }

    /**
     * Gets the value of the diameterMax property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDiameterMax() {
        return diameterMax;
    }

    /**
     * Sets the value of the diameterMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDiameterMax(Integer value) {
        this.diameterMax = value;
    }

    /**
     * Gets the value of the diameterMin property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDiameterMin() {
        return diameterMin;
    }

    /**
     * Sets the value of the diameterMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDiameterMin(Integer value) {
        this.diameterMin = value;
    }

    /**
     * Gets the value of the etMax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEtMax() {
        return etMax;
    }

    /**
     * Sets the value of the etMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEtMax(BigDecimal value) {
        this.etMax = value;
    }

    /**
     * Gets the value of the etMin property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEtMin() {
        return etMin;
    }

    /**
     * Sets the value of the etMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEtMin(BigDecimal value) {
        this.etMin = value;
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
     * Gets the value of the typeList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getTypeList() {
        return typeList;
    }

    /**
     * Sets the value of the typeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setTypeList(JAXBElement<ArrayOfint> value) {
        this.typeList = value;
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
     * Gets the value of the rimVidNameList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getRimVidNameList() {
        return rimVidNameList;
    }

    /**
     * Sets the value of the rimVidNameList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setRimVidNameList(JAXBElement<ArrayOfstring> value) {
        this.rimVidNameList = value;
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

}
