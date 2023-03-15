
package ejercicio_8_cap_3;

import javax.swing.JOptionPane;

public class Ejercicio_8_Cap_3 {

   
    public static void main(String[] args) {
        // Declaracion
        int CodigoEmpleado,NumHoras;
        double ValorHora,PorcRete;
        String Nombre;
        
        //Entradas y proceso
        
        CodigoEmpleado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Codigo Empleado"));
        Nombre = JOptionPane.showInputDialog("Ingrese Nombre del Empleado");
        NumHoras = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de horas"));
        ValorHora = Float.parseFloat(JOptionPane.showInputDialog("Ingrese Valor de la  Hora"));
        PorcRete = Float.parseFloat(JOptionPane.showInputDialog("Ingrese porcentaje retencion en la fuente, sin %"));
        PorcRete /= 100;
        
        //SAlidas
        
        System.out.println("El codigo del empleado es: "+CodigoEmpleado+"\n"+Nombre+" Devengo un salario bruto de "+(NumHoras*ValorHora)+" y su salario neto es: "+((NumHoras*ValorHora)*(1-PorcRete)));
        JOptionPane.showMessageDialog(null, "El codigo del empleado es: "+CodigoEmpleado+"\n"+Nombre+" Devengo un salario bruto de "+(NumHoras*ValorHora)+" y su salario neto es: "+((NumHoras*ValorHora)*(1-PorcRete)));
    }
    
}
