
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductChangeListItem complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ProductChangeListItem">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="orderProductID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="reduceQuantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductChangeListItem", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SetOrderUpdate", propOrder = {
    "orderProductID",
    "reduceQuantity"
})
public class ProductChangeListItem {

    protected Integer orderProductID;
    protected Integer reduceQuantity;

    /**
     * Gets the value of the orderProductID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrderProductID() {
        return orderProductID;
    }

    /**
     * Sets the value of the orderProductID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrderProductID(Integer value) {
        this.orderProductID = value;
    }

    /**
     * Gets the value of the reduceQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReduceQuantity() {
        return reduceQuantity;
    }

    /**
     * Sets the value of the reduceQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReduceQuantity(Integer value) {
        this.reduceQuantity = value;
    }

}
