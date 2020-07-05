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

import eboko.dao.INoteDao;
import eboko.entities.Note;

@RestController
@RequestMapping("/note")
@CrossOrigin
public class NoteController {

	@Autowired
	private INoteDao noteDao;
	
	@PostMapping("/add")
	public Note addNote (@RequestBody Note note ) {
		noteDao.save(note);
		return note;
	}
	
	@RequestMapping("/all")
	public List<Note> findAllNote(){
		return noteDao.findAll();
	}
	
	@RequestMapping("/get")
	public Note getNote(Long id) {
		return noteDao.findById(id).orElse(null);
	}
	
	@PostMapping("/update")
	public Note update(@RequestBody Note note) {
		noteDao.saveAndFlush(note);
		return note;
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		noteDao.deleteById(id);
	}
}
