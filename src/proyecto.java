import java.util.LinkedList;
import java.util.Scanner;

public class proyecto {
    public static void main(String[] args) {
        LinkedList<Empleado> empleados = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            Empleado item = new Empleado();
            System.out.println("Ingrese el nombre");
            item.setName(scanner.next());

            System.out.println("Ingrese el apellido");
            item.setLastname(scanner.next());
            System.out.println("Ingrese el direccion");
            item.setAddress(scanner.next());
            System.out.println("Ingrese el edad");
            item.setAge(scanner.nextInt());
            System.out.println("Ingrese el cargo");
            item.setCarge(scanner.next());

            empleados.add(item);
        }
        String cadena ="";
        for (Empleado empleado:empleados) {
            cadena=cadena+empleado.getName()+" "
                    +empleado.getLastname()+" "
                    + empleado.getAddress()+" "
                    + empleado.getAge()+" "
                    + empleado.getCarge();
        }
        System.out.println(cadena);
    }
}
