/**
 * Escreva uma descrição da classe Cidade aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Cidade
{
    private int codigo;
    private String descricao;
    private String uf;
    private int qtdEstudantes;
    
    //construtor
    public Cidade(int co, String des, String uf)
    {
        codigo = co;
        descricao = des;
        this.uf = uf;
    }
    
    //metodos getters e setters
    public int getCodigo(){
        return codigo;
    }
    
    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String des){
        descricao = des;
    }
    
    public String getUf(){
        return uf;
    }
    public void setUf(String uf){
        this.uf = uf;
    }
    
    public void adicionaNovoEstudante(){
        qtdEstudantes = qtdEstudantes + 1;
    }
    
    //método exibeDados
    public void exibeDados(){
        System.out.println("=====Dados=====");
        System.out.println("Codigo: " + codigo);
        System.out.println("Descricao: " + descricao);
        System.out.println("Uf: " + uf);
        System.out.println("Quantidade de estudantes: " + qtdEstudantes);
    }
}
