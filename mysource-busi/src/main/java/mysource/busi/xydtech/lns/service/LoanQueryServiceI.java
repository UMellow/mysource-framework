package mysource.busi.xydtech.lns.service;

import mysource.busi.xydtech.lns.model.Lnsacctinfo;

public abstract interface LoanQueryServiceI {
	
	public abstract Lnsacctinfo selectByAcctno(String paramString);
}
