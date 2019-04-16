package br.com.luisaugustoferreira.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.luisaugustoferreira.cursomc.domain.Cidade;
import br.com.luisaugustoferreira.cursomc.repositories.CidadeRepository;
import br.com.luisaugustoferreira.cursomc.services.exceptions.ObjectNotFoundException;


@Service
public class CidadeService {

	@Autowired
	private CidadeRepository repo;

	public Cidade find(Integer id) {
		Optional<Cidade> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		"Objeto não encontrado! Id: " + id + ", Tipo: " + Cidade.class.getName()));
		}

}
