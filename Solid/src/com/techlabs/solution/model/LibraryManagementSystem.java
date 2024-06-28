package com.techlabs.solution.model;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Create services
        BorrowingService borrowingService = new BorrowingService();
        CatalogService catalogService = new CatalogService();
        RegistrationService registrationService = new RegistrationService();

       
        Book book1 = new PrintedBook("The Catcher in the Rye", "J.D. Salinger", "A1");
        Book book2 = new EBook("1984", "George Orwell", "http://ebooklink.com/1984");

        catalogService.catalogBook(book1);
        catalogService.catalogBook(book2);

        User user = new User("John Doe", "12345", borrowingService);

        
        registrationService.registerUser(user);

        
        user.borrowBook(book1);
        user.returnBook(book1);

        user.borrowBook(book2);
        user.returnBook(book2);
    }
}
