
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for proposeGoodsContainer complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="proposeGoodsContainer">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="proposeConsumableContainer" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.ProposeGoods}ArrayOfproposeConsumableItem" minOccurs="0"/>
 *         <element name="proposeDiskContainer" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.ProposeGoods}ArrayOfproposeDiskItem" minOccurs="0"/>
 *         <element name="proposeFastenerContainer" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.ProposeGoods}ArrayOfproposeFastenerItem" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "proposeGoodsContainer", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.ProposeGoods", propOrder = {
    "proposeConsumableContainer",
    "proposeDiskContainer",
    "proposeFastenerContainer"
})
public class ProposeGoodsContainer {

    @XmlElementRef(name = "proposeConsumableContainer", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.ProposeGoods", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfproposeConsumableItem> proposeConsumableContainer;
    @XmlElementRef(name = "proposeDiskContainer", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.ProposeGoods", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfproposeDiskItem> proposeDiskContainer;
    @XmlElementRef(name = "proposeFastenerContainer", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.ProposeGoods", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfproposeFastenerItem> proposeFastenerContainer;

    /**
     * Gets the value of the proposeConsumableContainer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfproposeConsumableItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfproposeConsumableItem> getProposeConsumableContainer() {
        return proposeConsumableContainer;
    }

    /**
     * Sets the value of the proposeConsumableContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfproposeConsumableItem }{@code >}
     *     
     */
    public void setProposeConsumableContainer(JAXBElement<ArrayOfproposeConsumableItem> value) {
        this.proposeConsumableContainer = value;
    }

    /**
     * Gets the value of the proposeDiskContainer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfproposeDiskItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfproposeDiskItem> getProposeDiskContainer() {
        return proposeDiskContainer;
    }

    /**
     * Sets the value of the proposeDiskContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfproposeDiskItem }{@code >}
     *     
     */
    public void setProposeDiskContainer(JAXBElement<ArrayOfproposeDiskItem> value) {
        this.proposeDiskContainer = value;
    }

    /**
     * Gets the value of the proposeFastenerContainer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfproposeFastenerItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfproposeFastenerItem> getProposeFastenerContainer() {
        return proposeFastenerContainer;
    }

    /**
     * Sets the value of the proposeFastenerContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfproposeFastenerItem }{@code >}
     *     
     */
    public void setProposeFastenerContainer(JAXBElement<ArrayOfproposeFastenerItem> value) {
        this.proposeFastenerContainer = value;
    }

}
