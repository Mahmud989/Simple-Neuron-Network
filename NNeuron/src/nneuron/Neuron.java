/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nneuron;

import java.util.ArrayList;
import nneuron.Const.Vars;

/**
 *
 * @author Mahmud
 */
public class Neuron {

    ArrayList<Neuron> from, to;//1.input 2.output
    final int id, layerId;
    double outputValue = 0;
    public double Bias;
    public double Delta;

    public Neuron(ArrayList<Neuron> from, ArrayList<Neuron> to, int layerNumber) {
        Bias = Math.random() / 10000000000000.0;
        Delta = Math.random() / 10000000000000.0;
        this.id = Vars.getNext();
        this.layerId = layerNumber;
        this.from = from;
        this.to = to;
    }

    public int getId() {
        return id;
    }

    public void setOutputValue(double outputValue) {
        this.outputValue = outputValue;
    }

    public double getOutputValue() {
        if (layerId == 0) {
            return Vars.activationFunction.evulate(outputValue);
        }
        return Vars.activationFunction.evulate(inputSumFunction());
    }

    public double inputSumFunction() {
        return Connection.getInputSumming(this);
    }

}

