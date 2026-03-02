
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
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
 *         <element name="contractName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="contractNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="dateSF" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="edoStatusId" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/>
 *         <element name="goods" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetSaleInfo}ArrayOfSaleGoodContainer" minOccurs="0"/>
 *         <element name="gtdList" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.CreateMovement}ArrayOfgtdContainer" minOccurs="0"/>
 *         <element name="guid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="markCodeList" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetSaleInfo}ArrayOfMarkCodeContainer" minOccurs="0"/>
 *         <element name="number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="numberSF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="statusID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="sumRTU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Result", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetSaleInfo", propOrder = {
    "contractName",
    "contractNumber",
    "date",
    "dateSF",
    "edoStatusId",
    "goods",
    "gtdList",
    "guid",
    "markCodeList",
    "number",
    "numberSF",
    "statusID",
    "sumRTU"
})
public class Result7
    extends ClientServiceResult
{

    @XmlElementRef(name = "contractName", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetSaleInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contractName;
    @XmlElementRef(name = "contractNumber", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetSaleInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contractNumber;
    @XmlElementRef(name = "date", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetSaleInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> date;
    @XmlElementRef(name = "dateSF", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetSaleInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dateSF;
    @XmlElementRef(name = "edoStatusId", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetSaleInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> edoStatusId;
    @XmlElementRef(name = "goods", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetSaleInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSaleGoodContainer> goods;
    @XmlElementRef(name = "gtdList", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetSaleInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfgtdContainer> gtdList;
    @XmlElementRef(name = "guid", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetSaleInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> guid;
    @XmlElementRef(name = "markCodeList", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetSaleInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfMarkCodeContainer4> markCodeList;
    @XmlElementRef(name = "number", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetSaleInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> number;
    @XmlElementRef(name = "numberSF", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetSaleInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numberSF;
    protected Integer statusID;
    protected BigDecimal sumRTU;

    /**
     * Gets the value of the contractName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContractName() {
        return contractName;
    }

    /**
     * Sets the value of the contractName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContractName(JAXBElement<String> value) {
        this.contractName = value;
    }

    /**
     * Gets the value of the contractNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContractNumber() {
        return contractNumber;
    }

    /**
     * Sets the value of the contractNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContractNumber(JAXBElement<String> value) {
        this.contractNumber = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDate(JAXBElement<XMLGregorianCalendar> value) {
        this.date = value;
    }

    /**
     * Gets the value of the dateSF property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDateSF() {
        return dateSF;
    }

    /**
     * Sets the value of the dateSF property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDateSF(JAXBElement<XMLGregorianCalendar> value) {
        this.dateSF = value;
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
     * Gets the value of the goods property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSaleGoodContainer }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSaleGoodContainer> getGoods() {
        return goods;
    }

    /**
     * Sets the value of the goods property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSaleGoodContainer }{@code >}
     *     
     */
    public void setGoods(JAXBElement<ArrayOfSaleGoodContainer> value) {
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
     *     {@link JAXBElement }{@code <}{@link ArrayOfMarkCodeContainer4 }{@code >}
     *     
     */
    public JAXBElement<ArrayOfMarkCodeContainer4> getMarkCodeList() {
        return markCodeList;
    }

    /**
     * Sets the value of the markCodeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMarkCodeContainer4 }{@code >}
     *     
     */
    public void setMarkCodeList(JAXBElement<ArrayOfMarkCodeContainer4> value) {
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
     * Gets the value of the numberSF property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumberSF() {
        return numberSF;
    }

    /**
     * Sets the value of the numberSF property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumberSF(JAXBElement<String> value) {
        this.numberSF = value;
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
     * Gets the value of the sumRTU property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSumRTU() {
        return sumRTU;
    }

    /**
     * Sets the value of the sumRTU property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSumRTU(BigDecimal value) {
        this.sumRTU = value;
    }

}
