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

package org.treblereel.gwt.jackson.client.tests.annotations.xmladapter;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.treblereel.gwt.jackson.api.annotation.XMLMapper;

/** @author Dmitrii Tikhomirov Created by treblereel 9/29/20 */
@XMLMapper
public class MyTestBean {

  @XmlJavaTypeAdapter(MyTestBeanValueAdapter.class)
  private MyCustomBean value;

  @Override
  public int hashCode() {
    return getValue() != null ? getValue().hashCode() : 0;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof MyTestBean)) return false;

    MyTestBean that = (MyTestBean) o;

    return getValue() != null ? getValue().equals(that.getValue()) : that.getValue() == null;
  }

  public MyCustomBean getValue() {
    return value;
  }

  public void setValue(MyCustomBean value) {
    this.value = value;
  }
}