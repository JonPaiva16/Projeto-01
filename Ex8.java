import java.util.Arrays;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do primeiro array: ");
        int tamanho1 = scanner.nextInt();
        int[] array1 = new int[tamanho1];

        System.out.println("Digite os elementos do primeiro array em ordem crescente:");
        for (int i = 0; i < tamanho1; i++) {
            array1[i] = scanner.nextInt();
        }

    
        System.out.print("Digite o tamanho do segundo array: ");
        int tamanho2 = scanner.nextInt();
        int[] array2 = new int[tamanho2];

        System.out.println("Digite os elementos do segundo array em ordem crescente:");
        for (int i = 0; i < tamanho2; i++) {
            array2[i] = scanner.nextInt();
        }

        
        int[] resultado = mesclarArrays(array1, array2);

        System.out.println("Array mesclado e ordenado: " + Arrays.toString(resultado));

        scanner.close();
    }

    public static int[] mesclarArrays(int[] arr1, int[] arr2) {
        int tamanho1 = arr1.length;
        int tamanho2 = arr2.length;
        int[] resultado = new int[tamanho1 + tamanho2];

        int i = 0, j = 0, k = 0;

       
        while (i < tamanho1 && j < tamanho2) {
            if (arr1[i] < arr2[j]) {
                resultado[k++] = arr1[i++];
            } else {
                resultado[k++] = arr2[j++];
            }
        }


        while (i < tamanho1) {
            resultado[k++] = arr1[i++];
        }

       
        while (j < tamanho2) {
            resultado[k++] = arr2[j++];
        }

        return resultado;
    }
}
