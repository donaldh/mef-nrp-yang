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
package CoreModel.CoreNetworkModule.Associations;


/**
 * 
 *
 * @tigerstripe.association
 *		isAbstract = "false"
 *
 *
 * @tigerstripe.stereotype st.name = "Preliminary"
 * 
 */
public abstract class NcdControlsFds
 {


	/**
 * The FDs accessible via the NCD.
	 *	@tigerstripe.association-aEnd
	 *    aggregation = "none"
	 *    changeable = "none"
	 *    multiplicity = "*"
	 *    isOrdered = "false"
	 *    isUnique = "true"
	 *    isNavigable = "true"
	 *
 *
 * @tigerstripe.stereotype st.name = "OpenModelAttribute"
 *     attributeValueChangeNotification = "NA"
 *     isInvariant = "false"
 *     valueRange = ""
 *     partOfObjectKey = "0"
 *     unit = ""
 *     support = "MANDATORY"
 *     condition = ""
 * @tigerstripe.stereotype st.name = "Preliminary"
     * 
	 */	
	public CoreModel.CoreNetworkModule.ObjectClasses.ForwardingDomain _forwardingDomainRefList = null;

	/**
 * 
	 *	@tigerstripe.association-zEnd
	 *    aggregation = "shared"
	 *    changeable = "none"
	 *    multiplicity = "1..*"
	 *    isOrdered = "false"
	 *    isUnique = "true"
	 *    isNavigable = "false"
	 *
 *
 * @tigerstripe.stereotype st.name = "OpenModelAttribute"
 *     attributeValueChangeNotification = "NA"
 *     isInvariant = "false"
 *     valueRange = ""
 *     partOfObjectKey = "0"
 *     unit = ""
 *     support = "MANDATORY"
 *     condition = ""
 * 
	 */	
	private CoreModel.CoreNetworkModule.ObjectClasses.NetworkControlDomain _zEnd = null;
	
}