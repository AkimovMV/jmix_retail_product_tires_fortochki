
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetConsumableFilter complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GetConsumableFilter">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="applicability_list" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         <element name="brand_list" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         <element name="code_list" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         <element name="color_list" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         <element name="material_list" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         <element name="sort" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="type" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="weight_max" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="weight_min" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="wrh_list" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         <element name="include_paid_delivery" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="address_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetConsumableFilter", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetConsumable", propOrder = {
    "applicabilityList",
    "brandList",
    "codeList",
    "colorList",
    "materialList",
    "sort",
    "type",
    "weightMax",
    "weightMin",
    "wrhList",
    "includePaidDelivery",
    "addressId"
})
public class GetConsumableFilter {

    @XmlElementRef(name = "applicability_list", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetConsumable", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> applicabilityList;
    @XmlElementRef(name = "brand_list", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetConsumable", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> brandList;
    @XmlElementRef(name = "code_list", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetConsumable", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> codeList;
    @XmlElementRef(name = "color_list", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetConsumable", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> colorList;
    @XmlElementRef(name = "material_list", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetConsumable", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> materialList;
    protected Integer sort;
    protected int type;
    @XmlElement(name = "weight_max")
    protected Integer weightMax;
    @XmlElement(name = "weight_min")
    protected Integer weightMin;
    @XmlElementRef(name = "wrh_list", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetConsumable", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> wrhList;
    @XmlElementRef(name = "include_paid_delivery", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetConsumable", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> includePaidDelivery;
    @XmlElementRef(name = "address_id", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetConsumable", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> addressId;

    /**
     * Gets the value of the applicabilityList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getApplicabilityList() {
        return applicabilityList;
    }

    /**
     * Sets the value of the applicabilityList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setApplicabilityList(JAXBElement<ArrayOfint> value) {
        this.applicabilityList = value;
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
     * Gets the value of the materialList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getMaterialList() {
        return materialList;
    }

    /**
     * Sets the value of the materialList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setMaterialList(JAXBElement<ArrayOfstring> value) {
        this.materialList = value;
    }

    /**
     * Gets the value of the sort property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * Sets the value of the sort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSort(Integer value) {
        this.sort = value;
    }

    /**
     * Gets the value of the type property.
     * 
     */
    public int getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     */
    public void setType(int value) {
        this.type = value;
    }

    /**
     * Gets the value of the weightMax property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWeightMax() {
        return weightMax;
    }

    /**
     * Sets the value of the weightMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWeightMax(Integer value) {
        this.weightMax = value;
    }

    /**
     * Gets the value of the weightMin property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWeightMin() {
        return weightMin;
    }

    /**
     * Sets the value of the weightMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWeightMin(Integer value) {
        this.weightMin = value;
    }

    /**
     * Gets the value of the wrhList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getWrhList() {
        return wrhList;
    }

    /**
     * Sets the value of the wrhList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setWrhList(JAXBElement<ArrayOfint> value) {
        this.wrhList = value;
    }

    /**
     * Gets the value of the includePaidDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIncludePaidDelivery() {
        return includePaidDelivery;
    }

    /**
     * Sets the value of the includePaidDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIncludePaidDelivery(JAXBElement<Boolean> value) {
        this.includePaidDelivery = value;
    }

    /**
     * Gets the value of the addressId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAddressId() {
        return addressId;
    }

    /**
     * Sets the value of the addressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAddressId(JAXBElement<Integer> value) {
        this.addressId = value;
    }

}
