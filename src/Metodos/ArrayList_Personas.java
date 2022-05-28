/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus B450M-A II
 */
public class ArrayList_Personas {

    public ArrayList lPersonas;
    public ArrayList lPersonas2;
    public ArrayList lPersonas3;
    String Tipo;

    public ArrayList_Personas() {
        lPersonas = new ArrayList();
        lPersonas2 = new ArrayList();
        lPersonas3 = new ArrayList();

    }

    public int getBuscarID(String nid) {
        int i;
        Personas temp = null;
        if (lPersonas.isEmpty() == true) {
            return -1;
        } else {
            for (i = 0; i < lPersonas.size(); i++) {
                temp = (Personas) lPersonas.get(i);
                if ((temp.getID()).equals(nid)) {
                    return i;
                }
            }
            return -1;
        }
    }

    public int getBuscarID2(String nid) {
        int i;
        Personas temp = null;
        if (lPersonas2.isEmpty() == true) {
            return -1;
        } else {
            for (i = 0; i < lPersonas2.size(); i++) {
                temp = (Personas) lPersonas2.get(i);
                if ((temp.getID()).equals(nid)) {
                    return i;
                }
            }
            return -1;
        }
    }

    public int getBuscarID3(String nid) {
        int i;
        Personas temp = null;
        if (lPersonas3.isEmpty() == true) {
            return -1;
        } else {
            for (i = 0; i < lPersonas3.size(); i++) {
                temp = (Personas) lPersonas3.get(i);
                if ((temp.getID()).equals(nid)) {
                    return i;
                }
            }
            return -1;
        }
    }

    public char getLetra(int LetRandom) {
        int Letra = ((int) Math.floor(Math.random() * (26)));
        char letras[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        return letras[Letra];
    }

    public void setAddPersona(
            JTextField JTNombre,
            JTextField JTEdad,
            String JTID,
            JTextField JTSueldo,
            JTextField JTTelefono,
            JTextField JTEmpresa,
            JTextField JTCategoria,
            JComboBox jComboBox1
    ) {
        Empleado Emple;
        Cliente Clie;
        Directivo Direc;

        int posB = getBuscarID(JTID);
        int posB2 = getBuscarID2(JTID);
        int posB3 = getBuscarID3(JTID);
        if (posB != -1 && posB2 != -1 && posB3 != -1) {
            JOptionPane.showMessageDialog(null,
                    "El idEmpleado ya esta registrado. "
                    + "Intente nuevamente!");
        } else {
            Tipo = jComboBox1.getSelectedItem().toString();
            if (Tipo == "Empleados") {
                Emple = new Empleado(
                        JTNombre.getText(),
                        Integer.parseInt(JTEdad.getText()),
                        JTID,
                        Float.parseFloat(JTSueldo.getText())
                );
                Emple.setToMostrar();
                lPersonas.add(Emple);
                
            } else {
                if (Tipo == "Clientes") {
                    Clie = new Cliente(
                            JTEmpresa.getText(),
                            JTNombre.getText(),
                            Integer.parseInt(JTEdad.getText()),
                            JTID,
                            JTTelefono.getText());
                    Clie.setToMostrar();
                    lPersonas2.add(Clie);

                } else if (Tipo == "Directivos") {
                    Direc = new Directivo(
                            JTCategoria.getText(),
                            JTNombre.getText(),
                            Integer.parseInt(JTEdad.getText()),
                            JTID,
                            Float.parseFloat(JTSueldo.getText())
                    );
                    Direc.setToMostrar();
                    lPersonas3.add(Direc);
                }
            }

            JOptionPane.showMessageDialog(null,
                    "¡Nueva Persona registrada!");
            JTNombre.setText("");
            JTEdad.setText("");
            JTTelefono.setText("");
            JTEmpresa.setText("");
            JTSueldo.setText("");
            JTCategoria.setText("");
            JTNombre.requestFocus();
        }
    }
 
    public void setCliente(
            String idEmp
    ) {
        int posB = getBuscarID2(idEmp);
        if (posB == -1) {
            JOptionPane.showMessageDialog(null,
                    "¡La persona a eliminar no esta registrada!");
        } else {
            lPersonas2.remove(posB);
            JOptionPane.showMessageDialog(null,
                    "Persona eliminada de la posición: " + posB);
        }
    }

    public void setModificarCliente(
            String DNI, String nombre, int edad, String Nombre_empresa, String telefono_de_contacto
    ) {
        int posB = getBuscarID2(DNI);
        if (posB == -1) {
            JOptionPane.showMessageDialog(null,
                    "El Dato no se encuetra");
        } else {
            Cliente info = new Cliente(
                    Nombre_empresa, nombre, edad, DNI, telefono_de_contacto
            );
            lPersonas2.set(posB, info);
            JOptionPane.showMessageDialog(null,
                    "Datos de empleado modificado!");
        }
    }

    public void setEmpleado(
            String idEmp
    ) {
        int posB = getBuscarID(idEmp);
        if (posB == -1) {
            JOptionPane.showMessageDialog(null,
                    "¡La persona a eliminar no esta registrada!");
        } else {
            lPersonas.remove(posB);
            JOptionPane.showMessageDialog(null,
                    "Persona eliminada de la posición: " + posB);
        }
    }

    public void setModificarEmpleado(
            String DNI, String nombre, int edad, float SueldoBr
    ) {
        int posB = getBuscarID(DNI);
        if (posB == -1) {
            JOptionPane.showMessageDialog(null,
                    "El Dato no se encuetra");
        } else {
            Empleado info = new Empleado(
                    nombre, edad, DNI, SueldoBr
            );
            lPersonas.set(posB, info);
            JOptionPane.showMessageDialog(null,
                    "Datos de empleado modificado!");
        }
    }

    public void setDirectivo(
            String idEmp
    ) {
        int posB = getBuscarID3(idEmp);
        if (posB == -1) {
            JOptionPane.showMessageDialog(null,
                    "¡La persona a eliminar no esta registrada!");
        } else {
            lPersonas3.remove(posB);
            JOptionPane.showMessageDialog(null,
                    "Persona eliminada de la posición: " + posB);
        }
    }

    public void setModificarDirectivo(
            String DNI, String nombre, int edad, float SueldoBr, String categoria
    ) {
        int posB = getBuscarID3(DNI);
        if (posB == -1) {
            JOptionPane.showMessageDialog(null,
                    "El Dato no se encuetra");
        } else {
            Directivo info = new Directivo(
                    categoria, nombre, edad, DNI, SueldoBr
            );
            lPersonas3.set(posB, info);
            JOptionPane.showMessageDialog(null,
                    "Datos de empleado modificado!");
        }
    }

    public void setRegistrarFilaJTable(DefaultTableModel miModelo,
            int Fila, int indiceArray) {
        Cliente temp = (Cliente) lPersonas2.get(indiceArray);
        miModelo.setValueAt(temp.getID(), Fila, 0);
        miModelo.setValueAt(temp.getNombre(), Fila, 1);
        miModelo.setValueAt(temp.getEdad(), Fila, 2);
        miModelo.setValueAt(temp.getNombre_empresa(), Fila, 3);
        miModelo.setValueAt(temp.getTelefono_de_contacto(), Fila, 4);
    }

    public void setRegistrarFilaJTable2(DefaultTableModel miModelo2,
            int Fila, int indiceArray) {
        Empleado temp2 = (Empleado) lPersonas.get(indiceArray);
        miModelo2.setValueAt(temp2.getID(), Fila, 0);
        miModelo2.setValueAt(temp2.getNombre(), Fila, 1);
        miModelo2.setValueAt(temp2.getEdad(), Fila, 2);
        miModelo2.setValueAt(temp2.getSueldoBr(), Fila, 3);
    }

    public void setRegistrarFilaJTable3(DefaultTableModel miModelo3,
            int Fila, int indiceArray) {

        Directivo temp3 = (Directivo) lPersonas3.get(indiceArray);
        miModelo3.setValueAt(temp3.getID(), Fila, 0);
        miModelo3.setValueAt(temp3.getNombre(), Fila, 1);
        miModelo3.setValueAt(temp3.getEdad(), Fila, 2);
        miModelo3.setValueAt(temp3.getSueldoBr(), Fila, 3);
        miModelo3.setValueAt(temp3.getCategoria(), Fila, 4);

    }

    public void setLlenarJTable(JTable tab) {
        int indice = 0;
        int indice2 = 0;
        int indice3 = 0;
        int i = 0;
        int j = 0;
        int u = 0;

        if (Tipo == "Clientes") {
            DefaultTableModel miModelo = new DefaultTableModel();
            miModelo.addColumn("ID");
            miModelo.addColumn("Nombre");
            miModelo.addColumn("Edad");
            miModelo.addColumn("Empresa");
            miModelo.addColumn("Telefono");
            while (indice < lPersonas2.size()) {
                miModelo.addRow(new Object[]{"", "", "", "", ""});
                setRegistrarFilaJTable(miModelo, i, indice);
                i++;
                indice++;

            }
            tab.setModel(miModelo);

        } else {
            if (Tipo == "Empleados") {
                DefaultTableModel miModelo2 = new DefaultTableModel();
                miModelo2.addColumn("ID");
                miModelo2.addColumn("Nombre");
                miModelo2.addColumn("Edad");
                miModelo2.addColumn("Sueldo");

                while (indice2 < lPersonas.size()) {
                    miModelo2.addRow(new Object[]{"", "", "", ""});
                    setRegistrarFilaJTable2(miModelo2, j, indice2);
                    j++;
                    indice2++;

                }
                tab.setModel(miModelo2);

            } else {
                if (Tipo == "Directivos") {
                    DefaultTableModel miModelo3 = new DefaultTableModel();
                    miModelo3.addColumn("ID");
                    miModelo3.addColumn("Nombre");
                    miModelo3.addColumn("Edad");
                    miModelo3.addColumn("Sueldo");
                    miModelo3.addColumn("Categoria");

                    while (indice3 < lPersonas3.size()) {
                        miModelo3.addRow(new Object[]{"", "", "", "", ""});
                        setRegistrarFilaJTable3(miModelo3, u, indice3);
                        u++;
                        indice3++;

                    }
                    tab.setModel(miModelo3);

                }
            }
        }
    }

}
