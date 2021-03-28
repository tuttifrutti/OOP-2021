package com.company;

public class ClassBook_Main {

    public static void main(String[] args) {
	// write your code here
        ClassBook book1 = new ClassBook();
        book1.setAuthor("Shakespare");
        book1.setChapterNames(new String[] {"Hamlet", "Macbeth", "Romeo And Juliet"});
        ClassBook book2 = new ClassBook("Jane Austin", new  String[] {"Pride and Prejudice", "Sense and Sensibilty", "Emma A Novel","Persuasion"});
        ClassBook book3 = new ClassBook();
        System.out.println("Are authors of the two books same? " + book3.compareBooks(book1,book2));
        System.out.println("Book with greater number of chapters is " + book3.compareChapterNames(book1,book2));
    }
}
