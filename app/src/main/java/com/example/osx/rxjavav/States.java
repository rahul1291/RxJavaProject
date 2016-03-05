package com.example.osx.rxjavav;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"States"
})
public class States {

@JsonProperty("States")
private List<State> States = new ArrayList<State>();

/**
* 
* @return
* The States
*/
@JsonProperty("States")
public List<State> getStates() {
return States;
}

/**
* 
* @param States
* The States
*/
@JsonProperty("States")
public void setStates(List<State> States) {
this.States = States;
}

}