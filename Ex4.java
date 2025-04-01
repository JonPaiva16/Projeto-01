import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = scanner.nextInt();
        }

      
        for (int i = 0; i < numeros.length / 2; i++) {
            int temp = numeros[i]; 
            numeros[i] = numeros[numeros.length - 1 - i]; 
            numeros[numeros.length - 1 - i] = temp;
        }

        
        System.out.println("Array invertido:");
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i] + " ");
        }

        scanner.close();
    }
}
