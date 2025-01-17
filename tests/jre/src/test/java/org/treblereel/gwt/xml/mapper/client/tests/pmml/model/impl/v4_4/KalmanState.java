//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.3.0
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2021.08.06 at 04:43:18 PM BST
//

package org.treblereel.gwt.xml.mapper.client.tests.pmml.model.impl.v4_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.treblereel.gwt.xml.mapper.client.tests.pmml.model.api.IState;

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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}FinalOmega"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}FinalStateVector"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}HVector" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {"finalOmega", "finalStateVector", "hVector"})
@XmlRootElement(name = "KalmanState")
public class KalmanState implements IState {

  @XmlElement(name = "FinalOmega", required = true)
  protected FinalOmega finalOmega;

  @XmlElement(name = "FinalStateVector", required = true)
  protected FinalStateVector finalStateVector;

  @XmlElement(name = "HVector")
  protected HVector hVector;

  /**
   * Gets the value of the finalOmega property.
   *
   * @return possible object is {@link FinalOmega }
   */
  public FinalOmega getFinalOmega() {
    return finalOmega;
  }

  /**
   * Sets the value of the finalOmega property.
   *
   * @param value allowed object is {@link FinalOmega }
   */
  public void setFinalOmega(FinalOmega value) {
    this.finalOmega = value;
  }

  /**
   * Gets the value of the finalStateVector property.
   *
   * @return possible object is {@link FinalStateVector }
   */
  public FinalStateVector getFinalStateVector() {
    return finalStateVector;
  }

  /**
   * Sets the value of the finalStateVector property.
   *
   * @param value allowed object is {@link FinalStateVector }
   */
  public void setFinalStateVector(FinalStateVector value) {
    this.finalStateVector = value;
  }

  /**
   * Gets the value of the hVector property.
   *
   * @return possible object is {@link HVector }
   */
  public HVector getHVector() {
    return hVector;
  }

  /**
   * Sets the value of the hVector property.
   *
   * @param value allowed object is {@link HVector }
   */
  public void setHVector(HVector value) {
    this.hVector = value;
  }
}
