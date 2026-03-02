
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RestList complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RestList">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="rest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="wrh" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RestList", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SetProductsQtyOnWarehouse", propOrder = {
    "code",
    "rest",
    "wrh"
})
public class RestList {

    @XmlElement(required = true, nillable = true)
    protected String code;
    protected int rest;
    protected int wrh;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the rest property.
     * 
     */
    public int getRest() {
        return rest;
    }

    /**
     * Sets the value of the rest property.
     * 
     */
    public void setRest(int value) {
        this.rest = value;
    }

    /**
     * Gets the value of the wrh property.
     * 
     */
    public int getWrh() {
        return wrh;
    }

    /**
     * Sets the value of the wrh property.
     * 
     */
    public void setWrh(int value) {
        this.wrh = value;
    }

}
