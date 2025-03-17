//
//
//Collections Framework
//-----------------------------------------------------
//        1.Design a class Book in com.model package containing following private members:
//bookID	text
//title	text
//author	text
//category	text
//price	float
//
//Define public Parameterized constructor to initialize Book object.
//
//
//        2.Design a class called BookStore in com.service package which contains an appropriate collection object to store Book   Instances.
//
//Implement the below operations.
//
//        1.	addBook(Book b)
//To add a new Book object into the collection.
//
//2.	searchByTitle(String title)
//Search a book based on title and if found, display the details
//
//3.	searchByAuthor(String author)
//Search a book based on author and if found, display the details
//
//4.	displayAll()
//Print the details of all the books
//
//
//3.Create a class BookUtil in package com.bookutil which has the main method.
//
//        •	Instantiate the BookStore class
//•	Read data from user for 3 Book objects.
//Perform the below validations
//
//•	Category must be “Science”, “Fiction”, “Technology” or “Others”
//        •	Price cannot be negative
//•	bookID must start with ‘B’ and must be of length 4 characters
//
//If any of the validations fail, throw an user defined exception InvalidBookException with appropriate message(As specified in validations above).Declare this exception in com.exception package.
//
//        4.Implement below  Operations:
//
//        •	For Valid Book,Call the addBook method to add the book objects into the collection
//•	Search the books by title and author
//•	Display all the book details
//



package com.util;

import com.model.Book;
import com.service.BookStoreDemo;

public class BookUtil {
    public static void main(String[] args) {
        BookStoreDemo bd=new BookStoreDemo();
        bd.addBook(new Book("101","mahabarath","bhanubhai","fic",
                3.14f));
//       bd.display();
       bd.searchByTitle("mahabaraths");
       bd.searchByAuthor("bhanubhai");
    }

}
