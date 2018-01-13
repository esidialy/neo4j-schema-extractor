/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.niels.schemagenerator.schema;

import java.util.ArrayList;
import java.util.List;
import me.niels.values.schemagenerator.distribution.NumericDistribution;

/**
 *
 * @author Niels
 */
public class PropertyType {
    public String name;
    public NumericDistribution amountDistribution;
    public List<Integer> distributionCounter;
    public List<Object> values;
    public String className;
    public ValueSchema valueSchema;
    public PropertyType(String name) {
        this.name = name;
        distributionCounter = new ArrayList<>();
        values = new ArrayList<>();
    }

    @Override
    public String toString(){
        return name;
    }
}
