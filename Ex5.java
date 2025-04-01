import java.util.Scanner;


public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = scanner.nextInt();
        }

       
        System.out.print("Digite um número para buscar no array: ");
        int numeroBuscado = scanner.nextInt();

        boolean encontrado = false;

      
        for (int i = 0; i < 10; i++) {
            if (numeros[i] == numeroBuscado) {
                System.out.println("Número encontrado na posição: " + i);
                encontrado = true;
                break; 
            }
        }

        
        if (!encontrado) {
            System.out.println("Número não encontrado no array.");
        }

        scanner.close();
    }
}
