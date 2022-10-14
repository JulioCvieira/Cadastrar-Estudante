/**
 * Escreva uma descrição da classe Estudante aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */


public class Estudante
{
    private int codigo;
    private String nome;
    private String dataDeNascimento;
    private String email;
    private String senha;
    private Cidade cidade;
    
    //construtor
    public Estudante(int co, String no, String dataNas, String ema, String se, Cidade ci)
    {
        codigo = co;
        nome = no;
        dataDeNascimento = dataNas;
        email = ema;
        senha = se;
        cidade = ci;
        
        cidade.adicionaNovoEstudante();
    }
    
    //metodos getters e setters
    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int co){
        codigo = co;
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String no){
        nome = no;
    }
    
    public String getDataDeNascimento(){
        return dataDeNascimento;
    }
    public void setDataDeNascimento(String dataNas){
        dataDeNascimento = dataNas;
    }
    
    public String getEmail(){
        return email;
    }
    public void setEmail(String ema){
        email = ema;
    }
    
    public String getSenha(){
        return senha;
    }
    public void setSenha(String se){
        senha = se;
    }
    
    public Cidade getCidade(){
        return cidade;
    }
    public void setCidade(Cidade ci){
        cidade = ci;
    }
    
    //método exibeDados
    public void exibeDados(){
        System.out.println("=====Dados=====");
        System.out.println("Codigo: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Data de nascimento: " + dataDeNascimento);
        System.out.println("E-mail: " + email);
        System.out.println("Senha: " + senha);
        System.out.println("Cidade: " + cidade.getDescricao());
    }
}
