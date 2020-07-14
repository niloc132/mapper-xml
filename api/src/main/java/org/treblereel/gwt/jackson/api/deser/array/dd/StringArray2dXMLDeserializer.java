/*
 * Copyright © 2020 Treblereel
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.treblereel.gwt.jackson.api.deser.array.dd;

import java.util.List;
import javax.xml.stream.XMLStreamException;
import org.treblereel.gwt.jackson.api.XMLDeserializationContext;
import org.treblereel.gwt.jackson.api.XMLDeserializerParameters;
import org.treblereel.gwt.jackson.api.deser.StringXMLDeserializer;
import org.treblereel.gwt.jackson.api.stream.XMLReader;

/** @author Dmitrii Tikhomirov Created by treblereel 3/28/20 */
public class StringArray2dXMLDeserializer extends AbstractArray2dXMLDeserializer<String[][]> {

  private static final StringArray2dXMLDeserializer INSTANCE = new StringArray2dXMLDeserializer();

  private StringArray2dXMLDeserializer() {}

  /**
   * getInstance
   *
   * @return an instance of {@link StringArray2dXMLDeserializer}
   */
  public static StringArray2dXMLDeserializer newInstance() {
    return INSTANCE;
  }

  /** {@inheritDoc} */
  @Override
  public String[][] doDeserialize(
      XMLReader reader, XMLDeserializationContext ctx, XMLDeserializerParameters params)
      throws XMLStreamException {
    List<List<String>> list =
        deserializeIntoList(reader, ctx, s -> StringXMLDeserializer.getInstance(), params);

    if (list.isEmpty()) {
      return new String[0][0];
    }

    List<String> firstList = list.get(0);
    if (firstList.isEmpty()) {
      return new String[list.size()][0];
    }

    String[][] array = new String[list.size()][firstList.size()];

    int i = 0;
    int j;
    for (List<String> innerList : list) {
      j = 0;
      for (String value : innerList) {
        if (null != value) {
          array[i][j] = value;
        }
        j++;
      }
      i++;
    }
    return array;
  }
}
