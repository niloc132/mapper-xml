/*
 * Copyright 2014 Nicolas Morel
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

import org.treblereel.gwt.jackson.api.XMLDeserializationContext;
import org.treblereel.gwt.jackson.api.XMLDeserializer;
import org.treblereel.gwt.jackson.api.XMLDeserializerParameters;
import org.treblereel.gwt.jackson.api.deser.BooleanXMLDeserializer;
import org.treblereel.gwt.jackson.api.stream.XMLReader;

/**
 * Default {@link XMLDeserializer} implementation for 2D array of boolean.
 *
 * @author Nicolas Morel
 * @version $Id: $
 */
public class PrimitiveBooleanArray2dXMLDeserializer extends AbstractArray2dXMLDeserializer<boolean[][]> {

    private static final PrimitiveBooleanArray2dXMLDeserializer INSTANCE = new PrimitiveBooleanArray2dXMLDeserializer();

    /**
     * <p>getInstance</p>
     *
     * @return an instance of {@link PrimitiveBooleanArray2dXMLDeserializer}
     */
    public static PrimitiveBooleanArray2dXMLDeserializer getInstance() {
        return INSTANCE;
    }

    private PrimitiveBooleanArray2dXMLDeserializer() {
    }

    /** {@inheritDoc} */
    @Override
    public boolean[][] doDeserialize(XMLReader reader, XMLDeserializationContext ctx, XMLDeserializerParameters params) {
        List<List<Boolean>> list = deserializeIntoList(reader, ctx, BooleanXMLDeserializer.getInstance(), params);

        if (list.isEmpty()) {
            return new boolean[0][0];
        }

        List<Boolean> firstList = list.get(0);
        if (firstList.isEmpty()) {
            return new boolean[list.size()][0];
        }

        boolean[][] array = new boolean[list.size()][firstList.size()];

        int i = 0;
        int j;
        for (List<Boolean> innerList : list) {
            j = 0;
            for (Boolean value : innerList) {
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
