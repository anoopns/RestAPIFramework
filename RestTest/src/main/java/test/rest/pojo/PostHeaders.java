package test.rest.pojo;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"accept",
"accept-encoding",
"cache-control",
"content-length",
"content-type",
"cookie",
"host",
"postman-token",
"user-agent",
"x-forwarded-port",
"x-forwarded-proto"
})
public class PostHeaders {

/**
* The accept schema
* <p>
* An explanation about the purpose of this instance.
* 
*/
@JsonProperty("accept")
@JsonPropertyDescription("An explanation about the purpose of this instance.")
private String accept = "*/*";
/**
* The accept-encoding schema
* <p>
* An explanation about the purpose of this instance.
* 
*/
@JsonProperty("accept-encoding")
@JsonPropertyDescription("An explanation about the purpose of this instance.")
private String acceptEncoding = "gzip, deflate";
/**
* The cache-control schema
* <p>
* An explanation about the purpose of this instance.
* 
*/
@JsonProperty("cache-control")
@JsonPropertyDescription("An explanation about the purpose of this instance.")
private String cacheControl = "no-cache";
/**
* The content-length schema
* <p>
* An explanation about the purpose of this instance.
* 
*/
@JsonProperty("content-length")
@JsonPropertyDescription("An explanation about the purpose of this instance.")
private String contentLength = "257";
/**
* The content-type schema
* <p>
* An explanation about the purpose of this instance.
* 
*/
@JsonProperty("content-type")
@JsonPropertyDescription("An explanation about the purpose of this instance.")
private String contentType = "text/plain";
/**
* The cookie schema
* <p>
* An explanation about the purpose of this instance.
* 
*/
@JsonProperty("cookie")
@JsonPropertyDescription("An explanation about the purpose of this instance.")
private String cookie = "sails.sid=s%3AHZtesjaky-NHn__0ASXLbQ2Dd09fnXOo.b5ymDxHM85slYXr1GEAIR52v22AEVvWHx%2BNBIHjfEFI";
/**
* The host schema
* <p>
* An explanation about the purpose of this instance.
* 
*/
@JsonProperty("host")
@JsonPropertyDescription("An explanation about the purpose of this instance.")
private String host = "postman-echo.com";
/**
* The postman-token schema
* <p>
* An explanation about the purpose of this instance.
* 
*/
@JsonProperty("postman-token")
@JsonPropertyDescription("An explanation about the purpose of this instance.")
private String postmanToken = "decbc6f4-d581-4226-9b0e-a2302625b3d2";
/**
* The user-agent schema
* <p>
* An explanation about the purpose of this instance.
* 
*/
@JsonProperty("user-agent")
@JsonPropertyDescription("An explanation about the purpose of this instance.")
private String userAgent = "PostmanRuntime/6.3.2";
/**
* The x-forwarded-port schema
* <p>
* An explanation about the purpose of this instance.
* 
*/
@JsonProperty("x-forwarded-port")
@JsonPropertyDescription("An explanation about the purpose of this instance.")
private String xForwardedPort = "443";
/**
* The x-forwarded-proto schema
* <p>
* An explanation about the purpose of this instance.
* 
*/
@JsonProperty("x-forwarded-proto")
@JsonPropertyDescription("An explanation about the purpose of this instance.")
private String xForwardedProto = "https";
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* The accept schema
* <p>
* An explanation about the purpose of this instance.
* 
*/
@JsonProperty("accept")
public String getAccept() {
return accept;
}

/**
* The accept schema
* <p>
* An explanation about the purpose of this instance.
* 
*/
@JsonProperty("accept")
public void setAccept(String accept) {
this.accept = accept;
}

/**
* The accept-encoding schema
* <p>
* An explanation about the purpose of this instance.
* 
*/
@JsonProperty("accept-encoding")
public String getAcceptEncoding() {
return acceptEncoding;
}

/**
* The accept-encoding schema
* <p>
* An explanation about the purpose of this instance.
* 
*/
@JsonProperty("accept-encoding")
public void setAcceptEncoding(String acceptEncoding) {
this.acceptEncoding = acceptEncoding;
}

/**
* The cache-control schema
* <p>
* An explanation about the purpose of this instance.
* 
*/
@JsonProperty("cache-control")
public String getCacheControl() {
return cacheControl;
}

/**
* The cache-control schema
* <p>
* An explanation about the purpose of this instance.
* 
*/
@JsonProperty("cache-control")
public void setCacheControl(String cacheControl) {
this.cacheControl = cacheControl;
}

/**
* The content-length schema
* <p>
* An explanation about the purpose of this instance.
* 
*/
@JsonProperty("content-length")
public String getContentLength() {
return contentLength;
}

/**
* The content-length schema
* <p>
* An explanation about the purpose of this instance.
* 
*/
@JsonProperty("content-length")
public void setContentLength(String contentLength) {
this.contentLength = contentLength;
}

/**
* The content-type schema
* <p>
* An explanation about the purpose of this instance.
* 
*/
@JsonProperty("content-type")
public String getContentType() {
return contentType;
}

/**
* The content-type schema
* <p>
* An explanation about the purpose of this instance.
* 
*/
@JsonProperty("content-type")
public void setContentType(String contentType) {
this.contentType = contentType;
}

/**
* The cookie schema
* <p>
* An explanation about the purpose of this instance.
* 
*/
@JsonProperty("cookie")
public String getCookie() {
return cookie;
}

/**
* The cookie schema
* <p>
* An explanation about the purpose of this instance.
* 
*/
@JsonProperty("cookie")
public void setCookie(String cookie) {
this.cookie = cookie;
}

/**
* The host schema
* <p>
* An explanation about the purpose of this instance.
* 
*/
@JsonProperty("host")
public String getHost() {
return host;
}

/**
* The host schema
* <p>
* An explanation about the purpose of this instance.
* 
*/
@JsonProperty("host")
public void setHost(String host) {
this.host = host;
}

/**
* The postman-token schema
* <p>
* An explanation about the purpose of this instance.
* 
*/
@JsonProperty("postman-token")
public String getPostmanToken() {
return postmanToken;
}

/**
* The postman-token schema
* <p>
* An explanation about the purpose of this instance.
* 
*/
@JsonProperty("postman-token")
public void setPostmanToken(String postmanToken) {
this.postmanToken = postmanToken;
}

/**
* The user-agent schema
* <p>
* An explanation about the purpose of this instance.
* 
*/
@JsonProperty("user-agent")
public String getUserAgent() {
return userAgent;
}

/**
* The user-agent schema
* <p>
* An explanation about the purpose of this instance.
* 
*/
@JsonProperty("user-agent")
public void setUserAgent(String userAgent) {
this.userAgent = userAgent;
}

/**
* The x-forwarded-port schema
* <p>
* An explanation about the purpose of this instance.
* 
*/
@JsonProperty("x-forwarded-port")
public String getXForwardedPort() {
return xForwardedPort;
}

/**
* The x-forwarded-port schema
* <p>
* An explanation about the purpose of this instance.
* 
*/
@JsonProperty("x-forwarded-port")
public void setXForwardedPort(String xForwardedPort) {
this.xForwardedPort = xForwardedPort;
}

/**
* The x-forwarded-proto schema
* <p>
* An explanation about the purpose of this instance.
* 
*/
@JsonProperty("x-forwarded-proto")
public String getXForwardedProto() {
return xForwardedProto;
}

/**
* The x-forwarded-proto schema
* <p>
* An explanation about the purpose of this instance.
* 
*/
@JsonProperty("x-forwarded-proto")
public void setXForwardedProto(String xForwardedProto) {
this.xForwardedProto = xForwardedProto;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}
