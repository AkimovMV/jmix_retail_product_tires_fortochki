
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarkCodeContainer complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MarkCodeContainer">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MarkCodeLabelUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="MarkCodeString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="MarkCodeUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ProductCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarkCodeContainer", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SetRemoveFromOH", propOrder = {
    "markCodeLabelUrl",
    "markCodeString",
    "markCodeUrl",
    "productCode"
})
public class MarkCodeContainer2 {

    @XmlElementRef(name = "MarkCodeLabelUrl", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SetRemoveFromOH", type = JAXBElement.class, required = false)
    protected JAXBElement<String> markCodeLabelUrl;
    @XmlElementRef(name = "MarkCodeString", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SetRemoveFromOH", type = JAXBElement.class, required = false)
    protected JAXBElement<String> markCodeString;
    @XmlElementRef(name = "MarkCodeUrl", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SetRemoveFromOH", type = JAXBElement.class, required = false)
    protected JAXBElement<String> markCodeUrl;
    @XmlElementRef(name = "ProductCode", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SetRemoveFromOH", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productCode;

    /**
     * Gets the value of the markCodeLabelUrl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarkCodeLabelUrl() {
        return markCodeLabelUrl;
    }

    /**
     * Sets the value of the markCodeLabelUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarkCodeLabelUrl(JAXBElement<String> value) {
        this.markCodeLabelUrl = value;
    }

    /**
     * Gets the value of the markCodeString property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarkCodeString() {
        return markCodeString;
    }

    /**
     * Sets the value of the markCodeString property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarkCodeString(JAXBElement<String> value) {
        this.markCodeString = value;
    }

    /**
     * Gets the value of the markCodeUrl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarkCodeUrl() {
        return markCodeUrl;
    }

    /**
     * Sets the value of the markCodeUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarkCodeUrl(JAXBElement<String> value) {
        this.markCodeUrl = value;
    }

    /**
     * Gets the value of the productCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductCode() {
        return productCode;
    }

    /**
     * Sets the value of the productCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductCode(JAXBElement<String> value) {
        this.productCode = value;
    }

}
