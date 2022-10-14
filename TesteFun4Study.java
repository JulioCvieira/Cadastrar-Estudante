public class TesteFun4Study
{

    public static void main(String  args []){
        
        int contCidade = 0;
        int resp;
        int contEstudante = 0;
        int opcao = 0;
        Cidade cidade;
        Estudante estudante;
        
        //criação da cidade
        do{
            contCidade++;
            System.out.println("\nCadastre a cidade " + contCidade + ":\n" );
            cidade = new Cidade(Teclado.leInt("Digite o código :"),
                    Teclado.leString("Digite a descrição: "),
                    Teclado.leString("Digite a UF :  "));  
            
                    cidade.exibeDados();
            
            //criação do estudante, informa ao usuario que ele deve cadastrar no minimo 4 estudantes
            if(contEstudante >= 0)
            System.out.println("\n====== Cadastre no minimo 4 estudantes =====\n");
            
        do{
            do{
                contEstudante++;
                System.out.println("\nCadastre o estudante " + contEstudante + ": \n");
                estudante = new Estudante(Teclado.leInt("Digite o código: "),
                    Teclado.leString("Digite o nome: "),
                    Teclado.leString("Digite a data de nascimento: "),
                    Teclado.leString("Digite o email: "),
                    Teclado.leString("Digite a senha: "),
                    cidade);
                    
                    estudante.exibeDados();
            
                   //alterar dados     
                   System.out.println();
                   resp = Teclado.leChar("Deseja alterar os dados do estudante " + contEstudante + " (S-Sim / N-Não) ?");
                   while((resp == 'S') || (resp == 's')){
                   System.out.println("\nAtualize os dados\n");
                   System.out.println("Estudante " + contEstudante +  ":\n");
                   System.out.println("1-Digite o código");
                   System.out.println("2-Nome");
                   System.out.println("3-Data de nascimento");
                   System.out.println("4-Email");
                   System.out.println("5-Senha");
                   opcao = Teclado.leInt("Digite a opção de dado que deseja alterar:"); 
                   switch(opcao){
                        
                       case 1:
                            estudante.setCodigo(Teclado.leInt("Informe o novo código: "));
                            break;
                        case 2:
                            estudante.setNome(Teclado.leString("Informe o novo nome: "));
                            break;
                        case 3:
                            estudante.setDataDeNascimento(Teclado.leString("Informe a nova data de nascimento: "));
                            break;
                        case 4:
                            estudante.setEmail(Teclado.leString("Informe o novo E-mail: "));
                            break;
                            
                       //logica nova senha
                        case 5:
                            String senhaAnterior = Teclado.leString("Digite senha do estudante " + contEstudante + ":");
                            if((estudante.getSenha()).equals(senhaAnterior)){
                            String novaSenha  = Teclado.leString("Digite nova senha: ");
                            String repetirNovaSenha = Teclado.leString("Repita a digitação da nova senha: ");
    
                            if(novaSenha.equals(repetirNovaSenha)){
                            System.out.println("Senha cadastrada com sucesso!"); 
                    
                            estudante.setSenha(novaSenha);  
                    
                            }else{
                            System.out.println("Nova senha e senha confirmada nao são iguais!\nNão foi possivel alterar a senha!");
    
                            } 
                            }else{
                            System.out.println("Senhas não são iguais!\nNão foi possivel alterar a senha!");
                            }
                            break;
                        default:
                            System.out.println("\nOpção invalida!\n Digite Novamente!\n");
                       }
                    
                       resp = Teclado.leChar("Deseja continuar alterando os dados do estudante(S-Sim / N-Não) ?"); 
                       if((resp == 'N') || (resp == 'n')){
                       System.out.println("\n-- Dados do estudante estão Atualizados --\n");
                       System.out.println("Estudante " + contEstudante +  ":\n");
                       estudante.exibeDados();
                   }
                }     
                    
                    System.out.println("\nCrie outro estudante\n");//ira direto criar outro estudante enquando contEstudante for < 4                    
            }while(contEstudante < 4);
                resp = Teclado.leChar("Deseja criar outro estudante (S-Sim / N-Não)? "); 
        }while((resp == 'S') || (resp == 's') || contEstudante < 4);
            contEstudante = 0;
           
           
            resp = Teclado.leChar("Deseja criar outra cidade(S-Sim / N-Não)? "); 
        }while(((resp == 'S') || (resp == 's')));
        
        System.out.println("\n>>>>>> SISTEMA FINALIZADO <<<<<<\n");
    }
}  