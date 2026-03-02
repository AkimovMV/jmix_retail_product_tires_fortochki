
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetReMarkingDocumentResult.GetReMarkingDocumentResultContainer complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GetReMarkingDocumentResult.GetReMarkingDocumentResultContainer">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="Guid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="MarkCodeList" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetMovementInfo}ArrayOfMarkCodeContainer" minOccurs="0"/>
 *         <element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ProductList" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetReMarkingDocument}ArrayOfGetReMarkingDocumentItemProduct" minOccurs="0"/>
 *         <element name="StatusId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetReMarkingDocumentResult.GetReMarkingDocumentResultContainer", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetReMarkingDocument", propOrder = {
    "createDate",
    "guid",
    "markCodeList",
    "number",
    "productList",
    "statusId"
})
public class GetReMarkingDocumentResultGetReMarkingDocumentResultContainer {

    @XmlElement(name = "CreateDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    @XmlElementRef(name = "Guid", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetReMarkingDocument", type = JAXBElement.class, required = false)
    protected JAXBElement<String> guid;
    @XmlElementRef(name = "MarkCodeList", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetReMarkingDocument", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfMarkCodeContainer> markCodeList;
    @XmlElementRef(name = "Number", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetReMarkingDocument", type = JAXBElement.class, required = false)
    protected JAXBElement<String> number;
    @XmlElementRef(name = "ProductList", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetReMarkingDocument", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGetReMarkingDocumentItemProduct> productList;
    @XmlElement(name = "StatusId")
    protected Integer statusId;

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDate(XMLGregorianCalendar value) {
        this.createDate = value;
    }

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
     * Gets the value of the markCodeList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMarkCodeContainer }{@code >}
     *     
     */
    public JAXBElement<ArrayOfMarkCodeContainer> getMarkCodeList() {
        return markCodeList;
    }

    /**
     * Sets the value of the markCodeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMarkCodeContainer }{@code >}
     *     
     */
    public void setMarkCodeList(JAXBElement<ArrayOfMarkCodeContainer> value) {
        this.markCodeList = value;
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
     * Gets the value of the productList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGetReMarkingDocumentItemProduct }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGetReMarkingDocumentItemProduct> getProductList() {
        return productList;
    }

    /**
     * Sets the value of the productList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGetReMarkingDocumentItemProduct }{@code >}
     *     
     */
    public void setProductList(JAXBElement<ArrayOfGetReMarkingDocumentItemProduct> value) {
        this.productList = value;
    }

    /**
     * Gets the value of the statusId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatusId() {
        return statusId;
    }

    /**
     * Sets the value of the statusId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatusId(Integer value) {
        this.statusId = value;
    }

}
