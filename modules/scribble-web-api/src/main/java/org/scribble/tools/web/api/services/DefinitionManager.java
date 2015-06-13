/*
 * Copyright 2015 Red Hat, Inc. and/or its affiliates
 * and other contributors as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.scribble.tools.web.api.services;

import java.util.Set;

import org.scribble.tools.web.api.model.Module;
import org.scribble.tools.web.api.model.Protocol;
import org.scribble.tools.web.api.model.ProtocolInfo;

/**
 * @author gbrown
 */
public interface DefinitionManager {

    /**
     * This method updates a protocol definition.
     * 
     * @param moduleName The module name
     * @param protocolName The protocol name
     * @param definition The protocol definition
     * @throws Exception Failed to update protocol
     */
    public void updateProtocol(String moduleName, String protocolName, Protocol definition) throws Exception;
    
    /**
     * This method updates a protocol definition.
     * 
     * @param fromModuleName The module name
     * @param fromProtocolName The protocol name
     * @param toModuleName The module name
     * @param toProtocolName The protocol name
     * @throws Failed to rename
     */
    public void renameProtocol(String fromModuleName, String fromProtocolName,
            String toModuleName, String toProtocolName) throws Exception;
    
    /**
     * This method returns the definition associated with the supplied
     * module and protocol names.
     * 
     * @param moduleName The module name
     * @param protocolName The protocol name
     * @return The protocol definition
     */
    public Protocol getProtocol(String moduleName, String protocolName);
    
    /**
     * This method returns the list of modules.
     * 
     * @return The modules
     */
    public Set<Module> getModules();

    /**
     * This method returns the protocol information associated with the
     * supplied module.
     * 
     * @param moduleName The module name
     * @return The protocol information
     */
    public Set<ProtocolInfo> getProtocols(String moduleName);

}
