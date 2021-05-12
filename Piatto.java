/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainmensa;

/**
 *
 * @author informatica
 */
public class Piatto 
{
    protected static int numeroPiatto = 1;
    
    //add che ci permette di aumentare i piatti in modo sincronizzato

    public synchronized static void addPiatto() 
    {
        numeroPiatto++;
    }
    
    
}
