import com.digitalcastaway.datastructures.Stack;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Stack miPila = new Stack();
        int valorUsuario = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor introduzca un número: ");
        valorUsuario = sc.nextInt();
        sc.nextLine();
        miPila.push(valorUsuario);

        System.out.println("Por favor introduzca un número: ");
        valorUsuario = sc.nextInt();
        sc.nextLine();
        miPila.push(valorUsuario);

        System.out.println("Por favor, seleccione la operación");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");

        valorUsuario = sc.nextInt();

        int operando1 = miPila.pop();
        int operando2 = miPila.pop();
        int solucion = 0;

        switch(valorUsuario) {
            case 1:
                solucion = operando1 + operando2;
                break;
            case 2:
                solucion = operando1 - operando2;
                break;
            case 3:
                solucion = operando1 * operando2;
                break;
            case 4:
                solucion = operando1 / operando2;
                break;
            default:
                System.out.println("Es usted demasiado totufo para utilizar esta aplicación");
                break;
        }
        System.out.println("El resultado es: " + solucion);
    }
}
