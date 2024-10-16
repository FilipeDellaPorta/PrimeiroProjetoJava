import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double avaliacao = 0;
        int contador = 0;

        while (avaliacao != -1) {
            System.out.println("Digite sua avaliação para o filme ou -1 para encerrar: ");
            avaliacao = leitura.nextDouble();
            if (avaliacao != -1) {
                mediaAvaliacao += avaliacao;
                contador++;
            }
        }

        System.out.println("Média das avaliações: " + mediaAvaliacao/contador);
    }
}
