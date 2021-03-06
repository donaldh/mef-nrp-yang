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
package CoreModel.CoreNetworkModule.TypeDefinitions.TopologyPacs;


/**
 * The information for a particular risk characteristic where there is a list of risk identifiers related to that characteristic.
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
public abstract class RiskCharacteristic
 {



    /**
     * The name of the risk characteristic. The characteristic may be related to a specific degree of closeness. 
For example a particular characteristic may apply to failures that are localized (e.g. to one side of a road) where as another characteristic may relate to failures that have a broader impact (e.g. both sides of a road that crosses a bridge).
Depending upon the importance of the traffic being routed different risk characteristics will be evaluated.
     * @tigerstripe.field 
     *  isOptional = "false"
     *  isReadOnly = "false"
     *  isOrdered = "false"
     *  isUnique = "true"
     *  typeMultiplicity = "1"
     *
     *
     * @tigerstripe.stereotype st.name = "OpenModelAttribute"
     *     attributeValueChangeNotification = "NA"
     *     isInvariant = "false"
     *     valueRange = ""
     *     partOfObjectKey = "1"
     *     unit = ""
     *     support = "MANDATORY"
     *     condition = ""
     * 
     */
	public java.lang.String riskCharacteristicName;


    /**
     * A list of the identifiers of each physical/geographic unit (with the specific risk characteristic) that is related to a segment of the TopologicalEntity.
     * @tigerstripe.field 
     *  isOptional = "false"
     *  isReadOnly = "false"
     *  isOrdered = "false"
     *  isUnique = "true"
     *  typeMultiplicity = "1..*"
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
	public java.lang.String[] riskIdentifierList;


}