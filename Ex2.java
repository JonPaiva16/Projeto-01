import java.util.Scanner; 

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        System.out.println("Quantos números você deseja inserir?");
        int tamanho = scanner.nextInt(); 
        
        if (tamanho <= 0) {
            System.out.println("Tamanho inválido! O programa será encerrado.");
        } else {
            int[] numeros = new int[tamanho]; 
            int soma = 0; 
            
           
            for (int i = 0; i < tamanho; i++) {
                System.out.println("Digite o número " + (i + 1) + ":");
                numeros[i] = scanner.nextInt(); 
                soma += numeros[i]; 
            }
            
            double media = (double) soma / tamanho; 
            
            System.out.println("A média dos números digitados é: " + media);
        }
        
        scanner.close(); 
}
}