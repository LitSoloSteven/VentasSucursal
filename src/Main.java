import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner N = new Scanner(System.in);

        System.out.println("Ingresa la cantidad de ventas: ");
        int NCantidad = N.nextInt();

        N.nextLine();

        for (int i = 1; i <= NCantidad; i++) {
            System.out.println("Ingresa el nombre de la sucursal " + i +": ");
            String NSucursales = N.nextLine();

            System.out.println("Ingresa el importe de la sucursal "+ i +": ");
            int NImporte = N.nextInt();

            if (i < NCantidad) {
                N.nextLine();
            }
        }
    }
}