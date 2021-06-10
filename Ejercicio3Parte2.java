import java.util.Scanner;

//202030799 Manuel Rojas
//Se pide desarrollar un programa que lee un valor N y determine su factorial.
public class Ejercicio3Parte2 {
    public static void main(String[] args) {
        int num = 0;
        int factorial = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero para calcular su factorial: ");
        num = scanner.nextInt();
        if (num > 0){
            while(num > 1){
                factorial *= num;
                num--;
            }
        }
        System.out.println("El factorial de " + num + " es: " + factorial);
    }
}