public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Author(String fullName) {
        String[] parts = fullName.split(" ", 2);
        this.name = parts[0];
        this.surname = parts.length > 1 ? parts[1] : "";
    }

    public void print() {
        System.out.println("Author: " + name + " " + surname);
    }
}