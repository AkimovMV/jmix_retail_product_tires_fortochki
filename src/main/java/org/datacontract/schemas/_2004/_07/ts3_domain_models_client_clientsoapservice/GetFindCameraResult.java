
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
 * <p>Java class for GetFindCameraResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GetFindCameraResult">
 *   <complexContent>
 *     <extension base="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService}ClientServiceResult">
 *       <sequence>
 *         <element name="CurrencyRateItem" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService}CurrencyRate" minOccurs="0"/>
 *         <element name="ResultItems" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetFindCamera}ArrayOfGetFindCameraContainer" minOccurs="0"/>
 *         <element name="WarehouseLogisticEnumerable" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService}ArrayOfWarehouseLogistic" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFindCameraResult", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetFindCamera", propOrder = {
    "currencyRateItem",
    "resultItems",
    "warehouseLogisticEnumerable"
})
public class GetFindCameraResult
    extends ClientServiceResult
{

    @XmlElementRef(name = "CurrencyRateItem", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetFindCamera", type = JAXBElement.class, required = false)
    protected JAXBElement<CurrencyRate> currencyRateItem;
    @XmlElementRef(name = "ResultItems", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetFindCamera", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGetFindCameraContainer> resultItems;
    @XmlElementRef(name = "WarehouseLogisticEnumerable", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetFindCamera", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfWarehouseLogistic> warehouseLogisticEnumerable;

    /**
     * Gets the value of the currencyRateItem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CurrencyRate }{@code >}
     *     
     */
    public JAXBElement<CurrencyRate> getCurrencyRateItem() {
        return currencyRateItem;
    }

    /**
     * Sets the value of the currencyRateItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CurrencyRate }{@code >}
     *     
     */
    public void setCurrencyRateItem(JAXBElement<CurrencyRate> value) {
        this.currencyRateItem = value;
    }

    /**
     * Gets the value of the resultItems property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGetFindCameraContainer }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGetFindCameraContainer> getResultItems() {
        return resultItems;
    }

    /**
     * Sets the value of the resultItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGetFindCameraContainer }{@code >}
     *     
     */
    public void setResultItems(JAXBElement<ArrayOfGetFindCameraContainer> value) {
        this.resultItems = value;
    }

    /**
     * Gets the value of the warehouseLogisticEnumerable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfWarehouseLogistic }{@code >}
     *     
     */
    public JAXBElement<ArrayOfWarehouseLogistic> getWarehouseLogisticEnumerable() {
        return warehouseLogisticEnumerable;
    }

    /**
     * Sets the value of the warehouseLogisticEnumerable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfWarehouseLogistic }{@code >}
     *     
     */
    public void setWarehouseLogisticEnumerable(JAXBElement<ArrayOfWarehouseLogistic> value) {
        this.warehouseLogisticEnumerable = value;
    }

}
