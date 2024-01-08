import java.rmi.*;
import java.rmi.server.*;

/*
 * Implementazione dell'interfaccia
 */

public class PrintServiceImpl extends UnicastRemoteObject implements PrintService {

	private static final long serialVersionUID = 1L;
	public PrintServiceImpl() throws RemoteException {}
	
	// Definisco il corpo del metodo print
	public void print(Person obj){
		// Stampo sullo stdout del server un oggetto
		System.out.println(obj);
	}
	
	// Definisco il corpo del metodo print
	public void print(String msg){
		// Stampo sullo stdout del server una stringa
		System.out.println(msg);
	}

}
