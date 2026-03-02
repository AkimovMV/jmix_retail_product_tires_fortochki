
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfClientSoapResultDM.MarkCodeContainer complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfClientSoapResultDM.MarkCodeContainer">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ClientSoapResultDM.MarkCodeContainer" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo}ClientSoapResultDM.MarkCodeContainer" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClientSoapResultDM.MarkCodeContainer", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderInfo", propOrder = {
    "clientSoapResultDMMarkCodeContainer"
})
public class ArrayOfClientSoapResultDMMarkCodeContainer {

    @XmlElement(name = "ClientSoapResultDM.MarkCodeContainer", nillable = true)
    protected List<ClientSoapResultDMMarkCodeContainer> clientSoapResultDMMarkCodeContainer;

    /**
     * Gets the value of the clientSoapResultDMMarkCodeContainer property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clientSoapResultDMMarkCodeContainer property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getClientSoapResultDMMarkCodeContainer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClientSoapResultDMMarkCodeContainer }
     * </p>
     * 
     * 
     * @return
     *     The value of the clientSoapResultDMMarkCodeContainer property.
     */
    public List<ClientSoapResultDMMarkCodeContainer> getClientSoapResultDMMarkCodeContainer() {
        if (clientSoapResultDMMarkCodeContainer == null) {
            clientSoapResultDMMarkCodeContainer = new ArrayList<>();
        }
        return this.clientSoapResultDMMarkCodeContainer;
    }

}
