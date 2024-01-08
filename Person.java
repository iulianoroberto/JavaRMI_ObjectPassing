import java.io.*;

/*
 * Si definisce la classe Person. Affinché possano essere trasferiti oggetti di questo tipo al metodo remoto bisogna fare in modo che
 * la classe implmenti Serializable (un'interfaccia marker che viene usata dalla serializzazione Java). Bisogna mettere in piedi un
 * processo di marshalling che in Java è realizzato per mezzo della Java Serialization.
 * 
 * Il codice è il tipo di una classe che funziona da bean, classe di oggetti che rappresentano dati e in quanto tali si hanno
 * variabili di istanza (firstname e lastname) a cui si fanno corrispondere i metodi get e set per operare il lettura e scrittura su
 * queste proprietà.
 * 
 * In generale, quando si parla di bean (oggetti che rappresentano dati), il costruttore senza argomenti è opportuno prevederlo
 */

// La cosa più rilevante è Serializable che permette che istanze di questa classe possano essere usati come paremtri di metodi remoti
public class Person implements Serializable{

	private static final long serialVersionUID = 1L;
	private String firstname;
	private String lastname;
	private int age;

	// Costrutture senza argomenti
	public Person() {	}

	// Costruttore
	public Person(String fn, String ln, int a) {
		firstname = fn;
		lastname = ln;
		age = a;
	}

	// Metodi get e set
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	// Metodo di servizio
	@Override
	public String toString() {
		return "Person [firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + "]";
	}
	
}
