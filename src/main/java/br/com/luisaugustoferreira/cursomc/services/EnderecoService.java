package br.com.luisaugustoferreira.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.luisaugustoferreira.cursomc.domain.Endereco;
import br.com.luisaugustoferreira.cursomc.repositories.EnderecoRepository;
import br.com.luisaugustoferreira.cursomc.services.exceptions.ObjectNotFoundException;


@Service
public class EnderecoService {

	@Autowired
	private EnderecoRepository repo;

	public Endereco find(Integer id) {
		Optional<Endereco> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		"Objeto não encontrado! Id: " + id + ", Tipo: " + Endereco.class.getName()));
		}

}
