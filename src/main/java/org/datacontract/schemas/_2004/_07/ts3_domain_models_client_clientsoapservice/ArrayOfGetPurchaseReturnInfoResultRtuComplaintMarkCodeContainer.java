
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfGetPurchaseReturnInfoResult.RtuComplaintMarkCodeContainer complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfGetPurchaseReturnInfoResult.RtuComplaintMarkCodeContainer">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="GetPurchaseReturnInfoResult.RtuComplaintMarkCodeContainer" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetPurchaseReturnInfo}GetPurchaseReturnInfoResult.RtuComplaintMarkCodeContainer" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGetPurchaseReturnInfoResult.RtuComplaintMarkCodeContainer", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetPurchaseReturnInfo", propOrder = {
    "getPurchaseReturnInfoResultRtuComplaintMarkCodeContainer"
})
public class ArrayOfGetPurchaseReturnInfoResultRtuComplaintMarkCodeContainer {

    @XmlElement(name = "GetPurchaseReturnInfoResult.RtuComplaintMarkCodeContainer", nillable = true)
    protected List<GetPurchaseReturnInfoResultRtuComplaintMarkCodeContainer> getPurchaseReturnInfoResultRtuComplaintMarkCodeContainer;

    /**
     * Gets the value of the getPurchaseReturnInfoResultRtuComplaintMarkCodeContainer property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the getPurchaseReturnInfoResultRtuComplaintMarkCodeContainer property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getGetPurchaseReturnInfoResultRtuComplaintMarkCodeContainer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetPurchaseReturnInfoResultRtuComplaintMarkCodeContainer }
     * </p>
     * 
     * 
     * @return
     *     The value of the getPurchaseReturnInfoResultRtuComplaintMarkCodeContainer property.
     */
    public List<GetPurchaseReturnInfoResultRtuComplaintMarkCodeContainer> getGetPurchaseReturnInfoResultRtuComplaintMarkCodeContainer() {
        if (getPurchaseReturnInfoResultRtuComplaintMarkCodeContainer == null) {
            getPurchaseReturnInfoResultRtuComplaintMarkCodeContainer = new ArrayList<>();
        }
        return this.getPurchaseReturnInfoResultRtuComplaintMarkCodeContainer;
    }

}
