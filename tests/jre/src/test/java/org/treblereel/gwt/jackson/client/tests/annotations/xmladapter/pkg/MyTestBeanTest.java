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

package org.treblereel.gwt.jackson.client.tests.annotations.xmladapter.pkg;

import static org.junit.Assert.assertEquals;

import com.google.j2cl.junit.apt.J2clTestInput;
import javax.xml.stream.XMLStreamException;
import org.junit.Test;
import org.treblereel.gwt.jackson.client.tests.annotations.xmladapter.MyCustomBean;

/** @author Dmitrii Tikhomirov Created by treblereel 9/29/20 */
@J2clTestInput(MyTestBeanTest.class)
public class MyTestBeanTest {

  private static final String XML =
      "<?xml version='1.0' encoding='UTF-8'?><MyTestBean><value><value>TEST</value></value></MyTestBean>";

  MyTestBean_XMLMapperImpl mapper = MyTestBean_XMLMapperImpl.INSTANCE;

  @Test
  public void testSerializeValue() throws XMLStreamException {
    MyTestBean test = new MyTestBean();
    test.setValue(new MyCustomBean("TEST"));
    assertEquals(XML, mapper.write(test));
  }

  @Test
  public void testDeserializeValue() throws XMLStreamException {
    MyTestBean test = new MyTestBean();
    test.setValue(new MyCustomBean("TEST"));
    assertEquals(test, mapper.read(XML));
  }
}
