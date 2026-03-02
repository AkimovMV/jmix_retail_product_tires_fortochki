
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ts3_domain_models_client.ClientServiceResult;


/**
 * <p>Java class for getPurchaseReturnInfoResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="getPurchaseReturnInfoResult">
 *   <complexContent>
 *     <extension base="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService}ClientServiceResult">
 *       <sequence>
 *         <element name="guid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="numberBaseDocument" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="createDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="statusId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="contractSum" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="contractName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="sfNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="sfDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="guidBaseDocument" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="contractNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="updateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="rtuComplaintGtdContainers" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetPurchaseReturnInfo}ArrayOfGetPurchaseReturnInfoResult.RtuComplaintGtdContainer" minOccurs="0"/>
 *         <element name="rtuComplaintMarkCodeContainers" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetPurchaseReturnInfo}ArrayOfGetPurchaseReturnInfoResult.RtuComplaintMarkCodeContainer" minOccurs="0"/>
 *         <element name="rtuComplaintProductContainers" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetPurchaseReturnInfo}ArrayOfGetPurchaseReturnInfoResult.RtuComplaintProductContainer" minOccurs="0"/>
 *         <element name="edoStatusId" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPurchaseReturnInfoResult", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetPurchaseReturnInfo", propOrder = {
    "guid",
    "number",
    "numberBaseDocument",
    "createDate",
    "statusId",
    "contractSum",
    "contractName",
    "sfNumber",
    "sfDate",
    "guidBaseDocument",
    "contractNumber",
    "updateDate",
    "rtuComplaintGtdContainers",
    "rtuComplaintMarkCodeContainers",
    "rtuComplaintProductContainers",
    "edoStatusId"
})
public class GetPurchaseReturnInfoResult
    extends ClientServiceResult
{

    @XmlElementRef(name = "guid", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetPurchaseReturnInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> guid;
    @XmlElementRef(name = "number", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetPurchaseReturnInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> number;
    @XmlElementRef(name = "numberBaseDocument", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetPurchaseReturnInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numberBaseDocument;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    protected Integer statusId;
    protected BigDecimal contractSum;
    @XmlElementRef(name = "contractName", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetPurchaseReturnInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contractName;
    @XmlElementRef(name = "sfNumber", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetPurchaseReturnInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sfNumber;
    @XmlElementRef(name = "sfDate", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetPurchaseReturnInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> sfDate;
    @XmlElementRef(name = "guidBaseDocument", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetPurchaseReturnInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> guidBaseDocument;
    @XmlElementRef(name = "contractNumber", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetPurchaseReturnInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contractNumber;
    @XmlElementRef(name = "updateDate", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetPurchaseReturnInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> updateDate;
    @XmlElementRef(name = "rtuComplaintGtdContainers", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetPurchaseReturnInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGetPurchaseReturnInfoResultRtuComplaintGtdContainer> rtuComplaintGtdContainers;
    @XmlElementRef(name = "rtuComplaintMarkCodeContainers", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetPurchaseReturnInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGetPurchaseReturnInfoResultRtuComplaintMarkCodeContainer> rtuComplaintMarkCodeContainers;
    @XmlElementRef(name = "rtuComplaintProductContainers", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetPurchaseReturnInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGetPurchaseReturnInfoResultRtuComplaintProductContainer> rtuComplaintProductContainers;
    @XmlElementRef(name = "edoStatusId", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetPurchaseReturnInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> edoStatusId;

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
     * Gets the value of the numberBaseDocument property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumberBaseDocument() {
        return numberBaseDocument;
    }

    /**
     * Sets the value of the numberBaseDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumberBaseDocument(JAXBElement<String> value) {
        this.numberBaseDocument = value;
    }

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

    /**
     * Gets the value of the contractSum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getContractSum() {
        return contractSum;
    }

    /**
     * Sets the value of the contractSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setContractSum(BigDecimal value) {
        this.contractSum = value;
    }

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
     * Gets the value of the sfNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSfNumber() {
        return sfNumber;
    }

    /**
     * Sets the value of the sfNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSfNumber(JAXBElement<String> value) {
        this.sfNumber = value;
    }

    /**
     * Gets the value of the sfDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getSfDate() {
        return sfDate;
    }

    /**
     * Sets the value of the sfDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setSfDate(JAXBElement<XMLGregorianCalendar> value) {
        this.sfDate = value;
    }

    /**
     * Gets the value of the guidBaseDocument property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGuidBaseDocument() {
        return guidBaseDocument;
    }

    /**
     * Sets the value of the guidBaseDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGuidBaseDocument(JAXBElement<String> value) {
        this.guidBaseDocument = value;
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
     * Gets the value of the updateDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getUpdateDate() {
        return updateDate;
    }

    /**
     * Sets the value of the updateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setUpdateDate(JAXBElement<XMLGregorianCalendar> value) {
        this.updateDate = value;
    }

    /**
     * Gets the value of the rtuComplaintGtdContainers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGetPurchaseReturnInfoResultRtuComplaintGtdContainer }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGetPurchaseReturnInfoResultRtuComplaintGtdContainer> getRtuComplaintGtdContainers() {
        return rtuComplaintGtdContainers;
    }

    /**
     * Sets the value of the rtuComplaintGtdContainers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGetPurchaseReturnInfoResultRtuComplaintGtdContainer }{@code >}
     *     
     */
    public void setRtuComplaintGtdContainers(JAXBElement<ArrayOfGetPurchaseReturnInfoResultRtuComplaintGtdContainer> value) {
        this.rtuComplaintGtdContainers = value;
    }

    /**
     * Gets the value of the rtuComplaintMarkCodeContainers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGetPurchaseReturnInfoResultRtuComplaintMarkCodeContainer }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGetPurchaseReturnInfoResultRtuComplaintMarkCodeContainer> getRtuComplaintMarkCodeContainers() {
        return rtuComplaintMarkCodeContainers;
    }

    /**
     * Sets the value of the rtuComplaintMarkCodeContainers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGetPurchaseReturnInfoResultRtuComplaintMarkCodeContainer }{@code >}
     *     
     */
    public void setRtuComplaintMarkCodeContainers(JAXBElement<ArrayOfGetPurchaseReturnInfoResultRtuComplaintMarkCodeContainer> value) {
        this.rtuComplaintMarkCodeContainers = value;
    }

    /**
     * Gets the value of the rtuComplaintProductContainers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGetPurchaseReturnInfoResultRtuComplaintProductContainer }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGetPurchaseReturnInfoResultRtuComplaintProductContainer> getRtuComplaintProductContainers() {
        return rtuComplaintProductContainers;
    }

    /**
     * Sets the value of the rtuComplaintProductContainers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGetPurchaseReturnInfoResultRtuComplaintProductContainer }{@code >}
     *     
     */
    public void setRtuComplaintProductContainers(JAXBElement<ArrayOfGetPurchaseReturnInfoResultRtuComplaintProductContainer> value) {
        this.rtuComplaintProductContainers = value;
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

}
