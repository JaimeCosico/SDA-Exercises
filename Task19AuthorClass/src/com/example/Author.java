package com.example;

public class Author {
    private String surname,nationality; //declare fields for return.

    //this is a setter method that accepts surname. "this." is used to mark that you are using the surname variable within the class.
    public void setSurname(String surname){
        this.surname=surname;
    }

    //this is a setter method that accepts nationality. "this." is used to mark that you are using the surname variable within the class.
    public void setNationality(String _nationality){
        this.nationality=_nationality;
    }

    //this is a getter method that returns the value surname. How to access in main: Author <variable> = new Author();
    //<variable>.getSurname();

    public String getSurname(){

        return surname;
    }

    //this is a getter method that returns the value surname. How to access in main: Author <variable> = new Author();
    //<variable>.getNationality();

    public String getNationality(){

        return nationality;
    }
}
