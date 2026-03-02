
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfResult.GetDeliveryPeriodItem complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfResult.GetDeliveryPeriodItem">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Result.GetDeliveryPeriodItem" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetDeliveryPeriod}Result.GetDeliveryPeriodItem" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfResult.GetDeliveryPeriodItem", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetDeliveryPeriod", propOrder = {
    "resultGetDeliveryPeriodItem"
})
public class ArrayOfResultGetDeliveryPeriodItem {

    @XmlElement(name = "Result.GetDeliveryPeriodItem", nillable = true)
    protected List<ResultGetDeliveryPeriodItem> resultGetDeliveryPeriodItem;

    /**
     * Gets the value of the resultGetDeliveryPeriodItem property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resultGetDeliveryPeriodItem property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getResultGetDeliveryPeriodItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResultGetDeliveryPeriodItem }
     * </p>
     * 
     * 
     * @return
     *     The value of the resultGetDeliveryPeriodItem property.
     */
    public List<ResultGetDeliveryPeriodItem> getResultGetDeliveryPeriodItem() {
        if (resultGetDeliveryPeriodItem == null) {
            resultGetDeliveryPeriodItem = new ArrayList<>();
        }
        return this.resultGetDeliveryPeriodItem;
    }

}
