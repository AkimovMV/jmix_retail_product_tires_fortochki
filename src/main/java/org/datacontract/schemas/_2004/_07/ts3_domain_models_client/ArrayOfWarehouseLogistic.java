
package org.datacontract.schemas._2004._07.ts3_domain_models_client;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfWarehouseLogistic complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfWarehouseLogistic">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="WarehouseLogistic" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService}WarehouseLogistic" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWarehouseLogistic", propOrder = {
    "warehouseLogistic"
})
public class ArrayOfWarehouseLogistic {

    @XmlElement(name = "WarehouseLogistic", nillable = true)
    protected List<WarehouseLogistic> warehouseLogistic;

    /**
     * Gets the value of the warehouseLogistic property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warehouseLogistic property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getWarehouseLogistic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WarehouseLogistic }
     * </p>
     * 
     * 
     * @return
     *     The value of the warehouseLogistic property.
     */
    public List<WarehouseLogistic> getWarehouseLogistic() {
        if (warehouseLogistic == null) {
            warehouseLogistic = new ArrayList<>();
        }
        return this.warehouseLogistic;
    }

}
