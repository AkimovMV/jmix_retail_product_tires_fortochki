
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfGetRtuCorrectionInfoResult.RtuCorrectionMarkCodeContainer complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfGetRtuCorrectionInfoResult.RtuCorrectionMarkCodeContainer">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="GetRtuCorrectionInfoResult.RtuCorrectionMarkCodeContainer" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetRtuCorrectionInfo}GetRtuCorrectionInfoResult.RtuCorrectionMarkCodeContainer" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGetRtuCorrectionInfoResult.RtuCorrectionMarkCodeContainer", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetRtuCorrectionInfo", propOrder = {
    "getRtuCorrectionInfoResultRtuCorrectionMarkCodeContainer"
})
public class ArrayOfGetRtuCorrectionInfoResultRtuCorrectionMarkCodeContainer {

    @XmlElement(name = "GetRtuCorrectionInfoResult.RtuCorrectionMarkCodeContainer", nillable = true)
    protected List<GetRtuCorrectionInfoResultRtuCorrectionMarkCodeContainer> getRtuCorrectionInfoResultRtuCorrectionMarkCodeContainer;

    /**
     * Gets the value of the getRtuCorrectionInfoResultRtuCorrectionMarkCodeContainer property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the getRtuCorrectionInfoResultRtuCorrectionMarkCodeContainer property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getGetRtuCorrectionInfoResultRtuCorrectionMarkCodeContainer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetRtuCorrectionInfoResultRtuCorrectionMarkCodeContainer }
     * </p>
     * 
     * 
     * @return
     *     The value of the getRtuCorrectionInfoResultRtuCorrectionMarkCodeContainer property.
     */
    public List<GetRtuCorrectionInfoResultRtuCorrectionMarkCodeContainer> getGetRtuCorrectionInfoResultRtuCorrectionMarkCodeContainer() {
        if (getRtuCorrectionInfoResultRtuCorrectionMarkCodeContainer == null) {
            getRtuCorrectionInfoResultRtuCorrectionMarkCodeContainer = new ArrayList<>();
        }
        return this.getRtuCorrectionInfoResultRtuCorrectionMarkCodeContainer;
    }

}
