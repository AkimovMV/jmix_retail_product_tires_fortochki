
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfWarehouseDetails complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfWarehouseDetails">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="WarehouseDetails" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderList}WarehouseDetails" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWarehouseDetails", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetOrderList", propOrder = {
    "warehouseDetails"
})
public class ArrayOfWarehouseDetails {

    @XmlElement(name = "WarehouseDetails", nillable = true)
    protected List<WarehouseDetails> warehouseDetails;

    /**
     * Gets the value of the warehouseDetails property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warehouseDetails property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getWarehouseDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WarehouseDetails }
     * </p>
     * 
     * 
     * @return
     *     The value of the warehouseDetails property.
     */
    public List<WarehouseDetails> getWarehouseDetails() {
        if (warehouseDetails == null) {
            warehouseDetails = new ArrayList<>();
        }
        return this.warehouseDetails;
    }

}
