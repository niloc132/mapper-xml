//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.3.0
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2021.08.06 at 04:43:18 PM BST
//

package org.treblereel.gwt.xml.mapper.client.tests.pmml.model.impl.v4_4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}Extension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}AnovaRow" maxOccurs="3" minOccurs="3"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="target" type="{http://www.dmg.org/PMML-4_4}FIELD-NAME" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {"extension", "anovaRow"})
@XmlRootElement(name = "Anova")
public class Anova implements org.treblereel.gwt.xml.mapper.client.tests.pmml.model.api.Anova {

  @XmlElement(name = "Extension", type = Extension.class)
  protected List<org.treblereel.gwt.xml.mapper.client.tests.pmml.model.api.Extension> extension;

  @XmlElement(name = "AnovaRow", required = true, type = AnovaRow.class)
  protected List<org.treblereel.gwt.xml.mapper.client.tests.pmml.model.api.AnovaRow> anovaRow;

  @XmlAttribute(name = "target")
  protected String target;

  /**
   * Gets the value of the extension property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the extension property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getExtension().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link Extension }
   */
  public List<org.treblereel.gwt.xml.mapper.client.tests.pmml.model.api.Extension> getExtension() {
    if (extension == null) {
      extension =
          new ArrayList<org.treblereel.gwt.xml.mapper.client.tests.pmml.model.api.Extension>();
    }
    return this.extension;
  }

  /**
   * Gets the value of the anovaRow property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the anovaRow property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getAnovaRow().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link AnovaRow }
   */
  public List<org.treblereel.gwt.xml.mapper.client.tests.pmml.model.api.AnovaRow> getAnovaRow() {
    if (anovaRow == null) {
      anovaRow =
          new ArrayList<org.treblereel.gwt.xml.mapper.client.tests.pmml.model.api.AnovaRow>();
    }
    return this.anovaRow;
  }

  /**
   * Gets the value of the target property.
   *
   * @return possible object is {@link String }
   */
  public String getTarget() {
    return target;
  }

  /**
   * Sets the value of the target property.
   *
   * @param value allowed object is {@link String }
   */
  public void setTarget(String value) {
    this.target = value;
  }
}