package com.service;
import  com.model.Book;

import java.util.ArrayList;


public class BookStoreDemo {
    ArrayList<Book> ar=new ArrayList<>() ;
    Book b;
    public void addBook(Book b){
        ar.add(b);

    }
    String title;
    public void searchByTitle(String title){
        for(Book b:ar){
            if(b.getTitle().equals(title)){
                System.out.println(b);
            }
            else{
                System.out.println("book not found");
            }


        }
    }
    String Author;
    public void searchByAuthor(String Author){
        for(Book b:ar){
            if(b.getAuthor().equals(Author)){
                System.out.println(b);
            }
            else {
                System.out.println("book not found");
            }


        }
    }
   public void display(){
//        System.out.println(ar);
       for(Book b:ar){
           System.out.println(b);
       }

    }







}
