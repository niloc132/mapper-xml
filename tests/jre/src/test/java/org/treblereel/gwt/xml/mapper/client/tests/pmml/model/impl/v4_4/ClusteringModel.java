//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.3.0
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2021.08.06 at 04:43:18 PM BST
//

package org.treblereel.gwt.xml.mapper.client.tests.pmml.model.impl.v4_4;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.treblereel.gwt.xml.mapper.client.tests.pmml.model.api.IModel;

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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}MiningSchema"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}Output" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}ModelStats" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}ModelExplanation" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}LocalTransformations" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}ComparisonMeasure"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}ClusteringField" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}MissingValueWeights" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}Cluster" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}ModelVerification" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="modelName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="functionName" use="required" type="{http://www.dmg.org/PMML-4_4}MINING-FUNCTION" /&gt;
 *       &lt;attribute name="algorithmName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="modelClass" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="centerBased"/&gt;
 *             &lt;enumeration value="distributionBased"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="numberOfClusters" use="required" type="{http://www.dmg.org/PMML-4_4}INT-NUMBER" /&gt;
 *       &lt;attribute name="isScorable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {
      "extension",
      "miningSchema",
      "output",
      "modelStats",
      "modelExplanation",
      "localTransformations",
      "comparisonMeasure",
      "clusteringField",
      "missingValueWeights",
      "cluster",
      "modelVerification"
    })
@XmlRootElement(name = "ClusteringModel")
public class ClusteringModel implements IModel {

  @XmlElement(name = "Extension")
  protected List<Extension> extension;

  @XmlElement(name = "MiningSchema", required = true)
  protected MiningSchema miningSchema;

  @XmlElement(name = "Output")
  protected Output output;

  @XmlElement(name = "ModelStats")
  protected ModelStats modelStats;

  @XmlElement(name = "ModelExplanation")
  protected ModelExplanation modelExplanation;

  @XmlElement(name = "LocalTransformations")
  protected LocalTransformations localTransformations;

  @XmlElement(name = "ComparisonMeasure", required = true)
  protected ComparisonMeasure comparisonMeasure;

  @XmlElement(name = "ClusteringField", required = true)
  protected List<ClusteringField> clusteringField;

  @XmlElement(name = "MissingValueWeights")
  protected MissingValueWeights missingValueWeights;

  @XmlElement(name = "Cluster", required = true)
  protected List<Cluster> cluster;

  @XmlElement(name = "ModelVerification")
  protected ModelVerification modelVerification;

  @XmlAttribute(name = "modelName")
  protected String modelName;

  @XmlAttribute(name = "functionName", required = true)
  protected MININGFUNCTION functionName;

  @XmlAttribute(name = "algorithmName")
  protected String algorithmName;

  @XmlAttribute(name = "modelClass", required = true)
  protected String modelClass;

  @XmlAttribute(name = "numberOfClusters", required = true)
  protected BigInteger numberOfClusters;

  @XmlAttribute(name = "isScorable")
  protected Boolean isScorable;

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
  public List<Extension> getExtension() {
    if (extension == null) {
      extension = new ArrayList<Extension>();
    }
    return this.extension;
  }

  /**
   * Gets the value of the miningSchema property.
   *
   * @return possible object is {@link MiningSchema }
   */
  public MiningSchema getMiningSchema() {
    return miningSchema;
  }

  /**
   * Sets the value of the miningSchema property.
   *
   * @param value allowed object is {@link MiningSchema }
   */
  public void setMiningSchema(MiningSchema value) {
    this.miningSchema = value;
  }

  /**
   * Gets the value of the output property.
   *
   * @return possible object is {@link Output }
   */
  public Output getOutput() {
    return output;
  }

  /**
   * Sets the value of the output property.
   *
   * @param value allowed object is {@link Output }
   */
  public void setOutput(Output value) {
    this.output = value;
  }

  /**
   * Gets the value of the modelStats property.
   *
   * @return possible object is {@link ModelStats }
   */
  public ModelStats getModelStats() {
    return modelStats;
  }

  /**
   * Sets the value of the modelStats property.
   *
   * @param value allowed object is {@link ModelStats }
   */
  public void setModelStats(ModelStats value) {
    this.modelStats = value;
  }

  /**
   * Gets the value of the modelExplanation property.
   *
   * @return possible object is {@link ModelExplanation }
   */
  public ModelExplanation getModelExplanation() {
    return modelExplanation;
  }

  /**
   * Sets the value of the modelExplanation property.
   *
   * @param value allowed object is {@link ModelExplanation }
   */
  public void setModelExplanation(ModelExplanation value) {
    this.modelExplanation = value;
  }

  /**
   * Gets the value of the localTransformations property.
   *
   * @return possible object is {@link LocalTransformations }
   */
  public LocalTransformations getLocalTransformations() {
    return localTransformations;
  }

  /**
   * Sets the value of the localTransformations property.
   *
   * @param value allowed object is {@link LocalTransformations }
   */
  public void setLocalTransformations(LocalTransformations value) {
    this.localTransformations = value;
  }

  /**
   * Gets the value of the comparisonMeasure property.
   *
   * @return possible object is {@link ComparisonMeasure }
   */
  public ComparisonMeasure getComparisonMeasure() {
    return comparisonMeasure;
  }

  /**
   * Sets the value of the comparisonMeasure property.
   *
   * @param value allowed object is {@link ComparisonMeasure }
   */
  public void setComparisonMeasure(ComparisonMeasure value) {
    this.comparisonMeasure = value;
  }

  /**
   * Gets the value of the clusteringField property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the clusteringField property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getClusteringField().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link ClusteringField }
   */
  public List<ClusteringField> getClusteringField() {
    if (clusteringField == null) {
      clusteringField = new ArrayList<ClusteringField>();
    }
    return this.clusteringField;
  }

  /**
   * Gets the value of the missingValueWeights property.
   *
   * @return possible object is {@link MissingValueWeights }
   */
  public MissingValueWeights getMissingValueWeights() {
    return missingValueWeights;
  }

  /**
   * Sets the value of the missingValueWeights property.
   *
   * @param value allowed object is {@link MissingValueWeights }
   */
  public void setMissingValueWeights(MissingValueWeights value) {
    this.missingValueWeights = value;
  }

  /**
   * Gets the value of the cluster property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the cluster property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getCluster().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link Cluster }
   */
  public List<Cluster> getCluster() {
    if (cluster == null) {
      cluster = new ArrayList<Cluster>();
    }
    return this.cluster;
  }

  /**
   * Gets the value of the modelVerification property.
   *
   * @return possible object is {@link ModelVerification }
   */
  public ModelVerification getModelVerification() {
    return modelVerification;
  }

  /**
   * Sets the value of the modelVerification property.
   *
   * @param value allowed object is {@link ModelVerification }
   */
  public void setModelVerification(ModelVerification value) {
    this.modelVerification = value;
  }

  /**
   * Gets the value of the modelName property.
   *
   * @return possible object is {@link String }
   */
  public String getModelName() {
    return modelName;
  }

  /**
   * Sets the value of the modelName property.
   *
   * @param value allowed object is {@link String }
   */
  public void setModelName(String value) {
    this.modelName = value;
  }

  /**
   * Gets the value of the functionName property.
   *
   * @return possible object is {@link MININGFUNCTION }
   */
  public MININGFUNCTION getFunctionName() {
    return functionName;
  }

  /**
   * Sets the value of the functionName property.
   *
   * @param value allowed object is {@link MININGFUNCTION }
   */
  public void setFunctionName(MININGFUNCTION value) {
    this.functionName = value;
  }

  /**
   * Gets the value of the algorithmName property.
   *
   * @return possible object is {@link String }
   */
  public String getAlgorithmName() {
    return algorithmName;
  }

  /**
   * Sets the value of the algorithmName property.
   *
   * @param value allowed object is {@link String }
   */
  public void setAlgorithmName(String value) {
    this.algorithmName = value;
  }

  /**
   * Gets the value of the modelClass property.
   *
   * @return possible object is {@link String }
   */
  public String getModelClass() {
    return modelClass;
  }

  /**
   * Sets the value of the modelClass property.
   *
   * @param value allowed object is {@link String }
   */
  public void setModelClass(String value) {
    this.modelClass = value;
  }

  /**
   * Gets the value of the numberOfClusters property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getNumberOfClusters() {
    return numberOfClusters;
  }

  /**
   * Sets the value of the numberOfClusters property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setNumberOfClusters(BigInteger value) {
    this.numberOfClusters = value;
  }

  /**
   * Gets the value of the isScorable property.
   *
   * @return possible object is {@link Boolean }
   */
  public boolean isIsScorable() {
    if (isScorable == null) {
      return true;
    } else {
      return isScorable;
    }
  }

  /**
   * Sets the value of the isScorable property.
   *
   * @param value allowed object is {@link Boolean }
   */
  public void setIsScorable(Boolean value) {
    this.isScorable = value;
  }
}
