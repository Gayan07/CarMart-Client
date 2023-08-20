package services.client;

import services.rmiInterface.TheInterface;
import util.utility.AlertPopUp;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


/**
 * Basic Example of an RMI Client
 * @author Marc Conrad
 *
 */
public class RMIClient {
	public static TheInterface theInterface;
	public static void startClient(){
		System.out.println("(1) Starting the Client...");
		try {
			Registry registry = LocateRegistry.getRegistry(2021);
			theInterface  =   (TheInterface) registry.lookup("rmi://localhost/CarMartServer");
			System.out.println("The Server says: "+theInterface.getGreeting());
			System.out.println("User :" + theInterface.printBanner("Gayan"));

//			System.out.println(theInterface.getInstance());

		} catch (Exception e) {
			AlertPopUp.insertionFailed(e, "Server Connection Status Server Connection Failed.\n Please Contact Your Administrator!");
//			System.out.println(e);
			e.printStackTrace();
		}
		System.out.println("(4) Exiting the Client. Thank you");
	}

}
