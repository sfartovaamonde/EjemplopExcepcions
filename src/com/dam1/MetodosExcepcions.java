package com.dam1;

import javax.swing.*;

public class MetodosExcepcions {


    public void divisionSenExcepcion (){

        //declaramos los atributos del ejercicio
        int numerador, denominador, resultado;
        // leemos el numerador y el denominador
        numerador = Integer.parseInt(JOptionPane.showInputDialog(" numerador "));
        denominador = Integer.parseInt(JOptionPane.showInputDialog(" denominador "));

        // ahora calculamos el resultado
        resultado = numerador / denominador;
        // leemos el resultado
        JOptionPane.showMessageDialog(null, " division = " + resultado);

    }

    public void divisionConCondicionais(){

        int numerador, denominador, resultado;

        numerador = Integer.parseInt(JOptionPane.showInputDialog(" numerador "));
        denominador = Integer.parseInt(JOptionPane.showInputDialog(" denominador "));

        if ( denominador==0)
            JOptionPane.showMessageDialog(null, " NON SE PODE DIVIDIR ENTRE CERO ");
        else {
            resultado = numerador / denominador;

            JOptionPane.showMessageDialog(null, " division = " + resultado);
        }


    }
    public void divisionCapturaExcepcion (){
        int numerador, denominador, resultado;

        numerador = Integer.parseInt(JOptionPane.showInputDialog(" numerador "));
        denominador = Integer.parseInt(JOptionPane.showInputDialog(" denominador "));

        try {
            resultado = numerador / denominador;

            JOptionPane.showMessageDialog(null, " division = " + resultado);
        }catch(ArithmeticException ex){
            JOptionPane.showMessageDialog(null, " Erro 1 " + ex.toString());
        }

    }
public void divisionConBloqueFinally(){
    int numerador, denominador, resultado;

    numerador = Integer.parseInt(JOptionPane.showInputDialog(" numerador "));
    denominador = Integer.parseInt(JOptionPane.showInputDialog(" denominador "));

   try {
       resultado = numerador / denominador;

       JOptionPane.showMessageDialog(null, " division = " + resultado);
   }catch ( Exception ex) {
       JOptionPane.showMessageDialog(null, " excepción ");
   }finally {
       JOptionPane.showMessageDialog(null, " este bloque execútase sempre ");

   } JOptionPane.showMessageDialog(null, " remata o programa ");

}

}
