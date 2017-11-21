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
public class Shape_Fabric {
    
    public void CreateRectagles(double L1, double  L2){   
        
                 // llamada a instanciaas y constructores en clase

        Cuadrilatero ElCuadrilatero = new Cuadrilatero(L1, L2);
        Rectangulo ElRectangulo = new Rectangulo(L1, L2);  
    }
    
     public void CreateTriangles(int L1, int L2, int L3){   
         // llamada a instanciaas y constructores en clase
        Triangle ElTriangulo = new Triangle( L1,  L2,  L3);
        Triangulo_Equilatero ElTrianguloEquilatero = new Triangulo_Equilatero(L1,  L2,  L3);
        Triangulo_Isoceles ElTrianguloIsoceles = new Triangulo_Isoceles(L1,  L2,  L3);
    }
     
     public void CreatePoligono(double Lad, double Rad){
         
                  // llamada a instanciaas y constructores en clase

        Hexagono ElHexagono = new Hexagono(Lad, Rad);
        
        Pentagono ElPentagono = new Pentagono(Lad, Rad);                
        

    }
    
    
    
}
