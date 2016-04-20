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
 * NRP to verify if this should define
 the etherType of the frame format related to L2CP.
 *
 * @tigerstripe.enum
 *		isAbstract = "false"
 *      base-type="String"
 *      extensible="false"
 * @tigerstripe.interface package = "$artifact.IStandardSpecifics.InterfaceProperties.get("package")"
 *      generate = "true"
 * * 
 */
public abstract class NRP_ProtocolFrameType
 {


    /**
     * 
     * @tigerstripe.label
     *  value = '"ETHERTYPE"'
     *  
     *
     * 
     */
    public final static String ETHERTYPE = "ETHERTYPE";


    /**
     * 
     * @tigerstripe.label
     *  value = '"LLC_ADDRESS"'
     *  
     *
     * 
     */
    public final static String LLC_ADDRESS = "LLC_ADDRESS";


    /**
     * 
     * @tigerstripe.label
     *  value = '"OTHER"'
     *  
     *
     * 
     */
    public final static String OTHER = "OTHER";

}