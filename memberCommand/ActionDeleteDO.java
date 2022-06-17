package org.project.memberCommand;

import org.project.memberDao.MemberDao;

public class ActionDeleteDO implements MemberCommand{
	
	@Override
	public void executeQuery() {
		MemberDao dao = new MemberDao();
		dao.deleteDo();
	}

}
