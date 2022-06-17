package org.project.memberCommand;

import org.project.memberDao.MemberDao;

public class ActionInsertDo implements MemberCommand{
	
	@Override
	public void executeQuery() {
		MemberDao dao = new MemberDao();
		dao.insertDo();
	}
}
