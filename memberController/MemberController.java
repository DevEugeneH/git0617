package org.project.memberController;

import java.util.Scanner;

import org.project.memberCommand.ActionDeleteDO;
import org.project.memberCommand.ActionInsertDo;
import org.project.memberCommand.ActionSelectDo;
import org.project.memberCommand.ActionUpdateDo;
//import org.project.memberCommand.ActionInsertDo;
import org.project.memberCommand.MemberCommand;

public class MemberController {	
	public static void main(String[] args) {
		
		
		MemberCommand command = null;
		
		Scanner scn = new Scanner(System.in);
		
		
		while (true) {
			
			System.out.println("Please insert Query(insert, select, delete, update)");
		String in = scn.next();
		
		if(in.equals("insert")) {
			command = new ActionInsertDo();
			command.executeQuery();
		} else if(in.equals("select")) {
			command = new ActionSelectDo();
			command.executeQuery();
		} else if(in.equals("update")) {
			command = new ActionUpdateDo();
			command.executeQuery();
		} else if(in.equals("delete")) {
			command = new ActionDeleteDO();
			command.executeQuery();
		} else if(in.equals("exit")) {
			System.out.println("Console Exit");
			break;
		} else {
			System.out.println("unable query");
		}
		}
		
		scn.close();
	}
}
