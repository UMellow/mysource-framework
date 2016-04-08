package mysource.busi.authentication.dao;

import java.util.List;

import com.alibaba.fastjson.JSONObject;

/**
 * 身份认证信息数据查询与持久化接口
 * 
 * @author zhaoyi
 */
public interface AuthenticationMapper {

	/**
	 * 查询身份认证信息
	 * 
	 * @return JSONArray
	 * 			身份认证信息数据集
	 */
	public List<JSONObject> selectAuthentication();
}
