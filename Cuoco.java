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
public class Cuoco extends Thread
{

    public static void stampaInfoprmazioni()
    {
        System.out.println("\nIl piatto n " + Piatto.numeroPiatto + " è pronto");   
    }
}
