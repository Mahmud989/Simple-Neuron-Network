/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nneuron.Functions;

/**
 *
 * @author Mahmud
 */
public class SigmoidFunction implements ActivationFunction{


    public double evaluteDerivate(double value) {
        return (value - Math.pow(value, 2));
    }

    @Override
    public double evulate(double value) {
        return 1 / (1 + Math.pow(Math.E, -value));
    }
}



