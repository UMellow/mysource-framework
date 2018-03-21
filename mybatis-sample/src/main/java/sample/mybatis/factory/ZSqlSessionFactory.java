package sample.mybatis.factory;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class ZSqlSessionFactory {

	private static SqlSessionFactory sqlSessionFactory;
	
	/*static {
		try {
			InputStream inputStream = Resources.getResourceAsStream(ZSqlSessionFactory.class.getClassLoader(), "mybatis-config.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}*/

	// 获取SqlSession对象的静态方法
	public static SqlSession getSqlSession() {
		return getSqlSessionFactory().openSession();
	}

	// 获取SqlSessionFactory的静态方法
	public static SqlSessionFactory getSqlSessionFactory()
	{
		if(sqlSessionFactory==null) 
		{
			InputStream inputStream = null;
			try
			{
				inputStream = Resources.getResourceAsStream("mybatis-config.xml");
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			}catch (IOException e)
			{
				e.printStackTrace();
				throw new RuntimeException(e.getCause());
			}finally {
				if(inputStream != null){
					try {
						inputStream.close();
					} catch (IOException e) {
					}
				}
			}
		}
		return sqlSessionFactory;
	}
}
