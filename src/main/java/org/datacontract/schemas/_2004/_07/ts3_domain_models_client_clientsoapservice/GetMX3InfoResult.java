
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ts3_domain_models_client.ClientServiceResult;


/**
 * <p>Java class for GetMX3InfoResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GetMX3InfoResult">
 *   <complexContent>
 *     <extension base="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService}ClientServiceResult">
 *       <sequence>
 *         <element name="guid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="baseDocGuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="statusID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="whID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="goods" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetMx3Info}ArrayOfGetMX3InfoGoodsItem" minOccurs="0"/>
 *         <element name="edoStatusId" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/>
 *         <element name="typeFoundationDocument" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMX3InfoResult", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetMx3Info", propOrder = {
    "guid",
    "baseDocGuid",
    "number",
    "date",
    "statusID",
    "whID",
    "goods",
    "edoStatusId",
    "typeFoundationDocument"
})
public class GetMX3InfoResult
    extends ClientServiceResult
{

    @XmlElementRef(name = "guid", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetMx3Info", type = JAXBElement.class, required = false)
    protected JAXBElement<String> guid;
    @XmlElementRef(name = "baseDocGuid", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetMx3Info", type = JAXBElement.class, required = false)
    protected JAXBElement<String> baseDocGuid;
    @XmlElementRef(name = "number", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetMx3Info", type = JAXBElement.class, required = false)
    protected JAXBElement<String> number;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    protected Integer statusID;
    protected Integer whID;
    @XmlElementRef(name = "goods", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetMx3Info", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGetMX3InfoGoodsItem> goods;
    @XmlElementRef(name = "edoStatusId", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetMx3Info", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> edoStatusId;
    @XmlElementRef(name = "typeFoundationDocument", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetMx3Info", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> typeFoundationDocument;

    /**
     * Gets the value of the guid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGuid() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGuid(JAXBElement<String> value) {
        this.guid = value;
    }

    /**
     * Gets the value of the baseDocGuid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBaseDocGuid() {
        return baseDocGuid;
    }

    /**
     * Sets the value of the baseDocGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBaseDocGuid(JAXBElement<String> value) {
        this.baseDocGuid = value;
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

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the statusID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatusID() {
        return statusID;
    }

    /**
     * Sets the value of the statusID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatusID(Integer value) {
        this.statusID = value;
    }

    /**
     * Gets the value of the whID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWhID() {
        return whID;
    }

    /**
     * Sets the value of the whID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWhID(Integer value) {
        this.whID = value;
    }

    /**
     * Gets the value of the goods property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGetMX3InfoGoodsItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGetMX3InfoGoodsItem> getGoods() {
        return goods;
    }

    /**
     * Sets the value of the goods property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGetMX3InfoGoodsItem }{@code >}
     *     
     */
    public void setGoods(JAXBElement<ArrayOfGetMX3InfoGoodsItem> value) {
        this.goods = value;
    }

    /**
     * Gets the value of the edoStatusId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getEdoStatusId() {
        return edoStatusId;
    }

    /**
     * Sets the value of the edoStatusId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setEdoStatusId(JAXBElement<Short> value) {
        this.edoStatusId = value;
    }

    /**
     * Gets the value of the typeFoundationDocument property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getTypeFoundationDocument() {
        return typeFoundationDocument;
    }

    /**
     * Sets the value of the typeFoundationDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setTypeFoundationDocument(JAXBElement<Short> value) {
        this.typeFoundationDocument = value;
    }

}
