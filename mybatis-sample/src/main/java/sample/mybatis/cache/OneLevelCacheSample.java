package sample.mybatis.cache;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import sample.mybatis.domain.Employee;
import sample.mybatis.factory.ZSqlSessionFactory;
import sample.mybatis.mapper.EmployeeMapper;

/**
 * MyBatis 一级缓存测试；
 * MyBatis 默认开启一级缓存，作用域为 SQLSession.
 */
public class OneLevelCacheSample {

	public static void main(String[] args) {
		OneLevelCacheSample sample = new OneLevelCacheSample();
		sample.oneLevelCache();
	}
	
	@Test
	public void oneLevelCache() {
		
		try {
			SqlSession sqlSession = ZSqlSessionFactory.getSqlSession();
			EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
			
			Employee emp1 = mapper.selectEmployeeById(1);
			System.out.println(emp1);
			
			Employee emp2 = mapper.selectEmployeeById(1);
			System.out.println(emp2);
			
			sqlSession.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
