/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

/**
 *
 * @author andreus
 */
public class Calculadora implements ICalculadora {
    @Override
    public float suma (float num1, float num2){
        return num1 + num2;
    }
    @Override
    public float division(float num1, float num2){
        return (num1/num2);
    }
    @Override
    public float resta(float num1, float num2){
        return num1 - num2;
    }
    @Override
    public float multiplicacion(float num1, float num2){
        return num1 * num2;
    }

}

