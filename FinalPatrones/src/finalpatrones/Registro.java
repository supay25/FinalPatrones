/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalpatrones;

public class Registro extends Producto {
   
    int Factura;
    
    
    public Registro( int Factura, String Prenda, String Marca, int Codigo, float Precio){
       
       super(Prenda, Marca, Codigo, Precio);
       this.Factura=Factura;
       
   }
    public int getFacturas(){
        return Factura;
    }
    
}
