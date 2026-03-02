
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import java.math.BigDecimal;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for proposeDiskItem complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="proposeDiskItem">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="boltsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="brand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="car" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="color" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="dia" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="diameter" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="et" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="insertType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="manufactory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="manufactoryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="mount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="mountNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pcd1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="pcd2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
@XmlType(name = "proposeDiskItem", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.ProposeGoods", propOrder = {
    "boltsCount",
    "brand",
    "car",
    "code",
    "color",
    "dia",
    "diameter",
    "et",
    "insertType",
    "manufactory",
    "manufactoryCode",
    "model",
    "mount",
    "mountNote",
    "pcd1",
    "pcd2",
    "width"
})
public class ProposeDiskItem {

    protected Integer boltsCount;
    @XmlElementRef(name = "brand", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.ProposeGoods", type = JAXBElement.class, required = false)
    protected JAXBElement<String> brand;
    @XmlElementRef(name = "car", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.ProposeGoods", type = JAXBElement.class, required = false)
    protected JAXBElement<String> car;
    @XmlElementRef(name = "code", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.ProposeGoods", type = JAXBElement.class, required = false)
    protected JAXBElement<String> code;
    @XmlElementRef(name = "color", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.ProposeGoods", type = JAXBElement.class, required = false)
    protected JAXBElement<String> color;
    protected BigDecimal dia;
    protected BigDecimal diameter;
    protected BigDecimal et;
    @XmlElementRef(name = "insertType", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.ProposeGoods", type = JAXBElement.class, required = false)
    protected JAXBElement<String> insertType;
    @XmlElementRef(name = "manufactory", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.ProposeGoods", type = JAXBElement.class, required = false)
    protected JAXBElement<String> manufactory;
    @XmlElementRef(name = "manufactoryCode", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.ProposeGoods", type = JAXBElement.class, required = false)
    protected JAXBElement<String> manufactoryCode;
    @XmlElementRef(name = "model", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.ProposeGoods", type = JAXBElement.class, required = false)
    protected JAXBElement<String> model;
    @XmlElementRef(name = "mount", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.ProposeGoods", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mount;
    @XmlElementRef(name = "mountNote", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.ProposeGoods", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mountNote;
    protected BigDecimal pcd1;
    protected BigDecimal pcd2;
    protected BigDecimal width;

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
     * Gets the value of the car property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCar() {
        return car;
    }

    /**
     * Sets the value of the car property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCar(JAXBElement<String> value) {
        this.car = value;
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
     * Gets the value of the insertType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInsertType() {
        return insertType;
    }

    /**
     * Sets the value of the insertType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInsertType(JAXBElement<String> value) {
        this.insertType = value;
    }

    /**
     * Gets the value of the manufactory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getManufactory() {
        return manufactory;
    }

    /**
     * Sets the value of the manufactory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setManufactory(JAXBElement<String> value) {
        this.manufactory = value;
    }

    /**
     * Gets the value of the manufactoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getManufactoryCode() {
        return manufactoryCode;
    }

    /**
     * Sets the value of the manufactoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setManufactoryCode(JAXBElement<String> value) {
        this.manufactoryCode = value;
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
     * Gets the value of the pcd1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPcd1() {
        return pcd1;
    }

    /**
     * Sets the value of the pcd1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPcd1(BigDecimal value) {
        this.pcd1 = value;
    }

    /**
     * Gets the value of the pcd2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPcd2() {
        return pcd2;
    }

    /**
     * Sets the value of the pcd2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPcd2(BigDecimal value) {
        this.pcd2 = value;
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
