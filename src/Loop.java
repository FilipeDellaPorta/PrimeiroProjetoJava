import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double avaliacao = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite sua avaliação para o filme? ");
            avaliacao = leitura.nextDouble();
            mediaAvaliacao += avaliacao;
        }

        System.out.println("Média das avaliações: " + mediaAvaliacao/3);
    }
}
