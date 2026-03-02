
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ts3_domain_models_client.Error;


/**
 * <p>Java class for GetGoodsPriceRestByCodeResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GetGoodsPriceRestByCodeResult">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="error" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService}Error" minOccurs="0"/>
 *         <element name="price_rest_list" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsAndPricesInfo}ArrayOfprice_rest" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetGoodsPriceRestByCodeResult", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsAndPricesInfo", propOrder = {
    "error",
    "priceRestList"
})
public class GetGoodsPriceRestByCodeResult {

    @XmlElementRef(name = "error", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsAndPricesInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<Error> error;
    @XmlElementRef(name = "price_rest_list", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsAndPricesInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfpriceRest> priceRestList;

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Error }{@code >}
     *     
     */
    public JAXBElement<Error> getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Error }{@code >}
     *     
     */
    public void setError(JAXBElement<Error> value) {
        this.error = value;
    }

    /**
     * Gets the value of the priceRestList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfpriceRest }{@code >}
     *     
     */
    public JAXBElement<ArrayOfpriceRest> getPriceRestList() {
        return priceRestList;
    }

    /**
     * Sets the value of the priceRestList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfpriceRest }{@code >}
     *     
     */
    public void setPriceRestList(JAXBElement<ArrayOfpriceRest> value) {
        this.priceRestList = value;
    }

}
