
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Order complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Order">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="base_order" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.CreateOrder}BaseOrder" minOccurs="0"/>
 *         <element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="comment_cc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="createBonus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="customerId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="deliveryInfo" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.CreateOrder}DeliveryInfoContainer" minOccurs="0"/>
 *         <element name="is_test" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="need_separate_rtu" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="product_list" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.CreateOrder}ArrayOfOrderProduct"/>
 *         <element name="skip_error_61" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="useBonus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "Order", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.CreateOrder", propOrder = {
    "baseOrder",
    "comment",
    "commentCc",
    "createBonus",
    "customerId",
    "deliveryInfo",
    "isTest",
    "needSeparateRtu",
    "productList",
    "skipError61",
    "useBonus",
    "addressId"
})
public class Order {

    @XmlElementRef(name = "base_order", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.CreateOrder", type = JAXBElement.class, required = false)
    protected JAXBElement<BaseOrder> baseOrder;
    @XmlElementRef(name = "comment", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.CreateOrder", type = JAXBElement.class, required = false)
    protected JAXBElement<String> comment;
    @XmlElementRef(name = "comment_cc", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.CreateOrder", type = JAXBElement.class, required = false)
    protected JAXBElement<String> commentCc;
    @XmlElementRef(name = "createBonus", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.CreateOrder", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> createBonus;
    @XmlElementRef(name = "customerId", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.CreateOrder", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> customerId;
    @XmlElementRef(name = "deliveryInfo", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.CreateOrder", type = JAXBElement.class, required = false)
    protected JAXBElement<DeliveryInfoContainer> deliveryInfo;
    @XmlElement(name = "is_test")
    protected Boolean isTest;
    @XmlElementRef(name = "need_separate_rtu", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.CreateOrder", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> needSeparateRtu;
    @XmlElement(name = "product_list", required = true, nillable = true)
    protected ArrayOfOrderProduct productList;
    @XmlElement(name = "skip_error_61")
    protected Boolean skipError61;
    protected Boolean useBonus;
    @XmlElementRef(name = "address_id", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.CreateOrder", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> addressId;

    /**
     * Gets the value of the baseOrder property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BaseOrder }{@code >}
     *     
     */
    public JAXBElement<BaseOrder> getBaseOrder() {
        return baseOrder;
    }

    /**
     * Sets the value of the baseOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BaseOrder }{@code >}
     *     
     */
    public void setBaseOrder(JAXBElement<BaseOrder> value) {
        this.baseOrder = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComment(JAXBElement<String> value) {
        this.comment = value;
    }

    /**
     * Gets the value of the commentCc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCommentCc() {
        return commentCc;
    }

    /**
     * Sets the value of the commentCc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCommentCc(JAXBElement<String> value) {
        this.commentCc = value;
    }

    /**
     * Gets the value of the createBonus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCreateBonus() {
        return createBonus;
    }

    /**
     * Sets the value of the createBonus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCreateBonus(JAXBElement<Boolean> value) {
        this.createBonus = value;
    }

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCustomerId(JAXBElement<Integer> value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the deliveryInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DeliveryInfoContainer }{@code >}
     *     
     */
    public JAXBElement<DeliveryInfoContainer> getDeliveryInfo() {
        return deliveryInfo;
    }

    /**
     * Sets the value of the deliveryInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DeliveryInfoContainer }{@code >}
     *     
     */
    public void setDeliveryInfo(JAXBElement<DeliveryInfoContainer> value) {
        this.deliveryInfo = value;
    }

    /**
     * Gets the value of the isTest property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTest() {
        return isTest;
    }

    /**
     * Sets the value of the isTest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTest(Boolean value) {
        this.isTest = value;
    }

    /**
     * Gets the value of the needSeparateRtu property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getNeedSeparateRtu() {
        return needSeparateRtu;
    }

    /**
     * Sets the value of the needSeparateRtu property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setNeedSeparateRtu(JAXBElement<Boolean> value) {
        this.needSeparateRtu = value;
    }

    /**
     * Gets the value of the productList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrderProduct }
     *     
     */
    public ArrayOfOrderProduct getProductList() {
        return productList;
    }

    /**
     * Sets the value of the productList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrderProduct }
     *     
     */
    public void setProductList(ArrayOfOrderProduct value) {
        this.productList = value;
    }

    /**
     * Gets the value of the skipError61 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSkipError61() {
        return skipError61;
    }

    /**
     * Sets the value of the skipError61 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSkipError61(Boolean value) {
        this.skipError61 = value;
    }

    /**
     * Gets the value of the useBonus property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseBonus() {
        return useBonus;
    }

    /**
     * Sets the value of the useBonus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseBonus(Boolean value) {
        this.useBonus = value;
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
