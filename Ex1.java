import java.util.Scanner;

public class Ex1{ 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Quantos números você deseja inserir?");
        int quantidade = scanner.nextInt(); 
        
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida! O programa será encerrado.");
        } else {
            int maior = Integer.MIN_VALUE;
            int menor = Integer.MAX_VALUE;
            
            for (int i = 1; i <= quantidade; i++) {
                System.out.println("Digite o número " + i + ":");
                int numero = scanner.nextInt();
                if (numero > maior) {
                    maior = numero;
                }
                if (numero < menor) {
                    menor = numero;
                }
            }
            
            System.out.println("O maior número digitado foi: " + maior);
            System.out.println("O menor número digitado foi: " + menor);
        }
        
        scanner.close();
    }
}