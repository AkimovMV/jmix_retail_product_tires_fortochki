
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
 * <p>Java class for GetOilFilter complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GetOilFilter">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="applicability_list" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         <element name="brand_list" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         <element name="code_list" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         <element name="manufacturer_code_list" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         <element name="model_list" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         <element name="viscosity_list" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         <element name="type_list" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         <element name="sort" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "GetOilFilter", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOil", propOrder = {
    "applicabilityList",
    "brandList",
    "codeList",
    "manufacturerCodeList",
    "modelList",
    "viscosityList",
    "typeList",
    "sort",
    "wrhList",
    "includePaidDelivery",
    "addressId"
})
public class GetOilFilter {

    @XmlElementRef(name = "applicability_list", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOil", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> applicabilityList;
    @XmlElementRef(name = "brand_list", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOil", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> brandList;
    @XmlElementRef(name = "code_list", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOil", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> codeList;
    @XmlElementRef(name = "manufacturer_code_list", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOil", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> manufacturerCodeList;
    @XmlElementRef(name = "model_list", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOil", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> modelList;
    @XmlElementRef(name = "viscosity_list", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOil", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> viscosityList;
    @XmlElementRef(name = "type_list", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOil", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> typeList;
    protected Integer sort;
    @XmlElementRef(name = "wrh_list", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOil", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> wrhList;
    @XmlElement(name = "include_paid_delivery")
    protected Boolean includePaidDelivery;
    @XmlElementRef(name = "address_id", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOil", type = JAXBElement.class, required = false)
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
     * Gets the value of the manufacturerCodeList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getManufacturerCodeList() {
        return manufacturerCodeList;
    }

    /**
     * Sets the value of the manufacturerCodeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setManufacturerCodeList(JAXBElement<ArrayOfstring> value) {
        this.manufacturerCodeList = value;
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
     * Gets the value of the viscosityList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getViscosityList() {
        return viscosityList;
    }

    /**
     * Sets the value of the viscosityList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setViscosityList(JAXBElement<ArrayOfstring> value) {
        this.viscosityList = value;
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
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludePaidDelivery() {
        return includePaidDelivery;
    }

    /**
     * Sets the value of the includePaidDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludePaidDelivery(Boolean value) {
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
