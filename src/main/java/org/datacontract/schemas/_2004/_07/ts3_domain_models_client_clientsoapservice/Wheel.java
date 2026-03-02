
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ts3_domain_models_client.ArrayOfwhPriceRest;


/**
 * <p>Java class for Wheel complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Wheel">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="disk_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="img_big_my" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="img_big_pish" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="img_small" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="marka" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="quality" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="tire_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "Wheel", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetFindWheel", propOrder = {
    "code",
    "diskCode",
    "imgBigMy",
    "imgBigPish",
    "imgSmall",
    "marka",
    "name",
    "quality",
    "tireCode",
    "whpr"
})
public class Wheel {

    @XmlElementRef(name = "code", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetFindWheel", type = JAXBElement.class, required = false)
    protected JAXBElement<String> code;
    @XmlElementRef(name = "disk_code", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetFindWheel", type = JAXBElement.class, required = false)
    protected JAXBElement<String> diskCode;
    @XmlElementRef(name = "img_big_my", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetFindWheel", type = JAXBElement.class, required = false)
    protected JAXBElement<String> imgBigMy;
    @XmlElementRef(name = "img_big_pish", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetFindWheel", type = JAXBElement.class, required = false)
    protected JAXBElement<String> imgBigPish;
    @XmlElementRef(name = "img_small", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetFindWheel", type = JAXBElement.class, required = false)
    protected JAXBElement<String> imgSmall;
    @XmlElementRef(name = "marka", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetFindWheel", type = JAXBElement.class, required = false)
    protected JAXBElement<String> marka;
    @XmlElementRef(name = "name", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetFindWheel", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    protected Integer quality;
    @XmlElementRef(name = "tire_code", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetFindWheel", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tireCode;
    @XmlElementRef(name = "whpr", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetFindWheel", type = JAXBElement.class, required = false)
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
     * Gets the value of the diskCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDiskCode() {
        return diskCode;
    }

    /**
     * Sets the value of the diskCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDiskCode(JAXBElement<String> value) {
        this.diskCode = value;
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
     * Gets the value of the quality property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuality() {
        return quality;
    }

    /**
     * Sets the value of the quality property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuality(Integer value) {
        this.quality = value;
    }

    /**
     * Gets the value of the tireCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTireCode() {
        return tireCode;
    }

    /**
     * Sets the value of the tireCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTireCode(JAXBElement<String> value) {
        this.tireCode = value;
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
