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

import eboko.dao.IUeDao;
import eboko.entities.Ue;

@RestController
@RequestMapping("/ue")
@CrossOrigin
public class UeController {

	@Autowired
	private IUeDao ueDao;
	
	@PostMapping("/add")
	public Ue addUe (@RequestBody Ue ue) {
		ueDao.save(ue);
		return ue;
	}
	
	@RequestMapping("/all")
	public List<Ue> findAllUe(){
		return ueDao.findAll();
	}
	
	//@PostMapping("/ue")
	//public Page<Ue> findAllUe(int page){
		//return ueDao.findAll(new PageRequest(page, 5));
	//}
	
	//@RequestMapping("/ueBySearch")
	//public Page<Ue> ueBySearch(String search, int page){
		//return ueDao.ueByCode("%"+search+"%", new PageRequest(page, 5));
	//}
	
	@RequestMapping("/get")
	public Ue getUe(Long id) {
		return ueDao.findById(id).orElse(null);
	}
	
	@PostMapping("/update")
	public Ue update(@RequestBody Ue ue) {
		ueDao.saveAndFlush(ue);
		return ue;
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		ueDao.deleteById(id);	
	}
}
