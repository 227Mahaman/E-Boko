package eboko.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eboko.dao.INiveauDao;
import eboko.entities.Niveau;

@RestController
public class NiveauController {

	@Autowired
	private INiveauDao niveauDao;
	
	@PostMapping("/niveau/addNiveau")
	public Niveau addNiveau (@RequestBody Niveau niveau ) {
		niveauDao.save(niveau);
		return niveau;
	}
	
	@RequestMapping("/niveau/findAllNiveau")
	public List<Niveau> findAllNiveau(){
		return niveauDao.findAll();
	}
	
	@RequestMapping("/niveau/getNiveau")
	public Niveau getNiveau(Long id) {
		return niveauDao.findById(id).orElse(null);
	}
	
	@PostMapping("/niveau/updateNiveau")
	public Niveau update(@RequestBody Niveau niveau) {
		niveauDao.saveAndFlush(niveau);
		return niveau;
	}
}
