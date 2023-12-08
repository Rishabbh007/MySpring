
package com.vinculum.ondc.objects.response.onsearch.fb;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "unitized",
    "available",
    "maximum"
})
@Generated("jsonschema2pojo")
public class Quantity implements Serializable
{

    @JsonProperty("unitized")
    private Unitized unitized;
    @JsonProperty("available")
    private Available available;
    @JsonProperty("maximum")
    private Maximum maximum;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 5903475801064855919L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Quantity() {
    }

    /**
     * 
     * @param available
     * @param maximum
     * @param unitized
     */
    public Quantity(Unitized unitized, Available available, Maximum maximum) {
        super();
        this.unitized = unitized;
        this.available = available;
        this.maximum = maximum;
    }

    @JsonProperty("unitized")
    public Unitized getUnitized() {
        return unitized;
    }

    @JsonProperty("unitized")
    public void setUnitized(Unitized unitized) {
        this.unitized = unitized;
    }

    @JsonProperty("available")
    public Available getAvailable() {
        return available;
    }

    @JsonProperty("available")
    public void setAvailable(Available available) {
        this.available = available;
    }

    @JsonProperty("maximum")
    public Maximum getMaximum() {
        return maximum;
    }

    @JsonProperty("maximum")
    public void setMaximum(Maximum maximum) {
        this.maximum = maximum;
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
