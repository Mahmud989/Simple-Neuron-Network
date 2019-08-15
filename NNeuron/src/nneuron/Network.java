/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nneuron;

import java.util.ArrayList;
import nneuron.Const.Statics;
import nneuron.Const.Vars;
import nneuron.Functions.ActivationFunction;

/**
 *
 * @author Mahmud
 */
public class Network {

    int layerCount;//min 2 
    int inputCount;
    int outputCount;
    int hiddenCount;
    //input Layer
    private final ArrayList<Neuron> inputs = new ArrayList<>();
    //output Layer
    private final ArrayList<Neuron> outputs = new ArrayList<>();

    public Network(int layerCount, int inputCount, int outputCount, int hiddenCount, ActivationFunction activationFunction) {
        this.layerCount = layerCount;
        this.inputCount = inputCount;
        this.outputCount = outputCount;
        this.hiddenCount = hiddenCount;
        Vars.activationFunction = activationFunction;
    }

    public void generate() {

        for (int i = 0; i < inputCount; i++) {
            Neuron neuron = new Neuron(null, null, 0);
            inputs.add(neuron);
        }
        Vars.layers.add(new Layer(Statics.INPUT, inputs));

        for (int i = 1; i < layerCount - 1; i++) {
            //Layer neurons;            
            ArrayList<Neuron> neurons = new ArrayList<>();

            for (int j = 0; j < hiddenCount; j++) {
                neurons.add(new Neuron(null, null, i));
            }
            Vars.layers.add(new Layer(Statics.HIDDEN, neurons));
        }

        for (int i = 0; i < outputCount; i++) {
            outputs.add(new Neuron(null, null, layerCount - 1));
        }
        Vars.layers.add(new Layer(Statics.OUTPUT, outputs));

        for (int i = 0; i < Vars.layers.size() - 1; i++) {
            ArrayList<Neuron> from = Vars.layers.get(i).getNeurons(),
                    to = Vars.layers.get(i + 1).getNeurons();
            from.forEach((From) -> {
                System.out.println("--");
                to.forEach((To) -> {
                    double d = Math.random()/100d;
                    System.out.println("+\t" + d);
                    Connection.addConnection(From, To, d);
                });
            });
        }
    }

    public void getAnswer(Double... inputs) {
        if (inputs != null) {
            for (int i = 0; i < inputCount; i++) {
                this.inputs.get(i).setOutputValue(inputs[i]);
            }
        }
        outputs.stream().forEach((output) -> {
            System.out.println(output.getOutputValue()+ "\t" + output.id);
        });
    }

}





