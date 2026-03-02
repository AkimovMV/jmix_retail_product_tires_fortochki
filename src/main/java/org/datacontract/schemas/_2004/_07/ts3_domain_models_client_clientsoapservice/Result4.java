
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ts3_domain_models_client.ClientServiceResult;


/**
 * <p>Java class for Result complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Result">
 *   <complexContent>
 *     <extension base="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService}ClientServiceResult">
 *       <sequence>
 *         <element name="MarkCodeContainerList" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SetRemoveFromOH}ArrayOfMarkCodeContainer" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Result", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SetRemoveFromOH", propOrder = {
    "markCodeContainerList"
})
public class Result4
    extends ClientServiceResult
{

    @XmlElementRef(name = "MarkCodeContainerList", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SetRemoveFromOH", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfMarkCodeContainer2> markCodeContainerList;

    /**
     * Gets the value of the markCodeContainerList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMarkCodeContainer2 }{@code >}
     *     
     */
    public JAXBElement<ArrayOfMarkCodeContainer2> getMarkCodeContainerList() {
        return markCodeContainerList;
    }

    /**
     * Sets the value of the markCodeContainerList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMarkCodeContainer2 }{@code >}
     *     
     */
    public void setMarkCodeContainerList(JAXBElement<ArrayOfMarkCodeContainer2> value) {
        this.markCodeContainerList = value;
    }

}
