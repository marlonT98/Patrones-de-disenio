package org.example.patrones.builder;

import org.example.patrones.builder.domain.Address;
import org.example.patrones.builder.domain.Contact;
import org.example.patrones.builder.domain.Phone;

public class Main {
    public static void main(String[] args) {


        Employee employee =  new Employee.EmployeeBuilder()
                .setAge(23)
                .setName("jose")
                .setGenero("M")
                .setAddress( new Address("calle 9","lima","peru","050030"))
                .setAddress("calle 9","la paz","Bolivia","050030")
                .setPhone( new Phone( "97543422","1002","Fijo"))
                .setPhone("97543422","1002","celular")
                .setContact(
                        new Contact("jose",
                        new Phone("98734343","1002","celular"),
                        new Address("calle 49","medellin","colombia","050030"))
                )
                .build();

        System.out.println("employee = " + employee);



    }
}
