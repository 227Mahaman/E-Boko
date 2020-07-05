package eboko.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eboko.dao.IAnneescolaireDao;
import eboko.entities.Anneescolaire;

@RestController
@RequestMapping("/anneescolaire")
@CrossOrigin
public class AnneescolaireController {

	@Autowired
	private IAnneescolaireDao anneescolaireDao;
	
	@PostMapping("/add")
	public Anneescolaire addAnneescolaire (@RequestBody Anneescolaire anneescolaire ) {
		anneescolaireDao.save(anneescolaire);
		return anneescolaire;
	}
	
	@RequestMapping("/all")
	public List<Anneescolaire> findAllAnneescolaire(){
		return anneescolaireDao.findAll();
	}
	
	@RequestMapping("/{id}")
	public Anneescolaire getAnneescolaire(Long id) {
		return anneescolaireDao.findById(id).orElse(null);
	}
	
	@PostMapping("/update")
	public Anneescolaire update(@RequestBody Anneescolaire anneescolaire) {
		anneescolaireDao.saveAndFlush(anneescolaire);
		return anneescolaire;
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		anneescolaireDao.deleteById(id);
	}
}
