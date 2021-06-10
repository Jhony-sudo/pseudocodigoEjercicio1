import java.util.Scanner;
import java.util.Random;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        Random r = new Random();
        int Num;
        int NumPar = 0;
        int NumImpar = 0;

        System.out.println("Ingrese un numero");
        Num = sr.nextInt();
        for (int i = 0; i < Num; i++) {
            int NumAle = r.nextInt(99) + 1;
            System.out.println(NumAle);
            if (NumAle % 2 == 0) {
                NumPar++;
            } else {
                NumImpar++;

            }

        }
        System.out.println(Num + " numeros fueron generados");
        System.out.println(NumPar + " numeros son pares y " + NumImpar + " numeros son impares");

    }

}