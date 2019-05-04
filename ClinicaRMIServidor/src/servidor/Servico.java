package servidor;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import comum.ServicoRemotoImpl;

public class Servico {

	public Servico() throws RemoteException{
		try {
			LocateRegistry.createRegistry(8008);
			System.out.println("Inicio");
			Naming.rebind("rmi://localhost:8008/pessoa", new ServicoRemotoImpl());
			System.out.println("FIM");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws RemoteException{
		new Servico();
	}
}
