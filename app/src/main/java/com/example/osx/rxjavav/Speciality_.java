package com.example.osx.rxjavav;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Speciality_ {

@SerializedName("id")
@Expose
private String id;
@SerializedName("francais_name")
@Expose
private String francaisName;
@SerializedName("name")
@Expose
private String name;

/**
* No args constructor for use in serialization
* 
*/
public Speciality_() {
}

/**
* 
* @param id
* @param francaisName
* @param name
*/
public Speciality_(String id, String francaisName, String name) {
this.id = id;
this.francaisName = francaisName;
this.name = name;
}

/**
* 
* @return
* The id
*/
public String getId() {
return id;
}

/**
* 
* @param id
* The id
*/
public void setId(String id) {
this.id = id;
}

/**
* 
* @return
* The francaisName
*/
public String getFrancaisName() {
return francaisName;
}

/**
* 
* @param francaisName
* The francais_name
*/
public void setFrancaisName(String francaisName) {
this.francaisName = francaisName;
}

/**
* 
* @return
* The name
*/
public String getName() {
return name;
}

/**
* 
* @param name
* The name
*/
public void setName(String name) {
this.name = name;
}

}