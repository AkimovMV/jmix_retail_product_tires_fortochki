
package org.datacontract.schemas._2004._07.ts3_domain_models_client_clientsoapservice;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfGetMX3InfoGoodsItem complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfGetMX3InfoGoodsItem">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="GetMX3InfoGoodsItem" type="{http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetMx3Info}GetMX3InfoGoodsItem" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGetMX3InfoGoodsItem", namespace = "http://schemas.datacontract.org/2004/07/TS3.Domain.Models.Client.ClientSoapService.GetMx3Info", propOrder = {
    "getMX3InfoGoodsItem"
})
public class ArrayOfGetMX3InfoGoodsItem {

    @XmlElement(name = "GetMX3InfoGoodsItem", nillable = true)
    protected List<GetMX3InfoGoodsItem> getMX3InfoGoodsItem;

    /**
     * Gets the value of the getMX3InfoGoodsItem property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the getMX3InfoGoodsItem property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getGetMX3InfoGoodsItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetMX3InfoGoodsItem }
     * </p>
     * 
     * 
     * @return
     *     The value of the getMX3InfoGoodsItem property.
     */
    public List<GetMX3InfoGoodsItem> getGetMX3InfoGoodsItem() {
        if (getMX3InfoGoodsItem == null) {
            getMX3InfoGoodsItem = new ArrayList<>();
        }
        return this.getMX3InfoGoodsItem;
    }

}
