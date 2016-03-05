package com.example.osx.rxjavav;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"State"
})
public class State {

    @JsonProperty("State")
    private State_ State;

    /**
     * @return The State
     */
    @JsonProperty("State")
    public State_ getState() {
        return State;
    }

    /**
     * @param State The State
     */
    @JsonProperty("State")
    public void setState(State_ State) {
        this.State = State;
    }
}

