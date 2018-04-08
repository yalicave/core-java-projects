package com.yali.notes.tracker.controller;

import java.util.List;
import java.util.ArrayList;

import com.yali.notes.tracker.vo.Notes;

public class NotesManager {

	private Notes[] notesHolder = new Notes[100];
	private int limit = 0;
	private String a;

	public void save(Notes notes) {
		notesHolder[limit] = notes;
		limit++;

	}

	public Notes[] getAll() {
		return notesHolder;
	}

	public Notes getNotes(String title) {

		for (int i = 0; i < limit; i++) {
			Notes notes = notesHolder[i];
			if (title.equals(notes.getTitle())) {
				return notes;
			}
		}
		return null;
	}

	public void displayNotes() {

		for (int i = 0; i < limit; i++) {
			if (notesHolder[i] != null) {
				System.out.println(notesHolder[i]);
			}
		}
	}

	public void delete(String title) {
		for (int i = 0; i < limit; i++) {
			Notes notes = notesHolder[i];
			if (title.equals(notes.getTitle())) {
				notesHolder[i] = null;
			}
		}

	}
}
