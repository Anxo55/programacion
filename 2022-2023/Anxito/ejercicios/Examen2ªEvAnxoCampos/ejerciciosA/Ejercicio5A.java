package ejerciciosA;

// Programa que permita con un menú y usando una mlista dinámica:
// a/ poblar la lista con los nombres y las notas de varios alumnos
// (como mínimo 5)
// b/ añadir un alumno
// c/ Mostrar los nombres y notas de todos
// d/ ordenar la lista en orden alfabético
// e/ ordenar la lista por notas
// f/ eliminar un alumno (introduciendo el nombre)
// Use la clase auxiliar Alumno.java

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio5A {
	
	static ArrayList<Alumno> lista = new ArrayList<>();
	
	static void añadirAlumno() {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("nombre: ");
		String nombre=sc.nextLine();
		System.out.println("Nota: ");
		int nota=Integer.parseInt(sc.nextLine());
		Alumno alu=new Alumno(nombre, nota);
		lista.add(alu);
	}
	
	public static void mostrarLista() {
		for (Alumno a:lista) {
			System.out.println(a.toString());
		}
	}
	
	
	static void ordenaNombre() {
		Collections.sort(lista);
	}
	
	static void eliminaAlumno() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Alumno a eliminar: ");
		String nombre=sc.nextLine();
		
		for(Alumno a:lista) {
			if (a.getNombre().equals(nombre))
				lista.remove(a);
		}
	}
	
	public static void main(String[] args) {
		for(int i=0;i<5;i++)
			añadirAlumno();
		
		ordenaNombre();
		mostrarLista();
		eliminaAlumno();
		mostrarLista();
		
	}

}