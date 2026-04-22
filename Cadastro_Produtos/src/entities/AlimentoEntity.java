package entities;
import java.util.Scanner;
public class AlimentoEntity extends ProdutoEntity {

    private String datavalidade;

    //Inicialização do Construtor
    public AlimentoEntity(){
        super();
        datavalidade = new String();
    }

    //Construtor com parametros do Pai(ProdutoEntity) e do filho alimento;
    public AlimentoEntity(long codigo, String descricao, long qtd, String datavalidade){
        super(codigo, descricao, qtd);
        datavalidade = new String();
    }

    public String getDatavalidade() {
        return datavalidade;
    }

    public void setDatavalidade(String datavalidade) {
        this.datavalidade = datavalidade;
    }

    public void exibirAlimento(){
        System.out.println("Código" + getCodigo());
        System.out.println("Descricao" + getDescricao());
        System.out.println("Qtd" + getQtd());
        System.out.println("DATA VALIDADE " + datavalidade);
    }

    public void cadastrarAlimento(Scanner reader){
         do {
            try {
               System.out.println("Informe o Código do Alimento : ");
                setCodigo(reader.nextLong());
            } catch (Exception e) {
                System.out.println("ERRO" + e.getMessage());
            }
        } while (getCodigo()<=0);

        do {
            try {
               System.out.println("Informe o Descricao do Alimento : ");
                setDescricao(reader.nextLine());
            } catch (Exception e) {
                System.out.println("ERRO" + e.getMessage());
            }
        } while (getDescricao().isEmpty() || getDescricao().length()<20);

        do {
            try {
               System.out.println("Informe o QTD do Alimento : ");
                setQtd(reader.nextLong());
            } catch (Exception e) {
                System.out.println("ERRO" + e.getMessage());
            }
        } while (getQtd()< 0);

        do {
            try {
               System.out.println("Informe o Data Validade do Alimento : ");
                setDatavalidade(reader.nextLine());
            } catch (Exception e) {
                System.out.println("ERRO" + e.getMessage());
            }
        } while (getDatavalidade().isEmpty() || getDatavalidade().length()<10 || !getDatavalidade().contains("/"));
    }
}
