/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isaac
 */
public class Pizzeria {

    //main
    //psvm + tab
    public static void main(String[] args) { // metodo principal de la clase

        //System.out.println("hola mundo");
        Pizza objPizza1 = new Pizza();//Crear objetos objPizza1
        Pizza objPizza2 = new Pizza();

        Pizza pizza3 = new Pizza("Napolitana", "Muy Grande", "Rellena con queso");

        //objPizza1.nombre = "Peperoni";
        objPizza1.setNombre("Pepperoni");
        //objPizza1.masa = "Gruesa";
        objPizza1.setMasa("Gruesa");
        //objPizza1.tamaño = "Grande";
        objPizza1.setTamaño("Grande");
        //System.out.println("Nombre:" + objPizza1.nombre);

        //objPizza2.nombre = "Vegetariana";
        objPizza2.setNombre("Vegetariana");
        //objPizza2.masa = "Delgada";
        objPizza2.setMasa("Delgada");
        //objPizza2.tamaño = "Familiar";
        objPizza2.setTamaño("Familiar");

        objPizza1.calentar(); //usando metodos de la clase con objetos
        objPizza2.calentar();
        pizza3.calentar();
        System.out.println("Nombre Pizza 1 :" + objPizza1.getNombre());
        System.out.println("Nombre Pizza 1 :" + objPizza2.getNombre());
    }

}
