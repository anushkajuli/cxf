/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.cxf.ws.rm;

import org.apache.cxf.ws.addressing.Names;
import org.apache.cxf.ws.addressing.VersionTransformer.Names200408;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 *
 */
public class ProtocolVariationTest {

    @Test
    public void testFindVariant() {
        // valid combinations
        assertNotNull(ProtocolVariation.findVariant(
                          RM10Constants.NAMESPACE_URI, Names200408.WSA_NAMESPACE_NAME));
        assertNotNull(ProtocolVariation.findVariant(
                          RM10Constants.NAMESPACE_URI, Names.WSA_NAMESPACE_NAME));
        assertNotNull(ProtocolVariation.findVariant(
                          RM11Constants.NAMESPACE_URI, Names.WSA_NAMESPACE_NAME));

        // invalid combinations
        assertNull(ProtocolVariation.findVariant(
                          RM11Constants.NAMESPACE_URI, Names200408.WSA_NAMESPACE_NAME));
    }
}