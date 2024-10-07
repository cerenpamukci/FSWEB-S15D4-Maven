package org.example;

import java.util.Collections;
import java.util.ArrayList;

public class WorkintechList extends ArrayList {


    @Override
    public boolean add(Object object) {
        if (!this.contains(object)) {
            return super.add(object);
        }
        return false;
    }


    public void sort() {
        Collections.sort(this);
    }

    @Override
    public boolean remove(Object object) {
        return super.remove(object);
    }
}