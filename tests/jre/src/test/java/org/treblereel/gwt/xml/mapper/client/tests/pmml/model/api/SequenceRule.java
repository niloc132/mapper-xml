//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.3.0
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2021.08.06 at 04:43:12 PM BST
//

package org.treblereel.gwt.xml.mapper.client.tests.pmml.model.api;

import java.math.BigInteger;
import java.util.List;

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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}AntecedentSequence"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}Delimiter"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}Time" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}ConsequentSequence"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.dmg.org/PMML-4_4}ELEMENT-ID" /&gt;
 *       &lt;attribute name="numberOfSets" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *       &lt;attribute name="occurrence" use="required" type="{http://www.dmg.org/PMML-4_4}INT-NUMBER" /&gt;
 *       &lt;attribute name="support" use="required" type="{http://www.dmg.org/PMML-4_4}REAL-NUMBER" /&gt;
 *       &lt;attribute name="confidence" use="required" type="{http://www.dmg.org/PMML-4_4}REAL-NUMBER" /&gt;
 *       &lt;attribute name="lift" type="{http://www.dmg.org/PMML-4_4}REAL-NUMBER" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public interface SequenceRule {

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
  List<Extension> getExtension();

  /**
   * Gets the value of the antecedentSequence property.
   *
   * @return possible object is {@link AntecedentSequence }
   */
  AntecedentSequence getAntecedentSequence();

  /**
   * Sets the value of the antecedentSequence property.
   *
   * @param value allowed object is {@link AntecedentSequence }
   */
  void setAntecedentSequence(AntecedentSequence value);

  /**
   * Gets the value of the delimiter property.
   *
   * @return possible object is {@link Delimiter }
   */
  Delimiter getDelimiter();

  /**
   * Sets the value of the delimiter property.
   *
   * @param value allowed object is {@link Delimiter }
   */
  void setDelimiter(Delimiter value);

  /**
   * Gets the value of the time property.
   *
   * @return possible object is {@link Time }
   */
  Time getTime();

  /**
   * Sets the value of the time property.
   *
   * @param value allowed object is {@link Time }
   */
  void setTime(Time value);

  /**
   * Gets the value of the consequentSequence property.
   *
   * @return possible object is {@link ConsequentSequence }
   */
  ConsequentSequence getConsequentSequence();

  /**
   * Sets the value of the consequentSequence property.
   *
   * @param value allowed object is {@link ConsequentSequence }
   */
  void setConsequentSequence(ConsequentSequence value);

  /**
   * Gets the value of the id property.
   *
   * @return possible object is {@link String }
   */
  String getId();

  /**
   * Sets the value of the id property.
   *
   * @param value allowed object is {@link String }
   */
  void setId(String value);

  /**
   * Gets the value of the numberOfSets property.
   *
   * @return possible object is {@link BigInteger }
   */
  BigInteger getNumberOfSets();

  /**
   * Sets the value of the numberOfSets property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  void setNumberOfSets(BigInteger value);

  /**
   * Gets the value of the occurrence property.
   *
   * @return possible object is {@link BigInteger }
   */
  BigInteger getOccurrence();

  /**
   * Sets the value of the occurrence property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  void setOccurrence(BigInteger value);

  /** Gets the value of the support property. */
  double getSupport();

  /** Sets the value of the support property. */
  void setSupport(double value);

  /** Gets the value of the confidence property. */
  double getConfidence();

  /** Sets the value of the confidence property. */
  void setConfidence(double value);

  /**
   * Gets the value of the lift property.
   *
   * @return possible object is {@link Double }
   */
  Double getLift();

  /**
   * Sets the value of the lift property.
   *
   * @param value allowed object is {@link Double }
   */
  void setLift(Double value);
}