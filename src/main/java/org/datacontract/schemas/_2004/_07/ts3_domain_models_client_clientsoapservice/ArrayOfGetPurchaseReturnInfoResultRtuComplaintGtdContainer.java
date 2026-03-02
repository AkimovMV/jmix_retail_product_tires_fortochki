
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfGetPurchaseReturnInfoResult.RtuComplaintGtdContainer complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfGetPurchaseReturnInfoResult.RtuComplaintGtdContainer">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="GetPurchaseReturnInfoResult.RtuComplaintGtdContainer" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetPurchaseReturnInfo}GetPurchaseReturnInfoResult.RtuComplaintGtdContainer" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGetPurchaseReturnInfoResult.RtuComplaintGtdContainer", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetPurchaseReturnInfo", propOrder = {
    "getPurchaseReturnInfoResultRtuComplaintGtdContainer"
})
public class ArrayOfGetPurchaseReturnInfoResultRtuComplaintGtdContainer {

    @XmlElement(name = "GetPurchaseReturnInfoResult.RtuComplaintGtdContainer", nillable = true)
    protected List<GetPurchaseReturnInfoResultRtuComplaintGtdContainer> getPurchaseReturnInfoResultRtuComplaintGtdContainer;

    /**
     * Gets the value of the getPurchaseReturnInfoResultRtuComplaintGtdContainer property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the getPurchaseReturnInfoResultRtuComplaintGtdContainer property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getGetPurchaseReturnInfoResultRtuComplaintGtdContainer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetPurchaseReturnInfoResultRtuComplaintGtdContainer }
     * </p>
     * 
     * 
     * @return
     *     The value of the getPurchaseReturnInfoResultRtuComplaintGtdContainer property.
     */
    public List<GetPurchaseReturnInfoResultRtuComplaintGtdContainer> getGetPurchaseReturnInfoResultRtuComplaintGtdContainer() {
        if (getPurchaseReturnInfoResultRtuComplaintGtdContainer == null) {
            getPurchaseReturnInfoResultRtuComplaintGtdContainer = new ArrayList<>();
        }
        return this.getPurchaseReturnInfoResultRtuComplaintGtdContainer;
    }

}
