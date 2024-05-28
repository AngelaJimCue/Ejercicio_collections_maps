package collectionsymaps;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Persona implements Comparable<Persona>{
	private String nombre;
	private int anoNacimiento;
	
	
	public Persona(String nombre, int anoNacimiento) {
		this.nombre = nombre;
		this.anoNacimiento = anoNacimiento;
	}
	
	
	@Override
	public String toString() {
		return String.format("Persona{nombre = %s, año = %d}", nombre, anoNacimiento);
	}
	
	
	public int compareTo (Persona p) {
		if (p.nombre.length() - this.nombre.length() == 0) {
			return p.anoNacimiento - this.anoNacimiento;
		}else {
			return this.nombre.length() - p.nombre.length();
		}
	}
	
	
	
	public static void main(String[] args) {
		Persona [] personas = {
			new Persona	("Juan", 1970),
			new Persona ("Pedro", 2002),
			new Persona ("Antonio", 1999),
			new Persona ("Juan",1982),
			new Persona ("Pedro",1970),
			new Persona ("Maria",2002),
			new Persona ("Luz",2013),
			new Persona ("Rocio",1993),
			new Persona ("Maria",1882),
			new Persona ("Rosa",2005),
		};
		
		Arrays.sort(personas);		
		for (Persona persona : personas) {
			System.out.println(persona);
		}
		
		
		System.out.println();
		System.out.println("HashSet");
		System.out.println("-------");
		Set<Persona> hashSetPersonas = new HashSet<>(Arrays.asList(personas));
		for (Persona persona : hashSetPersonas) {
			System.out.println(persona);
		}
		
		System.out.println();
		System.out.println("TreeSet");
		System.out.println("-------");
		Set<Persona> treeSetPersonas = new TreeSet<>(Arrays.asList(personas));
		for (Persona persona : treeSetPersonas) {
			System.out.println(persona);
		}
		
	}


	
	
	
	
}
