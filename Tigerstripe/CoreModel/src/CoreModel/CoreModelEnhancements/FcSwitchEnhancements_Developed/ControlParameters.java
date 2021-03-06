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
package CoreModel.CoreModelEnhancements.FcSwitchEnhancements_Developed;


/**
 * A list of control parameters to apply to a switch
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

 * @tigerstripe.stereotype st.name = "Experimental"
 * 
 */
public abstract class ControlParameters
 {



    /**
     * This attribute whether or not the protection scheme is revertive or non-revertive. 
     * @tigerstripe.field 
     *  isOptional = "true"
     *  isReadOnly = "false"
     *  isOrdered = "false"
     *  isUnique = "true"
     *  typeMultiplicity = "0"
     *  defaultValue = "REVERTIVE" 
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
	public CoreModel.CoreNetworkModule.TypeDefinitions.OperType operType;


    /**
     * If the protection system is revertive, this attribute specifies the amount of time, in seconds, to wait after a fault clears before restoring traffic to the protected protectionUnit that initiated the switching. Valid values for this attribute are integers.
     * @tigerstripe.field 
     *  isOptional = "true"
     *  isReadOnly = "false"
     *  isOrdered = "false"
     *  isUnique = "true"
     *  typeMultiplicity = "0"
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
	public int waitToRestoreTime;


    /**
     * Indicates the protection scheme that is used for the ProtectionGroup.
     * @tigerstripe.field 
     *  isOptional = "true"
     *  isReadOnly = "false"
     *  isOrdered = "false"
     *  isUnique = "true"
     *  typeMultiplicity = "0"
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
	public CoreModel.CoreNetworkModule.TypeDefinitions.ProtectionType protType;


    /**
     * This attribute indicates the time, in seconds, between declaration of signal degrade or signal fail, and the initialization of the protection switching algorithm. Valid values are integers in units of seconds.
     * @tigerstripe.field 
     *  isOptional = "true"
     *  isReadOnly = "false"
     *  isOrdered = "false"
     *  isUnique = "true"
     *  typeMultiplicity = "0"
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
	public int holdOffTime;


    /**
     * 
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
	public java.lang.String id;



}