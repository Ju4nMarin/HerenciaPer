/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import javax.swing.JOptionPane;

/**
 *
 * @author Asus B450M-A II
 */
public class Empleado extends Personas {

    private float SueldoBr;

    public Empleado(String Nombre, int Edad, String ID, float SueldoBr) {
        super(Nombre, Edad, ID);
        this.SueldoBr = SueldoBr;
    }

    public float getSueldoBr() {
        return SueldoBr;
    }

    public void setSueldoBr(float SueldoBr) {
        this.SueldoBr = SueldoBr;
    }

    public void setToMostrar() {
        String info = this.getMostrar();
        info += "SueldoBruto: " + SueldoBr + "\n";
        JOptionPane.showMessageDialog(null, info);
    }

}
