package com.ibrahimsungur.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserControllerTry {
	
public static List<User>users=new ArrayList<User>();
	
	static{
		
		users.add(new User(1,"Alex","Sungur"));
		users.add(new User(2,"Tacettin","Sertkaya"));
		users.add(new User(3,"Mehmet","Sungur"));
	}
	
	@RequestMapping(value="/userTry",method=RequestMethod.GET)
	@ResponseBody
	public List<User>getAllUsers(){
		return users;
		
	}
}
