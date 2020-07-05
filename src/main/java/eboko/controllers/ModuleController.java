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

import eboko.dao.IModuleDao;
import eboko.entities.Module;

@RestController
@RequestMapping("/module")
@CrossOrigin
public class ModuleController {

	@Autowired
	private IModuleDao moduleDao;
	
	@PostMapping("/add")
	public Module addModule (@RequestBody Module module ) {
		moduleDao.save(module);
		return module;
	}
	
	@RequestMapping("/all")
	public List<Module> findAllModule(){
		return moduleDao.findAll();
	}
	
	@RequestMapping("/get")
	public Module getModule(Long id) {
		return moduleDao.findById(id).orElse(null);
	}
	
	@PostMapping("/update")
	public Module update(@RequestBody Module module) {
		moduleDao.saveAndFlush(module);
		return module;
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		moduleDao.deleteById(id);
	}
}
