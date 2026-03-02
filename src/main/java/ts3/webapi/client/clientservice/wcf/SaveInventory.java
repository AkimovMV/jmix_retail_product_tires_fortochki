
package ts3.webapi.client.clientservice.wcf;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.ArrayOfSaveInventoryMarkCode;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.ArrayOfSaveInventoryProduct;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="login" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="guid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="responsiblePerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="markCodeList" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SaveInventory}ArrayOfSaveInventoryMarkCode" minOccurs="0"/>
 *         <element name="productList" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SaveInventory}ArrayOfSaveInventoryProduct" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "login",
    "password",
    "guid",
    "responsiblePerson",
    "markCodeList",
    "productList"
})
@XmlRootElement(name = "SaveInventory")
public class SaveInventory {

    @XmlElementRef(name = "login", namespace = "Wcf.ClientService.Client.WebAPI.TS3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> login;
    @XmlElementRef(name = "password", namespace = "Wcf.ClientService.Client.WebAPI.TS3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> password;
    @XmlElementRef(name = "guid", namespace = "Wcf.ClientService.Client.WebAPI.TS3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> guid;
    @XmlElementRef(name = "responsiblePerson", namespace = "Wcf.ClientService.Client.WebAPI.TS3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> responsiblePerson;
    @XmlElementRef(name = "markCodeList", namespace = "Wcf.ClientService.Client.WebAPI.TS3", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSaveInventoryMarkCode> markCodeList;
    @XmlElementRef(name = "productList", namespace = "Wcf.ClientService.Client.WebAPI.TS3", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSaveInventoryProduct> productList;

    /**
     * Gets the value of the login property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLogin() {
        return login;
    }

    /**
     * Sets the value of the login property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLogin(JAXBElement<String> value) {
        this.login = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPassword(JAXBElement<String> value) {
        this.password = value;
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
     * Gets the value of the responsiblePerson property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResponsiblePerson() {
        return responsiblePerson;
    }

    /**
     * Sets the value of the responsiblePerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResponsiblePerson(JAXBElement<String> value) {
        this.responsiblePerson = value;
    }

    /**
     * Gets the value of the markCodeList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSaveInventoryMarkCode }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSaveInventoryMarkCode> getMarkCodeList() {
        return markCodeList;
    }

    /**
     * Sets the value of the markCodeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSaveInventoryMarkCode }{@code >}
     *     
     */
    public void setMarkCodeList(JAXBElement<ArrayOfSaveInventoryMarkCode> value) {
        this.markCodeList = value;
    }

    /**
     * Gets the value of the productList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSaveInventoryProduct }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSaveInventoryProduct> getProductList() {
        return productList;
    }

    /**
     * Sets the value of the productList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSaveInventoryProduct }{@code >}
     *     
     */
    public void setProductList(JAXBElement<ArrayOfSaveInventoryProduct> value) {
        this.productList = value;
    }

}
