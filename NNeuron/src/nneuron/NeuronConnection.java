/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nneuron;

/**
 *
 * @author Mahmud
 */
public class NeuronConnection {
    double weight;
    Neuron from,to;

    public NeuronConnection(double weight, Neuron from, Neuron to) {
        this.weight = weight;
        this.from = from;
        this.to = to;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Neuron getFrom() {
        return from;
        
    }

    public Neuron getTo() {
        return to;
    }
    
    
}




