
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ts3_domain_models_client.ClientServiceResult;


/**
 * <p>Java class for SetSupplierPriceResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SetSupplierPriceResult">
 *   <complexContent>
 *     <extension base="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService}ClientServiceResult">
 *       <sequence>
 *         <element name="minorErrors" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SetSupplierPrice}ArrayOfSupplierPriceError" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetSupplierPriceResult", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SetSupplierPrice", propOrder = {
    "minorErrors"
})
public class SetSupplierPriceResult
    extends ClientServiceResult
{

    @XmlElementRef(name = "minorErrors", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SetSupplierPrice", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSupplierPriceError> minorErrors;

    /**
     * Gets the value of the minorErrors property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSupplierPriceError }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSupplierPriceError> getMinorErrors() {
        return minorErrors;
    }

    /**
     * Sets the value of the minorErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSupplierPriceError }{@code >}
     *     
     */
    public void setMinorErrors(JAXBElement<ArrayOfSupplierPriceError> value) {
        this.minorErrors = value;
    }

}
