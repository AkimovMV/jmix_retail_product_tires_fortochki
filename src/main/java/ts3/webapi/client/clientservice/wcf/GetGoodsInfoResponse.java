
package ts3.webapi.client.clientservice.wcf;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice.ResultGetGoodsInfo;


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
 *         <element name="GetGoodsInfoResult" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo}ResultGetGoodsInfo" minOccurs="0"/>
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
    "getGoodsInfoResult"
})
@XmlRootElement(name = "GetGoodsInfoResponse")
public class GetGoodsInfoResponse {

    @XmlElementRef(name = "GetGoodsInfoResult", namespace = "Wcf.ClientService.Client.WebAPI.TS3", type = JAXBElement.class, required = false)
    protected JAXBElement<ResultGetGoodsInfo> getGoodsInfoResult;

    /**
     * Gets the value of the getGoodsInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResultGetGoodsInfo }{@code >}
     *     
     */
    public JAXBElement<ResultGetGoodsInfo> getGetGoodsInfoResult() {
        return getGoodsInfoResult;
    }

    /**
     * Sets the value of the getGoodsInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResultGetGoodsInfo }{@code >}
     *     
     */
    public void setGetGoodsInfoResult(JAXBElement<ResultGetGoodsInfo> value) {
        this.getGoodsInfoResult = value;
    }

}
