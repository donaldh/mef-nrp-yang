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
 * The L2CP Peering identifies the list that will be
Peered by a protocol entity at a UNI, VUNI, or ENNI. 
MEF 45, Section 8.2
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
public abstract class NRP_L2cpPeering
 {



    /**
     * The destination address determines the intended recipient device for the frame.
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
	public java.lang.String destinationMacAddress;


    /**
     * Protocol Identifier is either an LLC Address or an Ethertype, and it could have subtypes. The list specifies only the L2CP Frames that
are to be Peered. Any L2CP Frame that is not Peered will either be Discarded or Passed
as a result of the flow charts and requirements specified in MEF 45, Section 9.
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
	public NRP_Interface.TypeDefinitions.NRP_Types.NRP_ProtocolFrameType protocolType;


    /**
     * Identifies the physical link identifier for protocols (e.g. LLDP, ESMC) that can operate over the individual physical links.
If no link identifier is specified then the list entry will apply to all physical links. 
MEF 45, Section 8.2
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
	public java.lang.String linkId;


}