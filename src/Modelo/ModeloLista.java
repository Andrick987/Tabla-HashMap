
package Modelo;

import java.util.HashMap;
import javax.swing.JOptionPane;

public class ModeloLista {
    
    HashMap MiLista = new HashMap();
    public void IngresarDatos(int codigo,String pais)
    {
        
       
                if(MiLista.containsKey(codigo))
                {
                    JOptionPane.showMessageDialog(null,"El Pais ya se ingreso");
                }
                else
                {
                    MiLista.put(codigo, pais);
                    JOptionPane.showMessageDialog(null,"Se ha Ingresado " +pais);
                }
            
        
        
    }
    public void ListarDatos(){
        
        MiLista.forEach((codigo,valor)->{
            System.out.println(codigo + " "+ valor);
        });
        
    }
}
