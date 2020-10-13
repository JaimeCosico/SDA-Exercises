package com.example;

public class Poem{
    // field to be set/returned by the this Poem Class.
    private int stropheNumbers;

    // field to be set/returned by the this Poem Class. Note: You can pass an object as a returned value.
    private Author author;

    //You need to create a constructor without parameter because the default will be deleted once you create an
    //instance in the main class. This is a constructor without a parameter.
    public Poem(){

    }

    //This is a constructor with parameters or parameterized constructor. We can use a parameterized constructor here since
    //we are going to use this since we need to borrow the fields of the Author class.
    public Poem(Author _author,int _stropheNumbers){
       this.stropheNumbers=_stropheNumbers;
       this.author=_author;
   }

    //This is a getter method that returns the Author object with 2 fields.
    //we can't return 2 variables separately but we can return an multiple variables using an object.
   public Author getAuthor(){
        return author;
   }

   //This is a getter method that returns stropheNumbers variable built in this class.
   public int getStropheNumbers(){
        return stropheNumbers;
   }
}
