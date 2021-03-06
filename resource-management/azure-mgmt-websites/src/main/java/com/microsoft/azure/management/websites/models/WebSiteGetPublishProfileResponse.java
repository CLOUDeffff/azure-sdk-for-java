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

package com.microsoft.azure.management.websites.models;

import com.microsoft.windowsazure.core.LazyArrayList;
import com.microsoft.windowsazure.core.OperationResponse;

import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;

/**
* The Get Web Site Publish Profile operation response.
*/
public class WebSiteGetPublishProfileResponse extends OperationResponse implements Iterable<WebSiteGetPublishProfileResponse.PublishProfile> {
    private ArrayList<WebSiteGetPublishProfileResponse.PublishProfile> publishProfiles;
    
    /**
    * Optional. Contains one or more publish profiles.
    * @return The PublishProfiles value.
    */
    public ArrayList<WebSiteGetPublishProfileResponse.PublishProfile> getPublishProfiles() {
        return this.publishProfiles;
    }
    
    /**
    * Optional. Contains one or more publish profiles.
    * @param publishProfilesValue The PublishProfiles value.
    */
    public void setPublishProfiles(final ArrayList<WebSiteGetPublishProfileResponse.PublishProfile> publishProfilesValue) {
        this.publishProfiles = publishProfilesValue;
    }
    
    /**
    * Initializes a new instance of the WebSiteGetPublishProfileResponse class.
    *
    */
    public WebSiteGetPublishProfileResponse() {
        super();
        this.setPublishProfiles(new LazyArrayList<WebSiteGetPublishProfileResponse.PublishProfile>());
    }
    
    /**
    * Gets the sequence of PublishProfiles.
    *
    */
    public Iterator<WebSiteGetPublishProfileResponse.PublishProfile> iterator() {
        return this.getPublishProfiles().iterator();
    }
    
    /**
    * Contains attributes that contain information for a single database
    * connection.
    */
    public static class Database {
        private String connectionString;
        
        /**
        * Optional. Contains a database connection string.
        * @return The ConnectionString value.
        */
        public String getConnectionString() {
            return this.connectionString;
        }
        
        /**
        * Optional. Contains a database connection string.
        * @param connectionStringValue The ConnectionString value.
        */
        public void setConnectionString(final String connectionStringValue) {
            this.connectionString = connectionStringValue;
        }
        
        private String name;
        
        /**
        * Optional. Contains the friendly name of the connection string.
        * @return The Name value.
        */
        public String getName() {
            return this.name;
        }
        
        /**
        * Optional. Contains the friendly name of the connection string.
        * @param nameValue The Name value.
        */
        public void setName(final String nameValue) {
            this.name = nameValue;
        }
        
        private String providerName;
        
        /**
        * Optional. Contains the type of database provider (for example, "SQL"
        * or "MySQL").
        * @return The ProviderName value.
        */
        public String getProviderName() {
            return this.providerName;
        }
        
        /**
        * Optional. Contains the type of database provider (for example, "SQL"
        * or "MySQL").
        * @param providerNameValue The ProviderName value.
        */
        public void setProviderName(final String providerNameValue) {
            this.providerName = providerNameValue;
        }
        
        private String type;
        
        /**
        * Optional.
        * @return The Type value.
        */
        public String getType() {
            return this.type;
        }
        
        /**
        * Optional.
        * @param typeValue The Type value.
        */
        public void setType(final String typeValue) {
            this.type = typeValue;
        }
    }
    
    /**
    * Contains attributes that hold publish profile values.
    */
    public static class PublishProfile {
        private URI controlPanelUri;
        
        /**
        * Optional. The URL of the control panel for the web site.
        * @return The ControlPanelUri value.
        */
        public URI getControlPanelUri() {
            return this.controlPanelUri;
        }
        
        /**
        * Optional. The URL of the control panel for the web site.
        * @param controlPanelUriValue The ControlPanelUri value.
        */
        public void setControlPanelUri(final URI controlPanelUriValue) {
            this.controlPanelUri = controlPanelUriValue;
        }
        
        private ArrayList<WebSiteGetPublishProfileResponse.Database> databases;
        
        /**
        * Optional. Contains connection information for the databases used by
        * the web site application.
        * @return The Databases value.
        */
        public ArrayList<WebSiteGetPublishProfileResponse.Database> getDatabases() {
            return this.databases;
        }
        
        /**
        * Optional. Contains connection information for the databases used by
        * the web site application.
        * @param databasesValue The Databases value.
        */
        public void setDatabases(final ArrayList<WebSiteGetPublishProfileResponse.Database> databasesValue) {
            this.databases = databasesValue;
        }
        
        private URI destinationAppUri;
        
        /**
        * Optional. The URL of the website that will be published to.
        * @return The DestinationAppUri value.
        */
        public URI getDestinationAppUri() {
            return this.destinationAppUri;
        }
        
        /**
        * Optional. The URL of the website that will be published to.
        * @param destinationAppUriValue The DestinationAppUri value.
        */
        public void setDestinationAppUri(final URI destinationAppUriValue) {
            this.destinationAppUri = destinationAppUriValue;
        }
        
        private boolean ftpPassiveMode;
        
        /**
        * Optional. True or False depending on whether FTP passive mode is
        * being used. This attribute applies only if publishMethod is set to
        * FTP.
        * @return The FtpPassiveMode value.
        */
        public boolean isFtpPassiveMode() {
            return this.ftpPassiveMode;
        }
        
        /**
        * Optional. True or False depending on whether FTP passive mode is
        * being used. This attribute applies only if publishMethod is set to
        * FTP.
        * @param ftpPassiveModeValue The FtpPassiveMode value.
        */
        public void setFtpPassiveMode(final boolean ftpPassiveModeValue) {
            this.ftpPassiveMode = ftpPassiveModeValue;
        }
        
        private URI hostingProviderForumUri;
        
        /**
        * Optional. The URL of the forum of the hosting provider.
        * @return The HostingProviderForumUri value.
        */
        public URI getHostingProviderForumUri() {
            return this.hostingProviderForumUri;
        }
        
        /**
        * Optional. The URL of the forum of the hosting provider.
        * @param hostingProviderForumUriValue The HostingProviderForumUri value.
        */
        public void setHostingProviderForumUri(final URI hostingProviderForumUriValue) {
            this.hostingProviderForumUri = hostingProviderForumUriValue;
        }
        
        private String mSDeploySite;
        
        /**
        * Optional. The name of the site that will be published to. This
        * attribute applies only if publishMethod is set to MSDeploy.
        * @return The MSDeploySite value.
        */
        public String getMSDeploySite() {
            return this.mSDeploySite;
        }
        
        /**
        * Optional. The name of the site that will be published to. This
        * attribute applies only if publishMethod is set to MSDeploy.
        * @param mSDeploySiteValue The MSDeploySite value.
        */
        public void setMSDeploySite(final String mSDeploySiteValue) {
            this.mSDeploySite = mSDeploySiteValue;
        }
        
        private String mySqlConnectionString;
        
        /**
        * Optional. The MySQL database connection string for the web site
        * application, if the web site connects to a MySQL database.
        * @return The MySqlConnectionString value.
        */
        public String getMySqlConnectionString() {
            return this.mySqlConnectionString;
        }
        
        /**
        * Optional. The MySQL database connection string for the web site
        * application, if the web site connects to a MySQL database.
        * @param mySqlConnectionStringValue The MySqlConnectionString value.
        */
        public void setMySqlConnectionString(final String mySqlConnectionStringValue) {
            this.mySqlConnectionString = mySqlConnectionStringValue;
        }
        
        private String profileName;
        
        /**
        * Optional. The unique name of the publish profile.
        * @return The ProfileName value.
        */
        public String getProfileName() {
            return this.profileName;
        }
        
        /**
        * Optional. The unique name of the publish profile.
        * @param profileNameValue The ProfileName value.
        */
        public void setProfileName(final String profileNameValue) {
            this.profileName = profileNameValue;
        }
        
        private String publishMethod;
        
        /**
        * Optional. The publish method, such as MSDeploy or FTP.
        * @return The PublishMethod value.
        */
        public String getPublishMethod() {
            return this.publishMethod;
        }
        
        /**
        * Optional. The publish method, such as MSDeploy or FTP.
        * @param publishMethodValue The PublishMethod value.
        */
        public void setPublishMethod(final String publishMethodValue) {
            this.publishMethod = publishMethodValue;
        }
        
        private String publishUrl;
        
        /**
        * Optional. The URL to which content will be uploaded.
        * @return The PublishUrl value.
        */
        public String getPublishUrl() {
            return this.publishUrl;
        }
        
        /**
        * Optional. The URL to which content will be uploaded.
        * @param publishUrlValue The PublishUrl value.
        */
        public void setPublishUrl(final String publishUrlValue) {
            this.publishUrl = publishUrlValue;
        }
        
        private String sqlServerConnectionString;
        
        /**
        * Optional. The SQL Server database connection string for the web site
        * application, if the web site connects to a SQL Server database.
        * @return The SqlServerConnectionString value.
        */
        public String getSqlServerConnectionString() {
            return this.sqlServerConnectionString;
        }
        
        /**
        * Optional. The SQL Server database connection string for the web site
        * application, if the web site connects to a SQL Server database.
        * @param sqlServerConnectionStringValue The SqlServerConnectionString
        * value.
        */
        public void setSqlServerConnectionString(final String sqlServerConnectionStringValue) {
            this.sqlServerConnectionString = sqlServerConnectionStringValue;
        }
        
        private String userName;
        
        /**
        * Optional. The name for the identity that will be used for publishing.
        * @return The UserName value.
        */
        public String getUserName() {
            return this.userName;
        }
        
        /**
        * Optional. The name for the identity that will be used for publishing.
        * @param userNameValue The UserName value.
        */
        public void setUserName(final String userNameValue) {
            this.userName = userNameValue;
        }
        
        private String userPassword;
        
        /**
        * Optional. Hash value of the password that will be used for publishing.
        * @return The UserPassword value.
        */
        public String getUserPassword() {
            return this.userPassword;
        }
        
        /**
        * Optional. Hash value of the password that will be used for publishing.
        * @param userPasswordValue The UserPassword value.
        */
        public void setUserPassword(final String userPasswordValue) {
            this.userPassword = userPasswordValue;
        }
        
        /**
        * Initializes a new instance of the PublishProfile class.
        *
        */
        public PublishProfile() {
            this.setDatabases(new LazyArrayList<WebSiteGetPublishProfileResponse.Database>());
        }
    }
}
