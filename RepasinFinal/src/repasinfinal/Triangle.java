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
public class Triangle implements Polygon_Interface {
    
     private int LA;
     private int LB;
     private int LC;
    
 public Triangle(int L1 ,int  L2, int L3){
     
        this.LA = L1;
        this.LB = L2; 
        this.LC = L3;
    }
    
    
    @Override
    public double Area() {
        
        double q = (LA + LB + LC)/2;
        return Math.sqrt(q *(q-LA) * (q-LB) * (q-LC));
    }

    @Override
    public double Perimeter() {
        
        int perimetrotriangulo = LA + LB + LC;
        return perimetrotriangulo;
    }
    
  
    
}
