/* Vamos realizar a inscrição de equipes para os campeonatos da escola, desta forma,
solicitamos que os alunos informem a modalidade esportiva que deseja participar e o turno que os jogos devem acontecer.
Para resolnte 3 modaliver isso, solicite primeiramedades esportivas e os 3 turnos desejados, 
crie um laço de repetição que mostre as 3 modalidades, o usuário escolha uma e posteriormente o usuário poderá escolher o turno que deseja participar desta modalidade.
Ao final mostre a modalidade mais votada no respectivo turno. */

//Importando Scanner
import java.util.Scanner;

public class Prog_Campeoanto {
    
    public static void main(String[] args) {
        
        //Declarando Scanner
        Scanner reader = new Scanner(System.in);

        //Declarando Variaveis
        String modalidades1 = "", modalidades2 = "", modalidades3 = "", turnos = "", guardaTurno = "";
        int opcaoturno = 0;


        //Input
        do {
            try {
                System.out.println("Informe a 1º modalidades : ");
                modalidades1 = reader.nextLine();
                if (modalidades1.equals("") || !modalidades1.matches("[a-zA-Z]+")) {
                    System.out.println("Por favor informe novamente a modalidades");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (modalidades1.equals("") || !modalidades1.matches("[a-zA-Z]+"));

        do {
            try {
                System.out.println("Informe a 2º modalidades : ");
                modalidades2 = reader.nextLine();
                if (modalidades2.equals("") || !modalidades2.matches("[a-zA-Z]+")) {
                    System.out.println("Por favor informe novamente a modalidades");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (modalidades2.equals("") || !modalidades2.matches("[a-zA-Z]+"));

        do {
            try {
                System.out.println("Informe a 3º modalidades : ");
                modalidades3 = reader.nextLine();
                if (modalidades3.equals("") || !modalidades3.matches("[a-zA-Z]+")) {
                    System.out.println("Por favor informe novamente a modalidades");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (modalidades3.equals("") || !modalidades3.matches("[a-zA-Z]+"));

        do {
            for(int i = 1; i <=3; i++){
            try {
                System.out.println("Informe o turno que voce deseja participar (1-manha, 2- tarde, 3- noite");
                opcaoturno = reader.nextInt();
                if (opcaoturno <= 0 || opcaoturno >3) {
                    System.out.println("Valor invalido o numero deve ser entre 1 e 3");
                }
                switch (opcaoturno) {
                    case 1:
                        turnos = "manha";
                        break;
                    case 2:
                        turnos = "tarde";
                        break;
                    case 3 :
                        turnos = "noite";
                }
                guardaTurno = guardaTurno + "\n" + turnos;
            
            } catch (Exception e) {
                System.out.println(e.getLocalizedMessage());
            }
        }
        } while (opcaoturno <= 0 || opcaoturno >3);

        for(int i = 1; i <=3; i++){
            if (i == 1) {
                System.out.println(modalidades1);
            }
            else if (i == 2) {
                System.out.println(modalidades2);
            }
            else
                System.out.println(modalidades3);
        }
        System.out.println(guardaTurno);
        reader.close();
    }//MAIN
}//CLASS
