
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ts3_domain_models_client.ClientServiceResult;


/**
 * <p>Java class for GetMx3ListResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GetMx3ListResult">
 *   <complexContent>
 *     <extension base="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService}ClientServiceResult">
 *       <sequence>
 *         <element name="mx3ActList" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetMx3List}ArrayOfGetMx3ListItem" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMx3ListResult", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetMx3List", propOrder = {
    "mx3ActList"
})
public class GetMx3ListResult
    extends ClientServiceResult
{

    @XmlElementRef(name = "mx3ActList", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetMx3List", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGetMx3ListItem> mx3ActList;

    /**
     * Gets the value of the mx3ActList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGetMx3ListItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGetMx3ListItem> getMx3ActList() {
        return mx3ActList;
    }

    /**
     * Sets the value of the mx3ActList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGetMx3ListItem }{@code >}
     *     
     */
    public void setMx3ActList(JAXBElement<ArrayOfGetMx3ListItem> value) {
        this.mx3ActList = value;
    }

}
