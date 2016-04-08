package mysource.busi.authentication.service;

import com.alibaba.fastjson.JSONArray;

/**
 * 身份认证信息业务逻辑层接口
 * 
 * @author zhaoyi
 */
public interface AuthenticationServiceI {

	/**
	 * 查询身份认证信息
	 * 
	 * @return JSONArray
	 * 			身份认证信息数据集
	 */
	public JSONArray searchAuthentication();
}
