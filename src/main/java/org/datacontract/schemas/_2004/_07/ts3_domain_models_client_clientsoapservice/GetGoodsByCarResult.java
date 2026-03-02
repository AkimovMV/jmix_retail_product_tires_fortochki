
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ts3_domain_models_client.ArrayOfWarehouseLogistic;
import org.datacontract.schemas._2004._07.ts3_domain_models_client.ArrayOfsaleInfo;
import org.datacontract.schemas._2004._07.ts3_domain_models_client.CurrencyRate;
import org.datacontract.schemas._2004._07.ts3_domain_models_client.Error;


/**
 * <p>Java class for GetGoodsByCarResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GetGoodsByCarResult">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="currencyRate" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService}CurrencyRate" minOccurs="0"/>
 *         <element name="error" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService}Error" minOccurs="0"/>
 *         <element name="price_rest_list" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsBySpecs}ArrayOfgoods_price_rest" minOccurs="0"/>
 *         <element name="saleInfoList" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService}ArrayOfsaleInfo" minOccurs="0"/>
 *         <element name="warehouseLogistics" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService}ArrayOfWarehouseLogistic" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetGoodsByCarResult", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsBySpecs", propOrder = {
    "currencyRate",
    "error",
    "priceRestList",
    "saleInfoList",
    "warehouseLogistics"
})
public class GetGoodsByCarResult {

    @XmlElementRef(name = "currencyRate", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsBySpecs", type = JAXBElement.class, required = false)
    protected JAXBElement<CurrencyRate> currencyRate;
    @XmlElementRef(name = "error", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsBySpecs", type = JAXBElement.class, required = false)
    protected JAXBElement<Error> error;
    @XmlElementRef(name = "price_rest_list", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsBySpecs", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfgoodsPriceRest> priceRestList;
    @XmlElementRef(name = "saleInfoList", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsBySpecs", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfsaleInfo> saleInfoList;
    @XmlElementRef(name = "warehouseLogistics", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsBySpecs", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfWarehouseLogistic> warehouseLogistics;

    /**
     * Gets the value of the currencyRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CurrencyRate }{@code >}
     *     
     */
    public JAXBElement<CurrencyRate> getCurrencyRate() {
        return currencyRate;
    }

    /**
     * Sets the value of the currencyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CurrencyRate }{@code >}
     *     
     */
    public void setCurrencyRate(JAXBElement<CurrencyRate> value) {
        this.currencyRate = value;
    }

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
     *     {@link JAXBElement }{@code <}{@link ArrayOfgoodsPriceRest }{@code >}
     *     
     */
    public JAXBElement<ArrayOfgoodsPriceRest> getPriceRestList() {
        return priceRestList;
    }

    /**
     * Sets the value of the priceRestList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfgoodsPriceRest }{@code >}
     *     
     */
    public void setPriceRestList(JAXBElement<ArrayOfgoodsPriceRest> value) {
        this.priceRestList = value;
    }

    /**
     * Gets the value of the saleInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfsaleInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfsaleInfo> getSaleInfoList() {
        return saleInfoList;
    }

    /**
     * Sets the value of the saleInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfsaleInfo }{@code >}
     *     
     */
    public void setSaleInfoList(JAXBElement<ArrayOfsaleInfo> value) {
        this.saleInfoList = value;
    }

    /**
     * Gets the value of the warehouseLogistics property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfWarehouseLogistic }{@code >}
     *     
     */
    public JAXBElement<ArrayOfWarehouseLogistic> getWarehouseLogistics() {
        return warehouseLogistics;
    }

    /**
     * Sets the value of the warehouseLogistics property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfWarehouseLogistic }{@code >}
     *     
     */
    public void setWarehouseLogistics(JAXBElement<ArrayOfWarehouseLogistic> value) {
        this.warehouseLogistics = value;
    }

}
