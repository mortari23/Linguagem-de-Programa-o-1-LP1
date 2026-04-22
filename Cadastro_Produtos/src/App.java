/* Temos as seguintes classes:
        Produto (codigo, descricao, quantidade) e suas subclasses
        Vestuario(tamanho) e Alimento(dataValidade)
        Crie as classes, indique a herança, crie os construtores,
        sets e gets e uma classe com o método main que execute.
    A classe main deve realizar:
    - o cadastramento de Vestuario e Alimento
    - listar os produtos cadastrados
    - realizar a venda de produtos e baixa do estoque
    ao cadastrar os produtos, deverá realizar a validação
    de cada campo/atributo
Crie uma opção no menu que mostre os produtos que foram 
vendidos e a quantidade em estoque de cada produto
  */

import entities.AlimentoEntity;
import entities.ProdutoEntity;
import entities.VestuarioEntities;
import java.util.Scanner;
import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {

        //Instanciado todas as Entidades;
        ProdutoEntity produto = new ProdutoEntity();
        VestuarioEntities vestuario = new VestuarioEntities();
        AlimentoEntity alimento = new AlimentoEntity();
        Scanner reader = new Scanner(System.in);
        ArrayList <VestuarioEntities> listaVestuario = new ArrayList<>();
        ArrayList <AlimentoEntity> listaAlimento = new ArrayList<>();

        //Cadastrando Itens na ListaVestuario
        listaVestuario.add(new VestuarioEntities(1,"camiseta",5, "M"));
        listaVestuario.add(new VestuarioEntities(2,"Calça",10, "M"));
        listaVestuario.add(new VestuarioEntities(3,"bermuda",15, "G"));

        //Cadastrando Itens na ListaAlimento
        listaAlimento.add(new AlimentoEntity(1,"salgado",10,"21/04/2027"));
        listaAlimento.add(new AlimentoEntity(2,"sla",15,"22/04/2027"));
        listaAlimento.add(new AlimentoEntity(3,"sla",20,"23/04/2027"));

        int opcao = 0;

        do {
            mostrarMenu();
            System.out.println("Escolha Uma Opção : ");
            opcao = reader.nextInt();
            reader.nextLine();//Limpar Buffer
            switch (opcao) {
                case 1:
                    vestuario.cadastrarVestuario(reader);
                    break;
                case 2:
                    alimento.cadastrarAlimento(reader);
                    break;
                case 3:
                    for (AlimentoEntity alimentoEntity : listaAlimento) {
                    }
                    break;
                case 4 :
                    break;
                case 5 :
                    break;
                case 6 :
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Opção Inválida Tente Novamente");
                    break;
            }
        } while (opcao!=0);
    }

    public static void mostrarMenu(){
        System.out.println("===MENU===");
        System.out.println("'1- Cadastrar Vestuario");
        System.out.println("'2- Cadastrar Alimento");
        System.out.println("'3- Listar Produtos Cadastrados (Vestuario e Alimento)");
        System.out.println("4- Realizar Venda de Produto");
        System.out.println("5- Mostrar Produtos Vendidos e QTD em ESTOQUE");
        System.out.println("0- Sair ");        
       }
}
