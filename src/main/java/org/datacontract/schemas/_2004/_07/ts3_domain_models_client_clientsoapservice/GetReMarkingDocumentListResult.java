
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ts3_domain_models_client.ClientServiceResult;


/**
 * <p>Java class for GetReMarkingDocumentListResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GetReMarkingDocumentListResult">
 *   <complexContent>
 *     <extension base="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService}ClientServiceResult">
 *       <sequence>
 *         <element name="documents" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetReMarkingDocumentList}ArrayOfGetReMarkingDocumentListItem" minOccurs="0"/>
 *         <element name="totalItems" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="totalPages" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetReMarkingDocumentListResult", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetReMarkingDocumentList", propOrder = {
    "documents",
    "totalItems",
    "totalPages"
})
public class GetReMarkingDocumentListResult
    extends ClientServiceResult
{

    @XmlElementRef(name = "documents", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetReMarkingDocumentList", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGetReMarkingDocumentListItem> documents;
    protected Integer totalItems;
    protected Integer totalPages;

    /**
     * Gets the value of the documents property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGetReMarkingDocumentListItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGetReMarkingDocumentListItem> getDocuments() {
        return documents;
    }

    /**
     * Sets the value of the documents property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGetReMarkingDocumentListItem }{@code >}
     *     
     */
    public void setDocuments(JAXBElement<ArrayOfGetReMarkingDocumentListItem> value) {
        this.documents = value;
    }

    /**
     * Gets the value of the totalItems property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalItems() {
        return totalItems;
    }

    /**
     * Sets the value of the totalItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalItems(Integer value) {
        this.totalItems = value;
    }

    /**
     * Gets the value of the totalPages property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalPages() {
        return totalPages;
    }

    /**
     * Sets the value of the totalPages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalPages(Integer value) {
        this.totalPages = value;
    }

}
