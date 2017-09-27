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
"args",
"headers",
"url"
})
public class GetResponse {

@JsonProperty("args")
private GetArgs args;
@JsonProperty("headers")
private GetHeaders headers;
/**
* The url schema
* <p>
* An explanation about the purpose of this instance.
* 
*/
@JsonProperty("url")
@JsonPropertyDescription("An explanation about the purpose of this instance.")
private String url = "https://postman-echo.com/get?test=123";
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("args")
public GetArgs getArgs() {
return args;
}

@JsonProperty("args")
public void setArgs(GetArgs args) {
this.args = args;
}

@JsonProperty("headers")
public GetHeaders getHeaders() {
return headers;
}

@JsonProperty("headers")
public void setHeaders(GetHeaders headers) {
this.headers = headers;
}

/**
* The url schema
* <p>
* An explanation about the purpose of this instance.
* 
*/
@JsonProperty("url")
public String getUrl() {
return url;
}

/**
* The url schema
* <p>
* An explanation about the purpose of this instance.
* 
*/
@JsonProperty("url")
public void setUrl(String url) {
this.url = url;
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
