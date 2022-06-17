package org.project.memberCommand;

import org.project.memberDao.MemberDao;

public class ActionUpdateDo implements MemberCommand{

	@Override
	public void executeQuery() {
		MemberDao dao = new MemberDao();
		dao.updateDo();
	}
}
