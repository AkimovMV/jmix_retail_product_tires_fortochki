
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfWheelContainer complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfWheelContainer">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="WheelContainer" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsDetailedInfo}WheelContainer" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWheelContainer", propOrder = {
    "wheelContainer"
})
public class ArrayOfWheelContainer {

    @XmlElement(name = "WheelContainer", nillable = true)
    protected List<WheelContainer> wheelContainer;

    /**
     * Gets the value of the wheelContainer property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wheelContainer property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getWheelContainer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WheelContainer }
     * </p>
     * 
     * 
     * @return
     *     The value of the wheelContainer property.
     */
    public List<WheelContainer> getWheelContainer() {
        if (wheelContainer == null) {
            wheelContainer = new ArrayList<>();
        }
        return this.wheelContainer;
    }

}
