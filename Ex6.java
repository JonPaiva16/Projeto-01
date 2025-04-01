import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int[] semDuplicatas = new int[10];
        int tamanhoNovo = 0;

        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = scanner.nextInt();
        }

        
        for (int i = 0; i < 10; i++) {
            boolean repetido = false;
            for (int j = 0; j < tamanhoNovo; j++) {
                if (numeros[i] == semDuplicatas[j]) {
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                semDuplicatas[tamanhoNovo] = numeros[i];
                tamanhoNovo++;
            }
        }

        
        System.out.println("Array sem valores duplicados:");
        for (int i = 0; i < tamanhoNovo; i++) {
            System.out.print(semDuplicatas[i] + " ");
        }

        scanner.close();
    }
}
