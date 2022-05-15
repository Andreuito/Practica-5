package Practica5;

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
