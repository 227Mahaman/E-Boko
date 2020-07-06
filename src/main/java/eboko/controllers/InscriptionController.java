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

import eboko.dao.IInscriptionDao;
import eboko.entities.Inscription;

@RestController
@RequestMapping("/inscription")
@CrossOrigin
public class InscriptionController {
	

	@Autowired
	private IInscriptionDao inscriptionDao;
	
	@PostMapping("/add")
	public Inscription addInscription(@RequestBody Inscription inscription) {
		inscriptionDao.save(inscription);
		return inscription;
	}
	
	@RequestMapping("/all")
	public List<Inscription> findAllInscriptions(){
		return inscriptionDao.findAll();
	}
	
	@RequestMapping("/get")
	public Inscription getInscription(Long id) {
		return inscriptionDao.findById(id).orElse(null);
	}
	
	@PostMapping("/update")
	public Inscription update(@RequestBody Inscription inscription) {
		inscriptionDao.saveAndFlush(inscription);
		return inscription;
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		inscriptionDao.deleteById(id);
	}
	
	@RequestMapping("/matricule")
	public Inscription findInscriptionByMatricule(String matriculeE) {
		return inscriptionDao.findByMatriculeE(matriculeE).get(0);
	}
}
