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
package CoreModel.CoreModelEnhancements.ProfilesTemplatesAndSpecificationsModule.LinkCapability_Sketch;


/**
 * 
 *
 * @tigerstripe.association
 *		isAbstract = "false"
 *
 *
 * @tigerstripe.stereotype st.name = "Experimental"
 * 
 */
public abstract class LinkHasLinkSpec
 {


	/**
 * 
	 *	@tigerstripe.association-aEnd
	 *    aggregation = "none"
	 *    changeable = "none"
	 *    multiplicity = "*"
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
	public CoreModel.CoreNetworkModule.ObjectClasses.Link link = null;

	/**
 * References the specification that describes the capability and internal structure of of the Link (e.g. asymmetric flows between points).
The specification allows interpretation of LinkPort role and switch configurations etc.
See also ForwardingConstruct.
	 *	@tigerstripe.association-zEnd
	 *    aggregation = "none"
	 *    changeable = "none"
	 *    multiplicity = "1"
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
 * @tigerstripe.stereotype st.name = "Experimental"
 * 
	 */	
	public CoreModel.CoreModelEnhancements.ProfilesTemplatesAndSpecificationsModule.LinkCapability_Sketch.LinkSpec _linkSpecRef = null;
	
}