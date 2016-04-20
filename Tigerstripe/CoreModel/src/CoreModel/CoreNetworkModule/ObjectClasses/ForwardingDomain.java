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
package CoreModel.CoreNetworkModule.ObjectClasses;


/**
 * The ForwardingDomain (FD) object class models the topological component which represents the opportunity to enable forwarding (of specific transport characteristic information at one or more protocol layers) between points represented by the LTP in the model.
The FD object provides the context for instructing the formation, adjustment and removal of FCs and hence offers the potential to enable forwarding.
The LTPs available are those defined at the boundary of the FD.
At a lowere level of recursion, an FD (within a network element (NE)) represents a switch matrix (i.e., a fabric).
Note that an NE can encompass multiple switch matrices (FDs) and the FD representing the switch matrix can be further partitioned.
 *
 * @tigerstripe.managedEntity primary-key="$artifact.IStandardSpecifics.PrimaryKey"
 *      extensibilityType="multi"
 *      isSessionFactoryMethods="false"
 *		isAbstract = "false"
 *		implements = ""
 * @tigerstripe.key-interface package = "$artifact.IStandardSpecifics.InterfaceProperties.get("
 *      generate = "true"
 * @tigerstripe.value package = "$artifact.IStandardSpecifics.InterfaceProperties.get("
 *      generate = "true"
 *
 * @tigerstripe.property ts.id="ossj.entity.create"
 *   byAutoNaming = "false"
 *   bulkBestEffort = "false"
 *   ts.id = "ossj.entity.create"
 *   bulkAtomic = "false"
 *   bulkAtomicByKeys = "false"
 *   bulkBestEffortByKeys = "false"
 *   simple = "true"
 *
 * @tigerstripe.property ts.id="ossj.entity.get"
 *   byTemplates = "false"
 *   ts.id = "ossj.entity.get"
 *   byTemplate = "false"
 *   bulkAtomicByKeys = "false"
 *   simpleByKey = "true"
 *
 * @tigerstripe.property ts.id="ossj.entity.set"
 *   ts.id = "ossj.entity.set"
 *   simple = "true"
 *   byTemplates = "false"
 *   byTemplate = "false"
 *   byTemplatesBestEffort = "false"
 *   byTemplateBestEffort = "false"
 *   bulkAtomic = "false"
 *   bulkBestEffort = "false"
 *   bulkAtomicByKeys = "false"
 *   bulkBestEffortByKeys = "false"
 *
 * @tigerstripe.property ts.id="ossj.entity.remove"
 *   byTemplates = "false"
 *   byTemplatesBestEffort = "false"
 *   ts.id = "ossj.entity.remove"
 *   byTemplate = "false"
 *   bulkAtomicByKeys = "false"
 *   bulkBestEffortByKeys = "false"
 *   simpleByKey = "true"
 *   byTemplateBestEffort = "false"
 *

 * @tigerstripe.stereotype st.name = "OpenModelClass"
 *    objectCreationNotification = "NA"
 *    objectDeletionNotification = "NA"
 *    support = "MANDATORY"
 *    condition = ""
 * 
 */
public abstract class ForwardingDomain
  extends CoreModel.CoreFoundationModule.SuperClassesAndCommonPackages.ObjectClasses.GlobalClass
 {



    /**
     * One or more protocol layers at which the FD represents the opportunity to enable forwarding between LTP that bound it.
     * @tigerstripe.field 
     *  isOptional = "false"
     *  isReadOnly = "false"
     *  isOrdered = "false"
     *  isUnique = "true"
     *  typeMultiplicity = "1..*"
     *   ref-by = "value"
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
	public CoreModel.CoreNetworkModule.TypeDefinitions.LayerProtocolName[] layerProtocolNameList;



}