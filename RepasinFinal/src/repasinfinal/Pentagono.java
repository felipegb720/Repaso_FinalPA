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
public class Pentagono implements Polygon_Interface {

    
    double  Radio, L, Ap;
    // MAINVCONSTRUCTOR NULL IN CASE OF NO NEED HERE ;)
    public Pentagono(double L, double Rad){
        this.L = L;
        this.Radio = Radio;
    }
    
    @Override
    public double Area() {
        
        Ap = Math.sqrt(Math.pow(Radio,2) - Math.pow(Radio,2)); // calculo apotema
        
        return (Perimeter()*Ap)/2;
        
    }
    
    @Override
    public double Perimeter() {
        
        return (5 * L); 
    }
}
    

