
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCreateMarketplaceOrderItem complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfCreateMarketplaceOrderItem">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CreateMarketplaceOrderItem" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.CreateMarketplaceOrder}CreateMarketplaceOrderItem" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCreateMarketplaceOrderItem", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.CreateMarketplaceOrder", propOrder = {
    "createMarketplaceOrderItem"
})
public class ArrayOfCreateMarketplaceOrderItem {

    @XmlElement(name = "CreateMarketplaceOrderItem", nillable = true)
    protected List<CreateMarketplaceOrderItem> createMarketplaceOrderItem;

    /**
     * Gets the value of the createMarketplaceOrderItem property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the createMarketplaceOrderItem property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCreateMarketplaceOrderItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreateMarketplaceOrderItem }
     * </p>
     * 
     * 
     * @return
     *     The value of the createMarketplaceOrderItem property.
     */
    public List<CreateMarketplaceOrderItem> getCreateMarketplaceOrderItem() {
        if (createMarketplaceOrderItem == null) {
            createMarketplaceOrderItem = new ArrayList<>();
        }
        return this.createMarketplaceOrderItem;
    }

}
