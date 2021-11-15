/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isaac
 */
public class Producto {
    
    private int codigo, precio, unidad_gramos;
    private String subcategoria, descripcion;

    public Producto() {
    }

    public Producto(int codigo, int precio, int unidad_gramos, String subcategoria, String descripcion) {
        this.codigo = codigo;
        this.precio = precio;
        this.unidad_gramos = unidad_gramos;
        this.subcategoria = subcategoria;
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if (codigo >= 4 && codigo <= 4){
            this.codigo = codigo;
        }
        else{
            System.out.println("Codigo invalido");
        }
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        if (precio > 0){
            this.precio = precio;
        }
        else{
            System.out.println("No podi ponerlo gratis, tonto");
        }
    }

    public int getUnidad_gramos() {
        return unidad_gramos;
    }

    public void setUnidad_gramos(int unidad_gramos) {
        this.unidad_gramos = unidad_gramos;
    }

    public String getSubcategoria() {
        return subcategoria;
    }

    public void setSubcategoria(String subcategoria) {
        if (subcategoria == "Fruta" && subcategoria == "Verduras"){
            this.subcategoria = subcategoria;
        }
        else{
            System.out.println("Subcategoria no existe");
        }
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", precio=" + precio + ", unidad_gramos=" + unidad_gramos + ", subcategoria=" + subcategoria + ", descripcion=" + descripcion + '}';
    }
    
    public void imprimirProducto(){
        
        System.out.println(descripcion + precio + unidad_gramos);
    }
    
    public void imprimirProducto1(){
        
        System.out.println("Total: " + precio);
        System.out.println("Productos: " + descripcion+", " + precio+", " + unidad_gramos);
        
    }

    
}
