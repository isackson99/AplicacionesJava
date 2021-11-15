
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isaac
 */
public class Ejemplo1array {
    
    public static void main(String[] args){
        
        List<String> listaNombres = new ArrayList<>();
        //ArrayList <String> listaNombres2 = new ArrayList<>();
        listaNombres.add("Juan");
        listaNombres.add("Pedro");
        listaNombres.add("Maria");
        
        //for each
        //fore + tab
        for (String datos : listaNombres) {
            System.out.println(datos);
        }
    }
        
        
        
        
}
    
    
    
    
    
    
}
