package Metodos;

import javax.swing.JOptionPane;

public class Personas {

    private String Nombre;
    private int Edad;
    private String ID;

    public Personas(String Nombre, int Edad, String ID) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.ID = ID;

    }

    public Personas() {

    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public void setToMostrar() {
        String info = "Se agregó: \n";
        info += "ID: " + ID + "\n";
        info += "Nombres: " + Nombre + "\n";
        info += "Edad: " + Edad + "\n";
        JOptionPane.showMessageDialog(null, info);
    }

    public String getMostrar() {
        String info = "La siguiente Personas se agregó: \n";
        info += "ID: " + ID + "\n";
        info += "Nombres: " + Nombre + "\n";
        info += "Edad: " + Edad + "\n";
        return info;
    }
}
