package com.example.osx.rxjavav;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name="food")
public class Food{
    @Element(name="name")
     String name;

    @Element(name="price")
     String price;

    @Element(name="calories")
     String calories;

    @Element(name="description")
     String description;
}