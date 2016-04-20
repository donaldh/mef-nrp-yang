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
package CoreModel.CoreNetworkModule.Associations.TopologyPacs;


/**
 * 
 *
 * @tigerstripe.association
 *		isAbstract = "false"
 *
 *
 * @tigerstripe.stereotype st.name = "StrictComposite"
 * 
 */
public abstract class TopologicalEntityHasRiskCharacterisics
 {


	/**
 * 
	 *	@tigerstripe.association-aEnd
	 *    aggregation = "composite"
	 *    changeable = "none"
	 *    multiplicity = "1"
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
	public CoreModel.CoreNetworkModule.ObjectClasses.TopologyPacs.TopologicalEntity topologicalEntity = null;

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
 *     support = "CONDITIONAL"
 *     condition = "Present if risk information is relevant to usage and statement can be made that applies equally to all flows that can be supported by the TopologicalEntity.
Note that if risk is relevant but consistent ststement cannot be made then the TopologicalEntity should be described in terms of subordinate parts against which coherent statements can be made."
 * 
	 */	
	public CoreModel.CoreNetworkModule.ObjectClasses.TopologyPacs.RiskParameter_Pac _riskParameter_Pac = null;
	
}