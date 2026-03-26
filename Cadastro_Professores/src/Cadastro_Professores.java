/* Faca um programa que receba as inscrições de professores para um concurso, este programs funcionará da seguinte forma:
//ENTRADA
Os dados dos professores serão
Nome
Idade
tempo de experiência
área (1 exatas, 2 biologicas, 3 outras)

//PROCESSAMENTO
Crie una classe chamada Validacao para calcular a pontuação dos professores, que tenha os métodoss
calcularPontuacao(int idade, int tempo, int area)
a pontuação é calculada da seguinte forma:
a idade será /2, somada ao tempo * 3 e somada à área, sendo que,
para cada área será atribuída a pontuação: 1 --> 5 pontos, 2 -->10 pontos, 3 ---> 15 pontos

//VARIAVEIS
crie os atributos:
int pontuação [] new int[3]; // armazenará a pontuação dos 3 primeiros candidatos
String candidatos[]= new String[3]; // armazenará os nomes dos 3 primeiros candidatos
int contadorCandidatose; //armazenaré quantos candidatos foram inscritos
 */

import java.util.Scanner;
public class Cadastro_Professores {
    public static void main(String[] args) throws Exception {

        //Declarando Scanner
        Scanner reader = new Scanner(System.in);

        //Variaveis
        String nome = "";
        int idade = 0, tempo_experiencia = -1;
        int area = 0;
        String opcao;

        int pontuacao [] = new int[3];
        String candidatos [] = new String[3];
        int contador_candidatos = 0;

       
        //Entrada
        do{

            do {
                System.out.println("Informe o seu Nome : ");
                nome = reader.nextLine();
                if (!Validacao_Entrada.ValidarNome(nome)) {
                    System.out.println("Nome deve estar acima de 3 Caracteres");
                }
            } while (!Validacao_Entrada.ValidarNome(nome));

            do {
                System.out.println("Informe sua Idade : ");
                idade = reader.nextInt();
                if (!Validacao_Entrada.Validar_Idade(idade)) {
                    System.out.println("A idade deve ser Maior do que 18 anos");
                }
            } while (!Validacao_Entrada.Validar_Idade(idade));

            do {
                System.out.println("Informe o seu tempo de tempo de experiência : ");
                tempo_experiencia = reader.nextInt();
                if (!Validacao_Entrada.Validar_Experiencia(tempo_experiencia)) {
                    System.out.println("Tempo de Experiencia não pode estar abaixo de zero");
                }
            } while (!Validacao_Entrada.Validar_Experiencia(tempo_experiencia));

            do {
                System.out.println("Escolha uma Aréa 1-Exatas, 2-Biologicas, 3-Outros");
                area = reader.nextInt();
                if (!Validacao_Entrada.Validar_Area(area)) {
                    System.out.println("Area escolhida dever estar Entre 1 e 3");
                }
            } while (!Validacao_Entrada.Validar_Area(area));
        
            reader.nextLine(); // limpar buffer

            /* //======= Calculo da Pontuação ======
            int pontos = Validacao_Pontuacao.Validar_Pontuacao(idade, tempo_experiencia, area);
            System.out.println("Pontuação do candidatos é :" + pontuacao);

            if (contador_candidatos < 3) {
                candidatos[contador_candidatos] = nome;
                pontuacao[contador_candidatos] = pontos; */
            
            contador_candidatos++;

            System.out.println("deseja continuar (S/N) : ");
            opcao = reader.nextLine();
            
        } while (opcao.equalsIgnoreCase("S"));

        //Saida
       /*  for(int i = 0; i < 3 && i < contador_candidatos; i++){
            System.out.println(candidatos[i] + "-----" + pontuacao[i] + "pontos");
        }
 */
        System.out.println("A quantidade de Professores inscritos foram : " + contador_candidatos);
        reader.close();
    }
}
