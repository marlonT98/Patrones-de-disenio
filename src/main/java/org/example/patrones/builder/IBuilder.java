package org.example.patrones.builder;
//<T>= le estamos diciendo que se podra implementar en cualquier clase
public interface IBuilder<T> {

    public T build();//este es el que se encargara de juntar todos los objetos

}
