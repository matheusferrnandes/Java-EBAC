package br.com.fernandes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.fernandes.dao.ClienteDaoMock;
import br.com.fernandes.dao.IClienteDAO;
import br.com.fernandes.domain.Cliente;
import br.com.fernandes.exceptions.TipoChaveNaoEncontradaException;
import br.com.fernandes.services.ClienteService;
import br.com.fernandes.services.IClienteService;

public class ClienteServiceTest {
	
	private IClienteService clienteService;
	
	private Cliente cliente;
	
	public ClienteServiceTest() {
		IClienteDAO dao = new ClienteDaoMock();
		clienteService = new ClienteService(dao);
	}
	
	@Before
	public void init() {
		cliente = new Cliente();
		cliente.setCpf(12345678910L);
		cliente.setNome("Vinicius");
		cliente.setCidade("Sapiranga");
		cliente.setEnd("End");
		cliente.setEstado("RS");
		cliente.setNumero(73);
		cliente.setTel(51999999999L);
	}
	
	@Test
	public void pesquisarCliente() {
		Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);
	}
	
	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException {
		Boolean retorno = clienteService.cadastrar(cliente);
		
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluirCliente() {
		clienteService.excluir(cliente.getCpf());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setNome("Vinicius Vatte");
		clienteService.alterar(cliente);
		
		Assert.assertEquals("Vinicius Vatte", cliente.getNome());
	}
}
