package mysource.busi.xydtech.lns.service;

import mysource.busi.xydtech.lns.dao.LoanQueryMapper;
import mysource.busi.xydtech.lns.model.Lnsacctinfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service("loanQueryService")
public class LoanQueryServiceImpl implements LoanQueryServiceI {

	@Autowired
	private LoanQueryMapper loanQueryMapper;

	public Lnsacctinfo selectByAcctno(String acctno) {
		Lnsacctinfo lnsacctinfo = this.loanQueryMapper.selectByAcctno(acctno);
		return lnsacctinfo;
	}
}
