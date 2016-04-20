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
 * 
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
public abstract class NRP_EvcEndpoint_ConnAdaptSpec
  extends NRP_Interface.ObjectClasses.NRP_SpecPackage.NRP_ConnAdaptSpec
 {



    /**
     * The EVC End Point Identification. This attribute is adapted from MEF 26.2. MEF 10.3 uses &quot;EVC per UNI&quot; for EVC End Point, therefore there is no identificaiton attribute.
     * @tigerstripe.field 
     *  isOptional = "false"
     *  isReadOnly = "false"
     *  isOrdered = "false"
     *  isUnique = "true"
     *  typeMultiplicity = "1"
     *   ref-by = "value"
     *
     *
     * 
     */
	public NRP_Interface.TypeDefinitions.NRP_Types.NRP_Identifier45 nrp_evcEndPointId;


    /**
     * When the value of the Test MEG Service Attribute is Enabled, the CEN MUST meet the mandatory requirements in Section 7.5 of MEF 30.1.
that apply to the Test MEG
     * @tigerstripe.field 
     *  isOptional = "false"
     *  isReadOnly = "false"
     *  isOrdered = "false"
     *  isUnique = "true"
     *  typeMultiplicity = "1"
     *   ref-by = "value"
     *
     *
     * 
     */
	public boolean nrp_testMegEnabled;


    /**
     * The EVC End Point Role is ROOF or LEAF.
     * @tigerstripe.field 
     *  isOptional = "false"
     *  isReadOnly = "false"
     *  isOrdered = "false"
     *  isUnique = "true"
     *  typeMultiplicity = "1"
     *   ref-by = "value"
     *
     *
     * 
     */
	public NRP_Interface.TypeDefinitions.NRP_Types.NRP_EvcEndPointRole nrp_evcEndPointRole;


    /**
     * This attribute provides the list of CE-VLAN IDs that maps to the EVC. MEF 10.3 and MEF 6.2 list this attriubte (CE-VLAN ID/EVC map) as UNI service attribute while MEF 26.2 decided to move this on as endpoint service attribute, just as MEF 10.1 and MEF 6.1 did. Decided to move this one to endpoint to be consistent. To be consitent, changing its name to EvcEntPointMap (MEF 26.2 lists as OVC Endpoint Map).
     * @tigerstripe.field 
     *  isOptional = "false"
     *  isReadOnly = "false"
     *  isOrdered = "false"
     *  isUnique = "true"
     *  typeMultiplicity = "1..*"
     *   ref-by = "value"
     *
     *
     * 
     */
	public NRP_Interface.TypeDefinitions.NRP_Types.NRP_VlanId[] nrp_evcEndPointMap;


    /**
     * When the value of the Subscriber MEG MIP Service Attribute is Enabled, the CEN MUST instantiate a Subscriber Level MIP.
     * @tigerstripe.field 
     *  isOptional = "false"
     *  isReadOnly = "false"
     *  isOrdered = "false"
     *  isUnique = "true"
     *  typeMultiplicity = "1"
     *   ref-by = "value"
     *
     *
     * 
     */
	public boolean nrp_subscriberMegMipEbabled;


    /**
     * 
     * @tigerstripe.field 
     *  isOptional = "true"
     *  isReadOnly = "false"
     *  isOrdered = "false"
     *  isUnique = "true"
     *  typeMultiplicity = "0..1"
     *   ref-by = "value"
     *
     *
     * 
     */
	public NRP_Interface.ObjectClasses.NRP_SpecPackage.NRP_ElasticServiceConstraintProfile nrp_elasticserviceconstraintprofile;



}