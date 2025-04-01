import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = {1, 2, 3, 4, 5}; // Array de exemplo

        System.out.print("Digite o valor de k (quantidade de posições para rotacionar): ");
        int k = scanner.nextInt();
        k = k % numeros.length; 

       
        for (int i = 0; i < k; i++) {
            int ultimo = numeros[numeros.length - 1];


            for (int j = numeros.length - 1; j > 0; j--) {
                numeros[j] = numeros[j - 1];
            }

            numeros[0] = ultimo; 
        }

        
        System.out.println("Array rotacionado:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
