
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import javax.xml.datatype.XMLGregorianCalendar;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FindOrderFilter complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FindOrderFilter">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="dEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="dStart" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="orderNumbers" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         <element name="statusList" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         <element name="viewArchive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "FindOrderFilter", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderStatus", propOrder = {
    "dEnd",
    "dStart",
    "orderNumbers",
    "statusList",
    "viewArchive",
    "warehouses"
})
public class FindOrderFilter {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dEnd;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dStart;
    @XmlElementRef(name = "orderNumbers", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderStatus", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> orderNumbers;
    @XmlElementRef(name = "statusList", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderStatus", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> statusList;
    protected Boolean viewArchive;
    @XmlElementRef(name = "warehouses", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderStatus", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> warehouses;

    /**
     * Gets the value of the dEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDEnd() {
        return dEnd;
    }

    /**
     * Sets the value of the dEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDEnd(XMLGregorianCalendar value) {
        this.dEnd = value;
    }

    /**
     * Gets the value of the dStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDStart() {
        return dStart;
    }

    /**
     * Sets the value of the dStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDStart(XMLGregorianCalendar value) {
        this.dStart = value;
    }

    /**
     * Gets the value of the orderNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getOrderNumbers() {
        return orderNumbers;
    }

    /**
     * Sets the value of the orderNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setOrderNumbers(JAXBElement<ArrayOfstring> value) {
        this.orderNumbers = value;
    }

    /**
     * Gets the value of the statusList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getStatusList() {
        return statusList;
    }

    /**
     * Sets the value of the statusList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setStatusList(JAXBElement<ArrayOfint> value) {
        this.statusList = value;
    }

    /**
     * Gets the value of the viewArchive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isViewArchive() {
        return viewArchive;
    }

    /**
     * Sets the value of the viewArchive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setViewArchive(Boolean value) {
        this.viewArchive = value;
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
