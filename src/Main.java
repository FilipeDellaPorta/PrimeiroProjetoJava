public class Main {
    public static void main(String[] args) {
        System.out.println("Screen Match");


        int anoDeLancamento = 2022;

        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0) / 3;

        String sinopse;
        sinopse = """
                Filme: The Batman
                Filme de investigação e ação com personagem dos quadrinhos.
                Ano de lançamento: %d
                """.formatted(anoDeLancamento);
        System.out.println(sinopse);

        int classificacao = (int) (media / 2);
        System.out.println(classificacao + " estrelas");

    }
}