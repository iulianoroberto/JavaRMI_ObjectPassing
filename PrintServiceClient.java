import java.rmi.*;
import java.net.*;

public class PrintServiceClient {

	public static void main(String[] args) {
		try {
			PrintService ps = (PrintService)Naming.lookup("rmi://127.0.0.1/printservice");

			// Si crea un oggetto Person prima di trasferirlo
			Person p = new Person("Roberto", "Iuliano", 25);

			// Si trasferisce l'oggetto Person referenziato da p
			ps.print(p);
		} catch(RemoteException e) {
			System.err.println("Registry could not be contacted");
		} catch(MalformedURLException e) {
			System.err.println("Wrong URL for binding");
		} catch(NotBoundException e) {
			System.err.println("Object not bound");
		}

	}

}
