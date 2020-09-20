
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.twilio;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link com.twilio.rest.api.v2010.account.Message}.
 */
@ApiParams(apiName = "message", 
           description = "",
           apiMethods = {@ApiMethod(methodName = "creator", description="Create a MessageCreator to execute create", signatures={"com.twilio.rest.api.v2010.account.MessageCreator creator(com.twilio.type.PhoneNumber to, com.twilio.type.PhoneNumber from, String body)", "com.twilio.rest.api.v2010.account.MessageCreator creator(com.twilio.type.PhoneNumber to, com.twilio.type.PhoneNumber from, java.util.List<java.net.URI> mediaUrl)", "com.twilio.rest.api.v2010.account.MessageCreator creator(com.twilio.type.PhoneNumber to, String messagingServiceSid, String body)", "com.twilio.rest.api.v2010.account.MessageCreator creator(com.twilio.type.PhoneNumber to, String messagingServiceSid, java.util.List<java.net.URI> mediaUrl)", "com.twilio.rest.api.v2010.account.MessageCreator creator(String pathAccountSid, com.twilio.type.PhoneNumber to, com.twilio.type.PhoneNumber from, String body)", "com.twilio.rest.api.v2010.account.MessageCreator creator(String pathAccountSid, com.twilio.type.PhoneNumber to, com.twilio.type.PhoneNumber from, java.util.List<java.net.URI> mediaUrl)", "com.twilio.rest.api.v2010.account.MessageCreator creator(String pathAccountSid, com.twilio.type.PhoneNumber to, String messagingServiceSid, String body)", "com.twilio.rest.api.v2010.account.MessageCreator creator(String pathAccountSid, com.twilio.type.PhoneNumber to, String messagingServiceSid, java.util.List<java.net.URI> mediaUrl)"}), @ApiMethod(methodName = "deleter", description="Create a MessageDeleter to execute delete", signatures={"com.twilio.rest.api.v2010.account.MessageDeleter deleter(String pathSid)", "com.twilio.rest.api.v2010.account.MessageDeleter deleter(String pathAccountSid, String pathSid)"}), @ApiMethod(methodName = "fetcher", description="Create a MessageFetcher to execute fetch", signatures={"com.twilio.rest.api.v2010.account.MessageFetcher fetcher(String pathSid)", "com.twilio.rest.api.v2010.account.MessageFetcher fetcher(String pathAccountSid, String pathSid)"}), @ApiMethod(methodName = "reader", description="Create a MessageReader to execute read", signatures={"com.twilio.rest.api.v2010.account.MessageReader reader()", "com.twilio.rest.api.v2010.account.MessageReader reader(String pathAccountSid)"}), @ApiMethod(methodName = "updater", description="Create a MessageUpdater to execute update", signatures={"com.twilio.rest.api.v2010.account.MessageUpdater updater(String pathSid, String body)", "com.twilio.rest.api.v2010.account.MessageUpdater updater(String pathAccountSid, String pathSid, String body)"}), }, aliases = {"^creator$=create", "^deleter$=delete", "^fetcher$=fetch", "^reader$=read", "^updater$=update"})
@UriParams
@Configurer
public final class MessageEndpointConfiguration extends TwilioConfiguration {
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "creator", description="The text of the message you want to send. Can be up to 1,600 characters in length."), @ApiMethod(methodName = "updater", description="The text of the message you want to send")})
    private String body;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "creator", description="The phone number that initiated the message")})
    private com.twilio.type.PhoneNumber from;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "creator", description="The URL of the media to send with the message")})
    private java.util.List<java.net.URI> mediaUrl;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "creator", description="The SID of the Messaging Service you want to associate with the message")})
    private String messagingServiceSid;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "creator", description="The SID of the Account that will create the resource"), @ApiMethod(methodName = "deleter", description="The SID of the Account that created the resources to delete"), @ApiMethod(methodName = "fetcher", description="The SID of the Account that created the resource to fetch"), @ApiMethod(methodName = "reader", description="The SID of the Account that created the resources to read"), @ApiMethod(methodName = "updater", description="The SID of the Account that created the resources to update")})
    private String pathAccountSid;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "deleter", description="The unique string that identifies the resource"), @ApiMethod(methodName = "fetcher", description="The unique string that identifies the resource"), @ApiMethod(methodName = "updater", description="The unique string that identifies the resource")})
    private String pathSid;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "creator", description="The destination phone number")})
    private com.twilio.type.PhoneNumber to;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public com.twilio.type.PhoneNumber getFrom() {
        return from;
    }

    public void setFrom(com.twilio.type.PhoneNumber from) {
        this.from = from;
    }

    public java.util.List<java.net.URI> getMediaUrl() {
        return mediaUrl;
    }

    public void setMediaUrl(java.util.List<java.net.URI> mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    public String getMessagingServiceSid() {
        return messagingServiceSid;
    }

    public void setMessagingServiceSid(String messagingServiceSid) {
        this.messagingServiceSid = messagingServiceSid;
    }

    public String getPathAccountSid() {
        return pathAccountSid;
    }

    public void setPathAccountSid(String pathAccountSid) {
        this.pathAccountSid = pathAccountSid;
    }

    public String getPathSid() {
        return pathSid;
    }

    public void setPathSid(String pathSid) {
        this.pathSid = pathSid;
    }

    public com.twilio.type.PhoneNumber getTo() {
        return to;
    }

    public void setTo(com.twilio.type.PhoneNumber to) {
        this.to = to;
    }
}
