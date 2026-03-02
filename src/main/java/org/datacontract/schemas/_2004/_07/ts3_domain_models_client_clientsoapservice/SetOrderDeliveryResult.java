
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ts3_domain_models_client.ClientServiceResult;


/**
 * <p>Java class for SetOrderDeliveryResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SetOrderDeliveryResult">
 *   <complexContent>
 *     <extension base="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService}ClientServiceResult">
 *       <sequence>
 *         <element name="SetOrderDeliveryResultItemList" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SetOrderDelivery}ArrayOfSetOrderDeliveryResultItem" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetOrderDeliveryResult", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SetOrderDelivery", propOrder = {
    "setOrderDeliveryResultItemList"
})
public class SetOrderDeliveryResult
    extends ClientServiceResult
{

    @XmlElementRef(name = "SetOrderDeliveryResultItemList", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SetOrderDelivery", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSetOrderDeliveryResultItem> setOrderDeliveryResultItemList;

    /**
     * Gets the value of the setOrderDeliveryResultItemList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSetOrderDeliveryResultItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSetOrderDeliveryResultItem> getSetOrderDeliveryResultItemList() {
        return setOrderDeliveryResultItemList;
    }

    /**
     * Sets the value of the setOrderDeliveryResultItemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSetOrderDeliveryResultItem }{@code >}
     *     
     */
    public void setSetOrderDeliveryResultItemList(JAXBElement<ArrayOfSetOrderDeliveryResultItem> value) {
        this.setOrderDeliveryResultItemList = value;
    }

}
