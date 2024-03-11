package org.example.patrones.singleton;

//la idea es tener una sola instancia de esta clase
public class ConexionBDSingleton {

    //atributo estatico para poder ser utilizado en toda la clase
    private static ConexionBDSingleton instancia;//objeto de esta clase


    //para no poder crear una instancia de esta clase
    private ConexionBDSingleton() {
        System.out.println("conectandose a algun motor de una base de datos");
    }


    public static ConexionBDSingleton getInstance() {

        if (instancia == null) {//es que no existe la instancia
            //crear la instancia
            instancia = new ConexionBDSingleton();//aqui si podemos llamar al contructor pero no desde fuera
        }

        return instancia;


    }












}
