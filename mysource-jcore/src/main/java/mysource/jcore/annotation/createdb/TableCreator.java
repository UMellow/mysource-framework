package mysource.jcore.annotation.createdb;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import mysource.jcore.annotation.createdb.domain.Member;

public class TableCreator {

	public static void main(String[] args) {
		Class<Member> cl = Member.class;
		DBTable dbTable = cl.getAnnotation(DBTable.class);
		
		String tablename = dbTable.name();
		
		List<String> columnnames = new ArrayList<String>();
		Field[] fields = cl.getDeclaredFields();
		for(Field field : fields) {
			String columnname = null;
			Annotation[] annotations = field.getDeclaredAnnotations();
			
			if(annotations[0] instanceof SQLInteger) {
				SQLInteger sqlInteger = (SQLInteger) annotations[0]; 
				if(sqlInteger.columnname().length() < 1) {
					columnname = field.getName().toUpperCase();
				} else {
					columnname = sqlInteger.columnname().toUpperCase();
				}
				columnnames.add(columnname + " INT" + getContraints(sqlInteger.contraints()));
			}
			
			if(annotations[0] instanceof SQLString) {
				SQLString sqlString = (SQLString) annotations[0];
				if(sqlString.columnname().length() < 1) {
					columnname = field.getName().toUpperCase();
				} else {
					columnname = sqlString.columnname().toUpperCase();
				}
				columnnames.add(columnname + " VARCHAR(" + sqlString.length() + ")" + getContraints(sqlString.contraints()));
			}
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("CREATE TABLE ").append(tablename).append("(");
		for(String columnname : columnnames) {
			sb.append("\n    ").append(columnname).append(",");
		}
		
		String createCommand = sb.toString().substring(0, sb.toString().length() - 1) + "\n)";		
		System.out.println(createCommand);
	}
	
	public static String getContraints(Contraints contraints) {
		
		StringBuilder sb = new StringBuilder("");
		
		if(contraints.primarykey()) {
			sb.append(" PRIMARY KEY");
		}
		if(!contraints.allownull()) {
			sb.append(" NOT NULL");
		}
		if(contraints.unique()) {
			sb.append(" UNIQUE");
		}
		
		return sb.toString();
	}
}
