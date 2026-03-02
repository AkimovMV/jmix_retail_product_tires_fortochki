
package com.microsoft.schemas._2003._10.serialization.arrays;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfunsignedByte complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfunsignedByte">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="unsignedByte" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfunsignedByte", propOrder = {
    "unsignedByte"
})
public class ArrayOfunsignedByte {

    @XmlElement(type = Short.class)
    @XmlSchemaType(name = "unsignedByte")
    protected List<Short> unsignedByte;

    /**
     * Gets the value of the unsignedByte property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unsignedByte property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getUnsignedByte().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Short }
     * </p>
     * 
     * 
     * @return
     *     The value of the unsignedByte property.
     */
    public List<Short> getUnsignedByte() {
        if (unsignedByte == null) {
            unsignedByte = new ArrayList<>();
        }
        return this.unsignedByte;
    }

}
