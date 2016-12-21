package com.springboot.dao;


import org.apache.ibatis.annotations.Param;

public interface UserMapper {
	
	public int checkId(@Param("useremail")String useremail)throws Exception;
	
}
