package com.dam1;

import javax.swing.*;

public class ExExcecpions {

    public static void main(String[] args) {
	/*MetodosExcepcions obx = new MetodosExcepcions();
    obx.divisionSenExcepcion();

    MetodosExcepcions obx2 = new MetodosExcepcions();
    obx2.divisionConCondicionais();

    MetodosExcepcions obx3 = new MetodosExcepcions();
    obx3.divisionCapturaExcepcion();

    MetodosExcepcions obx4 = new MetodosExcepcions();
    obx4.divisionConBloqueFinally();*/


    MetodosExcepcions obx5 = new MetodosExcepcions();
    obx5.divisionLanzarExcepcion();


// capturamos a excepcion
        try{
            obx5.divisionLanzarExcepcion();
        }catch (ArithmeticException ex) {

            JOptionPane.showMessageDialog(null, " erri 2" + ex.getMessage());
        }


    }
}
