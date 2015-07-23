package mysource.busi.xydtech.lns.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class Lnsacctinfo implements Serializable {
	private static final long serialVersionUID = -5789251677911278384L;
	String acctno;
	String prdcode;
	String name;
	String custid;
	String idtype;
	String idno;
	String phone;
	String ccy;
	String repayway;
	String loantype;
	String loanstat;
	String opendate;
	int loanterm;
	String periodunit;
	String contractno;
	BigDecimal contractamt;
	BigDecimal initialpayment;
	private String provice;
	private String city;
	private String code;
	private String schoolname;
	private String bankcardno;
	private String alipayno;
	private String referralcode;
	private String cutrate;

	public String getCutrate() {
		return this.cutrate;
	}

	public void setCutrate(String cutrate) {
		this.cutrate = cutrate;
	}

	public String getProvice() {
		return this.provice;
	}

	public String getBankcardno() {
		return this.bankcardno;
	}

	public void setBankcardno(String bankcardno) {
		this.bankcardno = bankcardno;
	}

	public String getAlipayno() {
		return this.alipayno;
	}

	public void setAlipayno(String alipayno) {
		this.alipayno = alipayno;
	}

	public String getReferralcode() {
		return this.referralcode;
	}

	public void setReferralcode(String referralcode) {
		this.referralcode = referralcode;
	}

	public void setProvice(String provice) {
		this.provice = provice;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getSchoolname() {
		return this.schoolname;
	}

	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}

	public String getAcctno() {
		return this.acctno;
	}

	public void setAcctno(String acctno) {
		this.acctno = acctno;
	}

	public String getPrdcode() {
		return this.prdcode;
	}

	public void setPrdcode(String prdcode) {
		this.prdcode = prdcode;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCustid() {
		return this.custid;
	}

	public void setCustid(String custid) {
		this.custid = custid;
	}

	public String getIdtype() {
		return this.idtype;
	}

	public void setIdtype(String idtype) {
		this.idtype = idtype;
	}

	public String getIdno() {
		return this.idno;
	}

	public void setIdno(String idno) {
		this.idno = idno;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCcy() {
		return this.ccy;
	}

	public void setCcy(String ccy) {
		this.ccy = ccy;
	}

	public String getRepayway() {
		return this.repayway;
	}

	public void setRepayway(String repayway) {
		this.repayway = repayway;
	}

	public String getLoantype() {
		return this.loantype;
	}

	public void setLoantype(String loantype) {
		this.loantype = loantype;
	}

	public String getLoanstat() {
		return this.loanstat;
	}

	public void setLoanstat(String loanstat) {
		this.loanstat = loanstat;
	}

	public String getOpendate() {
		return this.opendate;
	}

	public void setOpendate(String opendate) {
		this.opendate = opendate;
	}

	public int getLoanterm() {
		return this.loanterm;
	}

	public void setLoanterm(int loanterm) {
		this.loanterm = loanterm;
	}

	public String getPeriodunit() {
		return this.periodunit;
	}

	public void setPeriodunit(String periodunit) {
		this.periodunit = periodunit;
	}

	public String getContractno() {
		return this.contractno;
	}

	public void setContractno(String contractno) {
		this.contractno = contractno;
	}

	public BigDecimal getContractamt() {
		return this.contractamt;
	}

	public void setContractamt(BigDecimal contractamt) {
		this.contractamt = contractamt;
	}

	public BigDecimal getInitialpayment() {
		return this.initialpayment;
	}

	public void setInitialpayment(BigDecimal initialpayment) {
		this.initialpayment = initialpayment;
	}

	public Lnsacctinfo() {
	}

	public Lnsacctinfo(String acctno, String prdcode, String name,
			String custid, String idtype, String idno, String phone,
			String ccy, String repayway, String loantype, String loanstat,
			String opendate, int loanterm, String periodunit,
			String contractno, BigDecimal contractamt,
			BigDecimal initialpayment, String provice, String city,
			String code, String schoolname, String bankcardno, String alipayno,
			String referralcode, String cutrate) {
		this.acctno = acctno;
		this.prdcode = prdcode;
		this.name = name;
		this.custid = custid;
		this.idtype = idtype;
		this.idno = idno;
		this.phone = phone;
		this.ccy = ccy;
		this.repayway = repayway;
		this.loantype = loantype;
		this.loanstat = loanstat;
		this.opendate = opendate;
		this.loanterm = loanterm;
		this.periodunit = periodunit;
		this.contractno = contractno;
		this.contractamt = contractamt;
		this.initialpayment = initialpayment;
		this.provice = provice;
		this.city = city;
		this.code = code;
		this.schoolname = schoolname;
		this.bankcardno = bankcardno;
		this.alipayno = alipayno;
		this.referralcode = referralcode;
		this.cutrate = cutrate;
	}

	public Lnsacctinfo(String acctno, String prdcode, String name,
			String custid, String idtype, String idno, String phone,
			String ccy, String repayway, String loantype, String loanstat,
			String opendate, int loanterm, String periodunit,
			String contractno, BigDecimal contractamt, BigDecimal initialpayment) {
		this.acctno = acctno;
		this.prdcode = prdcode;
		this.name = name;
		this.custid = custid;
		this.idtype = idtype;
		this.idno = idno;
		this.phone = phone;
		this.ccy = ccy;
		this.repayway = repayway;
		this.loantype = loantype;
		this.loanstat = loanstat;
		this.opendate = opendate;
		this.loanterm = loanterm;
		this.periodunit = periodunit;
		this.contractno = contractno;
		this.contractamt = contractamt;
		this.initialpayment = initialpayment;
	}
}
