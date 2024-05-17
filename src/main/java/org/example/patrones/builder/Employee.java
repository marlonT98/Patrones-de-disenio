package org.example.patrones.builder;

import org.example.patrones.builder.domain.Address;
import org.example.patrones.builder.domain.Contact;
import org.example.patrones.builder.domain.Phone;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private int age;
    private String name;
    private String genero;
    private Address address;
    private List<Phone> phones;
    private List<Contact> contacts;

    public Employee() {
    }

    public Employee(int age, String name, String genero, Address address, List<Phone> phones, List<Contact> contacts) {
        this.age = age;
        this.name = name;
        this.genero = genero;
        this.address = address;
        this.phones = phones;
        this.contacts = contacts;
    }

    //creamos una clase interna
    //con este contructor de empleados vamos a crear el addres , phones y contacts
    public static class EmployeeBuilder implements IBuilder {

        //ponemos los mismos atributos que tenemos en nuestra clase
        private int age;
        private String name;
        private String genero;
        private Address address;
        private List<Phone> phones = new ArrayList<>();
        private List<Contact> contacts = new ArrayList<>();

        //tenemos que declarar un contructor vacio
        public EmployeeBuilder() {
        }

        //tendremos metodos que devuelvan un objeto de tipo (employeeBuilder)

        //lo que estamos es seteando su edad de este objeto
        public EmployeeBuilder setAge(int age) {//me manda la edad
            this.age = age;//me vas a setear en esta edad (this.age)
            return this;//me mandas el objeto actual con el que estamos trabajando

        }


        public EmployeeBuilder setName(String name) {
            this.name = name;
            return this;
        }


        public EmployeeBuilder setGenero(String genero) {
            this.genero = genero;
            return this;
        }

        //Primer forma
        public EmployeeBuilder setAddress(Address address) {
            this.address = address;
            return this;
        }

        //segunda forma
        public EmployeeBuilder setAddress(String address, String city, String country, String cp) {
            this.address = new Address(address, city, country, cp);
            return this;
        }


        //Primera forma
        public EmployeeBuilder setPhone(Phone phone) {
            this.phones.add(phone);
            return this;
        }

        //segunda forma
        public EmployeeBuilder setPhone(String phoneNumber, String ext, String phoneType) {
            this.phones.add(new Phone(phoneNumber, ext, phoneType));
            return this;
        }

        //primer forma
        public EmployeeBuilder setContact(Contact contact) {
            this.contacts.add(contact);
            return this;
        }

        //segunda forma
        public EmployeeBuilder setContact(String name, Phone phone, Address address) {

            this.contacts.add(new Contact(name, phone, address));
            return this;

        }


        @Override
        public Employee build() {
            return new Employee(age, name, genero, address, phones, contacts);
        }
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "\n, age=" + age +
                "\n, name='" + name + '\'' +
                "\n, genero='" + genero + '\'' +
                "\n, address=" + address +
                "\n, phones=" + phones +
                "\n, contacts=" + contacts +
                "}";
    }
}
