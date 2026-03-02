
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ts3_domain_models_client.ClientServiceResult;


/**
 * <p>Java class for GetMx1ListResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GetMx1ListResult">
 *   <complexContent>
 *     <extension base="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService}ClientServiceResult">
 *       <sequence>
 *         <element name="mx1ActList" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetMx1List}ArrayOfGetMx1ListItem" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMx1ListResult", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetMx1List", propOrder = {
    "mx1ActList"
})
public class GetMx1ListResult
    extends ClientServiceResult
{

    @XmlElementRef(name = "mx1ActList", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetMx1List", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGetMx1ListItem> mx1ActList;

    /**
     * Gets the value of the mx1ActList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGetMx1ListItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGetMx1ListItem> getMx1ActList() {
        return mx1ActList;
    }

    /**
     * Sets the value of the mx1ActList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGetMx1ListItem }{@code >}
     *     
     */
    public void setMx1ActList(JAXBElement<ArrayOfGetMx1ListItem> value) {
        this.mx1ActList = value;
    }

}
