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

import java.util.List;
import java.util.Set;

import org.scribble.tools.web.api.model.Marker;
import org.scribble.tools.web.api.model.ProjectProtocolAction;
import org.scribble.tools.web.api.model.ProtocolInfo;
import org.scribble.tools.web.api.model.ProtocolProjection;
import org.scribble.tools.web.api.model.RoleInfo;
import org.scribble.tools.web.api.model.VerifyProtocolAction;

/**
 * @author gbrown
 */
public interface ActionManager {

    /**
     * This method parses the identified module and protocol to
     * provide the protocol information.
     *
     * @param moduleName The module name
     * @param protocolName The protocol
     * @return The protocol information
     */
    ProtocolInfo getInfo(String moduleName, String protocolName);

    /**
     * This method verifies the protocol associated with the supplied
     * action information.
     * 
     * @param action The verification action
     * @return The list of markers, identifying errors and warnings
     */
    List<Marker> verify(VerifyProtocolAction action);
    
    /**
     * This method projects a protocol identified by the supplied action.
     * 
     * @param action The projection action
     * @return The projection result
     */
    ProtocolProjection project(ProjectProtocolAction action);

    /**
     * This method returns the role information associated with the
     * supplied module and protocol.
     * 
     * @param moduleName The module name
     * @param protocolName The protocol name
     * @return The set of role information
     */
    Set<RoleInfo> getRoles(String moduleName, String protocolName);

}
