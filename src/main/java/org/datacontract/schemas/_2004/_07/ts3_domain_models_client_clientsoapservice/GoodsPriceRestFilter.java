
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
 * <p>Java class for GoodsPriceRestFilter complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GoodsPriceRestFilter">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="code_list" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring"/>
 *         <element name="wrh_list" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         <element name="include_paid_delivery" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="user_address_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="searchCodeByOccurence" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GoodsPriceRestFilter", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsAndPricesInfo", propOrder = {
    "codeList",
    "wrhList",
    "includePaidDelivery",
    "userAddressId",
    "searchCodeByOccurence"
})
public class GoodsPriceRestFilter {

    @XmlElement(name = "code_list", required = true, nillable = true)
    protected ArrayOfstring codeList;
    @XmlElementRef(name = "wrh_list", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsAndPricesInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> wrhList;
    @XmlElementRef(name = "include_paid_delivery", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsAndPricesInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> includePaidDelivery;
    @XmlElementRef(name = "user_address_id", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsAndPricesInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> userAddressId;
    @XmlElementRef(name = "searchCodeByOccurence", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsAndPricesInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> searchCodeByOccurence;

    /**
     * Gets the value of the codeList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getCodeList() {
        return codeList;
    }

    /**
     * Sets the value of the codeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setCodeList(ArrayOfstring value) {
        this.codeList = value;
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
     * Gets the value of the userAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUserAddressId() {
        return userAddressId;
    }

    /**
     * Sets the value of the userAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUserAddressId(JAXBElement<Integer> value) {
        this.userAddressId = value;
    }

    /**
     * Gets the value of the searchCodeByOccurence property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSearchCodeByOccurence() {
        return searchCodeByOccurence;
    }

    /**
     * Sets the value of the searchCodeByOccurence property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSearchCodeByOccurence(JAXBElement<Boolean> value) {
        this.searchCodeByOccurence = value;
    }

}
