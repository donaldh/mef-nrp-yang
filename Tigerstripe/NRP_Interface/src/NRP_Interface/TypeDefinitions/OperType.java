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
package NRP_Interface.TypeDefinitions;


/**
 * The operation type associated with the protection mechanism (either non-revertive or revertive).
 *
 * @tigerstripe.enum
 *		isAbstract = "false"
 *      base-type="String"
 *      extensible="false"
 * @tigerstripe.interface package = "$artifact.IStandardSpecifics.InterfaceProperties.get("package")"
 *      generate = "true"
 * * 
 */
public abstract class OperType
 {


    /**
     * 
     * @tigerstripe.label
     *  value = '"REVERTIVE"'
     *  
     *
     * 
     */
    public final static String REVERTIVE = "REVERTIVE";


    /**
     * 
     * @tigerstripe.label
     *  value = '"NON_REVERTIVE"'
     *  
     *
     * 
     */
    public final static String NON_REVERTIVE = "NON_REVERTIVE";

}