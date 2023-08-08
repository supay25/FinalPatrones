/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalpatrones;

/**
 *
 * @author luisd
 */
public class Producto {
    String Prenda;
    String Marca;
    int Codigo;
    float Precio;
    
    
     public Producto(String Prenda, String Marca, int Codigo, float Precio) {
   		 
        this.Prenda=Prenda;
        this.Marca=Marca;
        this.Codigo=Codigo;
        this.Precio=Precio;
        
     }  
     
     
    public String getPrenda(){
   	    return Prenda;
   	}
    public String getMarca(){
   	    return Marca;
   	}
    public int getCodigo(){
        return Codigo;
    }
    public float getPrecio(){
        return Precio;
    }
    
    
}
