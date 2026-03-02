
package ts3.webapi.client.clientservice.wcf;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetMx3ListResult;


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
 *         <element name="GetMX3ListResult" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetMx3List}GetMx3ListResult" minOccurs="0"/>
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
    "getMX3ListResult"
})
@XmlRootElement(name = "GetMX3ListResponse")
public class GetMX3ListResponse {

    @XmlElementRef(name = "GetMX3ListResult", namespace = "Wcf.ClientService.Client.WebAPI.TS3", type = JAXBElement.class, required = false)
    protected JAXBElement<GetMx3ListResult> getMX3ListResult;

    /**
     * Gets the value of the getMX3ListResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GetMx3ListResult }{@code >}
     *     
     */
    public JAXBElement<GetMx3ListResult> getGetMX3ListResult() {
        return getMX3ListResult;
    }

    /**
     * Sets the value of the getMX3ListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GetMx3ListResult }{@code >}
     *     
     */
    public void setGetMX3ListResult(JAXBElement<GetMx3ListResult> value) {
        this.getMX3ListResult = value;
    }

}
