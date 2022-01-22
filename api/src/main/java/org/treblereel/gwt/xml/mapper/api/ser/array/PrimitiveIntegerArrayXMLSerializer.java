/*
 * Copyright 2013 Nicolas Morel
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

package org.treblereel.gwt.xml.mapper.api.ser.array;

import javax.xml.stream.XMLStreamException;
import org.treblereel.gwt.xml.mapper.api.XMLSerializationContext;
import org.treblereel.gwt.xml.mapper.api.XMLSerializer;
import org.treblereel.gwt.xml.mapper.api.XMLSerializerParameters;
import org.treblereel.gwt.xml.mapper.api.ser.BaseNumberXMLSerializer;
import org.treblereel.gwt.xml.mapper.api.stream.XMLWriter;

/**
 * Default {@link XMLSerializer} implementation for array of int.
 *
 * @author Nicolas Morel
 * @version $Id: $
 */
public class PrimitiveIntegerArrayXMLSerializer extends BasicArrayXMLSerializer<int[]> {

  private BaseNumberXMLSerializer.IntegerXMLSerializer serializer =
      BaseNumberXMLSerializer.IntegerXMLSerializer.getInstance();

  private PrimitiveIntegerArrayXMLSerializer() {}

  /**
   * getInstance
   *
   * @return an instance of {@link PrimitiveIntegerArrayXMLSerializer}
   */
  public static BasicArrayXMLSerializer getInstance(String propertyName) {
    return new PrimitiveIntegerArrayXMLSerializer().setPropertyName(propertyName);
  }
  /** {@inheritDoc} */
  @Override
  protected boolean isEmpty(int[] value) {
    return null == value || value.length == 0;
  }

  /** {@inheritDoc} */
  @Override
  public void doSerialize(
      XMLWriter writer, int[] values, XMLSerializationContext ctx, XMLSerializerParameters params)
      throws XMLStreamException {
    if (!ctx.isWriteEmptyXMLArrays() && values.length == 0) {
      writer.nullValue();
      return;
    }

    beginObject(writer, isWrapCollections);
    for (int value : (int[]) values) {
      serializer.doSerialize(writer, value, ctx, params);
    }
    endObject(writer, isWrapCollections);
  }
}
