package com.techlabs.solution.model;
class User {
    private String name;
    private String userId;
    private Borrowable borrowingService;

    public User(String name, String userId, Borrowable borrowingService) {
        this.name = name;
        this.userId = userId;
        this.borrowingService = borrowingService;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getUserId() {
        return userId;
    }

    // Borrow and return books using BorrowingService
    public void borrowBook(Book book) {
        borrowingService.borrowBook(book, this);
    }

    public void returnBook(Book book) {
        borrowingService.returnBook(book, this);
    }
}
