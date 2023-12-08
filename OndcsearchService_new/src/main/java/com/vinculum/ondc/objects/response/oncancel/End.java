
package com.vinculum.ondc.objects.response.oncancel;

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
    "location",
    "time",
    "person",
    "contact"
})
@Generated("jsonschema2pojo")
public class End implements Serializable
{

    @JsonProperty("location")
    private Location__2 location;
    @JsonProperty("time")
    private Time__1 time;
    @JsonProperty("person")
    private Person person;
    @JsonProperty("contact")
    private Contact__1 contact;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 5929874318684839018L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public End() {
    }

    /**
     * 
     * @param person
     * @param contact
     * @param location
     * @param time
     */
    public End(Location__2 location, Time__1 time, Person person, Contact__1 contact) {
        super();
        this.location = location;
        this.time = time;
        this.person = person;
        this.contact = contact;
    }

    @JsonProperty("location")
    public Location__2 getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Location__2 location) {
        this.location = location;
    }

    @JsonProperty("time")
    public Time__1 getTime() {
        return time;
    }

    @JsonProperty("time")
    public void setTime(Time__1 time) {
        this.time = time;
    }

    @JsonProperty("person")
    public Person getPerson() {
        return person;
    }

    @JsonProperty("person")
    public void setPerson(Person person) {
        this.person = person;
    }

    @JsonProperty("contact")
    public Contact__1 getContact() {
        return contact;
    }

    @JsonProperty("contact")
    public void setContact(Contact__1 contact) {
        this.contact = contact;
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
