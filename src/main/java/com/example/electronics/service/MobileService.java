package com.example.electronics.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.electronics.dao.MobileDao;
import com.example.electronics.entity.Mobile;
@Service
public class MobileService {
	@Autowired
	MobileDao md;
	public String postMobile(List<Mobile> a) {
		return md.postMobile(a);
	}
	public List<Mobile> getMobile(){
		return md.getMobile();
	}
	public List<Mobile> getbyPrice( int a){
		return md.getbyPrice(a);
	}
	public List<String> getAsc(){
		return md.getAsc();
	}
	public List<Object> getTwo() {
		
		return md.getTwo();
	}
	
	public List<Mobile> getPrice( int a){
		return md.getPrice(a);
	}
	public List<Mobile> getFourthMax(){
		return md.getFourthMax();
	}


}
