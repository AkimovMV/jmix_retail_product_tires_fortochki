
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ts3_domain_models_client.ClientServiceResult;


/**
 * <p>Java class for getAddressListResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="getAddressListResult">
 *   <complexContent>
 *     <extension base="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService}ClientServiceResult">
 *       <sequence>
 *         <element name="getAddressListItems" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetAddressList}ArrayOfgetAddressListItem" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAddressListResult", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetAddressList", propOrder = {
    "getAddressListItems"
})
public class GetAddressListResult
    extends ClientServiceResult
{

    @XmlElementRef(name = "getAddressListItems", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetAddressList", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfgetAddressListItem> getAddressListItems;

    /**
     * Gets the value of the getAddressListItems property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfgetAddressListItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfgetAddressListItem> getGetAddressListItems() {
        return getAddressListItems;
    }

    /**
     * Sets the value of the getAddressListItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfgetAddressListItem }{@code >}
     *     
     */
    public void setGetAddressListItems(JAXBElement<ArrayOfgetAddressListItem> value) {
        this.getAddressListItems = value;
    }

}
