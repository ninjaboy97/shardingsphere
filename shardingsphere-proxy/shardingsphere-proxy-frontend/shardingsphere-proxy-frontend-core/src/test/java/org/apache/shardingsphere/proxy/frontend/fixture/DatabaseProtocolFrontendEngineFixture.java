/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.proxy.frontend.fixture;

import org.apache.shardingsphere.db.protocol.codec.DatabasePacketCodecEngine;
import org.apache.shardingsphere.proxy.backend.session.ConnectionSession;
import org.apache.shardingsphere.proxy.frontend.context.FrontendContext;
import org.apache.shardingsphere.proxy.frontend.authentication.AuthenticationEngine;
import org.apache.shardingsphere.proxy.frontend.command.CommandExecuteEngine;
import org.apache.shardingsphere.proxy.frontend.spi.DatabaseProtocolFrontendEngine;

public final class DatabaseProtocolFrontendEngineFixture implements DatabaseProtocolFrontendEngine {
    
    @Override
    public FrontendContext getFrontendContext() {
        return null;
    }
    
    @Override
    public DatabasePacketCodecEngine<?> getCodecEngine() {
        return null;
    }
    
    @Override
    public AuthenticationEngine getAuthenticationEngine() {
        return null;
    }
    
    @Override
    public CommandExecuteEngine getCommandExecuteEngine() {
        return null;
    }
    
    @Override
    public void release(final ConnectionSession connectionSession) {
    }
    
    @Override
    public void handleException(final ConnectionSession connectionSession, final Exception exception) {
    }
    
    @Override
    public String getType() {
        return new FixtureDatabaseType().getType();
    }
}
