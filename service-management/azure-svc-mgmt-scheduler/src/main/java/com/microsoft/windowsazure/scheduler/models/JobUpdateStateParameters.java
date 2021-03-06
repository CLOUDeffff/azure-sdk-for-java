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

package com.microsoft.windowsazure.scheduler.models;

/**
* Parameters supplied to the Update Job State operation.
*/
public class JobUpdateStateParameters {
    private JobState state;
    
    /**
    * Required. New state to update to: 'enabled' or 'disabled'.
    * @return The State value.
    */
    public JobState getState() {
        return this.state;
    }
    
    /**
    * Required. New state to update to: 'enabled' or 'disabled'.
    * @param stateValue The State value.
    */
    public void setState(final JobState stateValue) {
        this.state = stateValue;
    }
    
    private String updateStateReason;
    
    /**
    * Optional. A description of the circumstances associated with this job
    * state update.
    * @return The UpdateStateReason value.
    */
    public String getUpdateStateReason() {
        return this.updateStateReason;
    }
    
    /**
    * Optional. A description of the circumstances associated with this job
    * state update.
    * @param updateStateReasonValue The UpdateStateReason value.
    */
    public void setUpdateStateReason(final String updateStateReasonValue) {
        this.updateStateReason = updateStateReasonValue;
    }
    
    /**
    * Initializes a new instance of the JobUpdateStateParameters class.
    *
    */
    public JobUpdateStateParameters() {
    }
    
    /**
    * Initializes a new instance of the JobUpdateStateParameters class with
    * required arguments.
    *
    * @param state New state to update to: 'enabled' or 'disabled'.
    */
    public JobUpdateStateParameters(JobState state) {
        if (state == null) {
            throw new NullPointerException("state");
        }
        this.setState(state);
    }
}
