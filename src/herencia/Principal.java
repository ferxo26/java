package herencia;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "1. Agregar Empleado\n" +
                    "2. Agregar Cliente\n" +
                    "3. Salir del programa\n" +
                    "Ingrese el número de la opción deseada:"
            ));

            switch (opcion) {
                case 1:
                    agregarEmpleado();
                    break;
                case 2:
                    agregarCliente();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "¡Hasta luego!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 3);
    }

    // Método para agregar un empleado
    public static void agregarEmpleado() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del empleado:"));
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario del empleado:"));

                                                

      //  JOptionPane.showMessageDialog(null, "Empleado agregado:\nNombre: " + emp.getNombre() + "\nEdad: " + empleado.getEdad() + "\nSalario: " + empleado.getSalario());
    }

    // Método para agregar un cliente
    public static void agregarCliente() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del cliente:"));
        String direccion = JOptionPane.showInputDialog("Ingrese la dirección del cliente:");

       

      //  JOptionPane.showMessageDialog(null, "Cliente agregado:\nNombre: " + cliente.getNombre() + "\nEdad: " + cliente.getEdad() + "\nDirección: " + cliente.getDireccion());
    }
}
