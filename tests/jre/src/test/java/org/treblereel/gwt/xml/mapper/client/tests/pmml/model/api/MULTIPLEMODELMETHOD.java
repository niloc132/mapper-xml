//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.3.0
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2021.08.06 at 04:43:12 PM BST
//

package org.treblereel.gwt.xml.mapper.client.tests.pmml.model.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for MULTIPLE-MODEL-METHOD.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <p>
 *
 * <pre>
 * &lt;simpleType name="MULTIPLE-MODEL-METHOD"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="majorityVote"/&gt;
 *     &lt;enumeration value="weightedMajorityVote"/&gt;
 *     &lt;enumeration value="average"/&gt;
 *     &lt;enumeration value="weightedAverage"/&gt;
 *     &lt;enumeration value="median"/&gt;
 *     &lt;enumeration value="weightedMedian"/&gt;
 *     &lt;enumeration value="max"/&gt;
 *     &lt;enumeration value="sum"/&gt;
 *     &lt;enumeration value="weightedSum"/&gt;
 *     &lt;enumeration value="selectFirst"/&gt;
 *     &lt;enumeration value="selectAll"/&gt;
 *     &lt;enumeration value="modelChain"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "MULTIPLE-MODEL-METHOD")
@XmlEnum
public enum MULTIPLEMODELMETHOD {
  @XmlEnumValue("majorityVote")
  MAJORITY_VOTE("majorityVote"),
  @XmlEnumValue("weightedMajorityVote")
  WEIGHTED_MAJORITY_VOTE("weightedMajorityVote"),
  @XmlEnumValue("average")
  AVERAGE("average"),
  @XmlEnumValue("weightedAverage")
  WEIGHTED_AVERAGE("weightedAverage"),
  @XmlEnumValue("median")
  MEDIAN("median"),
  @XmlEnumValue("weightedMedian")
  WEIGHTED_MEDIAN("weightedMedian"),
  @XmlEnumValue("max")
  MAX("max"),
  @XmlEnumValue("sum")
  SUM("sum"),
  @XmlEnumValue("weightedSum")
  WEIGHTED_SUM("weightedSum"),
  @XmlEnumValue("selectFirst")
  SELECT_FIRST("selectFirst"),
  @XmlEnumValue("selectAll")
  SELECT_ALL("selectAll"),
  @XmlEnumValue("modelChain")
  MODEL_CHAIN("modelChain");
  private final String value;

  MULTIPLEMODELMETHOD(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static MULTIPLEMODELMETHOD fromValue(String v) {
    for (MULTIPLEMODELMETHOD c : MULTIPLEMODELMETHOD.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }
}