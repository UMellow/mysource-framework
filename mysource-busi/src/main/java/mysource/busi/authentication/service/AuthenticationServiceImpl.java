package mysource.busi.authentication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mysource.busi.authentication.dao.AuthenticationMapper;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * 身份认证信息业务逻辑层实现
 * 
 * @author zhaoyi
 */
@Service
public class AuthenticationServiceImpl implements AuthenticationServiceI {

	@Autowired
	private AuthenticationMapper authenticationMapper;
	
	public JSONArray searchAuthentication() {
		
		List<JSONObject> jsonObjects = authenticationMapper.selectAuthentication();
		
		JSONArray jsonArray = new JSONArray();
		jsonArray.addAll(jsonObjects);
		
		return jsonArray;
	}

}
