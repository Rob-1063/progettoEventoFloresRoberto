/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eventofloresnavarroroberto;

import java.util.Objects;

/**
 *
 * @author floresnavarro.robert
 */
public class Evento {
    //elenco degli attributi
    private String nomeEvento;
    private double prezzo;
    private int numeroBigliettiVenduti;
    private int numeroBigliettiResidui;
    
    //meteodo costruttore
    public Evento(String nomeEvento,double prezzo,int numeroBigliettiVenduti,int numeroBigliettiResidui){
        this.nomeEvento=nomeEvento;
        this.prezzo=prezzo;
        this.numeroBigliettiVenduti=numeroBigliettiVenduti;
        this.numeroBigliettiResidui=numeroBigliettiResidui;
    }
    
    //elenco dei metodi
    //metodi getter
    /**
     * metodo getter serve per leggere un valore privato al di fuori della classe
     * @return il nome dell'evento
     */
    public String getNomeEvento(){
        return this.nomeEvento;
    }
    /**
     * metodo getter serve per leggere un valore privato al di fuori della classe
     * @return il prezzo del biglietto
     */
    public double getPrezzo(){
        return this.prezzo;
    }
    /**
     * metodo getter serve per leggere un valore privato al di fuori della classe
     * @return 
     */
    public int getNumeroBigliettiVenduti(){
        return this.numeroBigliettiVenduti;
    }
    public int getNumeroBigliettiResidui(){
        return this.numeroBigliettiResidui;
    }
    
    //metodi setter
    public void setNomeEvento(String nomeEvento){
        nomeEvento=this.nomeEvento;
    }
    public void setPrezzo(double prezzo){
        prezzo = this.prezzo;
    }
    
    public void setNumeroBigliettiVenduti (int numeroBigliettiVenduti){
        numeroBigliettiVenduti = this.numeroBigliettiVenduti;
    }
    public void setNumeroBigliettiResidui (int numeroBigliettiResidui){
        numeroBigliettiResidui = this.numeroBigliettiResidui;
    }
    
    //metodi della classe
    public void vendiBiglietto(){
        int bigliettivenduti = (int)(Math.random()*10)+1;
        this.numeroBigliettiVenduti += bigliettivenduti;
        this.numeroBigliettiResidui -= bigliettivenduti;
        if (this.numeroBigliettiResidui>=0)
        System.out.println("\nHai venduto: "+ getNumeroBigliettiVenduti()+" biglietti/o");
        else
            System.out.println("\nnon e stato possibile vendere i biglietti perche biglietti non sono sufficienti!");
    }
    public void ristampaBiglietti(){
        int bigliettiristampati = (int)(Math.random()*50)+1;
        this.numeroBigliettiResidui += bigliettiristampati;
        System.out.println("sono stati ristampati: "+bigliettiristampati+" biglietti");
    }
    //toString
    public String toString (){
        return "\nBiglietti attuali: "+getNumeroBigliettiResidui();
    }
    //metodo equals

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.nomeEvento);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.prezzo) ^ (Double.doubleToLongBits(this.prezzo) >>> 32));
        hash = 53 * hash + this.numeroBigliettiVenduti;
        hash = 53 * hash + this.numeroBigliettiResidui;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Evento other = (Evento) obj;
        if (Double.doubleToLongBits(this.prezzo) != Double.doubleToLongBits(other.prezzo)) {
            return false;
        }
        if (this.numeroBigliettiVenduti != other.numeroBigliettiVenduti) {
            return false;
        }
        if (this.numeroBigliettiResidui != other.numeroBigliettiResidui) {
            return false;
        }
        return Objects.equals(this.nomeEvento, other.nomeEvento);
    }
    
    
    
    
}
