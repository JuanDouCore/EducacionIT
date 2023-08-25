package desafiojava2.principal;

import desafiojava2.domain.Alumno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de alumnos a cargar: ");
        int cantidadAlumnos = scanner.nextInt();

        Alumno[] alumnos = new Alumno[cantidadAlumnos];

        for(int i=0; i<cantidadAlumnos; i++) {
            System.out.println("Cargando datos del alumnos #" + (i+1));

            System.out.println("Ingrese nombre: ");
            String nombre = scanner.next();

            System.out.println("Ingrese apellido: ");
            String apellido = scanner.next();

            System.out.println("Ingrese numero de examen: ");
            int nroExamen = scanner.nextInt();

            System.out.println("Ingrese nota: ");
            double nota = scanner.nextDouble();
            while (nota < 0 || nota > 10) {
                System.out.println("La nota debe ser mayor o igual que 0 y menor o igual que 10");
                System.out.println("Ingrese nota: ");
                nota = scanner.nextDouble();
            }

            alumnos[i] = new Alumno(nombre, apellido, nroExamen, nota);
        }

        Alumno mayorNota = alumnos[0];
        Alumno menorNota = alumnos[0];

        for (int i = 0; i < alumnos.length; i++) {
            if(alumnos[i].getNota() > mayorNota.getNota())
                mayorNota = alumnos[i];

            if(alumnos[i].getNota() < menorNota.getNota())
                menorNota = alumnos[i];
        }

        System.out.println("El alumno con la mayor nota fue: " + mayorNota.getNombreCompleto() + " con una nota de " + mayorNota.getNota());
        System.out.println("El alumno con la menor nota fue: " + menorNota.getNombreCompleto() + " con una nota de " + menorNota.getNota());

        System.out.println("Alumnos que promocionan: ");
        for(Alumno alumno : alumnos) {
            if(alumno.getNota() >= 7)
                System.out.println(alumno.getNombreCompleto() + " " + alumno.getNota());
        }

        System.out.println("Alumnos que deben recursar: ");
        for(Alumno alumno : alumnos) {
            if(alumno.getNota() < 7)
                System.out.println(alumno.getNombreCompleto() + " " + alumno.getNota());
        }
    }
}