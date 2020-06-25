package eboko.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eboko.dao.IEtudiantDao;
import eboko.entities.Etudiant;

@RestController
public class EtudiantController {

	@Autowired
	private IEtudiantDao etudiantDao;
	
	@PostMapping("/etudiant/addEtudiant")
	public Etudiant addEtudiant (@RequestBody Etudiant etudiant ) {
		etudiantDao.save(etudiant);
		return etudiant;
	}
	
	@RequestMapping("/etudiant/findAllEtudiant")
	public List<Etudiant> findAllEtudiant(){
		return etudiantDao.findAll();
	}
	
	@RequestMapping("/etudiant/getEtudiant")
	public Etudiant getEtudiant(Long id) {
		return etudiantDao.findById(id).orElse(null);
	}
	
	@PostMapping("/etudiant/updateEtudiant")
	public Etudiant update(@RequestBody Etudiant etudiant) {
		etudiantDao.saveAndFlush(etudiant);
		return etudiant;
	}
}
