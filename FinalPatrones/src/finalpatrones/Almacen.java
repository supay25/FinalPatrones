/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalpatrones;

/**
 *
 * @author luisd
 */
public class Almacen extends Producto {
    
    int Cantidad;
    int Sector;
    
    public Almacen(int Cantidad, String Prenda, String Marca, int Codigo, float Precio, boolean Estado){
        
       super(Prenda, Marca, Codigo, Precio, Estado);
       this.Cantidad=Cantidad;
       this.Sector=Sector;
        
    }
    
    public int getCantidad(){
       return Cantidad;
    }
    
    public int getSector(){
        return Sector;
    }
    
}
