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
package CoreModel.CoreModelEnhancements.InterViewRelationships_Sketch;


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
public abstract class FcSupportedByFcInOtherView
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
	public CoreModel.CoreModelEnhancements.InterViewRelationships_Sketch.Sketch.FC sketch__fc = null;

	/**
 * 
	 *	@tigerstripe.association-zEnd
	 *    aggregation = "none"
	 *    changeable = "none"
	 *    multiplicity = "0..1"
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
 * 
	 */	
	public CoreModel.CoreModelEnhancements.InterViewRelationships_Sketch.Sketch.FC _supportingFcInOtherViewRef = null;
	
}