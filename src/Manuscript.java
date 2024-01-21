import java.util.Scanner;

class Manuscript {
    final String author;
    final String name;

    // Parameterized constructor
    public Manuscript(String author, String name) {
        this.author = author;
        this.name = name;
    }

    // Getter for author


    // Override the method toString
    @Override
    public String toString() {
        return String.format("Manuscript;%s;%s", author, name);
    }
}

class PublishedBook extends Manuscript {
    private final String publisher;
    private final int pagesNumber;

    // Parameterized constructor
    public PublishedBook(String author, String name, String publisher, int pagesNumber) {
        super(author, name);
        this.publisher = publisher;
        this.pagesNumber = pagesNumber;
    }

    // Override the method toString
    @Override
    public String toString() {
        return String.format("PublishedBook;%s;%s;%s;%d", this.author, this.name, publisher, pagesNumber);
    }


}

class ElectronicBook extends Manuscript {
    private final String format;
    private final int size;

    // Parameterized constructor
    public ElectronicBook(String author, String name, String format, int size) {
        super(author, name);
        this.format = format;
        this.size = size;
    }

    // Override the method toString
    @Override
    public String toString() {
        return String.format("ElectronicBook;%s;%s;%s;%d", this.author, this.name, format, size);
    }
}

class Solution {
    public static Manuscript getManuscript(String inputLine) {
        try (Scanner sc = new Scanner(inputLine)) {
            sc.useDelimiter(";");
            int id = sc.nextInt();
            String author = sc.next();
            String name = sc.next();

            if (id == 1) {
                String publisher = sc.next();
                int pagesNumber = sc.nextInt();
                return new PublishedBook(author, name, publisher, pagesNumber);
            } else if (id == 2) {
                String format = sc.next();
                int size = sc.nextInt();
                return new ElectronicBook(author, name, format, size);
            } else {
                return new Manuscript(author, name);
            }
        }
    }
}
