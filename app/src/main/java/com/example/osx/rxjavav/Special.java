package com.example.osx.rxjavav;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Special {

@SerializedName("Speciality")
@Expose
private List<com.example.osx.rxjavav.Speciality> Speciality = new ArrayList<com.example.osx.rxjavav.Speciality>();

/**
* No args constructor for use in serialization
* 
*/
public Special() {
}

/**
* 
* @param Speciality
*/
public Special(List<com.example.osx.rxjavav.Speciality> Speciality) {
this.Speciality = Speciality;
}

/**
* 
* @return
* The Speciality
*/
public List<com.example.osx.rxjavav.Speciality> getSpeciality() {
return Speciality;
}

/**
* 
* @param Speciality
* The Speciality
*/
public void setSpeciality(List<com.example.osx.rxjavav.Speciality> Speciality) {
this.Speciality = Speciality;
}

}


