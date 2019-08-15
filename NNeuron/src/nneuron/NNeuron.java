/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nneuron;

import java.util.ArrayList;
import nneuron.Const.Vars;
import nneuron.Functions.SigmoidFunction;
import nneuron.Functions.TanjanFuction;

/**
 *
 * @author Mahmud
 */
public class NNeuron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Vars.activationFunction=new SigmoidFunction();
//        //First test
//        ArrayList<Layer> layers = new ArrayList<>();
//        //input Layer
//        ArrayList<Neuron> inputs = new ArrayList<>();
//
//        inputs.add(new Neuron(null, null, 0));
//        inputs.add(new Neuron(null, null, 0));
//        inputs.add(new Neuron(null, null, 0));
//
//        layers.add(new Layer(0, inputs));
//        //output Layer
//        ArrayList<Neuron> outputs = new ArrayList<>();
//
//        outputs.add(new Neuron(null, null, 1));
//        outputs.add(new Neuron(null, null, 1));
//
//        layers.add(new Layer(2, inputs));
//
//        inputs.forEach((input) -> {
//            System.out.println("--");
//            outputs.forEach((output) -> {
//                double d = Math.random();
//                System.out.println("+\t" + d);
//                Connection.addConnection(input, output, d);
//            });
//        });
//        outputs.stream().forEach((output) -> {
//            System.out.println(output.inputSumFunction() + "\t" + output.id);
//        });
                
            Network network=new Network(4, 8, 4, 12, new TanjanFuction());
            network.generate();
            network.getAnswer(null);
            network.getAnswer(0d,5d,0d,0d,0d,0d,0d,0d);
            
            
    }

}



























