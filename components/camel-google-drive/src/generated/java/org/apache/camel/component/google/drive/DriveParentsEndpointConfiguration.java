
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.google.drive;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link com.google.api.services.drive.Drive$Parents}.
 */
@ApiParams(apiName = "drive-parents", 
           description = "The parents collection of methods",
           apiMethods = {@ApiMethod(methodName = "delete", description="Removes a parent from a file", signatures={"com.google.api.services.drive.Drive$Parents$Delete delete(String fileId, String parentId)"}), @ApiMethod(methodName = "get", description="Gets a specific parent reference", signatures={"com.google.api.services.drive.Drive$Parents$Get get(String fileId, String parentId)"}), @ApiMethod(methodName = "insert", description="Adds a parent folder for a file", signatures={"com.google.api.services.drive.Drive$Parents$Insert insert(String fileId, com.google.api.services.drive.model.ParentReference content)"}), @ApiMethod(methodName = "list", description="Lists a file's parents", signatures={"com.google.api.services.drive.Drive$Parents$List list(String fileId)"})}, aliases = {})
@UriParams
@Configurer
public final class DriveParentsEndpointConfiguration extends GoogleDriveConfiguration {
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "insert", description="The com.google.api.services.drive.model.ParentReference")})
    private com.google.api.services.drive.model.ParentReference content;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "delete", description="The ID of the file"), @ApiMethod(methodName = "get", description="The ID of the file"), @ApiMethod(methodName = "insert", description="The ID of the file"), @ApiMethod(methodName = "list", description="The ID of the file")})
    private String fileId;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "delete", description="The ID of the parent"), @ApiMethod(methodName = "get", description="The ID of the parent")})
    private String parentId;

    public com.google.api.services.drive.model.ParentReference getContent() {
        return content;
    }

    public void setContent(com.google.api.services.drive.model.ParentReference content) {
        this.content = content;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }
}
