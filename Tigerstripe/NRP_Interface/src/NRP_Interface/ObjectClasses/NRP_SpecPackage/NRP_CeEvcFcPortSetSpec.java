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
package NRP_Interface.ObjectClasses.NRP_SpecPackage;


/**
 * The association of the FC to LTPs is made via FcPorts.
The FcPort object class models the access to the FC function.
The traffic forwarding between the associated FcPorts of the FC depends upon the type of FC and may be associated with FcSwitch object instances.
In cases where there is resilience the FcPort may convey the resilience role of the access to the FC.
It can represent a protected (resilient/reliable) point or a protecting (unreliable working or protection) point.
The FcPort replaces the Protection Unit of a traditional protection model.
The ForwadingConstruct can be considered as a component and the FcPort as a Port on that component
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
 * 
 */
public abstract class NRP_CeEvcFcPortSetSpec
  extends NetworkResource.Main.ObjectClasses.CeEvcFcPortSetSpec
 {




}