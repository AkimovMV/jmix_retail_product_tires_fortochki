
package ts3.webapi.client.clientservice.wcf;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.GetMX1InfoResult;


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
 *         <element name="GetMX1InfoResult" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetMx1Info}GetMX1InfoResult" minOccurs="0"/>
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
    "getMX1InfoResult"
})
@XmlRootElement(name = "GetMX1InfoResponse")
public class GetMX1InfoResponse {

    @XmlElementRef(name = "GetMX1InfoResult", namespace = "Wcf.ClientService.Client.WebAPI.TS3", type = JAXBElement.class, required = false)
    protected JAXBElement<GetMX1InfoResult> getMX1InfoResult;

    /**
     * Gets the value of the getMX1InfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GetMX1InfoResult }{@code >}
     *     
     */
    public JAXBElement<GetMX1InfoResult> getGetMX1InfoResult() {
        return getMX1InfoResult;
    }

    /**
     * Sets the value of the getMX1InfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GetMX1InfoResult }{@code >}
     *     
     */
    public void setGetMX1InfoResult(JAXBElement<GetMX1InfoResult> value) {
        this.getMX1InfoResult = value;
    }

}
