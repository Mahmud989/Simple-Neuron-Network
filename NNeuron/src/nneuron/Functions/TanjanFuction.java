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
public class TanjanFuction implements ActivationFunction {

    @Override
    public double evulate(double value) {
        return Math.tanh(value);
    }
}

