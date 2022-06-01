package usuario;

public class User {

    private String user;

    public String getUser() {
        return user;
    }

    public void setUser(String nome) {
        user = nome;
    }
    
    public void display(){
        String texto;
        String nome = getUser();
        String lastCharacter = nome.substring(nome.length() - 1);
    
       if(lastCharacter.equals("a")){
           System.out.println("Olá, " + nome + ". Seja bem vinda!");
       }else{
           System.out.println("Olá, " + nome + ". Seja bem vindo!");
       }        
        
    }
}
