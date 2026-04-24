import java.util.Scanner;

import javax.print.DocFlavor.READER;

import java.util.ArrayList;


/* Faça um programa que cadastre uma quantidade indeterminada de estagiários
para uma vaga de emprego, depois mostre o seguinte menu:
1 - mostrar todos os candidatos maiores do que uma idade informada
2 - mostrar todos os candidatos com mediageral acima de 7
3 - mostrar total de candidatos por sexo
4 - mostrar todos os nomes e idades dos alunos do curso de ADS
5 - Sair */

public class App {
    public static void main(String[] args) throws Exception {



        ArrayList <Estagiario> listaestagiario = new ArrayList<>();

        //cadastrar 2 estagiários ao iniciar o programa
        listaestagiario.add(new Estagiario("João Silva", "maria.oliveira@email.com", "ads", 7.5, 19, "M"));
        listaestagiario.add(new Estagiario("Maria Oliveira","maria.oliveira@email.com", "ADS", 6.0,  20, "F"));
        listaestagiario.add(new Estagiario("Matheus Mortari","matheus.oliveira@email.com", "ADS", 8.0,  25, "F"));
        listaestagiario.add(new Estagiario("bruno Oliveira","bruno.oliveira@email.com", "ADS", 9.0,  30, "m"));
        listaestagiario.add(new Estagiario("pedro Oliveira","pedro.oliveira@email.com", "ADS", 5.0,  35, "F"));

       

        Scanner reader = new Scanner(System.in);
        int opcao = 0;
        String  continuar = "S";

        do{
            Estagiario estagiario = new Estagiario();
            estagiario.cadastrarEstagiario(reader);
            listaestagiario.add(estagiario);
            System.out.println("Deseja cadastrar outro estagiário? (S|N)");
            continuar = reader.next().charAt(0)+"";
        }while(continuar.equalsIgnoreCase("S"));
        
        //mostrar todos os estagiários cadastrados
        for(Estagiario estagiario : listaestagiario){
            estagiario.exibirDados();
        }

        do {
                exibirMenu();
                
                System.out.println("ESCOLHA UMA OPÇÃO : ");
                opcao = reader.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe sua idade : ");
                    int idade = reader.nextInt();
                    for (Estagiario estagiario : listaestagiario) {
                        if (estagiario.getIdade() > idade) {
                            System.out.println(estagiario.getNome() + "   Idade   " + estagiario.getIdade());
                        }
                    }
                    break;
                case 2:
                    System.out.println("Mostrando Todos os Candidatos com media geral Acima de 7");
                    for (Estagiario estagiario : listaestagiario) {
                        if (estagiario.getMediageral() > 7.0) {
                            System.out.println(estagiario.getNome() + " MEDIA GERAL " +estagiario.getMediageral());
                        }
                    }
                    break;

                case 3:
                    System.out.println("Mostrar total de Canditados por sexo");
                    int cont_M=0, cont_F=0;
                    for (Estagiario estagiario : listaestagiario) {
                        
                        if (estagiario.getSexo().equalsIgnoreCase("M")) {
                            cont_M++;
                        }
                        if (estagiario.getSexo().equalsIgnoreCase("F")) {
                            cont_F++;
                        }
                    }
                        System.out.println("\n========== Total de candidatos por sexo ==========");
                        System.out.println("Feminino: " + cont_F);
                        System.out.println("Masculino: " + cont_M);
                        System.out.println("Total geral: " + (cont_F + cont_M));
                        break;

                case 4:
                    System.out.println("Mostrando todos os nomes e idades dos alunos do Curso de ads");
                    for (Estagiario estagiario : listaestagiario) {
                        if (estagiario.getCurso().equalsIgnoreCase("ADS")) {
                            System.out.println("Nome  " + estagiario.getNome() + " --- " + " Idade " + estagiario.getIdade());
                        }
                    }
                    break;
                case 5 :
                    System.out.println("5- SAINDO");
                    break;
                default:
                     System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao!= 5);
       
    }

    private static void exibirMenu(){
        System.out.println("-----------Escolha uma opção Abaixo-------------");
        System.out.println("1- Exibir todos os candidatos maiores que a idade informada");
        System.out.println("2- Mostrar todos os Canditados com media geral acima de 7");
        System.out.println("3- Mostrar total de candidatos por sexo");
        System.out.println("4- Mostrar todos os nomes e idades dos aluno do Curso de ads");
        System.out.println("5- Sair");
    }
}
