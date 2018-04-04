package com.yali.notes.tracker;

import java.util.Date;

import com.yali.notes.tracker.controller.NotesManager;
import com.yali.notes.tracker.vo.Notes;

public class Application {

	public static void main(String[] args) {
		NotesManager n = new NotesManager();
		n.save(new Notes("Amma", "Amma is good", new Date()));
		n.save(new Notes("appa", "appa is good", new Date()));
		n.save(new Notes("sithapa", "sithapa is good", new Date()));
		n.displayNotes();
		Notes ammaNotes = n.getNotes("appa");
		System.out.println(ammaNotes);
	}

}
