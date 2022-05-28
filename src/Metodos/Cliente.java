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
public class Cliente extends Personas {

    private String nombre_empresa;
    private String telefono_de_contacto;

    public Cliente(String nombre_empresa, String Nombre, int Edad, String ID, String telefono_de_contacto) {
        super(Nombre, Edad, ID);
        this.nombre_empresa = nombre_empresa;
        this.telefono_de_contacto = telefono_de_contacto;
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    public String getTelefono_de_contacto() {
        return telefono_de_contacto;
    }

    public void setTelefono_de_contacto(String telefono_de_contacto) {
        this.telefono_de_contacto = telefono_de_contacto;
    }

    public void setToMostrar() {
        String info = this.getMostrar();
        info += "Nombre de la Empresa: " + nombre_empresa + "\n";
        info += "Telefono de contaco: " + telefono_de_contacto + "\n";
        JOptionPane.showMessageDialog(null, info);
    }

 

}
