package com.example.osx.rxjavav;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"state",
"state_code",
"country_id"
})
public class State_ {

@JsonProperty("state")
private String state;
@JsonProperty("state_code")
private String stateCode;
@JsonProperty("country_id")
private String countryId;

/**
* 
* @return
* The state
*/
@JsonProperty("state")
public String getState() {
return state;
}

/**
* 
* @param state
* The state
*/
@JsonProperty("state")
public void setState(String state) {
this.state = state;
}

/**
* 
* @return
* The stateCode
*/
@JsonProperty("state_code")
public String getStateCode() {
return stateCode;
}

/**
* 
* @param stateCode
* The state_code
*/
@JsonProperty("state_code")
public void setStateCode(String stateCode) {
this.stateCode = stateCode;
}

/**
* 
* @return
* The countryId
*/
@JsonProperty("country_id")
public String getCountryId() {
return countryId;
}

/**
* 
* @param countryId
* The country_id
*/
@JsonProperty("country_id")
public void setCountryId(String countryId) {
this.countryId = countryId;
}

}