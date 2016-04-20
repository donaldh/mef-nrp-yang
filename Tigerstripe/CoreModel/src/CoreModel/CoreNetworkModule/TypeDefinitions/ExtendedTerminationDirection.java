/*******************************************************************************
 * Created with Tigerstripe(tm) Workbench v.$runtime.getProperty("tigerstripe.feature.version")
 * Copyright (c) 2007 Cisco Systems, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * DO NOT EDIT THIS FILE - Created with Tigerstripe(tm) Workbench
 *
 *******************************************************************************/
package CoreModel.CoreNetworkModule.TypeDefinitions;


/**
 * Extended to include contra-direction considerations. Only applies to LP and elements of LP not to LTP??
 *
 * @tigerstripe.enum
 *		isAbstract = "false"
 *      base-type="String"
 *      extensible="false"
 * @tigerstripe.interface package = "$artifact.IStandardSpecifics.InterfaceProperties.get("
 *      generate = "true"
 *
 * @tigerstripe.stereotype st.name = "Experimental"
 * 
 */
public abstract class ExtendedTerminationDirection
  extends CoreModel.CoreNetworkModule.TypeDefinitions.TerminationDirection
 {


    /**
     * 
     * @tigerstripe.label
     *  value = '"CONTRA_DIRECTION_SINK"'
     *  
     *
     * 
     */
    public final static String CONTRA_DIRECTION_SINK = "CONTRA_DIRECTION_SINK";


    /**
     * 
     * @tigerstripe.label
     *  value = '"CONTRA_DIRECTION_SOURCE"'
     *  
     *
     * 
     */
    public final static String CONTRA_DIRECTION_SOURCE = "CONTRA_DIRECTION_SOURCE";

}