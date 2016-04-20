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
 * Complex data type including MEP ID, MEG LEVEL and MEP direction.
 *
 * @tigerstripe.datatype
 *		isAbstract = "false"
 *      isSingleExtensionType="false"
 *      isSessionFactoryMethods="false"
 *		implements = ""
 * @tigerstripe.interface package = "$artifact.IStandardSpecifics.InterfaceProperties.get("package")"
 *      generate = "true"
 * * 
 */
public abstract class NRP_MepLevelAndDirection
 {



    /**
     * 
     * @tigerstripe.field 
     *  isOptional = "false"
     *  isReadOnly = "false"
     *  isOrdered = "false"
     *  isUnique = "true"
     *  typeMultiplicity = "1"
     *
     *
     * 
     */
	public NRP_Interface.TypeDefinitions.NRP_Types.NRP_NaturalNumber nrp_level;


    /**
     * 
     * @tigerstripe.field 
     *  isOptional = "false"
     *  isReadOnly = "false"
     *  isOrdered = "false"
     *  isUnique = "true"
     *  typeMultiplicity = "1"
     *
     *
     * 
     */
	public NRP_Interface.TypeDefinitions.NRP_Types.NRP_MepDirection nrp_direction;


}