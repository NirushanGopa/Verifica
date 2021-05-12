/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainmensa;

/**
 *
 * @author Gopalakrishnan
 */
public class Dipendenti extends Thread
{
    

    @Override
    public void run() 
    {
        try 
        {
            synchronized(BanconeBuffer.semaforoPresenzaPiatto)
            {

                BanconeBuffer.buffer = 1; //variabile che ha lo scopo di un "flag" per indicarci se il bancone è occupato o no (1 si, 2 no)
                
                //preparazione piatto con un tempo random di preparazione
                
                System.out.println("\nPREPARAZIONE PIATTO");
                sleep((int) Math.random()* 10); 
                
                //richiamo il thread cuoco che in modo sincronizzato stampa le sue informazioni
                
                Cuoco.stampaInfoprmazioni();
                
                
                BanconeBuffer.semaforoPresenzaPiatto.acquire(); //il semaforo sta afferma che si sta utilizzando la risorsa
                BanconeBuffer.buffer = 0; //variabile che ha lo scopo di un "flag" per indicarci se il bancone ha posto o no (1 si, 0 no)
                
                //comportamento che ci ralascia la risorsa identificata dal semaforo
                
                System.out.println("\nDipendente trova piatto sul bancone...");
                System.out.println("\nConsumo: " + Piatto.numeroPiatto);
                
                BanconeBuffer.semaforoPresenzaPiatto.release();
                
                //add che ci permette di passare al prossimo piatto
                Piatto.addPiatto();
                
                System.out.println("--------------------------------------------");
            
            }
            
            
            
        } catch (Exception e) 
        {
            
        }
    }
    

}
