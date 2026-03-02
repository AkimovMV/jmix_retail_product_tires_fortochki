
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfgoods_price_rest complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfgoods_price_rest">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="goods_price_rest" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsBySpecs}goods_price_rest" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfgoods_price_rest", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.SearchProductsBySpecs", propOrder = {
    "goodsPriceRest"
})
public class ArrayOfgoodsPriceRest {

    @XmlElement(name = "goods_price_rest", nillable = true)
    protected List<GoodsPriceRest> goodsPriceRest;

    /**
     * Gets the value of the goodsPriceRest property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the goodsPriceRest property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getGoodsPriceRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GoodsPriceRest }
     * </p>
     * 
     * 
     * @return
     *     The value of the goodsPriceRest property.
     */
    public List<GoodsPriceRest> getGoodsPriceRest() {
        if (goodsPriceRest == null) {
            goodsPriceRest = new ArrayList<>();
        }
        return this.goodsPriceRest;
    }

}
