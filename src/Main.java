import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pila bolsa = new Pila();
        Cola fila = new Cola();
        int opcion = 0;

        do {
            System.out.println("\n=== SUPERMERCADO ===");
            System.out.println("1. Agregar producto a la bolsa (Pila)");
            System.out.println("2. Sacar producto de la bolsa (Pila)");
            System.out.println("3. Ver producto en la cima de la bolsa");
            System.out.println("4. Agregar persona a la fila (Cola)");
            System.out.println("5. Atender producto de la fila (Cola)");
            System.out.println("6. Ver primera persona en la fila");
            System.out.println("7. Salir");
            System.out.print("Elige una opción: ");

            try {
                opcion = sc.nextInt();
                sc.nextLine();

                switch (opcion) {
                    case 1 -> {
                        System.out.print("Nombre del producto: ");
                        String nombre = sc.nextLine();
                        bolsa.push(new Producto(nombre));
                    }
                    case 2 -> bolsa.pop();
                    case 3 -> System.out.println("Tope de la bolsa: " + bolsa.peek());
                    case 4 -> {
                        System.out.print("Nombre del producto: ");
                        String nombre = sc.nextLine();
                        fila.enqueue(new Producto(nombre));
                    }
                    case 5 -> fila.dequeue();
                    case 6 -> System.out.println("Primer producto en la fila: " + fila.peek());
                    case 7 -> System.out.println("Saliendo del sistema...");
                    default -> System.out.println("Opción no válida");
                }
            } catch (InputMismatchException e) {
                System.out.println("Eso no es un número válido.");
                sc.nextLine();
            }

        } while (opcion != 7);

        sc.close();
    }
}
