import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        String filmeDigitado = leitura.nextLine();
        System.out.println("Qual o ano de lançamento? ");
        int anoLancamento = leitura.nextInt();
        System.out.println("Qual sua nota para o filme? ");
        double notaFilme = leitura.nextDouble();

        System.out.println(filmeDigitado);
        System.out.println(anoLancamento);
        System.out.println(notaFilme);
    }
}
