
package polimorfismo;

public class Principal {
    public static void main(String[] args){
        
        Animais animais = new Peixe();
        animais.mover();

        Animais animais2 = new Passaro();
        animais2.mover();
        
        
        relatorio(animais2);
    }
    
    public static void relatorio(Animais anim){
        anim.mover();
    }
}
