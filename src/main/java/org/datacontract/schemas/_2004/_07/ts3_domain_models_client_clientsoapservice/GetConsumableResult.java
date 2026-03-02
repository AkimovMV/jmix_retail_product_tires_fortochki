
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ts3_domain_models_client.ArrayOfWarehouseLogistic;
import org.datacontract.schemas._2004._07.ts3_domain_models_client.ClientServiceResult;
import org.datacontract.schemas._2004._07.ts3_domain_models_client.CurrencyRate;


/**
 * <p>Java class for GetConsumableResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GetConsumableResult">
 *   <complexContent>
 *     <extension base="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService}ClientServiceResult">
 *       <sequence>
 *         <element name="currencyRate" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService}CurrencyRate" minOccurs="0"/>
 *         <element name="getConsumableResultItems" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetConsumable}ArrayOfGetConsumableResultItem" minOccurs="0"/>
 *         <element name="sort" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="totalPages" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="warehouseLogistics" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService}ArrayOfWarehouseLogistic" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetConsumableResult", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetConsumable", propOrder = {
    "currencyRate",
    "getConsumableResultItems",
    "sort",
    "totalPages",
    "warehouseLogistics"
})
public class GetConsumableResult
    extends ClientServiceResult
{

    @XmlElementRef(name = "currencyRate", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetConsumable", type = JAXBElement.class, required = false)
    protected JAXBElement<CurrencyRate> currencyRate;
    @XmlElementRef(name = "getConsumableResultItems", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetConsumable", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGetConsumableResultItem> getConsumableResultItems;
    protected Integer sort;
    protected Integer totalPages;
    @XmlElementRef(name = "warehouseLogistics", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetConsumable", type = JAXBElement.class, required = false)
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
     * Gets the value of the getConsumableResultItems property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGetConsumableResultItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGetConsumableResultItem> getGetConsumableResultItems() {
        return getConsumableResultItems;
    }

    /**
     * Sets the value of the getConsumableResultItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGetConsumableResultItem }{@code >}
     *     
     */
    public void setGetConsumableResultItems(JAXBElement<ArrayOfGetConsumableResultItem> value) {
        this.getConsumableResultItems = value;
    }

    /**
     * Gets the value of the sort property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * Sets the value of the sort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSort(Integer value) {
        this.sort = value;
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
