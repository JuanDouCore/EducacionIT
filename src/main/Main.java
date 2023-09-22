package main;

import domain.model.CollectionCustom;

public class Main {
    public static void main(String[] args) {
        CollectionCustom<Integer> collectionCustom = new CollectionCustom<>();
        collectionCustom.add(1);
        collectionCustom.add(3);
        collectionCustom.add(5);
        collectionCustom.add(7);
        collectionCustom.add(2);

        collectionCustom.listAll();
        System.out.println("---------------------------");
        collectionCustom.addFirst(11);
        collectionCustom.listAll();
        System.out.println("---------------------------");
        collectionCustom.addLast(35);
        collectionCustom.listAll();
        System.out.println("---------------------------");

        collectionCustom.remove(5);

        collectionCustom.listAll();
        System.out.println("---------------------------");

        System.out.println("Vacia: " + collectionCustom.empty());

        System.out.println("---------------------------");
        collectionCustom.removeAll();
        System.out.println("Vacia: " + collectionCustom.empty());
    }
}