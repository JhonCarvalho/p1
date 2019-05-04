package comum;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class ServicoRemotoImpl extends UnicastRemoteObject implements IServicoRemoto {

	/**
	 * 
	 */
	private static final long serialVersionUID = 275298353359706426L;
	
	private static List<Pessoa> lstPessoa = new ArrayList<>();
	
	public ServicoRemotoImpl() throws RemoteException{
		
	}
	
	@Override
	public void inserir(Pessoa p) throws RemoteException{
		lstPessoa.add(p);
	}
	
	@Override
	public List<Pessoa> listarPessoa() throws RemoteException{
		return lstPessoa;
	}
	
	
}
