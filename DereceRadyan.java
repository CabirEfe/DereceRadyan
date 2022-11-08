/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.Scanner;
public class DereceRadyan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner enes = new Scanner(System.in);
        System.out.println("Hoşgeldiniz");
        System.out.println("Lütfen Derece Değerini Griniz: ");
        double derece = enes.nextDouble();
        
        
        double pi = 3.14;
        
        
        double radyan = derece * pi / 180;
        double gradyan = derece * 10 / 9;
        System.out.println("Radyan Cinsinden Değeri: "+radyan);
        System.out.println("Gradyan Cinsinden Değeri: "+ gradyan);
        
        
        
        
    }
    
}
