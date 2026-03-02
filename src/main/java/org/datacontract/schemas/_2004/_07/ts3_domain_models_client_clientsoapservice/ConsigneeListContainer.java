
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ts3_domain_models_client.ClientServiceResult;


/**
 * <p>Java class for ConsigneeListContainer complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ConsigneeListContainer">
 *   <complexContent>
 *     <extension base="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService}ClientServiceResult">
 *       <sequence>
 *         <element name="Consignees" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.Consignee}ArrayOfConsigneeInfoContainer" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsigneeListContainer", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.Consignee", propOrder = {
    "consignees"
})
public class ConsigneeListContainer
    extends ClientServiceResult
{

    @XmlElementRef(name = "Consignees", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.Consignee", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfConsigneeInfoContainer> consignees;

    /**
     * Gets the value of the consignees property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfConsigneeInfoContainer }{@code >}
     *     
     */
    public JAXBElement<ArrayOfConsigneeInfoContainer> getConsignees() {
        return consignees;
    }

    /**
     * Sets the value of the consignees property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfConsigneeInfoContainer }{@code >}
     *     
     */
    public void setConsignees(JAXBElement<ArrayOfConsigneeInfoContainer> value) {
        this.consignees = value;
    }

}
