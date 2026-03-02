
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ts3_domain_models_client.ClientServiceResult;


/**
 * <p>Java class for SetDeliveryAddresResultContainer complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SetDeliveryAddresResultContainer">
 *   <complexContent>
 *     <extension base="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService}ClientServiceResult">
 *       <sequence>
 *         <element name="ItemList" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SetDeliveryAddress}ArrayOfSetDeliveryAddresResultItem" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetDeliveryAddresResultContainer", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SetDeliveryAddress", propOrder = {
    "itemList"
})
public class SetDeliveryAddresResultContainer
    extends ClientServiceResult
{

    @XmlElementRef(name = "ItemList", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SetDeliveryAddress", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSetDeliveryAddresResultItem> itemList;

    /**
     * Gets the value of the itemList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSetDeliveryAddresResultItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSetDeliveryAddresResultItem> getItemList() {
        return itemList;
    }

    /**
     * Sets the value of the itemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSetDeliveryAddresResultItem }{@code >}
     *     
     */
    public void setItemList(JAXBElement<ArrayOfSetDeliveryAddresResultItem> value) {
        this.itemList = value;
    }

}
