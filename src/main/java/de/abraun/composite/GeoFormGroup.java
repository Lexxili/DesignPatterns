package de.abraun.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GeoFormGroup implements GeoForm{

    private List<GeoForm> elements;

    public GeoFormGroup(GeoForm... elements) {
        this.elements = new ArrayList<>(Arrays.asList(elements));
    }

    void add(GeoForm element){
        elements.add(element);
    }

    @Override
    public void print() {
        for(GeoForm g : elements ){
            g.print();
        }
    }

    @Override
    public void moveTo(int x, int y) {
        for (GeoForm g : elements){
            g.moveTo(x,y);
        }
    }
}
