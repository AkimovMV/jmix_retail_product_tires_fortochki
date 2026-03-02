
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfGetRtuCorrectionInfoResult.RtuCorrectionDiscrepancyContainer complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfGetRtuCorrectionInfoResult.RtuCorrectionDiscrepancyContainer">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="GetRtuCorrectionInfoResult.RtuCorrectionDiscrepancyContainer" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetRtuCorrectionInfo}GetRtuCorrectionInfoResult.RtuCorrectionDiscrepancyContainer" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGetRtuCorrectionInfoResult.RtuCorrectionDiscrepancyContainer", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetRtuCorrectionInfo", propOrder = {
    "getRtuCorrectionInfoResultRtuCorrectionDiscrepancyContainer"
})
public class ArrayOfGetRtuCorrectionInfoResultRtuCorrectionDiscrepancyContainer {

    @XmlElement(name = "GetRtuCorrectionInfoResult.RtuCorrectionDiscrepancyContainer", nillable = true)
    protected List<GetRtuCorrectionInfoResultRtuCorrectionDiscrepancyContainer> getRtuCorrectionInfoResultRtuCorrectionDiscrepancyContainer;

    /**
     * Gets the value of the getRtuCorrectionInfoResultRtuCorrectionDiscrepancyContainer property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the getRtuCorrectionInfoResultRtuCorrectionDiscrepancyContainer property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getGetRtuCorrectionInfoResultRtuCorrectionDiscrepancyContainer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetRtuCorrectionInfoResultRtuCorrectionDiscrepancyContainer }
     * </p>
     * 
     * 
     * @return
     *     The value of the getRtuCorrectionInfoResultRtuCorrectionDiscrepancyContainer property.
     */
    public List<GetRtuCorrectionInfoResultRtuCorrectionDiscrepancyContainer> getGetRtuCorrectionInfoResultRtuCorrectionDiscrepancyContainer() {
        if (getRtuCorrectionInfoResultRtuCorrectionDiscrepancyContainer == null) {
            getRtuCorrectionInfoResultRtuCorrectionDiscrepancyContainer = new ArrayList<>();
        }
        return this.getRtuCorrectionInfoResultRtuCorrectionDiscrepancyContainer;
    }

}
