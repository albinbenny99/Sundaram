package com.model;

public class Book{
    private String bookId,title,author,category;
    float price;
    public Book(String bookId, String title, String author, String category, float price){
        this.bookId=bookId;
        this.title=title;
        this.author=author;
        this.category=category;
        this.price=price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId='" + bookId + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
