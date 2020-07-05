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

import eboko.dao.ISalleDao;
import eboko.entities.Salle;

@RestController
@RequestMapping("/salle")
@CrossOrigin
public class SalleController {

	@Autowired
	private ISalleDao salleDao;
	
	@PostMapping("/add")
	public Salle addSalle (@RequestBody Salle salle ) {
		salleDao.save(salle);
		return salle;
	}
	
	@RequestMapping("/all")
	public List<Salle> findAllSalle(){
		return salleDao.findAll();
	}
	
	@RequestMapping("/get")
	public Salle getSalle(Long id) {
		return salleDao.findById(id).orElse(null);
	}
	
	@PostMapping("/update")
	public Salle update(@RequestBody Salle salle) {
		salleDao.saveAndFlush(salle);
		return salle;
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		salleDao.deleteById(id);
	}
}
