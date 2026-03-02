
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ts3_domain_models_client.Error;


/**
 * <p>Java class for GetChangeOrderResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GetChangeOrderResult">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="error" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService}Error" minOccurs="0"/>
 *         <element name="order_list" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetChangedOrders}ArrayOfChangedOrder" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetChangeOrderResult", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetChangedOrders", propOrder = {
    "error",
    "orderList"
})
public class GetChangeOrderResult {

    @XmlElementRef(name = "error", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetChangedOrders", type = JAXBElement.class, required = false)
    protected JAXBElement<Error> error;
    @XmlElementRef(name = "order_list", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetChangedOrders", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfChangedOrder> orderList;

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
     * Gets the value of the orderList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfChangedOrder }{@code >}
     *     
     */
    public JAXBElement<ArrayOfChangedOrder> getOrderList() {
        return orderList;
    }

    /**
     * Sets the value of the orderList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfChangedOrder }{@code >}
     *     
     */
    public void setOrderList(JAXBElement<ArrayOfChangedOrder> value) {
        this.orderList = value;
    }

}
