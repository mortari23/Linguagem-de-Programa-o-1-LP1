/* Crie una classe chamada Validacao para calcular a pontuação dos professores, que tenha os métodoss
calcularPontuacao(int idade, int tempo, int area)
a pontuação é calculada da seguinte forma:
a idade será /2, somada ao tempo * 3 e somada à área, sendo que,
para cada área será atribuída a pontuação: 1 --> 5 pontos, 2 -->10 pontos, 3 ---> 15 pontos */

public class Validacao_Pontuacao {

    public static int Validar_Pontuacao(int idade, int tempo_experiencia, int area){

        int pontos_area = 0;

        if (area == 1) {
            pontos_area = 5;
        } else if (area == 2) {
            pontos_area = 10;
        } else {
            pontos_area = 15;
        }

        // Fórmula correta
        int pontuacao = (idade / 2) + (tempo_experiencia * 3) + pontos_area;

        return pontuacao;
    }
}