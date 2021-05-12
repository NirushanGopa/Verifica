/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainmensa;

import java.util.ArrayList;

/**
 *
 * @author informatica
 */
public class MainMensa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException 
    {
       ArrayList <Dipendenti> listaDipendenti = new ArrayList<>(); //creazione array per agevolare gli start e i join 
       
       Cuoco c = new Cuoco(); // creazione di un solo cuoco
       
       Dipendenti d1 = new Dipendenti(); //creazione primo dipendente
       Dipendenti d2 = new Dipendenti(); //creazione secondo dipendente
       Dipendenti d3 = new Dipendenti(); //creazione terzo dipendente
       Dipendenti d4 = new Dipendenti(); //creazione quarto dipendente
       Dipendenti d5 = new Dipendenti(); //creazione quinto dipendente 
       
       listaDipendenti.add(d1);
       listaDipendenti.add(d2);
       listaDipendenti.add(d3);
       listaDipendenti.add(d4);
       listaDipendenti.add(d5);
       
       c.start(); //startiamo il cuoco
       
       //start automatico di tutti i dipendenti
       
       for(int i = 0; i < listaDipendenti.size(); i++)
       {
           listaDipendenti.get(i).start();
       }
       
       
        //join automatico di tutti i dipendenti
       
       for(int i = 0; i < listaDipendenti.size(); i++)
       {
           
           try 
           {
               
                listaDipendenti.get(i).join();
               
           } catch (Exception e) 
           {
               
           }
           
       }
       
       System.out.println("\nFINE PAUSA PRANZO");
    }
    
}
