//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.3.0
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2021.08.06 at 04:43:12 PM BST
//

package org.treblereel.gwt.xml.mapper.client.tests.pmml.model.api;

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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}ConfusionMatrix" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}LiftData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}ROC" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="targetField" use="required" type="{http://www.dmg.org/PMML-4_4}FIELD-NAME" /&gt;
 *       &lt;attribute name="dataName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="dataUsage" default="training"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="training"/&gt;
 *             &lt;enumeration value="test"/&gt;
 *             &lt;enumeration value="validation"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="meanError" type="{http://www.dmg.org/PMML-4_4}NUMBER" /&gt;
 *       &lt;attribute name="meanAbsoluteError" type="{http://www.dmg.org/PMML-4_4}NUMBER" /&gt;
 *       &lt;attribute name="meanSquaredError" type="{http://www.dmg.org/PMML-4_4}NUMBER" /&gt;
 *       &lt;attribute name="rootMeanSquaredError" type="{http://www.dmg.org/PMML-4_4}NUMBER" /&gt;
 *       &lt;attribute name="r-squared" type="{http://www.dmg.org/PMML-4_4}NUMBER" /&gt;
 *       &lt;attribute name="adj-r-squared" type="{http://www.dmg.org/PMML-4_4}NUMBER" /&gt;
 *       &lt;attribute name="sumSquaredError" type="{http://www.dmg.org/PMML-4_4}NUMBER" /&gt;
 *       &lt;attribute name="sumSquaredRegression" type="{http://www.dmg.org/PMML-4_4}NUMBER" /&gt;
 *       &lt;attribute name="numOfRecords" type="{http://www.dmg.org/PMML-4_4}NUMBER" /&gt;
 *       &lt;attribute name="numOfRecordsWeighted" type="{http://www.dmg.org/PMML-4_4}NUMBER" /&gt;
 *       &lt;attribute name="numOfPredictors" type="{http://www.dmg.org/PMML-4_4}NUMBER" /&gt;
 *       &lt;attribute name="degreesOfFreedom" type="{http://www.dmg.org/PMML-4_4}NUMBER" /&gt;
 *       &lt;attribute name="fStatistic" type="{http://www.dmg.org/PMML-4_4}NUMBER" /&gt;
 *       &lt;attribute name="AIC" type="{http://www.dmg.org/PMML-4_4}NUMBER" /&gt;
 *       &lt;attribute name="BIC" type="{http://www.dmg.org/PMML-4_4}NUMBER" /&gt;
 *       &lt;attribute name="AICc" type="{http://www.dmg.org/PMML-4_4}NUMBER" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public interface PredictiveModelQuality {

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
   * Gets the value of the confusionMatrix property.
   *
   * @return possible object is {@link ConfusionMatrix }
   */
  ConfusionMatrix getConfusionMatrix();

  /**
   * Sets the value of the confusionMatrix property.
   *
   * @param value allowed object is {@link ConfusionMatrix }
   */
  void setConfusionMatrix(ConfusionMatrix value);

  /**
   * Gets the value of the liftData property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the liftData property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getLiftData().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link LiftData }
   */
  List<LiftData> getLiftData();

  /**
   * Gets the value of the roc property.
   *
   * @return possible object is {@link ROC }
   */
  ROC getROC();

  /**
   * Sets the value of the roc property.
   *
   * @param value allowed object is {@link ROC }
   */
  void setROC(ROC value);

  /**
   * Gets the value of the targetField property.
   *
   * @return possible object is {@link String }
   */
  String getTargetField();

  /**
   * Sets the value of the targetField property.
   *
   * @param value allowed object is {@link String }
   */
  void setTargetField(String value);

  /**
   * Gets the value of the dataName property.
   *
   * @return possible object is {@link String }
   */
  String getDataName();

  /**
   * Sets the value of the dataName property.
   *
   * @param value allowed object is {@link String }
   */
  void setDataName(String value);

  /**
   * Gets the value of the dataUsage property.
   *
   * @return possible object is {@link String }
   */
  String getDataUsage();

  /**
   * Sets the value of the dataUsage property.
   *
   * @param value allowed object is {@link String }
   */
  void setDataUsage(String value);

  /**
   * Gets the value of the meanError property.
   *
   * @return possible object is {@link Double }
   */
  Double getMeanError();

  /**
   * Sets the value of the meanError property.
   *
   * @param value allowed object is {@link Double }
   */
  void setMeanError(Double value);

  /**
   * Gets the value of the meanAbsoluteError property.
   *
   * @return possible object is {@link Double }
   */
  Double getMeanAbsoluteError();

  /**
   * Sets the value of the meanAbsoluteError property.
   *
   * @param value allowed object is {@link Double }
   */
  void setMeanAbsoluteError(Double value);

  /**
   * Gets the value of the meanSquaredError property.
   *
   * @return possible object is {@link Double }
   */
  Double getMeanSquaredError();

  /**
   * Sets the value of the meanSquaredError property.
   *
   * @param value allowed object is {@link Double }
   */
  void setMeanSquaredError(Double value);

  /**
   * Gets the value of the rootMeanSquaredError property.
   *
   * @return possible object is {@link Double }
   */
  Double getRootMeanSquaredError();

  /**
   * Sets the value of the rootMeanSquaredError property.
   *
   * @param value allowed object is {@link Double }
   */
  void setRootMeanSquaredError(Double value);

  /**
   * Gets the value of the rSquared property.
   *
   * @return possible object is {@link Double }
   */
  Double getRSquared();

  /**
   * Sets the value of the rSquared property.
   *
   * @param value allowed object is {@link Double }
   */
  void setRSquared(Double value);

  /**
   * Gets the value of the adjRSquared property.
   *
   * @return possible object is {@link Double }
   */
  Double getAdjRSquared();

  /**
   * Sets the value of the adjRSquared property.
   *
   * @param value allowed object is {@link Double }
   */
  void setAdjRSquared(Double value);

  /**
   * Gets the value of the sumSquaredError property.
   *
   * @return possible object is {@link Double }
   */
  Double getSumSquaredError();

  /**
   * Sets the value of the sumSquaredError property.
   *
   * @param value allowed object is {@link Double }
   */
  void setSumSquaredError(Double value);

  /**
   * Gets the value of the sumSquaredRegression property.
   *
   * @return possible object is {@link Double }
   */
  Double getSumSquaredRegression();

  /**
   * Sets the value of the sumSquaredRegression property.
   *
   * @param value allowed object is {@link Double }
   */
  void setSumSquaredRegression(Double value);

  /**
   * Gets the value of the numOfRecords property.
   *
   * @return possible object is {@link Double }
   */
  Double getNumOfRecords();

  /**
   * Sets the value of the numOfRecords property.
   *
   * @param value allowed object is {@link Double }
   */
  void setNumOfRecords(Double value);

  /**
   * Gets the value of the numOfRecordsWeighted property.
   *
   * @return possible object is {@link Double }
   */
  Double getNumOfRecordsWeighted();

  /**
   * Sets the value of the numOfRecordsWeighted property.
   *
   * @param value allowed object is {@link Double }
   */
  void setNumOfRecordsWeighted(Double value);

  /**
   * Gets the value of the numOfPredictors property.
   *
   * @return possible object is {@link Double }
   */
  Double getNumOfPredictors();

  /**
   * Sets the value of the numOfPredictors property.
   *
   * @param value allowed object is {@link Double }
   */
  void setNumOfPredictors(Double value);

  /**
   * Gets the value of the degreesOfFreedom property.
   *
   * @return possible object is {@link Double }
   */
  Double getDegreesOfFreedom();

  /**
   * Sets the value of the degreesOfFreedom property.
   *
   * @param value allowed object is {@link Double }
   */
  void setDegreesOfFreedom(Double value);

  /**
   * Gets the value of the fStatistic property.
   *
   * @return possible object is {@link Double }
   */
  Double getFStatistic();

  /**
   * Sets the value of the fStatistic property.
   *
   * @param value allowed object is {@link Double }
   */
  void setFStatistic(Double value);

  /**
   * Gets the value of the aic property.
   *
   * @return possible object is {@link Double }
   */
  Double getAIC();

  /**
   * Sets the value of the aic property.
   *
   * @param value allowed object is {@link Double }
   */
  void setAIC(Double value);

  /**
   * Gets the value of the bic property.
   *
   * @return possible object is {@link Double }
   */
  Double getBIC();

  /**
   * Sets the value of the bic property.
   *
   * @param value allowed object is {@link Double }
   */
  void setBIC(Double value);

  /**
   * Gets the value of the aiCc property.
   *
   * @return possible object is {@link Double }
   */
  Double getAICc();

  /**
   * Sets the value of the aiCc property.
   *
   * @param value allowed object is {@link Double }
   */
  void setAICc(Double value);
}