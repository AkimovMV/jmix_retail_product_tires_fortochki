
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfGetRtuCorrectionListItem complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfGetRtuCorrectionListItem">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="GetRtuCorrectionListItem" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetRtuCorrectionList}GetRtuCorrectionListItem" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGetRtuCorrectionListItem", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetRtuCorrectionList", propOrder = {
    "getRtuCorrectionListItem"
})
public class ArrayOfGetRtuCorrectionListItem {

    @XmlElement(name = "GetRtuCorrectionListItem", nillable = true)
    protected List<GetRtuCorrectionListItem> getRtuCorrectionListItem;

    /**
     * Gets the value of the getRtuCorrectionListItem property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the getRtuCorrectionListItem property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getGetRtuCorrectionListItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetRtuCorrectionListItem }
     * </p>
     * 
     * 
     * @return
     *     The value of the getRtuCorrectionListItem property.
     */
    public List<GetRtuCorrectionListItem> getGetRtuCorrectionListItem() {
        if (getRtuCorrectionListItem == null) {
            getRtuCorrectionListItem = new ArrayList<>();
        }
        return this.getRtuCorrectionListItem;
    }

}
