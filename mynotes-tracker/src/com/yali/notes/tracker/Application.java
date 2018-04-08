package com.yali.notes.tracker;

import java.util.Date;
import java.util.Scanner;

import com.yali.notes.tracker.controller.NotesManager;
import com.yali.notes.tracker.vo.Notes;

public class Application {

	public static void main(String[] args) {
		NotesManager nManager = new NotesManager();

		Scanner scan=new Scanner(System.in);
		int i=0;
		while(i!=5){
			System.out.println(" 1.ADD\n 2.LIST\n 3.VIEW\n 4.DELETE\n 5.EXIT");
			
			 i=scan.nextInt();
		switch (i) {
		case 1:
			System.out.println("enter the title");
					String a=scan.next();
			System.out.println("enter the content");
			String b=scan.next();
			Notes n=new Notes(a, b, new Date());
			nManager.save(n);
			break;
		case 2:
			nManager.displayNotes();
			break;
		case 3:
			System.out.println("enter the title to be search");
			String title=scan.next();
			Notes ammaNotes = nManager.getNotes(title);
			System.out.println(ammaNotes);
			break;
		case 4:
			System.out.println("enter the title to be deleted");
			String titleDelete=scan.next();
			nManager.delete(titleDelete);
		default:
			break;
		}
		

	}

}
}
