
package com.coverity.ws.v9;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for functionInfoDataObj complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="functionInfoDataObj">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fileId" type="{http://ws.coverity.com/v9}fileIdDataObj" minOccurs="0"/>
 *         &lt;element name="functionDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="functionMangledName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="functionMergeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "functionInfoDataObj", propOrder = {
    "fileId",
    "functionDisplayName",
    "functionMangledName",
    "functionMergeName"
})
public class FunctionInfoDataObj {

    protected FileIdDataObj fileId;
    protected String functionDisplayName;
    protected String functionMangledName;
    protected String functionMergeName;

    /**
     * Gets the value of the fileId property.
     * 
     * @return
     *     possible object is
     *     {@link com.coverity.ws.v9.FileIdDataObj }
     *     
     */
    public FileIdDataObj getFileId() {
        return fileId;
    }

    /**
     * Sets the value of the fileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.coverity.ws.v9.FileIdDataObj }
     *     
     */
    public void setFileId(FileIdDataObj value) {
        this.fileId = value;
    }

    /**
     * Gets the value of the functionDisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionDisplayName() {
        return functionDisplayName;
    }

    /**
     * Sets the value of the functionDisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionDisplayName(String value) {
        this.functionDisplayName = value;
    }

    /**
     * Gets the value of the functionMangledName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionMangledName() {
        return functionMangledName;
    }

    /**
     * Sets the value of the functionMangledName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionMangledName(String value) {
        this.functionMangledName = value;
    }

    /**
     * Gets the value of the functionMergeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionMergeName() {
        return functionMergeName;
    }

    /**
     * Sets the value of the functionMergeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionMergeName(String value) {
        this.functionMergeName = value;
    }

}