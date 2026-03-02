
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ts3_domain_models_client.ClientServiceResult;


/**
 * <p>Java class for GetOrderListResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GetOrderListResult">
 *   <complexContent>
 *     <extension base="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService}ClientServiceResult">
 *       <sequence>
 *         <element name="items" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderList}ArrayOfGetOrderListResultItem" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetOrderListResult", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderList", propOrder = {
    "items"
})
public class GetOrderListResult
    extends ClientServiceResult
{

    @XmlElementRef(name = "items", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderList", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGetOrderListResultItem> items;

    /**
     * Gets the value of the items property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGetOrderListResultItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGetOrderListResultItem> getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGetOrderListResultItem }{@code >}
     *     
     */
    public void setItems(JAXBElement<ArrayOfGetOrderListResultItem> value) {
        this.items = value;
    }

}
