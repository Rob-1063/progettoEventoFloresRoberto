/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eventofloresnavarroroberto;

/**
 *
 * @author floresnavarro.robert
 */
public class EventoFloresNavarroRoberto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Evento e1 = new Evento ("Halloween festival",22.2,0,5);
        Evento e2= new Evento ("Halloween festival",22.2,0,5);
        System.out.println("l'evento 1 e 2 sono uguali?: "+e1.equals(e2));
        System.out.println("\nbiglietti iniziali: "+ e1.getNumeroBigliettiResidui());
        e1.vendiBiglietto();
        if (e1.getNumeroBigliettiResidui()>=0){
        System.out.println(e1.toString());
        System.out.println("\nil prezzo dei biglietti e di: "+e1.getPrezzo()+"€");
        e1.ristampaBiglietti();
        System.out.println(e1.toString());    
        }
        
        
        
    }
    
}
