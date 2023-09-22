package domain.model;

import java.util.Arrays;
import java.util.Random;

public class CollectionCustom<T>{

    private T[] coleccion;
    private int maximosSlots;

    public CollectionCustom() {
        maximosSlots = 1;
        coleccion = (T[]) new Object[maximosSlots];
    }

    public void listAll() {
        int i = 0;
        for(T t: coleccion) {
            if(t!=null) System.out.println(coleccion[i]);
            i++;
        }
    }

    public int size() {
        return coleccion.length-1;
    }

    public void addFirst(T element) {
        maximosSlots++;

        T[] coleccionTemporal = Arrays.copyOf(coleccion, coleccion.length);

        coleccion = (T[]) new Object[maximosSlots];

        coleccion[0] = element;

        int contadorAux = 1;
        for (T t : coleccionTemporal) {
            coleccion[contadorAux] = t;
            contadorAux++;
        }
    }

    public void add(T element) {
        maximosSlots++;

        T[] coleccionTemporal = Arrays.copyOf(coleccion, coleccion.length);

        coleccion = (T[]) new Object[maximosSlots];


        int contadorAux = 0;
        for (T t : coleccionTemporal) {
            if(t!=null) {
                coleccion[contadorAux] = t;
                contadorAux++;
            } else {
                coleccion[contadorAux] = element;
                break;
            }
        }
    }

    public void addLast(T element) {
        maximosSlots++;

        T[] coleccionTemporal = Arrays.copyOf(coleccion, coleccion.length);

        coleccion = (T[]) new Object[maximosSlots];


        int contadorAux = 0;
        for (T t : coleccionTemporal) {
            if(t!=null) {
                coleccion[contadorAux] = t;
                contadorAux++;
            } else {
                coleccion[contadorAux] = element;
                break;
            }
        }
    }

    public T remove(T element) {
        T returnElement = null;

        int iterator = 0;
        boolean encontrado = false;

        while (!encontrado) {
            if(coleccion[iterator] == element) {
                returnElement = coleccion[iterator];

                coleccion[iterator] = null;

                maximosSlots--;

                T[] coleccionTemporal = Arrays.copyOf(coleccion, coleccion.length);

                coleccion = (T[]) new Object[maximosSlots];

                int contadorAux = 0;
                for (T t : coleccionTemporal) {
                    if(t!=null) {
                        coleccion[contadorAux] = t;
                        contadorAux++;
                    }
                }

                encontrado = true;
            } else {
                iterator++;
                if(iterator == coleccion.length)
                    encontrado = true;
            }
        }

        return returnElement;
    }

    public void removeAll() {
        maximosSlots = 1;
        coleccion = (T[]) new Object[maximosSlots];
    }

    public boolean empty() {
        return coleccion[0] == null;
    }
}
