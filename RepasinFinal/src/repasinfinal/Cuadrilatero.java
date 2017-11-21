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
public class Cuadrilatero implements Polygon_Interface {

    double L1 , L2;
    
    
     // MAINVCONSTRUCTOR NULL IN CASE OF NO NEED HERE ;)
    
    public Cuadrilatero(double l1, double l2){
        this.L1 = l1;
        this.L1 = l2;
    }
    @Override
    public double Area() {
        
        return L2*L2;
    }

    @Override
    public double Perimeter() {
        
       return 2*(L1)+ 2*(L2);
    }
    
}
