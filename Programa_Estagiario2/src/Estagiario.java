/* Crie uma classe chamada Estagiario com os seguintes atributos:
Nome, email, curso, médiageral, idade, sexo
 








Crie os construtores da classe
Crie os setters e getters
 
Faça um programa que cadastre uma quantidade indeterminada de estagiários
para uma vaga de emprego, depois mostre o seguinte menu:
1 - mostrar todos os candidatos maiores do que uma idade informada
2 - mostrar todos os candidatos com mediageral acima de 7
3 - mostrar total de candidatos por sexo
4 - mostrar todos os nomes e idades dos alunos do curso de ADS
5 - Sair
 */


import java.util.Scanner;

public class Estagiario {

    //Criando Atributos
    private String nome;
    private String email;
    private String curso;
    private Double mediageral;
    private int idade;
    private String sexo;


    //Inizialização de Atributos/ Construtores
    public Estagiario(){
        nome = new String();
        email = new String();
        curso = new String();
        mediageral = 0.0;
        idade = 0;
        sexo = new String();
    }

    //Construtor com Paramentro
    public Estagiario(String nome, String email, String curso, Double mediageral, int idade, String sexo) {
        this.nome = nome;
        this.email = email;
        this.curso = curso;
        this.mediageral = mediageral;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Double getMediageral() {
        return mediageral;
    }

    public void setMediageral(Double mediageral) {
        this.mediageral = mediageral;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    //Criando método exibir dados do Estagiario
    public void exibirDados(){
        System.out.println("Nome" + nome);
        System.out.println("Email" + email);
        System.out.println("Curso" + curso);
        System.out.println("Média Geral" + mediageral);
        System.out.println("Idade" + idade);
        System.out.println("Sexo" + sexo);
    }


    //Método para cadastrar os dados do Estagiario
    public void cadastrarEstagiario(Scanner reader){
        do {
            try{
            System.out.println("Informe o nome do estagiario : ");
            nome = reader.nextLine();
            }catch(Exception e){
                System.out.println("ERRO" + e.getMessage());
            }
        } while (nome.length()<10 || nome.isEmpty());

         do {
            try{
            System.out.println("Informe o email do estagiario : ");
            email = reader.nextLine();
            }catch(Exception e){
                System.out.println("ERRO" + e.getMessage());
            }
        } while (email.length()<10 || email.isEmpty() || !email.contains("@") ||!email.contains("."));

         do {
            try{
            System.out.println("Informe o curso do estagiario : ");
            curso = reader.nextLine();
            }catch(Exception e){
                System.out.println("ERRO" + e.getMessage());
            }
        } while (curso.length()<5 || curso.isEmpty());

         do {
            try{
            System.out.println("Informe o Média Geral do estagiario : ");
            mediageral = reader.nextDouble();
            }catch(Exception e){
                System.out.println("ERRO" + e.getMessage());
                reader.nextLine();
            }
        } while (mediageral<0 || mediageral>10);

        do {
            try{
            System.out.println("Informe o Idade do estagiario : ");
            idade = reader.nextInt();
            }catch(Exception e){
                System.out.println("ERRO" + e.getMessage());
                reader.nextLine();
            }
        } while (idade<18);

        do {
            try{
            System.out.println("Informe o Sexo do estagiario (M/F) : ");
            sexo = reader.nextLine();
            reader.nextLine();
            }catch(Exception e){
                System.out.println("ERRO" + e.getMessage());
            }
        } while (!sexo.equalsIgnoreCase("M") || !sexo.equalsIgnoreCase("F"));
    }
}
