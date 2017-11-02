
package com.github.ittalks.commons.example.ws.jax.demo4.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getRolesResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="getRolesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://server.demo4.jax.ws.example.commons.ittalks.github.com/}myRoleArray" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRolesResponse", propOrder = {
    "_return"
})
public class GetRolesResponse {

    @XmlElement(name = "return")
    protected MyRoleArray _return;

    /**
     * 获取return属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MyRoleArray }
     *     
     */
    public MyRoleArray getReturn() {
        return _return;
    }

    /**
     * 设置return属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MyRoleArray }
     *     
     */
    public void setReturn(MyRoleArray value) {
        this._return = value;
    }

}