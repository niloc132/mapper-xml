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
package org.treblereel.gwt.jackson.api;

import org.treblereel.gwt.jackson.api.utils.JsDateFormat;
import org.treblereel.gwt.jackson.api.utils.JsMapLike;

/**
 * JsJacksonContext class.
 *
 * @author vegegoku
 * @version $Id: $Id
 */
public class JsJacksonContext implements JacksonContext {

  /** {@inheritDoc} */
  @Override
  public DateFormat dateFormat() {
    return new JsDateFormat();
  }

  /** {@inheritDoc} */
  @Override
  public MapLikeFactory mapLikeFactory() {
    return JsMapLike::new;
  }

  /** {@inheritDoc} */
  @Override
  public XMLSerializerParameters defaultSerializerParameters() {
    return DefaultXMLSerializerParameters.DEFAULT;
  }

  @Override
  public XMLSerializerParameters newSerializerParameters() {
    return new DefaultXMLSerializerParameters();
  }

  /** {@inheritDoc} */
  @Override
  public XMLDeserializerParameters defaultDeserializerParameters() {
    return DefaultXMLDeserializerParameters.DEFAULT;
  }

  @Override
  public XMLDeserializerParameters newDeserializerParameters() {
    return new DefaultXMLDeserializerParameters();
  }
}
