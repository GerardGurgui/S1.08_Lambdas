package n1Ex5;


public class App {
    
    public static void main(String[] args) {
        
        //Esquerra de la fletxa arguments (en aquest cas el metode no els requereix)
        
        InterfazGetPi interfaz = ()-> {return 3.1415;};
        
        System.out.println(interfaz.getPiValue());
    }
    
    
}