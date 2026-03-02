
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdecimal;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfunsignedByte;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetFindCameraFilter complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GetFindCameraFilter">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="address_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="brand_list" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         <element name="code_list" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         <element name="diameter_list" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfdecimal" minOccurs="0"/>
 *         <element name="sort" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="subtype_id_list" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfunsignedByte" minOccurs="0"/>
 *         <element name="wrh_list" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         <element name="include_paid_delivery" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFindCameraFilter", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetFindCamera", propOrder = {
    "addressId",
    "brandList",
    "codeList",
    "diameterList",
    "sort",
    "subtypeIdList",
    "wrhList",
    "includePaidDelivery"
})
public class GetFindCameraFilter {

    @XmlElementRef(name = "address_id", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetFindCamera", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> addressId;
    @XmlElementRef(name = "brand_list", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetFindCamera", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> brandList;
    @XmlElementRef(name = "code_list", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetFindCamera", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> codeList;
    @XmlElementRef(name = "diameter_list", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetFindCamera", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfdecimal> diameterList;
    @XmlElementRef(name = "sort", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetFindCamera", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> sort;
    @XmlElementRef(name = "subtype_id_list", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetFindCamera", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfunsignedByte> subtypeIdList;
    @XmlElementRef(name = "wrh_list", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetFindCamera", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> wrhList;
    @XmlElementRef(name = "include_paid_delivery", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetFindCamera", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> includePaidDelivery;

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
     * Gets the value of the diameterList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfdecimal }{@code >}
     *     
     */
    public JAXBElement<ArrayOfdecimal> getDiameterList() {
        return diameterList;
    }

    /**
     * Sets the value of the diameterList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfdecimal }{@code >}
     *     
     */
    public void setDiameterList(JAXBElement<ArrayOfdecimal> value) {
        this.diameterList = value;
    }

    /**
     * Gets the value of the sort property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSort() {
        return sort;
    }

    /**
     * Sets the value of the sort property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSort(JAXBElement<Integer> value) {
        this.sort = value;
    }

    /**
     * Gets the value of the subtypeIdList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfunsignedByte }{@code >}
     *     
     */
    public JAXBElement<ArrayOfunsignedByte> getSubtypeIdList() {
        return subtypeIdList;
    }

    /**
     * Sets the value of the subtypeIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfunsignedByte }{@code >}
     *     
     */
    public void setSubtypeIdList(JAXBElement<ArrayOfunsignedByte> value) {
        this.subtypeIdList = value;
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

}
