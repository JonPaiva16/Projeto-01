import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();
        int[] numeros = new int[tamanho];

        System.out.println("Digite os elementos do array:");
        for (int i = 0; i < tamanho; i++) {
            numeros[i] = scanner.nextInt();
        }

        encontrarMaxSubarray(numeros);

        scanner.close();
    }

    public static void encontrarMaxSubarray(int[] numeros) {
        int maxSoma = Integer.MIN_VALUE; 
        int somaAtual = 0; 
        int inicio = 0, fim = 0, tempInicio = 0;

        for (int i = 0; i < numeros.length; i++) {
            somaAtual += numeros[i];

            
            if (somaAtual > maxSoma) {
                maxSoma = somaAtual;
                inicio = tempInicio;
                fim = i;
            }

            
            if (somaAtual < 0) {
                somaAtual = 0;
                tempInicio = i + 1;
            }
        }

       
        System.out.println("Maior soma: " + maxSoma);
        System.out.print("Subarray: [");
        for (int i = inicio; i <= fim; i++) {
            System.out.print(numeros[i]);
            if (i < fim) System.out.print(", ");
        }
        System.out.println("]");
    }
}
