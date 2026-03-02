
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ts3_domain_models_client.ClientServiceResult;


/**
 * <p>Java class for GetReMarkingDocumentResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GetReMarkingDocumentResult">
 *   <complexContent>
 *     <extension base="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService}ClientServiceResult">
 *       <sequence>
 *         <element name="Result" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetReMarkingDocument}GetReMarkingDocumentResult.GetReMarkingDocumentResultContainer" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetReMarkingDocumentResult", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetReMarkingDocument", propOrder = {
    "result"
})
public class GetReMarkingDocumentResult
    extends ClientServiceResult
{

    @XmlElementRef(name = "Result", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetReMarkingDocument", type = JAXBElement.class, required = false)
    protected JAXBElement<GetReMarkingDocumentResultGetReMarkingDocumentResultContainer> result;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GetReMarkingDocumentResultGetReMarkingDocumentResultContainer }{@code >}
     *     
     */
    public JAXBElement<GetReMarkingDocumentResultGetReMarkingDocumentResultContainer> getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GetReMarkingDocumentResultGetReMarkingDocumentResultContainer }{@code >}
     *     
     */
    public void setResult(JAXBElement<GetReMarkingDocumentResultGetReMarkingDocumentResultContainer> value) {
        this.result = value;
    }

}
