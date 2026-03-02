
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ts3_domain_models_client.ClientServiceResult;


/**
 * <p>Java class for GetPurchaseReturnListResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GetPurchaseReturnListResult">
 *   <complexContent>
 *     <extension base="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService}ClientServiceResult">
 *       <sequence>
 *         <element name="purcahseReturnList" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetPurchaseReturnList}ArrayOfGetPurchaseReturnListItem" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPurchaseReturnListResult", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetPurchaseReturnList", propOrder = {
    "purcahseReturnList"
})
public class GetPurchaseReturnListResult
    extends ClientServiceResult
{

    @XmlElementRef(name = "purcahseReturnList", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetPurchaseReturnList", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGetPurchaseReturnListItem> purcahseReturnList;

    /**
     * Gets the value of the purcahseReturnList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGetPurchaseReturnListItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGetPurchaseReturnListItem> getPurcahseReturnList() {
        return purcahseReturnList;
    }

    /**
     * Sets the value of the purcahseReturnList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGetPurchaseReturnListItem }{@code >}
     *     
     */
    public void setPurcahseReturnList(JAXBElement<ArrayOfGetPurchaseReturnListItem> value) {
        this.purcahseReturnList = value;
    }

}
