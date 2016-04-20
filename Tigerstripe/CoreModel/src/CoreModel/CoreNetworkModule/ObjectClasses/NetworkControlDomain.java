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
 * The Network Control Domain (NCD) object class represents the scope of control that a particular SDN controller has with respect to a particular network, (i.e., encompassing a designated set of interconnected network elements).
In the interfaces between SDN controllers where virtualization is necessary, e.g., in client/server SDN controller relationship, the NCD object defines the scope of control of the client SDN controller on the virtual network that has been provided by the server SDN controller (i.e., the scope of control relates to the partitioned provider resources allocated to that particular client).
The NCD provides the scope of naming space for identifying objects representing the virtual resources within the virtual network.
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

 * @tigerstripe.stereotype st.name = "Preliminary"
 * 
 */
public abstract class NetworkControlDomain
  extends CoreModel.CoreFoundationModule.SuperClassesAndCommonPackages.ObjectClasses.GlobalClass
 {



    /**
     * 
     * @tigerstripe.field 
     *  isOptional = "false"
     *  isReadOnly = "false"
     *  isOrdered = "false"
     *  isUnique = "true"
     *  typeMultiplicity = "1"
     *   ref-by = "value"
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
	public java.lang.String id;



}