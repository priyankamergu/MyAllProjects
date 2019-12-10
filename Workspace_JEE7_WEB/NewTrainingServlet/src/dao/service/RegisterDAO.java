package dao.service;

import bean.or.pojo.RegistrationPOJO;

public interface RegisterDAO
{
	public boolean register(RegistrationPOJO r);
	public Integer UpdateUser(RegistrationPOJO r);
	public RegistrationPOJO SerachUser(int id);
	public boolean  DeleteUser(int id);
	
}
