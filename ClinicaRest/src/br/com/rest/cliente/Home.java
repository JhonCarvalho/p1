package br.com.rest.cliente;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import comum.IServicoRemoto;
import comum.Veterinario;

@Path("/home")
public class Home {

	@GET
	@Path("inserir/{param1}/{param2}/{param3}")
	public String inserir(@PathParam("param1")int id,@PathParam("param2") String nome,@PathParam("param3") String cpf) {
		String out = "Erro ao Inserir!";
		
		try {
		IServicoRemoto objPessoa = (IServicoRemoto) Naming.lookup("rmi://localhost:8008/pessoa");
		
		Veterinario v1 = new Veterinario();
		
		v1.setId(id);
		v1.setNome(nome);
		v1.setCpf(cpf);
		
		// Inserir Veterinario
		
		objPessoa.inserir(v1);
	      out = "Inserido com sucesso !";
		
		}catch(MalformedURLException e) {
			e.printStackTrace();
		}catch(RemoteException e) {
			e.printStackTrace();
		}catch(NotBoundException e) {
			e.printStackTrace();
		}
		
		return out;
	}
	
	
	
}
