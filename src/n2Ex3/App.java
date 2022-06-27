package n2Ex3;

public class App {
    
    public static void main(String[] args) {
        
        float a = 8;
        float b = 4;
        
        //SUMA
        Operacio opSuma = ()->{return a+b;};
        System.out.println("Suma = "+opSuma.operacio());
        
        //RESTA
        Operacio opResta = ()->{return a-b;};
        System.out.println("Resta = "+ opResta.operacio());
        
        //Multiplicacio
        Operacio opMultip = ()->{return a*b;};
        System.out.println("Multiplicació = " +opMultip.operacio());
        
        
        //Divisio
        Operacio opDivisio = ()->{return a/b;};
        System.out.println("Divisió = " +opDivisio.operacio());
        
    }
    
}