
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ts3_domain_models_client.ClientServiceResult;


/**
 * <p>Java class for Result complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Result">
 *   <complexContent>
 *     <extension base="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService}ClientServiceResult">
 *       <sequence>
 *         <element name="goods" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.CreateMovement}ArrayOfgood" minOccurs="0"/>
 *         <element name="gtdList" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.CreateMovement}ArrayOfgtdContainer" minOccurs="0"/>
 *         <element name="number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Result", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.CreateMovement", propOrder = {
    "goods",
    "gtdList",
    "number"
})
@XmlSeeAlso({
    MovementInfoContainer.class
})
public class Result2
    extends ClientServiceResult
{

    @XmlElementRef(name = "goods", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.CreateMovement", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfgood> goods;
    @XmlElementRef(name = "gtdList", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.CreateMovement", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfgtdContainer> gtdList;
    @XmlElementRef(name = "number", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.CreateMovement", type = JAXBElement.class, required = false)
    protected JAXBElement<String> number;

    /**
     * Gets the value of the goods property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfgood }{@code >}
     *     
     */
    public JAXBElement<ArrayOfgood> getGoods() {
        return goods;
    }

    /**
     * Sets the value of the goods property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfgood }{@code >}
     *     
     */
    public void setGoods(JAXBElement<ArrayOfgood> value) {
        this.goods = value;
    }

    /**
     * Gets the value of the gtdList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfgtdContainer }{@code >}
     *     
     */
    public JAXBElement<ArrayOfgtdContainer> getGtdList() {
        return gtdList;
    }

    /**
     * Sets the value of the gtdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfgtdContainer }{@code >}
     *     
     */
    public void setGtdList(JAXBElement<ArrayOfgtdContainer> value) {
        this.gtdList = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumber(JAXBElement<String> value) {
        this.number = value;
    }

}
