
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetPurchaseReturnInfoResult.RtuComplaintMarkCodeContainer complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GetPurchaseReturnInfoResult.RtuComplaintMarkCodeContainer">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="imgUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="markCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="productCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPurchaseReturnInfoResult.RtuComplaintMarkCodeContainer", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetPurchaseReturnInfo", propOrder = {
    "imgUrl",
    "markCode",
    "productCode"
})
public class GetPurchaseReturnInfoResultRtuComplaintMarkCodeContainer {

    @XmlElementRef(name = "imgUrl", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetPurchaseReturnInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> imgUrl;
    @XmlElementRef(name = "markCode", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetPurchaseReturnInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> markCode;
    @XmlElementRef(name = "productCode", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetPurchaseReturnInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productCode;

    /**
     * Gets the value of the imgUrl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getImgUrl() {
        return imgUrl;
    }

    /**
     * Sets the value of the imgUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setImgUrl(JAXBElement<String> value) {
        this.imgUrl = value;
    }

    /**
     * Gets the value of the markCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarkCode() {
        return markCode;
    }

    /**
     * Sets the value of the markCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarkCode(JAXBElement<String> value) {
        this.markCode = value;
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
