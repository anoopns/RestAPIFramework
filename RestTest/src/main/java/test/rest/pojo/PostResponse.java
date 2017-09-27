

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
"data",
"files",
"form",
"headers",
"json",
"url"
})
public class PostResponse {

@JsonProperty("args")
private PostArgs args;
/**
* The data schema
* <p>
* An explanation about the purpose of this instance.
* 
*/
@JsonProperty("data")
@JsonPropertyDescription("An explanation about the purpose of this instance.")
private PostData data;
@JsonProperty("files")
private PostFiles files;
@JsonProperty("form")
private PostForm form;
@JsonProperty("headers")
private PostHeaders headers;
/**
* The json schema
* <p>
* An explanation about the purpose of this instance.
* 
*/
@JsonProperty("json")
@JsonPropertyDescription("An explanation about the purpose of this instance.")
private Object json = null;
/**
* The url schema
* <p>
* An explanation about the purpose of this instance.
* 
*/
@JsonProperty("url")
@JsonPropertyDescription("An explanation about the purpose of this instance.")
private String url = "https://postman-echo.com/post";
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("args")
public PostArgs getArgs() {
return args;
}

@JsonProperty("args")
public void setArgs(PostArgs args) {
this.args = args;
}

/**
* The data schema
* <p>
* An explanation about the purpose of this instance.
* 
*/
@JsonProperty("data")
public PostData getData() {
return data;
}

/**
* The data schema
* <p>
* An explanation about the purpose of this instance.
* 
*/
@JsonProperty("data")
public void setData(PostData data) {
this.data = data;
}

@JsonProperty("files")
public PostFiles getFiles() {
return files;
}

@JsonProperty("files")
public void setFiles(PostFiles files) {
this.files = files;
}

@JsonProperty("form")
public PostForm getForm() {
return form;
}

@JsonProperty("form")
public void setForm(PostForm form) {
this.form = form;
}

@JsonProperty("headers")
public PostHeaders getHeaders() {
return headers;
}

@JsonProperty("headers")
public void setHeaders(PostHeaders headers) {
this.headers = headers;
}

/**
* The json schema
* <p>
* An explanation about the purpose of this instance.
* 
*/
@JsonProperty("json")
public Object getJson() {
return json;
}

/**
* The json schema
* <p>
* An explanation about the purpose of this instance.
* 
*/
@JsonProperty("json")
public void setJson(Object json) {
this.json = json;
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