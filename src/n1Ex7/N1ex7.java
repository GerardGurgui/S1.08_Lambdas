package n1Ex7;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class N1ex7 {
    
    private List<String> llistaNoms;
    
    
    ////CONSTRUCTOR
    public N1ex7(){
        
        llistaNoms = new ArrayList<>();
        
    }

    
    ///GETTERS SETTERS
    public List<String> getLlistaNoms() {
        return llistaNoms;
    }

    public void setLlistaNoms(List<String> llistaNoms) {
        this.llistaNoms = llistaNoms;
    }
    
    
    ////METODES
    public void afegirNoms(){
        
        
        llistaNoms.add("Gerard");
        llistaNoms.add("Alba");
        llistaNoms.add("Pol");
        llistaNoms.add("Albertito");
        llistaNoms.add("Berto");
        llistaNoms.add("Laura");
        
    }
    
    
    
    public void ordenarNoms(){
        
        
        Collections.sort(llistaNoms, (String nom1, String nom2) -> {
            
            int long1 = nom1.length();
            int long2 = nom2.length();
            
            return long1 > long2 ? -1 : long1 < long2 ? 1 : 0;
        });
        
    } 
    
}