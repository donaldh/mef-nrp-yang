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
 * This profile groups the UNI attributes (or their values) that are applicable to OVC (vs. applicable to EVC). 
 *
 * @tigerstripe.managedEntity primary-key="$artifact.IStandardSpecifics.PrimaryKey"
 *      extensibilityType="multi"
 *      isSessionFactoryMethods="false"
 *		isAbstract = "false"
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

 * @tigerstripe.stereotype st.name = "OpenModelClass"
 *    objectCreationNotification = "NA"
 *    objectDeletionNotification = "NA"
 *    support = "MANDATORY"
 *    condition = ""
 * 
 */
public abstract class NRP_OperatorUniProfile
 {



    /**
     * The Operator UNI ID allows the SP/SO and Operator to uniquely identify the UNI for operations purposes.
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
     * 
     */
	public NRP_Interface.TypeDefinitions.NRP_Types.NRP_Identifier45 nrp_operatorUniId;


    /**
     * This attribute provides an upper bound on the number of OVC End Points that are associated by each OVC that the can support at the UNI or ENNI. For ENNI, this upper bound applies to the sum of the number OVC End Points that are not in a VUNI plus the number of OVC End Points that are in a VUNI. 
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
     * 
     */
	public NRP_Interface.TypeDefinitions.NRP_Types.NRP_NaturalNumber nrp_maxNumOfOvcEndPoint;


    /**
     * This attribute specifies the largest number of CE- VLAN ID values that can map to an OVC End Point in a OVC End Point Map Service Attribute at the UNI.
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
     * 
     */
	public NRP_Interface.TypeDefinitions.NRP_Types.NRP_NaturalNumber nrp_maxNumOfCeVlanIdPerOvcEndPoint;



}