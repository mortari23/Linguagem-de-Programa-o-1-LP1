package entities;

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
public class ProdutoEntity {
    private long codigo;
    private String descricao;
    private long qtd;

    //Inicializando os Atributos /  Contrutores sem Parametros
    public ProdutoEntity(){
        codigo = 0;
        descricao = new String();
        qtd = 0;
    }

    //Criando o Construtor com Parametros
    public ProdutoEntity(long codigo, String descricao, long qtd){
        this.codigo = codigo;
        this.descricao = descricao;
        this.qtd = qtd;
    }


    public long getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public long getQtd() {
        return qtd;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setQtd(long qtd) {
        this.qtd = qtd;
    }

}
