package com.example.osx.rxjavav;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Speciality {

@SerializedName("Speciality")
@Expose
private Speciality_ Speciality;

/**
* No args constructor for use in serialization
* 
*/
public Speciality() {
}

/**
* 
* @param Speciality
*/
public Speciality(Speciality_ Speciality) {
this.Speciality = Speciality;
}

/**
* 
* @return
* The Speciality
*/
public Speciality_ getSpeciality() {
return Speciality;
}

/**
* 
* @param Speciality
* The Speciality
*/
public void setSpeciality(Speciality_ Speciality) {
this.Speciality = Speciality;
}

}