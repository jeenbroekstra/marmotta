/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.marmotta.kiwi.hazelcast.serializer;

import com.hazelcast.nio.ObjectDataInput;
import com.hazelcast.nio.ObjectDataOutput;
import com.hazelcast.nio.serialization.StreamSerializer;
import org.apache.marmotta.kiwi.io.KiWiIO;
import org.apache.marmotta.kiwi.model.rdf.KiWiDoubleLiteral;

import java.io.IOException;

/**
 * Add file description here!
 *
 * @author Sebastian Schaffert (sschaffert@apache.org)
 */
public class DoubleLiteralSerializer implements StreamSerializer<KiWiDoubleLiteral> {

    @Override
    public int getTypeId() {
        return ExternalizerIds.DOUBLE_LITERAL;
    }

    @Override
    public void write(ObjectDataOutput output, KiWiDoubleLiteral object) throws IOException {
        KiWiIO.writeDoubleLiteral(output,object);
    }

    @Override
    public KiWiDoubleLiteral read(ObjectDataInput input) throws IOException {
        return KiWiIO.readDoubleLiteral(input);
    }

    @Override
    public void destroy() {

    }
}
