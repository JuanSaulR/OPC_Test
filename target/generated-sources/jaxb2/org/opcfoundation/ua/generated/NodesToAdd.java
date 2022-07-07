//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.07.06 at 10:44:03 AM PDT 
//


package org.opcfoundation.ua.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NodesToAdd complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodesToAdd"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="UAObject" type="{http://opcfoundation.org/UA/2011/03/UANodeSet.xsd}UAObject"/&gt;
 *         &lt;element name="UAVariable" type="{http://opcfoundation.org/UA/2011/03/UANodeSet.xsd}UAVariable"/&gt;
 *         &lt;element name="UAMethod" type="{http://opcfoundation.org/UA/2011/03/UANodeSet.xsd}UAMethod"/&gt;
 *         &lt;element name="UAView" type="{http://opcfoundation.org/UA/2011/03/UANodeSet.xsd}UAView"/&gt;
 *         &lt;element name="UAObjectType" type="{http://opcfoundation.org/UA/2011/03/UANodeSet.xsd}UAObjectType"/&gt;
 *         &lt;element name="UAVariableType" type="{http://opcfoundation.org/UA/2011/03/UANodeSet.xsd}UAVariableType"/&gt;
 *         &lt;element name="UADataType" type="{http://opcfoundation.org/UA/2011/03/UANodeSet.xsd}UADataType"/&gt;
 *         &lt;element name="UAReferenceType" type="{http://opcfoundation.org/UA/2011/03/UANodeSet.xsd}UAReferenceType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NodesToAdd", propOrder = {
    "uaObjectOrUAVariableOrUAMethod"
})
public class NodesToAdd {

    @XmlElements({
        @XmlElement(name = "UAObject", type = UAObject.class),
        @XmlElement(name = "UAVariable", type = UAVariable.class),
        @XmlElement(name = "UAMethod", type = UAMethod.class),
        @XmlElement(name = "UAView", type = UAView.class),
        @XmlElement(name = "UAObjectType", type = UAObjectType.class),
        @XmlElement(name = "UAVariableType", type = UAVariableType.class),
        @XmlElement(name = "UADataType", type = UADataType.class),
        @XmlElement(name = "UAReferenceType", type = UAReferenceType.class)
    })
    protected List<UANode> uaObjectOrUAVariableOrUAMethod;

    /**
     * Gets the value of the uaObjectOrUAVariableOrUAMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uaObjectOrUAVariableOrUAMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUAObjectOrUAVariableOrUAMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UAObject }
     * {@link UAVariable }
     * {@link UAMethod }
     * {@link UAView }
     * {@link UAObjectType }
     * {@link UAVariableType }
     * {@link UADataType }
     * {@link UAReferenceType }
     * 
     * 
     */
    public List<UANode> getUAObjectOrUAVariableOrUAMethod() {
        if (uaObjectOrUAVariableOrUAMethod == null) {
            uaObjectOrUAVariableOrUAMethod = new ArrayList<UANode>();
        }
        return this.uaObjectOrUAVariableOrUAMethod;
    }

}
