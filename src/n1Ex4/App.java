package n1Ex4;


import n1Ex3.Calendari;

public class App {
    
    public static void main(String[] args) {
        
       
        
        Calendari mesos = new Calendari();
        
        mesos.afegirMesos();
        
        mesos.getLlistaMesos().forEach(System.out::println);
        
    }
    
}