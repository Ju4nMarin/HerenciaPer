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
public class Directivo extends Empleado {

    private String categoria;

    public Directivo(String categoria, String Nombre, int Edad, String ID, float SueldoBr) {
        super(Nombre, Edad, ID, SueldoBr);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setToMostrar(){
        String info = this.getMostrar();
        info += "Categoria: " + categoria + "\n";
        JOptionPane.showMessageDialog(null, info);
    }

}
