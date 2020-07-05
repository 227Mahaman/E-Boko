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

import eboko.dao.IEtudiantDao;
import eboko.entities.Etudiant;

@RestController
@RequestMapping("/etudiant")
@CrossOrigin
public class EtudiantController {

	@Autowired
	private IEtudiantDao etudiantDao;
	
	@PostMapping("/add")
	public Etudiant addEtudiant (@RequestBody Etudiant etudiant ) {
		etudiantDao.save(etudiant);
		return etudiant;
	}
	
	@RequestMapping("/all")
	public List<Etudiant> findAllEtudiant(){
		return etudiantDao.findAll();
	}
	
	@RequestMapping("/get")
	public Etudiant getEtudiant(Long id) {
		return etudiantDao.findById(id).orElse(null);
	}
	
	@PostMapping("/update")
	public Etudiant update(@RequestBody Etudiant etudiant) {
		etudiantDao.saveAndFlush(etudiant);
		return etudiant;
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		etudiantDao.deleteById(id);
	}
}
