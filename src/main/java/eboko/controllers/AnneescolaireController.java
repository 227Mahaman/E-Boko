package eboko.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import eboko.dao.IAnneescolaireDao;
import eboko.entities.Anneescolaire;

@RestController
public class AnneescolaireController {

	@Autowired
	private IAnneescolaireDao anneescolaireDao;
	
	@PostMapping("/anneescolaire/addAnneescolaire")
	public Anneescolaire addAnneescolaire (@RequestBody Anneescolaire anneescolaire ) {
		anneescolaireDao.save(anneescolaire);
		return anneescolaire;
	}
	
	@PostMapping("/anneescolaire/findAllAnneescolaire")
	public List<Anneescolaire> findAllAnneescolaire(){
		return anneescolaireDao.findAll();
	}
	
	@PostMapping("/anneescolaire/getAnneescolaire")
	public Anneescolaire getAnneescolaire(Long id) {
		return anneescolaireDao.findById(id).orElse(null);
	}
	
	@PostMapping("/anneescolaire/updateAnneescolaire")
	public Anneescolaire update(@RequestBody Anneescolaire anneescolaire) {
		anneescolaireDao.saveAndFlush(anneescolaire);
		return anneescolaire;
	}
}
