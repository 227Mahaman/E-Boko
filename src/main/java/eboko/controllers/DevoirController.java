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

import eboko.dao.IDevoirDao;
import eboko.entities.Devoir;

@RestController
@RequestMapping("/devoir")
@CrossOrigin
public class DevoirController {

	@Autowired
	private IDevoirDao devoirDao;
	
	@PostMapping("/add")
	public Devoir addDevoir (@RequestBody Devoir devoir ) {
		devoirDao.save(devoir);
		return devoir;
	}
	
	@RequestMapping("/all")
	public List<Devoir> findAllDevoir(){
		return devoirDao.findAll();
	}
	
	@RequestMapping("/get")
	public Devoir getDevoir(Long id) {
		return devoirDao.findById(id).orElse(null);
	}
	
	@PostMapping("/update")
	public Devoir update(@RequestBody Devoir devoir) {
		devoirDao.saveAndFlush(devoir);
		return devoir;
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		devoirDao.deleteById(id);
	}
}
