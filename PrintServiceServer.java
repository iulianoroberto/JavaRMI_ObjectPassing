import java.rmi.*;
import java.net.*;
import java.rmi.registry.*;

public class PrintServiceServer {

	public static void main(String[] args) {
		try {
			PrintService ps = new PrintServiceImpl();
			LocateRegistry.createRegistry(1099);
			Naming.bind("rmi://127.0.0.1/printservice", ps);
		} catch(AccessException e) {
			System.err.println("Bind operation not permitted");
		} catch(RemoteException e) {
			System.err.println("Registry could not be contacted");
		} catch(MalformedURLException e) {
			System.err.println("Wrong URL for binding");
		} catch(AlreadyBoundException e) {
			System.err.println("Object already bound to the registry");
		}

	}

}
