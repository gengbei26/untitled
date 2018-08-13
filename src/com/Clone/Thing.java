package com.Clone;

import java.util.ArrayList;

public class Thing implements Cloneable {
    private ArrayList arrayList = new ArrayList();
    @Override
    public Thing clone() {
        Thing thing = null;
        try {
            thing = (Thing) super.clone();
            //深拷贝
            thing.arrayList = (ArrayList<String>) this.arrayList.clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        return thing;
    }

    public void setValue(String value) {
        this.arrayList.add(value);
    }

    public ArrayList<String> getValue() {
        return this.arrayList;
    }
}
