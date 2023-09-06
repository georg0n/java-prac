package ru.mirea.prac1;

public class TestBook {
    public static void main(String[] args){
        Book bo1 = new Book("Dostoevskiy", 320);
        Book bo2 = new Book("King", 231);
        Book bo3 = new Book("Lermontov");
        bo3.setPages(23);
        System.out.println(bo1);
        System.out.println(bo2);
        System.out.println(bo3);
    }
}
