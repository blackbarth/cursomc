package br.com.luisaugustoferreira.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.luisaugustoferreira.cursomc.domain.Estado;
import br.com.luisaugustoferreira.cursomc.repositories.EstadoRepository;
import br.com.luisaugustoferreira.cursomc.services.exceptions.ObjectNotFoundException;


@Service
public class EstadoService {

	@Autowired
	private EstadoRepository repo;

	public Estado find(Integer id) {
		Optional<Estado> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		"Objeto não encontrado! Id: " + id + ", Tipo: " + Estado.class.getName()));
		}

}
