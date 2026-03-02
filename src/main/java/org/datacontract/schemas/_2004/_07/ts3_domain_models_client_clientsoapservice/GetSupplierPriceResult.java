
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ts3_domain_models_client.ClientServiceResult;


/**
 * <p>Java class for GetSupplierPriceResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GetSupplierPriceResult">
 *   <complexContent>
 *     <extension base="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService}ClientServiceResult">
 *       <sequence>
 *         <element name="PriceList" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SetSupplierPrice}ArrayOfSupplierPriceItem" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSupplierPriceResult", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetSupplierPrice", propOrder = {
    "priceList"
})
public class GetSupplierPriceResult
    extends ClientServiceResult
{

    @XmlElementRef(name = "PriceList", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetSupplierPrice", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSupplierPriceItem> priceList;

    /**
     * Gets the value of the priceList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSupplierPriceItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSupplierPriceItem> getPriceList() {
        return priceList;
    }

    /**
     * Sets the value of the priceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSupplierPriceItem }{@code >}
     *     
     */
    public void setPriceList(JAXBElement<ArrayOfSupplierPriceItem> value) {
        this.priceList = value;
    }

}
