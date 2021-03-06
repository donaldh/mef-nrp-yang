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
package NRP_Interface.TypeDefinitions.NRP_Types;


/**
 * General connection types, including point to point, multi-point and rooted multi-point.
 *
 * @tigerstripe.enum
 *		isAbstract = "false"
 *      base-type="String"
 *      extensible="false"
 * @tigerstripe.interface package = "$artifact.IStandardSpecifics.InterfaceProperties.get("package")"
 *      generate = "true"
 * * 
 */
public abstract class NRP_ConnectionType
 {


    /**
     * 
     * @tigerstripe.label
     *  value = '"POINT_TO_POINT"'
     *  
     *
     * 
     */
    public final static String POINT_TO_POINT = "POINT_TO_POINT";


    /**
     * 
     * @tigerstripe.label
     *  value = '"MULTIPOINT"'
     *  
     *
     * 
     */
    public final static String MULTIPOINT = "MULTIPOINT";


    /**
     * 
     * @tigerstripe.label
     *  value = '"ROOTED_MULTIPOINT"'
     *  
     *
     * 
     */
    public final static String ROOTED_MULTIPOINT = "ROOTED_MULTIPOINT";

}