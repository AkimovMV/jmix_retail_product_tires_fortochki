
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SetOrderUpdateParameters complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SetOrderUpdateParameters">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="customerID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="orderID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="productChangeList" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SetOrderUpdate}ArrayOfProductChangeListItem" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetOrderUpdateParameters", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SetOrderUpdate", propOrder = {
    "customerID",
    "orderID",
    "productChangeList"
})
public class SetOrderUpdateParameters {

    @XmlElementRef(name = "customerID", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SetOrderUpdate", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> customerID;
    protected Integer orderID;
    @XmlElementRef(name = "productChangeList", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SetOrderUpdate", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfProductChangeListItem> productChangeList;

    /**
     * Gets the value of the customerID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCustomerID() {
        return customerID;
    }

    /**
     * Sets the value of the customerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCustomerID(JAXBElement<Integer> value) {
        this.customerID = value;
    }

    /**
     * Gets the value of the orderID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrderID() {
        return orderID;
    }

    /**
     * Sets the value of the orderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrderID(Integer value) {
        this.orderID = value;
    }

    /**
     * Gets the value of the productChangeList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProductChangeListItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfProductChangeListItem> getProductChangeList() {
        return productChangeList;
    }

    /**
     * Sets the value of the productChangeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProductChangeListItem }{@code >}
     *     
     */
    public void setProductChangeList(JAXBElement<ArrayOfProductChangeListItem> value) {
        this.productChangeList = value;
    }

}
