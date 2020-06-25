package eboko.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eboko.dao.INoteDao;
import eboko.entities.Note;

@RestController
public class NoteController {

	@Autowired
	private INoteDao noteDao;
	
	@PostMapping("/note/addNote")
	public Note addNote (@RequestBody Note note ) {
		noteDao.save(note);
		return note;
	}
	
	@RequestMapping("/note/findAllNote")
	public List<Note> findAllNote(){
		return noteDao.findAll();
	}
	
	@RequestMapping("/note/getNote")
	public Note getNote(Long id) {
		return noteDao.findById(id).orElse(null);
	}
	
	@PostMapping("/note/updateNote")
	public Note update(@RequestBody Note note) {
		noteDao.saveAndFlush(note);
		return note;
	}
}
