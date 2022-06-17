package org.project.memberCommand;

import java.util.ArrayList;

import org.project.memberDao.MemberDao;
import org.project.memberDto.MemberDto;

public class ActionSelectDo implements MemberCommand{
	@Override
	public void executeQuery() {
		
		MemberDao dao = new MemberDao();
		ArrayList<MemberDto> lists = dao.list();
		System.out.println(lists);
		
	}
}
