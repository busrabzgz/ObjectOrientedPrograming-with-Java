package org.example.studies.oopApplications.libraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class LibrarySystem {
    private List<Book> books;
    private List<Author> authors;
    private List<User> users;
    private List<LibraryPersonnel> libraryPersonnels;

//    public LibrarySystem(List<Book> books, List<Author> authors, List<User> users, List<LibraryPersonnel> libraryPersonnels) {
//        this.books = books;
//        this.authors = authors;
//        this.users = users;
//        this.libraryPersonnels = libraryPersonnels;
//    }

    public LibrarySystem(){
        books=new ArrayList<>();
        authors=new ArrayList<>();
        users=new ArrayList<>();
        libraryPersonnels=new ArrayList<>();
    }

    public void addBook(Book book){
        this.books.add(book);
    }

    public void removeBook(Book book){
        this.books.remove(book);
    }
    public void addUser(User user){
        this.users.add(user);
    }
    public void removeUser(User user){
        this.users.remove(user);
    }
    public void addLibraryPersonnel( LibraryPersonnel libraryPersonnel){
        this.libraryPersonnels.add(libraryPersonnel);

    }

    public void  listBooks(){
        System.out.println("********************BOOKS***************");
        for (Book book:this.books){
            book.printBookInfo();
        }
    }

    public void listAuthors(){
        System.out.println("*****************AUTHORS*****************");
        for (Author author:this.authors){
            author.printAuthorInfo();
        }
    }

    public void listUsers(){
        System.out.println("****************USERS*********************");
        for (User user:this.users){
            user.printUserInfo();
        }
    }


    public void addAuthor(Author author) {
        this.authors.add(author);
    }

    public void listLibraryPersonnel() {
        System.out.println("**************LIBRARY PERSONNEL***********");
        for (LibraryPersonnel libraryPersonnel:this.libraryPersonnels){
            libraryPersonnel.printLibraryPersonnelInfo();
        }
    }
}
