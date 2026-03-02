
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
 * <p>Java class for GetGoodsByCarFilter complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GetGoodsByCarFilter">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="marka" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="model" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="modification" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="podbor_type" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         <element name="season_list" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         <element name="thorn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="type" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         <element name="wrh_list" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         <element name="year_beg" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="year_end" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "GetGoodsByCarFilter", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsBySpecs", propOrder = {
    "marka",
    "model",
    "modification",
    "podborType",
    "seasonList",
    "thorn",
    "type",
    "wrhList",
    "yearBeg",
    "yearEnd",
    "addressId"
})
public class GetGoodsByCarFilter {

    @XmlElement(required = true, nillable = true)
    protected String marka;
    @XmlElement(required = true, nillable = true)
    protected String model;
    @XmlElement(required = true, nillable = true)
    protected String modification;
    @XmlElementRef(name = "podbor_type", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsBySpecs", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> podborType;
    @XmlElementRef(name = "season_list", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsBySpecs", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> seasonList;
    @XmlElementRef(name = "thorn", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsBySpecs", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> thorn;
    @XmlElementRef(name = "type", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsBySpecs", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> type;
    @XmlElementRef(name = "wrh_list", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsBySpecs", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> wrhList;
    @XmlElement(name = "year_beg", required = true, nillable = true)
    protected String yearBeg;
    @XmlElement(name = "year_end", required = true, nillable = true)
    protected String yearEnd;
    @XmlElementRef(name = "address_id", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsBySpecs", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> addressId;

    /**
     * Gets the value of the marka property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarka() {
        return marka;
    }

    /**
     * Sets the value of the marka property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarka(String value) {
        this.marka = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Gets the value of the modification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModification() {
        return modification;
    }

    /**
     * Sets the value of the modification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModification(String value) {
        this.modification = value;
    }

    /**
     * Gets the value of the podborType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getPodborType() {
        return podborType;
    }

    /**
     * Sets the value of the podborType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setPodborType(JAXBElement<ArrayOfint> value) {
        this.podborType = value;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setType(JAXBElement<ArrayOfstring> value) {
        this.type = value;
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
     * Gets the value of the yearBeg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYearBeg() {
        return yearBeg;
    }

    /**
     * Sets the value of the yearBeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYearBeg(String value) {
        this.yearBeg = value;
    }

    /**
     * Gets the value of the yearEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYearEnd() {
        return yearEnd;
    }

    /**
     * Sets the value of the yearEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYearEnd(String value) {
        this.yearEnd = value;
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
