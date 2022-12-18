package com.cleancode;

import entity.Address;
import entity.Employee;

public class ParameterObject {

    public static void main(String[] args){

        getEmployeeAddress(new Employee("John", "Doe"), new Address("Iuliu Maniu", "244G", "Bucuresti","Bucuresti"));

    }

    public static void getEmployeeAddress(Employee employee, Address address){

        System.out.println(employee.getFullName().asCorporateName());
        System.out.println(address.getCity() + " " + address.getStreet() + " " + address.getNumber());

    }

}
