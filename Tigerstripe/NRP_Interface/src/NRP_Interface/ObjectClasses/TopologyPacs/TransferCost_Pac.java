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
package NRP_Interface.ObjectClasses.TopologyPacs;


/**
 * The cost characteristics of a TopologicalEntity not necessarily correlated to the cost of the underlying physical realization. 
They may be quite specific to the individual TopologicalEntity e.g. opportunity cost. Relates to layer capacity
There may be many perspectives from which cost may be considered  for a particular TopologicalEntity and hence many specific costs and potentially cost algorithms. 
Using an entity will incur a cost. 
 *
 * @tigerstripe.managedEntity primary-key="$artifact.IStandardSpecifics.PrimaryKey"
 *      extensibilityType="multi"
 *      isSessionFactoryMethods="false"
 *		isAbstract = "true"
 *		implements = ""
 * @tigerstripe.key-interface package = "$artifact.IStandardSpecifics.InterfaceProperties.get("package")"
 *      generate = "true"
 * @tigerstripe.value package = "$artifact.IStandardSpecifics.InterfaceProperties.get("package")"
 *      generate = "true"
 *
 * @tigerstripe.property ts.id="ossj.entity.create"
 *   byAutoNaming = "false"
 *   bulkBestEffort = "false"
 *   bulkAtomic = "false"
 *   bulkAtomicByKeys = "false"
 *   bulkBestEffortByKeys = "false"
 *   simple = "true"
 *
 * @tigerstripe.property ts.id="ossj.entity.get"
 *   byTemplates = "false"
 *   byTemplate = "false"
 *   bulkAtomicByKeys = "false"
 *   simpleByKey = "true"
 *
 * @tigerstripe.property ts.id="ossj.entity.set"
 *   simple = "true"
 *   byTemplates = "false"
 *   byTemplatesBestEffort = "false"
 *   byTemplate = "false"
 *   byTemplateBestEffort = "false"
 *   bulkAtomic = "false"
 *   bulkBestEffort = "false"
 *   bulkAtomicByKeys = "false"
 *   bulkBestEffortByKeys = "false"
 *
 * @tigerstripe.property ts.id="ossj.entity.remove"
 *   byTemplatesBestEffort = "false"
 *   byTemplates = "false"
 *   byTemplate = "false"
 *   bulkAtomicByKeys = "false"
 *   bulkBestEffortByKeys = "false"
 *   simpleByKey = "true"
 *   byTemplateBestEffort = "false"
 *
 * 
 */
public abstract class TransferCost_Pac
 {



    /**
     * The list of costs where each cost relates to some aspect of the TopologicalEntity.
     * @tigerstripe.field 
     *  isOptional = "false"
     *  isReadOnly = "false"
     *  isOrdered = "false"
     *  isUnique = "true"
     *  typeMultiplicity = "1..*"
     *
     *
     * 
     */
	public CoreModel.CoreNetworkModule.TypeDefinitions.TopologyPacs.CostCharacteristics[] costCharacteristicList;



}