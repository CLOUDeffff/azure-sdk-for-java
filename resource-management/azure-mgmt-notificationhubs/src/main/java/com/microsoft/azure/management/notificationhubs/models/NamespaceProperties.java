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

package com.microsoft.azure.management.notificationhubs.models;

import java.net.URI;
import java.util.Calendar;

/**
* Namespace properties.
*/
public class NamespaceProperties {
    private Calendar createdAt;
    
    /**
    * Optional. The time the namespace was created.
    * @return The CreatedAt value.
    */
    public Calendar getCreatedAt() {
        return this.createdAt;
    }
    
    /**
    * Optional. The time the namespace was created.
    * @param createdAtValue The CreatedAt value.
    */
    public void setCreatedAt(final Calendar createdAtValue) {
        this.createdAt = createdAtValue;
    }
    
    private boolean critical;
    
    /**
    * Optional. Whether or not the namespace is set as Critical.
    * @return The Critical value.
    */
    public boolean isCritical() {
        return this.critical;
    }
    
    /**
    * Optional. Whether or not the namespace is set as Critical.
    * @param criticalValue The Critical value.
    */
    public void setCritical(final boolean criticalValue) {
        this.critical = criticalValue;
    }
    
    private boolean enabled;
    
    /**
    * Optional. Whether or not the namespace is currently enabled.
    * @return The Enabled value.
    */
    public boolean isEnabled() {
        return this.enabled;
    }
    
    /**
    * Optional. Whether or not the namespace is currently enabled.
    * @param enabledValue The Enabled value.
    */
    public void setEnabled(final boolean enabledValue) {
        this.enabled = enabledValue;
    }
    
    private String name;
    
    /**
    * Optional. The name of the namespace.
    * @return The Name value.
    */
    public String getName() {
        return this.name;
    }
    
    /**
    * Optional. The name of the namespace.
    * @param nameValue The Name value.
    */
    public void setName(final String nameValue) {
        this.name = nameValue;
    }
    
    private NamespaceType namespaceType;
    
    /**
    * Optional. Gets or sets the namespace type.
    * @return The NamespaceType value.
    */
    public NamespaceType getNamespaceType() {
        return this.namespaceType;
    }
    
    /**
    * Optional. Gets or sets the namespace type.
    * @param namespaceTypeValue The NamespaceType value.
    */
    public void setNamespaceType(final NamespaceType namespaceTypeValue) {
        this.namespaceType = namespaceTypeValue;
    }
    
    private String provisioningState;
    
    /**
    * Optional. Gets or sets provisioning state of the Namespace.
    * @return The ProvisioningState value.
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    
    /**
    * Optional. Gets or sets provisioning state of the Namespace.
    * @param provisioningStateValue The ProvisioningState value.
    */
    public void setProvisioningState(final String provisioningStateValue) {
        this.provisioningState = provisioningStateValue;
    }
    
    private String region;
    
    /**
    * Optional. Specifies the targeted region in which the namespace should be
    * created. It can be any of the following values: Australia EastAustralia
    * SoutheastCentral USEast USEast US 2West USNorth Central USSouth Central
    * USEast AsiaSoutheast AsiaBrazil SouthJapan EastJapan WestNorth
    * EuropeWest Europe  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/jj873988.aspx for
    * more information)
    * @return The Region value.
    */
    public String getRegion() {
        return this.region;
    }
    
    /**
    * Optional. Specifies the targeted region in which the namespace should be
    * created. It can be any of the following values: Australia EastAustralia
    * SoutheastCentral USEast USEast US 2West USNorth Central USSouth Central
    * USEast AsiaSoutheast AsiaBrazil SouthJapan EastJapan WestNorth
    * EuropeWest Europe  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/jj873988.aspx for
    * more information)
    * @param regionValue The Region value.
    */
    public void setRegion(final String regionValue) {
        this.region = regionValue;
    }
    
    private String scaleUnit;
    
    /**
    * Optional. ScaleUnit where the namespace gets created
    * @return The ScaleUnit value.
    */
    public String getScaleUnit() {
        return this.scaleUnit;
    }
    
    /**
    * Optional. ScaleUnit where the namespace gets created
    * @param scaleUnitValue The ScaleUnit value.
    */
    public void setScaleUnit(final String scaleUnitValue) {
        this.scaleUnit = scaleUnitValue;
    }
    
    private URI serviceBusEndpoint;
    
    /**
    * Optional. Endpoint you can use to perform NotificationHub operations.
    * (see http://msdn.microsoft.com/en-us/library/windowsazure/jj873988.aspx
    * for more information)
    * @return The ServiceBusEndpoint value.
    */
    public URI getServiceBusEndpoint() {
        return this.serviceBusEndpoint;
    }
    
    /**
    * Optional. Endpoint you can use to perform NotificationHub operations.
    * (see http://msdn.microsoft.com/en-us/library/windowsazure/jj873988.aspx
    * for more information)
    * @param serviceBusEndpointValue The ServiceBusEndpoint value.
    */
    public void setServiceBusEndpoint(final URI serviceBusEndpointValue) {
        this.serviceBusEndpoint = serviceBusEndpointValue;
    }
    
    private String status;
    
    /**
    * Optional. Status of the namespace. It can be any of these values:1 =
    * Created/Active2 = Creating3 = Suspended4 = Deleting  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/jj873988.aspx for
    * more information)
    * @return The Status value.
    */
    public String getStatus() {
        return this.status;
    }
    
    /**
    * Optional. Status of the namespace. It can be any of these values:1 =
    * Created/Active2 = Creating3 = Suspended4 = Deleting  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/jj873988.aspx for
    * more information)
    * @param statusValue The Status value.
    */
    public void setStatus(final String statusValue) {
        this.status = statusValue;
    }
    
    private String subscriptionId;
    
    /**
    * Optional. The Id of the Azure subscription associated with the namespace.
    * @return The SubscriptionId value.
    */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }
    
    /**
    * Optional. The Id of the Azure subscription associated with the namespace.
    * @param subscriptionIdValue The SubscriptionId value.
    */
    public void setSubscriptionId(final String subscriptionIdValue) {
        this.subscriptionId = subscriptionIdValue;
    }
}
