package com.techlabs.solution.model;

class BorrowingService implements Borrowable {
    @Override
    public void borrowBook(Book book, User user) {
        if (!book.isBorrowed()) {
            book.setBorrowed(true);
            System.out.println(user.getName() + " borrowed " + book.getTitle());
        } else {
            System.out.println(book.getTitle() + " is already borrowed.");
        }
    }

    @Override
    public void returnBook(Book book, User user) {
        if (book.isBorrowed()) {
            book.setBorrowed(false);
            System.out.println(user.getName() + " returned " + book.getTitle());
        } else {
            System.out.println(book.getTitle() + " was not borrowed.");
        }
    }
}