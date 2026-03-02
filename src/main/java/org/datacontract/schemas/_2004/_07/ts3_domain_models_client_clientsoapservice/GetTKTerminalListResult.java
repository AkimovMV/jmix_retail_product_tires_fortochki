
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ts3_domain_models_client.ClientServiceResult;


/**
 * <p>Java class for GetTKTerminalListResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GetTKTerminalListResult">
 *   <complexContent>
 *     <extension base="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService}ClientServiceResult">
 *       <sequence>
 *         <element name="data" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetTKTerminalList}ArrayOfTKTerminalItem" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTKTerminalListResult", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetTKTerminalList", propOrder = {
    "data"
})
public class GetTKTerminalListResult
    extends ClientServiceResult
{

    @XmlElementRef(name = "data", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetTKTerminalList", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTKTerminalItem> data;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTKTerminalItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTKTerminalItem> getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTKTerminalItem }{@code >}
     *     
     */
    public void setData(JAXBElement<ArrayOfTKTerminalItem> value) {
        this.data = value;
    }

}
