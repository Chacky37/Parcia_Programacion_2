/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sueldo;

public class Vsueldo {
    String nom,nom1;
    int sueldo=200,sueldo1,SUEl;
    float P,P1,q,q1;
    public Vsueldo(String nom,String nom1,int sul){
        this.nom=nom;
        sueldo1=sul;
        this.nom1=nom1;
        SUEl=sul;
    }
    
    public void ImpC(float h,float h1){
        P=sueldo*h;
        P1=sueldo1*h;
        
        q=sueldo*h1;
        q1=SUEl*h1;
        System.out.println("Nombre del trabajador : "+nom);
        System.out.println("HORAS TRABAJADAS = "+h);
        System.out.println("Sueldo viejo = "+P);
        System.out.println("");
        System.out.println("sueldo NUEVO = "+P1);
        
        System.out.println("");
        System.out.println("HORAS TRABAJADAS = "+h1);
        System.out.println("Nombre del segundo trabajador : "+nom1);
        System.out.println("Sueldo viejo = "+q);
        System.out.println("");
        System.out.println("sueldo NUEVO = "+P1);
    
    }
    
    
}
