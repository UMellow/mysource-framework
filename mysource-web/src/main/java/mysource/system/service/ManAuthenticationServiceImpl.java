package mysource.system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mysource.system.dao.ManAuthenticationDao;
import mysource.system.entity.ManAuthentication;

@Service
public class ManAuthenticationServiceImpl implements ManAuthenticationServiceI {

	@Autowired
	private ManAuthenticationDao authenticationDao;
	
	@Override
	public ManAuthentication searchByPrimaryKey(long iid) {		
		return authenticationDao.selectByPrimaryKey(iid);
	}

}
