package com.techlabs.solution.model;

class EBook extends Book {
    private String downloadLink;

    public EBook(String title, String author, String downloadLink) {
        super(title, author);
        this.downloadLink = downloadLink;
    }

    // Additional methods specific to EBook
    public String getDownloadLink() {
        return downloadLink;
    }
}

class PrintedBook extends Book {
    private String shelfLocation;

    public PrintedBook(String title, String author, String shelfLocation) {
        super(title, author);
        this.shelfLocation = shelfLocation;
    }

    // Additional methods specific to PrintedBook
    public String getShelfLocation() {
        return shelfLocation;
    }
}
