
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
 * Camel endpoint configuration for {@link com.google.api.services.drive.Drive$Files}.
 */
@ApiParams(apiName = "drive-files", 
           description = "The files collection of methods",
           apiMethods = {@ApiMethod(methodName = "copy", description="Creates a copy of the specified file", signatures={"com.google.api.services.drive.Drive$Files$Copy copy(String fileId, com.google.api.services.drive.model.File content)"}), @ApiMethod(methodName = "delete", description="Permanently deletes a file by ID", signatures={"com.google.api.services.drive.Drive$Files$Delete delete(String fileId)"}), @ApiMethod(methodName = "emptyTrash", description="Permanently deletes all of the user's trashed files", signatures={"com.google.api.services.drive.Drive$Files$EmptyTrash emptyTrash()"}), @ApiMethod(methodName = "export", description="Exports a Google Doc to the requested MIME type and returns the exported content", signatures={"com.google.api.services.drive.Drive$Files$Export export(String fileId, String mimeType)"}), @ApiMethod(methodName = "generateIds", description="Generates a set of file IDs which can be provided in insert requests", signatures={"com.google.api.services.drive.Drive$Files$GenerateIds generateIds()"}), @ApiMethod(methodName = "get", description="Gets a file's metadata by ID", signatures={"com.google.api.services.drive.Drive$Files$Get get(String fileId)"}), @ApiMethod(methodName = "insert", description="Insert a new file", signatures={"com.google.api.services.drive.Drive$Files$Insert insert(com.google.api.services.drive.model.File content)", "com.google.api.services.drive.Drive$Files$Insert insert(com.google.api.services.drive.model.File content, com.google.api.client.http.AbstractInputStreamContent mediaContent)"}), @ApiMethod(methodName = "list", description="Lists the user's files", signatures={"com.google.api.services.drive.Drive$Files$List list()"}), @ApiMethod(methodName = "patch", description="Updates file metadata and/or content", signatures={"com.google.api.services.drive.Drive$Files$Patch patch(String fileId, com.google.api.services.drive.model.File content)"}), @ApiMethod(methodName = "touch", description="Set the file's updated time to the current server time", signatures={"com.google.api.services.drive.Drive$Files$Touch touch(String fileId)"}), @ApiMethod(methodName = "trash", description="Moves a file to the trash", signatures={"com.google.api.services.drive.Drive$Files$Trash trash(String fileId)"}), @ApiMethod(methodName = "untrash", description="Restores a file from the trash", signatures={"com.google.api.services.drive.Drive$Files$Untrash untrash(String fileId)"}), @ApiMethod(methodName = "update", description="Updates file metadata and/or content", signatures={"com.google.api.services.drive.Drive$Files$Update update(String fileId, com.google.api.services.drive.model.File content)", "com.google.api.services.drive.Drive$Files$Update update(String fileId, com.google.api.services.drive.model.File content, com.google.api.client.http.AbstractInputStreamContent mediaContent)"}), @ApiMethod(methodName = "watch", description="Subscribe to changes on a file", signatures={"com.google.api.services.drive.Drive$Files$Watch watch(String fileId, com.google.api.services.drive.model.Channel content)"})}, aliases = {})
@UriParams
@Configurer
public final class DriveFilesEndpointConfiguration extends GoogleDriveConfiguration {
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "copy", description="The com.google.api.services.drive.model.File"), @ApiMethod(methodName = "insert", description="The com.google.api.services.drive.model.File media metadata or null if none"), @ApiMethod(methodName = "patch", description="The com.google.api.services.drive.model.File"), @ApiMethod(methodName = "update", description="The com.google.api.services.drive.model.File media metadata or null if none")})
    private com.google.api.services.drive.model.File content;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "watch", description="The com.google.api.services.drive.model.Channel")})
    private com.google.api.services.drive.model.Channel contentChannel;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "copy", description="The ID of the file to copy"), @ApiMethod(methodName = "delete", description="The ID of the file to delete"), @ApiMethod(methodName = "export", description="The ID of the file"), @ApiMethod(methodName = "get", description="The ID for the file in question"), @ApiMethod(methodName = "patch", description="The ID of the file to update"), @ApiMethod(methodName = "touch", description="The ID of the file to update"), @ApiMethod(methodName = "trash", description="The ID of the file to trash"), @ApiMethod(methodName = "untrash", description="The ID of the file to untrash"), @ApiMethod(methodName = "update", description="The ID of the file to update"), @ApiMethod(methodName = "watch", description="The ID for the file in question")})
    private String fileId;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "insert", description="The media HTTP content or null if none"), @ApiMethod(methodName = "update", description="The media HTTP content or null if none")})
    private com.google.api.client.http.AbstractInputStreamContent mediaContent;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "export", description="The MIME type of the format requested for this export")})
    private String mimeType;

    public com.google.api.services.drive.model.File getContent() {
        return content;
    }

    public void setContent(com.google.api.services.drive.model.File content) {
        this.content = content;
    }

    public com.google.api.services.drive.model.Channel getContentChannel() {
        return contentChannel;
    }

    public void setContentChannel(com.google.api.services.drive.model.Channel contentChannel) {
        this.contentChannel = contentChannel;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public com.google.api.client.http.AbstractInputStreamContent getMediaContent() {
        return mediaContent;
    }

    public void setMediaContent(com.google.api.client.http.AbstractInputStreamContent mediaContent) {
        this.mediaContent = mediaContent;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }
}
