/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.kafka.streams.kstream.internals;

import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.streams.kstream.Joined;

import java.time.Duration;

public class JoinedInternal<K, VLeft, VRight> extends Joined<K, VLeft, VRight>  {

    JoinedInternal(final Joined<K, VLeft, VRight> joined) {
        super(joined);
    }

    public Duration gracePeriod() {
        return gracePeriod;
    }

    public Serde<K> keySerde() {
        return keySerde;
    }

    public Serde<VLeft> leftValueSerde() {
        return leftValueSerde;
    }

    public Serde<VRight> rightValueSerde() {
        return rightValueSerde;
    }

    public String name() {
        return name;
    }
}
