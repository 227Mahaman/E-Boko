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

import eboko.dao.IFiliereDao;
import eboko.entities.Filiere;

@RestController
@RequestMapping("/filiere")
@CrossOrigin
public class FiliereController {

	@Autowired
	private IFiliereDao filiereDao;
	
	@PostMapping("/add")
	public Filiere addFiliere (@RequestBody Filiere filiere ) {
		filiereDao.save(filiere);
		return filiere;
	}
	
	@RequestMapping("/all")
	public List<Filiere> findAllFiliere(){
		return filiereDao.findAll();
	}
	
	@RequestMapping("/get")
	public Filiere getFiliere(Long id) {
		return filiereDao.findById(id).orElse(null);
	}
	
	@PostMapping("/update")
	public Filiere update(@RequestBody Filiere filiere) {
		filiereDao.saveAndFlush(filiere);
		return filiere;
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		filiereDao.deleteById(id);
	}
}
