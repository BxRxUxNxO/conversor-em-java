/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;


 
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5.0 / 9.0;
        return celsius;
    

    public static void main(String[] args) {
        double fahrenheit = 68; // Altere este valor para a temperatura em Fahrenheit que deseja converter
        double celsius = fahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + " graus Fahrenheit é equivalente a " + String.format("%.2f", celsius) + " graus Celsius.");
    }
}

public class TemperatureConverterImpl extends TemperatureConverter {
    // Aqui você pode adicionar métodos específicos para a classe TemperatureConverterImpl, se necessário
}
