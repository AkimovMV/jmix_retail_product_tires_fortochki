
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ts3_domain_models_client.ArrayOfWarehouseLogistic;
import org.datacontract.schemas._2004._07.ts3_domain_models_client.CurrencyRate;
import org.datacontract.schemas._2004._07.ts3_domain_models_client.Error;


/**
 * <p>Java class for GetFastenerResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GetFastenerResult">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="currencyRate" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService}CurrencyRate" minOccurs="0"/>
 *         <element name="error" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService}Error" minOccurs="0"/>
 *         <element name="items" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetFastener}ArrayOfGetFastenerContainer" minOccurs="0"/>
 *         <element name="totalPages" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "GetFastenerResult", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetFastener", propOrder = {
    "currencyRate",
    "error",
    "items",
    "totalPages",
    "warehouseLogistics"
})
public class GetFastenerResult {

    @XmlElementRef(name = "currencyRate", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetFastener", type = JAXBElement.class, required = false)
    protected JAXBElement<CurrencyRate> currencyRate;
    @XmlElementRef(name = "error", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetFastener", type = JAXBElement.class, required = false)
    protected JAXBElement<Error> error;
    @XmlElementRef(name = "items", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetFastener", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGetFastenerContainer> items;
    protected Integer totalPages;
    @XmlElementRef(name = "warehouseLogistics", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetFastener", type = JAXBElement.class, required = false)
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
     * Gets the value of the items property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGetFastenerContainer }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGetFastenerContainer> getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGetFastenerContainer }{@code >}
     *     
     */
    public void setItems(JAXBElement<ArrayOfGetFastenerContainer> value) {
        this.items = value;
    }

    /**
     * Gets the value of the totalPages property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalPages() {
        return totalPages;
    }

    /**
     * Sets the value of the totalPages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalPages(Integer value) {
        this.totalPages = value;
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
