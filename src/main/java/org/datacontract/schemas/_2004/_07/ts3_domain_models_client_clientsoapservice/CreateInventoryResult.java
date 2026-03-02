
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ts3_domain_models_client.ClientServiceResult;


/**
 * <p>Java class for CreateInventoryResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CreateInventoryResult">
 *   <complexContent>
 *     <extension base="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService}ClientServiceResult">
 *       <sequence>
 *         <element name="InventoryDocument" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.CreateInventory}CreateInventoryItem" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateInventoryResult", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.CreateInventory", propOrder = {
    "inventoryDocument"
})
public class CreateInventoryResult
    extends ClientServiceResult
{

    @XmlElementRef(name = "InventoryDocument", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.CreateInventory", type = JAXBElement.class, required = false)
    protected JAXBElement<CreateInventoryItem> inventoryDocument;

    /**
     * Gets the value of the inventoryDocument property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreateInventoryItem }{@code >}
     *     
     */
    public JAXBElement<CreateInventoryItem> getInventoryDocument() {
        return inventoryDocument;
    }

    /**
     * Sets the value of the inventoryDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreateInventoryItem }{@code >}
     *     
     */
    public void setInventoryDocument(JAXBElement<CreateInventoryItem> value) {
        this.inventoryDocument = value;
    }

}
