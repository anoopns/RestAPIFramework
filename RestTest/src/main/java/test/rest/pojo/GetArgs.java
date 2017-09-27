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
"test"
})
public class GetArgs {

/**
* The test schema
* <p>
* An explanation about the purpose of this instance.
* 
*/
@JsonProperty("test")
@JsonPropertyDescription("An explanation about the purpose of this instance.")
private String test = "123";
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* The test schema
* <p>
* An explanation about the purpose of this instance.
* 
*/
@JsonProperty("test")
public String getTest() {
return test;
}

/**
* The test schema
* <p>
* An explanation about the purpose of this instance.
* 
*/
@JsonProperty("test")
public void setTest(String test) {
this.test = test;
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
