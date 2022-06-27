package n2Ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class N2ex2 {
    
    
    private List<Integer> llistaNums;
    
    
    public N2ex2(){
    
        llistaNums = new ArrayList<>();
        
    }
 
    
    
    public void afegirNumeros(){
        
        llistaNums.add(10);
        llistaNums.add(11);
        llistaNums.add(3);
        llistaNums.add(55);
        llistaNums.add(44);
        llistaNums.add(62);
        llistaNums.add(28);
        llistaNums.add(81);
        
    }
    
    
    public void separarLlista(){
    	
        /*Utilitzarem un map amb un operador ternari(com if-else però més optimitzat molt útil)
        comcença amb la condició a evaluar(condició) seguit de un '?' que ens separa la condició de la resposta
        després les 2 posibles respostas o true o false separadas per ':'
        */
        
        List <String> llistaLambda = llistaNums  .stream()
                                            .map(i-> (i%2 == 0) ? "E"+ i.toString() : "O"+ i.toString())
                                            .collect(Collectors.toList());

               
        llistaLambda.forEach(n-> System.out.println(n));
         

    }
    
}