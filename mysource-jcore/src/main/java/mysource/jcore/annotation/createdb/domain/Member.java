package mysource.jcore.annotation.createdb.domain;

import mysource.jcore.annotation.createdb.Contraints;
import mysource.jcore.annotation.createdb.DBTable;
import mysource.jcore.annotation.createdb.SQLInteger;
import mysource.jcore.annotation.createdb.SQLString;

@DBTable(name="member")
public class Member {

	@SQLString(length=50, contraints=@Contraints(primarykey=true))
	private String code;
	
	@SQLString(columnname="name", length=50)
	private String name;
	
	@SQLInteger
	private Integer age;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
