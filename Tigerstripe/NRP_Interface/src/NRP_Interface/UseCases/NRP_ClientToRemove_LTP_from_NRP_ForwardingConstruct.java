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
package NRP_Interface.UseCases;


/**
 * 
 *
 * @tigerstripe.association
 *		isAbstract = "false"
 *
 * * 
 */
public abstract class NRP_ClientToRemove_LTP_from_NRP_ForwardingConstruct
 {


	/**
 * 
	 *	@tigerstripe.association-aEnd
	 *    aggregation = "none"
	 *    changeable = "none"
	 *    multiplicity = "1"
	 *    isOrdered = "false"
	 *    isUnique = "true"
	 *    isNavigable = "false"
	 *
 *
     * 
	 */	
	public NRP_Interface.UseCases.NRP_Client nrp_client = null;

	/**
 * 
	 *	@tigerstripe.association-zEnd
	 *    aggregation = "none"
	 *    changeable = "none"
	 *    multiplicity = "1"
	 *    isOrdered = "false"
	 *    isUnique = "true"
	 *    isNavigable = "false"
	 *
 *
 * 
	 */	
	public NRP_Interface.UseCases.Remove_LTP_from_NRP_ForwardingConstruct remove_ltp_from_nrp_forwardingconstruct = null;
	
}