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
 * The information for a particular cost characteristic.
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
public abstract class CostCharacteristics
 {



    /**
     * The cost characteristic will related to some aspect of the TopologicalEntity (e.g. $ cost, routing weight). This aspect will be conveyed by the costName.
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
     * @tigerstripe.stereotype st.name = "Preliminary"
     * 
     */
	public java.lang.String costName;


    /**
     * The specific cost.
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
     *     partOfObjectKey = "0"
     *     unit = ""
     *     support = "MANDATORY"
     *     condition = ""
     * @tigerstripe.stereotype st.name = "Preliminary"
     * 
     */
	public java.lang.String costValue;


}