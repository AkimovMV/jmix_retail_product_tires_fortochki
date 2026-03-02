
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import javax.xml.datatype.XMLGregorianCalendar;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FindChangeOrderFilter complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FindChangeOrderFilter">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="changed" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="userIDs" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         <element name="warehouses" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindChangeOrderFilter", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetChangedOrders", propOrder = {
    "changed",
    "userIDs",
    "warehouses"
})
public class FindChangeOrderFilter {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar changed;
    @XmlElementRef(name = "userIDs", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetChangedOrders", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> userIDs;
    @XmlElementRef(name = "warehouses", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetChangedOrders", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> warehouses;

    /**
     * Gets the value of the changed property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChanged() {
        return changed;
    }

    /**
     * Sets the value of the changed property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChanged(XMLGregorianCalendar value) {
        this.changed = value;
    }

    /**
     * Gets the value of the userIDs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getUserIDs() {
        return userIDs;
    }

    /**
     * Sets the value of the userIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setUserIDs(JAXBElement<ArrayOfint> value) {
        this.userIDs = value;
    }

    /**
     * Gets the value of the warehouses property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getWarehouses() {
        return warehouses;
    }

    /**
     * Sets the value of the warehouses property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setWarehouses(JAXBElement<ArrayOfint> value) {
        this.warehouses = value;
    }

}
