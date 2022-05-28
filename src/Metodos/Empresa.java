/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

/**
 *
 * @author Asus B450M-A II
 */
public class Empresa {

    private Cliente Clientes;
    String nombre;

    public Empresa(Cliente Clientes, String nombre) {
        this.Clientes = Clientes;
        this.nombre = nombre;
    }

    public Cliente getClientes() {
        return Clientes;
    }

    public void setClientes(Cliente Clientes) {
        this.Clientes = Clientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
