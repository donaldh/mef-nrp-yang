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
package NRP_Interface.ObjectClasses.NRP_BandwidthProfilePackage;


/**
 * Using Vlan tag PCP for egress frame color indication.
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
 * 
 */
public abstract class NRP_PcpForColorEgressMap
 {



    /**
     * S tag or C tag for OvcEndPoint and C tag for EvcEndPoint.
     * @tigerstripe.field 
     *  isOptional = "false"
     *  isReadOnly = "false"
     *  isOrdered = "false"
     *  isUnique = "true"
     *  typeMultiplicity = "1"
     *
     *
     * 
     */
	public NRP_Interface.TypeDefinitions.NRP_Types.NRP_VlanTag nrp_vlanTag;


    /**
     * Ingress CoS name.
     * @tigerstripe.field 
     *  isOptional = "false"
     *  isReadOnly = "false"
     *  isOrdered = "false"
     *  isUnique = "true"
     *  typeMultiplicity = "1"
     *
     *
     * 
     */
	public java.lang.String nrp_ingressCosName;


    /**
     * The ingress color may be considered as part of the egress mapping. 
     * @tigerstripe.field 
     *  isOptional = "true"
     *  isReadOnly = "false"
     *  isOrdered = "false"
     *  isUnique = "true"
     *  typeMultiplicity = "0..1"
     *
     *
     * 
     */
	public NRP_Interface.TypeDefinitions.NRP_Types.NRP_FrameColor nrp_ingressColor;


    /**
     * Egress frame PCP value (S tag ot C tag is from vlanTag attribute), mapping from ingress CoS name and ingress frame color. 
     * @tigerstripe.field 
     *  isOptional = "false"
     *  isReadOnly = "false"
     *  isOrdered = "false"
     *  isUnique = "true"
     *  typeMultiplicity = "1"
     *
     *
     * 
     */
	public NRP_Interface.TypeDefinitions.NRP_Types.NRP_PcpOrDiscard nrp_pcpValue;



}