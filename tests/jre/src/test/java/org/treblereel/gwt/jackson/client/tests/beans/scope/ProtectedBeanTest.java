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
package org.treblereel.gwt.jackson.client.tests.beans.scope;

import static org.junit.Assert.assertEquals;

import javax.xml.stream.XMLStreamException;
import org.junit.Test;

/** @author Dmitrii Tikhomirov Created by treblereel 5/13/20 */
public class ProtectedBeanTest {
  ProtectedBean_MapperImpl mapper = ProtectedBean_MapperImpl.INSTANCE;

  @Test
  public void test() throws XMLStreamException {
    ProtectedBean test = new ProtectedBean();
    test.setValue("test");
    test.value1 = "value1";
    test.value2 = "value2";
    test.value3 = "value3";
    assertEquals(test, mapper.read(mapper.write(test)));
  }
}
