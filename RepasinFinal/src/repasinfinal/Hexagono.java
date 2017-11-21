/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasinfinal;

/**
 *
 * @author Felipe
 */
public class Hexagono implements Polygon_Interface {

    double Rad, L, AP;
    
   // MAIN CONSTRUCTOR NULL IN CASE OF INSERT NULL.L
    public Hexagono(double Lado, double Radio){
        this.L = Lado;
        this.Rad = Radio;
    }
    @Override
    public double Area() {
        
        AP = Math.sqrt(Math.pow(Rad,2) - Math.pow(L,2));
        return (Perimeter()*AP)/2;
    }

    @Override
    public double Perimeter() {
        
       return( 6*L); 
    }
}
