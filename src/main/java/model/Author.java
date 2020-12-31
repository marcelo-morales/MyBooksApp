package model;

import java.util.Objects;

public class Author {
    private String name;
    private int numberOfBooks;
    private String nationality;

    public Author(String name, int numberOfBooks, String nationality) {
        this.name = name;
        this.numberOfBooks = numberOfBooks;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public String getNationality() {
        return nationality;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return numberOfBooks == author.numberOfBooks &&
                Objects.equals(name, author.name) &&
                Objects.equals(nationality, author.nationality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numberOfBooks, nationality);
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", numberOfBooks=" + numberOfBooks +
                ", nationality='" + nationality + '\'' +
                '}';
    }


}
