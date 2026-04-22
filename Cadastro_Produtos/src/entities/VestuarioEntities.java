package entities;
import java.util.Scanner;


public class VestuarioEntities extends ProdutoEntity {
    private String tamanho;

    //Inizialização do Atributo;
    public VestuarioEntities(){
        super();
        tamanho = new String();
    }

    //Construtor com Paramentro e com os Atributos do Produto(pai);
    public VestuarioEntities(long codigo, String descricao, long qtd, String Tamanho){
        super(codigo, descricao, qtd);
        tamanho = new String();
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    //Criando Método para Exibir os Vestuario;
    public void exibirVestuario(){
        System.out.println("Codigo" + getCodigo());
        System.out.println("Descricao" + getDescricao());
        System.out.println("QTD" + getQtd());
        System.out.println("Tamanho " + tamanho);
    }

    public void cadastrarVestuario(Scanner reader){
        do {
            try {
               System.out.println("Informe o Código do Vestuario : ");
                setCodigo(reader.nextLong());
            } catch (Exception e) {
                System.out.println("ERRO" + e.getMessage());
            }
        } while (getCodigo()<=0);

        do {
            try {
               System.out.println("Informe o Descricao do Vestuario : ");
                setDescricao(reader.nextLine());
            } catch (Exception e) {
                System.out.println("ERRO" + e.getMessage());
            }
        } while (getDescricao().isEmpty() || getDescricao().length()<20);

        do {
            try {
               System.out.println("Informe o QTD do Vestuario : ");
                setQtd(reader.nextLong());
            } catch (Exception e) {
                System.out.println("ERRO" + e.getMessage());
            }
        } while (getQtd()< 0);

        do {
            try {
               System.out.println("Informe o Tamanho do Vestuario : ");
                setTamanho(reader.nextLine());
            } catch (Exception e) {
                System.out.println("ERRO" + e.getMessage());
            }
        } while (getTamanho().isEmpty() || getTamanho().length()<3);
    }
}
