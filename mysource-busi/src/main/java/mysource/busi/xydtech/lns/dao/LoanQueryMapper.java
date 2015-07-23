package mysource.busi.xydtech.lns.dao;

import mysource.busi.xydtech.lns.model.Lnsacctinfo;

public abstract interface LoanQueryMapper {
	
	public abstract Lnsacctinfo selectByAcctno(String paramString);
}
