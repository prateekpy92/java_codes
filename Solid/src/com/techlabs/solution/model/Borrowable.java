package com.techlabs.solution.model;
interface Borrowable {
    void borrowBook(Book book, User user);
    void returnBook(Book book, User user);
}