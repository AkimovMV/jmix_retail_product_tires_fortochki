
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ts3_domain_models_client.ClientServiceResult;


/**
 * <p>Java class for GetStoOrderListResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GetStoOrderListResult">
 *   <complexContent>
 *     <extension base="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService}ClientServiceResult">
 *       <sequence>
 *         <element name="items" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetStoOrderList}ArrayOfGetStoOrderListResult.GetStoOrderListResultItem" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetStoOrderListResult", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetStoOrderList", propOrder = {
    "items"
})
public class GetStoOrderListResult
    extends ClientServiceResult
{

    @XmlElementRef(name = "items", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetStoOrderList", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGetStoOrderListResultGetStoOrderListResultItem> items;

    /**
     * Gets the value of the items property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGetStoOrderListResultGetStoOrderListResultItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGetStoOrderListResultGetStoOrderListResultItem> getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGetStoOrderListResultGetStoOrderListResultItem }{@code >}
     *     
     */
    public void setItems(JAXBElement<ArrayOfGetStoOrderListResultGetStoOrderListResultItem> value) {
        this.items = value;
    }

}
