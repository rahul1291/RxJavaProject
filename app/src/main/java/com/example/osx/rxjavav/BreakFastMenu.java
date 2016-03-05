package com.example.osx.rxjavav;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

/**
 * Created by Rahull on 10/25/2015.
 */
@Root(name="breakfast_menu")
public class BreakFastMenu {

    @ElementList(inline = true)
    List<Food> list;
}
