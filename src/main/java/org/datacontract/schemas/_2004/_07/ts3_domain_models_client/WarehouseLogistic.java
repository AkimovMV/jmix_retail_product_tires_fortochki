
package org.datacontract.schemas._2004._07.ts3_domain_models_client;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WarehouseLogistic complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="WarehouseLogistic">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="logistDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="whId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WarehouseLogistic", propOrder = {
    "logistDays",
    "whId"
})
public class WarehouseLogistic {

    protected Integer logistDays;
    protected Integer whId;

    /**
     * Gets the value of the logistDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLogistDays() {
        return logistDays;
    }

    /**
     * Sets the value of the logistDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLogistDays(Integer value) {
        this.logistDays = value;
    }

    /**
     * Gets the value of the whId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWhId() {
        return whId;
    }

    /**
     * Sets the value of the whId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWhId(Integer value) {
        this.whId = value;
    }

}
