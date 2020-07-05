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

import eboko.dao.INiveauDao;
import eboko.entities.Niveau;

@RestController
@RequestMapping("/niveau")
@CrossOrigin
public class NiveauController {

	@Autowired
	private INiveauDao niveauDao;
	
	@PostMapping("/add")
	public Niveau addNiveau (@RequestBody Niveau niveau ) {
		niveauDao.save(niveau);
		return niveau;
	}
	
	@RequestMapping("/all")
	public List<Niveau> findAllNiveau(){
		return niveauDao.findAll();
	}
	
	@RequestMapping("/get")
	public Niveau getNiveau(Long id) {
		return niveauDao.findById(id).orElse(null);
	}
	
	@PostMapping("/update")
	public Niveau update(@RequestBody Niveau niveau) {
		niveauDao.saveAndFlush(niveau);
		return niveau;
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		niveauDao.deleteById(id);
	}
}
