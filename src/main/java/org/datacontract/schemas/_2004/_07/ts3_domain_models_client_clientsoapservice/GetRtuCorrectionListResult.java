
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ts3_domain_models_client.ClientServiceResult;


/**
 * <p>Java class for GetRtuCorrectionListResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GetRtuCorrectionListResult">
 *   <complexContent>
 *     <extension base="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService}ClientServiceResult">
 *       <sequence>
 *         <element name="rtuCorrectionList" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetRtuCorrectionList}ArrayOfGetRtuCorrectionListItem" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetRtuCorrectionListResult", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetRtuCorrectionList", propOrder = {
    "rtuCorrectionList"
})
public class GetRtuCorrectionListResult
    extends ClientServiceResult
{

    @XmlElementRef(name = "rtuCorrectionList", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetRtuCorrectionList", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGetRtuCorrectionListItem> rtuCorrectionList;

    /**
     * Gets the value of the rtuCorrectionList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGetRtuCorrectionListItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGetRtuCorrectionListItem> getRtuCorrectionList() {
        return rtuCorrectionList;
    }

    /**
     * Sets the value of the rtuCorrectionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGetRtuCorrectionListItem }{@code >}
     *     
     */
    public void setRtuCorrectionList(JAXBElement<ArrayOfGetRtuCorrectionListItem> value) {
        this.rtuCorrectionList = value;
    }

}
