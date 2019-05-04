package cliente;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import comum.IServicoRemoto;
import comum.Pessoa;
import comum.Veterinario;

public class AppPrincipal {

	public static void main(String[] args) {
		try {
			
			IServicoRemoto objPessoa = (IServicoRemoto) Naming.lookup("rmi://localhost:8008/pessoa");
			
			Veterinario v1 = new Veterinario();
			
			v1.setId(1);
			v1.setNome("Tamires Zamai");
			v1.setCpf("397.429.918-12");
			
			Veterinario v2 = new Veterinario();
			
			v2.setId(2);
			v2.setNome("Jhon Carvalho");
			v2.setCpf("063.306.680-00");

			Veterinario v3 = new Veterinario();
			
			v3.setId(3);
			v3.setNome("André Silva");
			v3.setCpf("371.464.010-06");
			
			// Inserir Veterinario
			
			objPessoa.inserir(v1);
			objPessoa.inserir(v2);
			objPessoa.inserir(v3);
			
			//Listar
			for (Pessoa veterinario : objPessoa.listarPessoa()) {
				
				System.out.println("ID : "+ veterinario.getId());
				System.out.println("Nome : "+ veterinario.getNome());
				System.out.println("Cpf : "+ veterinario.getCpf());
				System.out.println("----------------------------");
				
			}
			
			
		}catch(MalformedURLException e) {
			e.printStackTrace();
		}catch(RemoteException e) {
			e.printStackTrace();
		}catch(NotBoundException e) {
			e.printStackTrace();
		}
	}
}
