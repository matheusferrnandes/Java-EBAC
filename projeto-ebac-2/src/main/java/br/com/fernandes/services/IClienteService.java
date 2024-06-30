package br.com.fernandes.services;

import br.com.fernandes.domain.Cliente;
import br.com.fernandes.exceptions.TipoChaveNaoEncontradaException;

public interface IClienteService {

	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;

	Cliente buscarPorCPF(Long cpf);

	void excluir(Long cpf);

	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
