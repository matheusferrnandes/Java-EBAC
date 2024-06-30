package br.com.fernandes.services;

import br.com.fernandes.dao.IClienteDAO;
import br.com.fernandes.domain.Cliente;
import br.com.fernandes.services.generic.GenericService;


public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {

	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);
	}

	@Override
	public Cliente buscarPorCPF(Long cpf) {
		return this.dao.consultar(cpf);
	}
}
