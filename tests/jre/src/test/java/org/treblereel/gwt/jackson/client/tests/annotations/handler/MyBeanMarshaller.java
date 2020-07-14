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
package org.treblereel.gwt.jackson.client.tests.annotations.handler;

import javax.xml.stream.XMLStreamException;
import org.treblereel.gwt.jackson.api.XMLSerializationContext;
import org.treblereel.gwt.jackson.api.XMLSerializerParameters;
import org.treblereel.gwt.jackson.api.custom.CustomXMLSerializer;
import org.treblereel.gwt.jackson.api.stream.XMLWriter;

/** @author Dmitrii Tikhomirov Created by treblereel 5/17/20 */
public class MyBeanMarshaller extends CustomXMLSerializer<MyBean> {

  @Override
  protected void doSerialize(
      XMLWriter writer, MyBean value, XMLSerializationContext ctx, XMLSerializerParameters params)
      throws XMLStreamException {
    writer.value(value.getValue() + "+" + value.getValue2());
  }
}
