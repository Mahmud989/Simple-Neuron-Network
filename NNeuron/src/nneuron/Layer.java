/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nneuron;

import java.util.ArrayList;

/**
 *
 * @author Mahmud
 */
public class Layer {
    
    private int LayerType;
    ArrayList<Neuron> neurons;
    

    public Layer(int LayerType, ArrayList<Neuron> neurons) {
        this.LayerType = LayerType;
        this.neurons = neurons;
    }

    public ArrayList<Neuron> getNeurons() {
        return neurons;
    }

    public void setNeurons(ArrayList<Neuron> neurons) {
        this.neurons = neurons;
    }

    public boolean addNeuron(Neuron neuron) {
        return neurons.add(neuron);
    }
    public int getLayerType(){
        return LayerType;
    }
    

}



