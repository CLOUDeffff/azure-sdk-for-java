/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.compute.models;

import com.microsoft.windowsazure.core.LazyHashMap;

import java.net.URI;
import java.util.HashMap;

/**
* Parameters supplied to the Upgrade Deployment operation.
*/
public class DeploymentUpgradeParameters {
    private String configuration;
    
    /**
    * Required. The service configuration file for the deployment. The client
    * library does the base-64 encoding from the plain text input.
    * @return The Configuration value.
    */
    public String getConfiguration() {
        return this.configuration;
    }
    
    /**
    * Required. The service configuration file for the deployment. The client
    * library does the base-64 encoding from the plain text input.
    * @param configurationValue The Configuration value.
    */
    public void setConfiguration(final String configurationValue) {
        this.configuration = configurationValue;
    }
    
    private HashMap<String, String> extendedProperties;
    
    /**
    * Optional. Represents the name of an extended deployment property. Each
    * extended property must have a defined name and a value. You can have a
    * maximum of 25 extended property name/value pairs. The maximum length of
    * the name element is 64 characters, only alphanumeric characters and
    * underscores are valid in the name, and the name must start with a
    * letter. Attempting to use other characters, starting the name with a
    * non-letter character, or entering a name that is identical to that of
    * another extended property owned by the same hosted service will result
    * in a status code 400 (Bad Request) error.
    * @return The ExtendedProperties value.
    */
    public HashMap<String, String> getExtendedProperties() {
        return this.extendedProperties;
    }
    
    /**
    * Optional. Represents the name of an extended deployment property. Each
    * extended property must have a defined name and a value. You can have a
    * maximum of 25 extended property name/value pairs. The maximum length of
    * the name element is 64 characters, only alphanumeric characters and
    * underscores are valid in the name, and the name must start with a
    * letter. Attempting to use other characters, starting the name with a
    * non-letter character, or entering a name that is identical to that of
    * another extended property owned by the same hosted service will result
    * in a status code 400 (Bad Request) error.
    * @param extendedPropertiesValue The ExtendedProperties value.
    */
    public void setExtendedProperties(final HashMap<String, String> extendedPropertiesValue) {
        this.extendedProperties = extendedPropertiesValue;
    }
    
    private ExtensionConfiguration extensionConfiguration;
    
    /**
    * Optional. Represents an extension that is added to the cloud service. In
    * Azure, a process can run as an extension of a cloud service. For
    * example, Remote Desktop Access or the Azure Diagnostics Agent can run as
    * extensions to the cloud service. You must add an extension to the cloud
    * service by using Add Extension before it can be added to the deployment.
    * @return The ExtensionConfiguration value.
    */
    public ExtensionConfiguration getExtensionConfiguration() {
        return this.extensionConfiguration;
    }
    
    /**
    * Optional. Represents an extension that is added to the cloud service. In
    * Azure, a process can run as an extension of a cloud service. For
    * example, Remote Desktop Access or the Azure Diagnostics Agent can run as
    * extensions to the cloud service. You must add an extension to the cloud
    * service by using Add Extension before it can be added to the deployment.
    * @param extensionConfigurationValue The ExtensionConfiguration value.
    */
    public void setExtensionConfiguration(final ExtensionConfiguration extensionConfigurationValue) {
        this.extensionConfiguration = extensionConfigurationValue;
    }
    
    private boolean force;
    
    /**
    * Required. Specifies whether the rollback should proceed even when it will
    * cause local data to be lost from some role instances.
    * @return The Force value.
    */
    public boolean isForce() {
        return this.force;
    }
    
    /**
    * Required. Specifies whether the rollback should proceed even when it will
    * cause local data to be lost from some role instances.
    * @param forceValue The Force value.
    */
    public void setForce(final boolean forceValue) {
        this.force = forceValue;
    }
    
    private String label;
    
    /**
    * Required. A name for the hosted service. The name can be up to 100
    * characters in length. It is recommended that the label be unique within
    * the subscription. The name can be used identify the hosted service for
    * your tracking purposes.
    * @return The Label value.
    */
    public String getLabel() {
        return this.label;
    }
    
    /**
    * Required. A name for the hosted service. The name can be up to 100
    * characters in length. It is recommended that the label be unique within
    * the subscription. The name can be used identify the hosted service for
    * your tracking purposes.
    * @param labelValue The Label value.
    */
    public void setLabel(final String labelValue) {
        this.label = labelValue;
    }
    
    private DeploymentUpgradeMode mode;
    
    /**
    * Required. The type of update to initiate. Role instances are allocated to
    * update domains when the service is deployed. Updates can be initiated
    * manually in each update domain or initiated automatically in all update
    * domains. Possible values are Auto or Manual. If not specified, the
    * default value is Auto. If set to Manual, WalkUpgradeDomain must be
    * called to apply the update. If set to Auto, the update is automatically
    * applied to each update domain in sequence.
    * @return The Mode value.
    */
    public DeploymentUpgradeMode getMode() {
        return this.mode;
    }
    
    /**
    * Required. The type of update to initiate. Role instances are allocated to
    * update domains when the service is deployed. Updates can be initiated
    * manually in each update domain or initiated automatically in all update
    * domains. Possible values are Auto or Manual. If not specified, the
    * default value is Auto. If set to Manual, WalkUpgradeDomain must be
    * called to apply the update. If set to Auto, the update is automatically
    * applied to each update domain in sequence.
    * @param modeValue The Mode value.
    */
    public void setMode(final DeploymentUpgradeMode modeValue) {
        this.mode = modeValue;
    }
    
    private URI packageUri;
    
    /**
    * Required. A URL that refers to the location of the service package in the
    * Blob service. The service package can be located either in a storage
    * account beneath the same subscription or a Shared Access Signature (SAS)
    * URI from any storage account. For more information about Shared Access
    * Signatures, see Delegating Access with a Shared Access Signature (REST
    * API) at
    * http://msdn.microsoft.com/en-us/library/windowsazure/ee395415.aspx.
    * @return The PackageUri value.
    */
    public URI getPackageUri() {
        return this.packageUri;
    }
    
    /**
    * Required. A URL that refers to the location of the service package in the
    * Blob service. The service package can be located either in a storage
    * account beneath the same subscription or a Shared Access Signature (SAS)
    * URI from any storage account. For more information about Shared Access
    * Signatures, see Delegating Access with a Shared Access Signature (REST
    * API) at
    * http://msdn.microsoft.com/en-us/library/windowsazure/ee395415.aspx.
    * @param packageUriValue The PackageUri value.
    */
    public void setPackageUri(final URI packageUriValue) {
        this.packageUri = packageUriValue;
    }
    
    private String roleToUpgrade;
    
    /**
    * Optional. The name of the specific role instance to update.
    * @return The RoleToUpgrade value.
    */
    public String getRoleToUpgrade() {
        return this.roleToUpgrade;
    }
    
    /**
    * Optional. The name of the specific role instance to update.
    * @param roleToUpgradeValue The RoleToUpgrade value.
    */
    public void setRoleToUpgrade(final String roleToUpgradeValue) {
        this.roleToUpgrade = roleToUpgradeValue;
    }
    
    /**
    * Initializes a new instance of the DeploymentUpgradeParameters class.
    *
    */
    public DeploymentUpgradeParameters() {
        this.setExtendedProperties(new LazyHashMap<String, String>());
    }
}
