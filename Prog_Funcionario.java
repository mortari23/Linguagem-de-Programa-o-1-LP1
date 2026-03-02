/* Faça um programa que receba uma quantidade indeterminada de dados de funcionários:
Nome
email;
- salário;
departamento
Valide cada entrada de dados da seguinte forma:
Nome deve ter pelo menos 10 caracteres

E-mail deve conter @ e . e pelo menos 15 caracteres

Salário deve ser maior que 1000,00

Departamento não pode ser vazio

Ao final, calcule e mostre:
O departamento do funcionário que recebe o maior salário
- A média dos salários de todos os funcionários
Os e-mails dos funcionários do departamento de TI
-
Quanto seria o novo salário dos funcionários com aumento de 20%

 */

import java.util.Scanner;

public class Prog_Funcionario {
    public static void main(String[] args) {

        //Declarando Scanner
        Scanner reader = new Scanner(System.in);

        //Declarando Variaveis
        String nome = "", email = "", departamento = "";
        Double salario = 0.0, maior_salario=0.0, soma_salario = 0.0, media_aaa = 0.0, reajuste = 1.2;
        int cont_salario =0;
        String departamento_maior = "", lista = "", lista_reajuste = "";
        char continuar;

        
        //Input
        //NOME
       do{
            do {//inicio do
                try { // inicio do try
                    System.out.println("Informe o seu nome : ");
                    nome = reader.nextLine();
                    // mensagem que eu quero exibir para o usuario
                    if (nome.length() < 10) {
                    System.out.println("Por favor Informe o nome novamente deve ter pelo menos 10 caracteres");
                    }
                } catch (Exception e) { //inicio do catch 
                    System.out.println(e.getMessage());//getMessage é um metodo para fazer o tratamento de erro, ele esta dentro da classe Exception
                }// fim do catch
                
            
            } while (nome.length() < 10);// fim do while
            //Metodo length serve para contar quantos  caracteres uma variavel tem q ter

            //EMAIL
            do {//inicio 
                try {//inicio try
                    System.out.println("Informe o seu email : ");
                    email = reader.nextLine(); //
                    //mensagem do catch para o usuario
                    if (email.length() < 15 || !email.contains("@")  || !email.contains(".")) {
                        System.out.println("email invalido deve conter pelo menos 15 caracteres, (@) e (.)");
                    }
                } catch (Exception e) {//inicio cath
                    System.out.println(e.getMessage());
                }//fim do catch
                
            } while (email.length() <15 || !email.contains("@") || !email.contains("."));// Método contains é para verifcar se contem a sequencia que caratceres que eu pedi
            
            do {
                try {
                    System.out.println("Informe o seu salario : ");
                    salario = reader.nextDouble();
                    reader.nextLine(); // limpa buffer
                    //mensaem para usuario
                    if (salario < 1000) {
                    System.out.println("Informe o seu salario novamente deve ser maior que 1000");
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                lista_reajuste = lista_reajuste + "\n" + nome + "  "  + salario * reajuste;
            } while (salario < 1000.00);

            do {
                try {
                    System.out.println("Informe o seu departamento : ");
                    departamento = reader.nextLine();
                    if (departamento == "") {
                        System.out.println("Informe um valor valido");
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                
                if (departamento.equalsIgnoreCase("TI") || departamento.equalsIgnoreCase("Tecnico de Informatica"))
                    { //equalsIgnoreCase é um método comparar 2 strings e o IgnoreCase é pra diferenciar minusculo de maisculo
                lista =  lista + email + "    " + departamento;
            }
            } while (departamento == "");
            
            //Processamento 
            //maior salario e o departamento
            if (salario > maior_salario) {
                maior_salario = salario;
                departamento_maior = departamento;
            }

            //contando todos os salarios
            cont_salario++;
            //media salarial
            soma_salario = salario + soma_salario;


            System.out.println("deseja digitar um novo funcionario : (S/N)");
            continuar = reader.next().charAt(0);
            reader.nextLine();
       }while(continuar == 's' || continuar == 'S' );

        media_aaa = soma_salario/cont_salario; 

        reajuste = salario * reajuste;
        System.out.println("departamento que recebe o maior salario : " + departamento_maior + "  " + maior_salario );
        System.out.println("media salarial é : " + media_aaa);
        System.out.println("todos os emails de TI : " + lista);
        System.out.println("salario reajustado : "  + lista_reajuste);
    }//main      
}//Classe 
