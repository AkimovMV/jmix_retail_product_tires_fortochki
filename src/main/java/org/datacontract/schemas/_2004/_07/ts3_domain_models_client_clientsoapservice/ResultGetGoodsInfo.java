
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ts3_domain_models_client.Error;


/**
 * <p>Java class for ResultGetGoodsInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ResultGetGoodsInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="cameraList" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo}ArrayOfCameraContainer" minOccurs="0"/>
 *         <element name="fastenerList" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo}ArrayOfFastenerContainer" minOccurs="0"/>
 *         <element name="oilList" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo}ArrayOfOilContainer" minOccurs="0"/>
 *         <element name="pressureSensorList" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo}ArrayOfPressureSensorContainer" minOccurs="0"/>
 *         <element name="rimList" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo}ArrayOfRimContainer" minOccurs="0"/>
 *         <element name="sparePartList" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo}ArrayOfSparePartContainer" minOccurs="0"/>
 *         <element name="tyreList" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo}ArrayOfTyreContainer" minOccurs="0"/>
 *         <element name="GtinList" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo}ArrayOfGtinItem" minOccurs="0"/>
 *         <element name="error" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService}Error" minOccurs="0"/>
 *         <element name="wheelList" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo}ArrayOfWheelContainer" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultGetGoodsInfo", propOrder = {
    "cameraList",
    "fastenerList",
    "oilList",
    "pressureSensorList",
    "rimList",
    "sparePartList",
    "tyreList",
    "gtinList",
    "error",
    "wheelList"
})
public class ResultGetGoodsInfo {

    @XmlElementRef(name = "cameraList", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCameraContainer> cameraList;
    @XmlElementRef(name = "fastenerList", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfFastenerContainer> fastenerList;
    @XmlElementRef(name = "oilList", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfOilContainer> oilList;
    @XmlElementRef(name = "pressureSensorList", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPressureSensorContainer> pressureSensorList;
    @XmlElementRef(name = "rimList", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRimContainer> rimList;
    @XmlElementRef(name = "sparePartList", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSparePartContainer> sparePartList;
    @XmlElementRef(name = "tyreList", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTyreContainer> tyreList;
    @XmlElementRef(name = "GtinList", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGtinItem> gtinList;
    @XmlElementRef(name = "error", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<Error> error;
    @XmlElementRef(name = "wheelList", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfWheelContainer> wheelList;

    /**
     * Gets the value of the cameraList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCameraContainer }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCameraContainer> getCameraList() {
        return cameraList;
    }

    /**
     * Sets the value of the cameraList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCameraContainer }{@code >}
     *     
     */
    public void setCameraList(JAXBElement<ArrayOfCameraContainer> value) {
        this.cameraList = value;
    }

    /**
     * Gets the value of the fastenerList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFastenerContainer }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFastenerContainer> getFastenerList() {
        return fastenerList;
    }

    /**
     * Sets the value of the fastenerList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFastenerContainer }{@code >}
     *     
     */
    public void setFastenerList(JAXBElement<ArrayOfFastenerContainer> value) {
        this.fastenerList = value;
    }

    /**
     * Gets the value of the oilList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOilContainer }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOilContainer> getOilList() {
        return oilList;
    }

    /**
     * Sets the value of the oilList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOilContainer }{@code >}
     *     
     */
    public void setOilList(JAXBElement<ArrayOfOilContainer> value) {
        this.oilList = value;
    }

    /**
     * Gets the value of the pressureSensorList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPressureSensorContainer }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPressureSensorContainer> getPressureSensorList() {
        return pressureSensorList;
    }

    /**
     * Sets the value of the pressureSensorList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPressureSensorContainer }{@code >}
     *     
     */
    public void setPressureSensorList(JAXBElement<ArrayOfPressureSensorContainer> value) {
        this.pressureSensorList = value;
    }

    /**
     * Gets the value of the rimList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRimContainer }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRimContainer> getRimList() {
        return rimList;
    }

    /**
     * Sets the value of the rimList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRimContainer }{@code >}
     *     
     */
    public void setRimList(JAXBElement<ArrayOfRimContainer> value) {
        this.rimList = value;
    }

    /**
     * Gets the value of the sparePartList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSparePartContainer }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSparePartContainer> getSparePartList() {
        return sparePartList;
    }

    /**
     * Sets the value of the sparePartList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSparePartContainer }{@code >}
     *     
     */
    public void setSparePartList(JAXBElement<ArrayOfSparePartContainer> value) {
        this.sparePartList = value;
    }

    /**
     * Gets the value of the tyreList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTyreContainer }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTyreContainer> getTyreList() {
        return tyreList;
    }

    /**
     * Sets the value of the tyreList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTyreContainer }{@code >}
     *     
     */
    public void setTyreList(JAXBElement<ArrayOfTyreContainer> value) {
        this.tyreList = value;
    }

    /**
     * Gets the value of the gtinList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGtinItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGtinItem> getGtinList() {
        return gtinList;
    }

    /**
     * Sets the value of the gtinList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGtinItem }{@code >}
     *     
     */
    public void setGtinList(JAXBElement<ArrayOfGtinItem> value) {
        this.gtinList = value;
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
     * Gets the value of the wheelList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfWheelContainer }{@code >}
     *     
     */
    public JAXBElement<ArrayOfWheelContainer> getWheelList() {
        return wheelList;
    }

    /**
     * Sets the value of the wheelList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfWheelContainer }{@code >}
     *     
     */
    public void setWheelList(JAXBElement<ArrayOfWheelContainer> value) {
        this.wheelList = value;
    }

}
