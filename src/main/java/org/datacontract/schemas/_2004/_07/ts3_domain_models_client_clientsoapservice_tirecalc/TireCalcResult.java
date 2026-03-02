
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice_tirecalc;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ts3_domain_models_client.Error;


/**
 * <p>Java class for TireCalcResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TireCalcResult">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="difference" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.TireCalc.Parameters}TireCalcSize" minOccurs="0"/>
 *         <element name="error" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService}Error" minOccurs="0"/>
 *         <element name="new_size" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.TireCalc.Parameters}TireCalcSize" minOccurs="0"/>
 *         <element name="old_size" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.TireCalc.Parameters}TireCalcSize" minOccurs="0"/>
 *         <element name="speedometer" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.TireCalc.Result}TireCalcSpeedometerInfo" minOccurs="0"/>
 *         <element name="success" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TireCalcResult", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.TireCalc.Result", propOrder = {
    "difference",
    "error",
    "newSize",
    "oldSize",
    "speedometer",
    "success"
})
public class TireCalcResult {

    @XmlElementRef(name = "difference", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.TireCalc.Result", type = JAXBElement.class, required = false)
    protected JAXBElement<TireCalcSize> difference;
    @XmlElementRef(name = "error", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.TireCalc.Result", type = JAXBElement.class, required = false)
    protected JAXBElement<Error> error;
    @XmlElementRef(name = "new_size", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.TireCalc.Result", type = JAXBElement.class, required = false)
    protected JAXBElement<TireCalcSize> newSize;
    @XmlElementRef(name = "old_size", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.TireCalc.Result", type = JAXBElement.class, required = false)
    protected JAXBElement<TireCalcSize> oldSize;
    @XmlElementRef(name = "speedometer", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.TireCalc.Result", type = JAXBElement.class, required = false)
    protected JAXBElement<TireCalcSpeedometerInfo> speedometer;
    protected Boolean success;

    /**
     * Gets the value of the difference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TireCalcSize }{@code >}
     *     
     */
    public JAXBElement<TireCalcSize> getDifference() {
        return difference;
    }

    /**
     * Sets the value of the difference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TireCalcSize }{@code >}
     *     
     */
    public void setDifference(JAXBElement<TireCalcSize> value) {
        this.difference = value;
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
     * Gets the value of the newSize property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TireCalcSize }{@code >}
     *     
     */
    public JAXBElement<TireCalcSize> getNewSize() {
        return newSize;
    }

    /**
     * Sets the value of the newSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TireCalcSize }{@code >}
     *     
     */
    public void setNewSize(JAXBElement<TireCalcSize> value) {
        this.newSize = value;
    }

    /**
     * Gets the value of the oldSize property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TireCalcSize }{@code >}
     *     
     */
    public JAXBElement<TireCalcSize> getOldSize() {
        return oldSize;
    }

    /**
     * Sets the value of the oldSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TireCalcSize }{@code >}
     *     
     */
    public void setOldSize(JAXBElement<TireCalcSize> value) {
        this.oldSize = value;
    }

    /**
     * Gets the value of the speedometer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TireCalcSpeedometerInfo }{@code >}
     *     
     */
    public JAXBElement<TireCalcSpeedometerInfo> getSpeedometer() {
        return speedometer;
    }

    /**
     * Sets the value of the speedometer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TireCalcSpeedometerInfo }{@code >}
     *     
     */
    public void setSpeedometer(JAXBElement<TireCalcSpeedometerInfo> value) {
        this.speedometer = value;
    }

    /**
     * Gets the value of the success property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuccess(Boolean value) {
        this.success = value;
    }

}
