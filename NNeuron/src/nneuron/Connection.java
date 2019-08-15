/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nneuron;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 *
 * @author Mahmud
 */
public abstract class Connection {

    static ArrayList<NeuronConnection> connections = new ArrayList<>();

    static public void setConnectionWeight(Neuron from, Neuron to, double weight) {
        connections.stream().filter(connection -> from.equals(connection.getFrom()) && to.equals(connection.getTo()))
                .forEach((connection) -> {
                    connection.setWeight(weight);
                });
    }

    static public boolean addConnection(Neuron from, Neuron to, double weight) {
        return connections.add(new NeuronConnection(weight, from, to));
    }

    static public NeuronConnection getNeuronConnection(Neuron from, Neuron to) {
        return connections.stream()
                .filter(connection -> from.equals(connection.getFrom()) && to.equals(connection.getTo()))
                .findFirst().get();
    }

    static public Set<NeuronConnection> getNeuronConnections(Neuron neuron, boolean input) {
        if (input) {
            return connections.stream()
                    .filter(connection -> neuron.equals(connection.getTo())).collect(Collectors.toSet());
        } else {
            return connections.stream()
                    .filter(connection -> neuron.equals(connection.getFrom())).collect(Collectors.toSet());
        }
    }

    static public double getInputSumming(Neuron to) {
        return connections.stream().filter(connection -> to.equals(connection.to))
                .collect(Collectors.summingDouble((connection) -> {
                    return connection.getFrom().getOutputValue() * connection.getWeight(); //To change body of generated lambdas, choose Tools | Templates.
                })).doubleValue() ;
    }
}


