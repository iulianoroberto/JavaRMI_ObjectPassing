import java.rmi.*;

/*
 * Questa è la definizione dell'interfaccia che definisce il prototipo di due metodi.
 */

public interface PrintService extends Remote{
	// Metodo utilizzato per il passaggio remoto di una stringa
	public void print(String msg) throws RemoteException;
	// Metodo per il passaggio remoto di un oggetto di tipo Person
	public void print(Person obj) throws RemoteException;
}
