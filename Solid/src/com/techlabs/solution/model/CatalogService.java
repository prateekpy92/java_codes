package com.techlabs.solution.model;


class CatalogService implements Catalogable {
    @Override
    public void catalogBook(Book book) {
        // Cataloging logic
        System.out.println("Cataloging book: " + book.getTitle());
    }
}