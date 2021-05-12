/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainmensa;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Gopalakrishnan
 */
public class BanconeBuffer 
{
    protected static Semaphore semaforoPresenzaPiatto = new Semaphore(1); //semaforo che ci farà o non ci farà accedere alla risorsa
    
    //variabile che ha lo scopo di un "flag" per indicarci se il bancone è occupato o no (1 si, 2 no)
    //questa variabile ci permetterà ANCHE di mettere un limite di piatti sul bancone INSIEME al semaforo 
    protected static int buffer = 5; 
}
