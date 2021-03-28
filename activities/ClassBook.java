package com.company;

public class ClassBook {
    private String author;
    private String chapterNames[] = new String[100];
    public ClassBook(){
    }
    public ClassBook(String a, String[] array){
        author = a;
        chapterNames = array;
    }
    public void setAuthor(String a) {
        author = a;
    }
    public void setChapterNames(String[] array) {
        chapterNames = array;
    }
    public String getAuthor(){
        return author;
    }
    public String[] getChapterNames() {
        return chapterNames;
    }
    public boolean compareBooks(ClassBook B_a, ClassBook B_b){
        if (B_a.author != B_b.author) {
            return false;
        }
        else {
            return true;
        }
    }
    public int compareChapterNames(ClassBook B_a, ClassBook B_b) {
        if (B_a.chapterNames.length > B_b.chapterNames.length){
            System.out.println("Author of the book with greater chapters is " + B_a.getAuthor());
            return B_a.chapterNames.length;
        }
        else {
            System.out.println("Author of the book with greater chapters is " + B_b.getAuthor());
            return B_b.chapterNames.length;
        }
    }
}
