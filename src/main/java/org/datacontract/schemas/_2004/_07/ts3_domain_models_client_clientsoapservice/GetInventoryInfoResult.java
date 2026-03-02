
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ts3_domain_models_client.ClientServiceResult;


/**
 * <p>Java class for GetInventoryInfoResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GetInventoryInfoResult">
 *   <complexContent>
 *     <extension base="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService}ClientServiceResult">
 *       <sequence>
 *         <element name="inventory" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetInventoryInfo}InventoryInfo" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetInventoryInfoResult", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetInventoryInfo", propOrder = {
    "inventory"
})
public class GetInventoryInfoResult
    extends ClientServiceResult
{

    @XmlElementRef(name = "inventory", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetInventoryInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<InventoryInfo> inventory;

    /**
     * Gets the value of the inventory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InventoryInfo }{@code >}
     *     
     */
    public JAXBElement<InventoryInfo> getInventory() {
        return inventory;
    }

    /**
     * Sets the value of the inventory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InventoryInfo }{@code >}
     *     
     */
    public void setInventory(JAXBElement<InventoryInfo> value) {
        this.inventory = value;
    }

}
