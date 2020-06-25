package eboko.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eboko.dao.IFiliereDao;
import eboko.entities.Filiere;

@RestController
public class FiliereController {

	@Autowired
	private IFiliereDao filiereDao;
	
	@PostMapping("/filiere/addFiliere")
	public Filiere addFiliere (@RequestBody Filiere filiere ) {
		filiereDao.save(filiere);
		return filiere;
	}
	
	@RequestMapping("/filiere/findAllFiliere")
	public List<Filiere> findAllFiliere(){
		return filiereDao.findAll();
	}
	
	@RequestMapping("/filiere/getFiliere")
	public Filiere getFiliere(Long id) {
		return filiereDao.findById(id).orElse(null);
	}
	
	@PostMapping("/filiere/updateFiliere")
	public Filiere update(@RequestBody Filiere filiere) {
		filiereDao.saveAndFlush(filiere);
		return filiere;
	}
}
