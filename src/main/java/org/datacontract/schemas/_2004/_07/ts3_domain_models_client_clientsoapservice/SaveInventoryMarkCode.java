
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SaveInventoryMarkCode complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SaveInventoryMarkCode">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MarkCodeString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="artikul" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaveInventoryMarkCode", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SaveInventory", propOrder = {
    "markCodeString",
    "artikul"
})
public class SaveInventoryMarkCode {

    @XmlElementRef(name = "MarkCodeString", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SaveInventory", type = JAXBElement.class, required = false)
    protected JAXBElement<String> markCodeString;
    @XmlElementRef(name = "artikul", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SaveInventory", type = JAXBElement.class, required = false)
    protected JAXBElement<String> artikul;

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
     * Gets the value of the artikul property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getArtikul() {
        return artikul;
    }

    /**
     * Sets the value of the artikul property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setArtikul(JAXBElement<String> value) {
        this.artikul = value;
    }

}
