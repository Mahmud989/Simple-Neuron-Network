/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nneuron.Const;

import java.util.ArrayList;
import nneuron.Functions.ActivationFunction;
import nneuron.Layer;

/**
 *
 * @author Mahmud
 */
public abstract class Vars {
    static public ArrayList<Layer> layers=new ArrayList<>();
    static public ActivationFunction activationFunction;
    static private int LayerCount = 0;

    static private int i = 0;

    public static int getNext() {
        return ++i;
    }

    public static int getCurrent() {
        return i;
    }

    public static void decrease() {
        i--;
    }

    public static void setLayerCount(int LayerCount) {
        Vars.LayerCount = LayerCount;
    }

    public static int getLayerCount() {
        return LayerCount;
    }
    

}



