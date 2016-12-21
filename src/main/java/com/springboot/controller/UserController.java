package com.springboot.controller;

import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dao.UserMapper;

import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@RestController
public class UserController {
	@Autowired
	private UserMapper mapper;
	
	String resultmsg="";
	
	@RequestMapping(value="/usercheck",method=RequestMethod.POST)
	public @ResponseBody Map<String,Object> checkid(HttpServletRequest request) throws Exception{
		int cnt = mapper.checkId(request.getParameter("useremail"));
		
		Map<String, Object> jsonObject = new HashMap<String, Object>();
		
		if(cnt==0){
			resultmsg="ID can be used";
		}else{
			resultmsg="ID not available";
		}
		
		jsonObject.put("resultmsg", resultmsg);
		
		return jsonObject;
	}
	
}//class end
