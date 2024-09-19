public class Filme {
        String nome;
        int anoDeLancamento;
        boolean incluidoNoPlano;
        double somaDasAvaliacoes;
        int totalDeAvaliacoes;
        int duracaoEmMinutos;

        void exibeFichaTecnica(){
                System.out.println("Nome do Filme: " + nome);
                System.out.println("Ano do Filme: " + anoDeLancamento);
                System.out.println("Duração do Filme: " + duracaoEmMinutos);

        }

        void avalia(double nota) {
                somaDasAvaliacoes += nota;
                totalDeAvaliacoes++;
        }

                double pegaMedia(){
                        return somaDasAvaliacoes / totalDeAvaliacoes;
                }



}

