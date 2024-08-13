package com.example.electronics.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.electronics.entity.Mobile;
import com.example.electronics.repository.MobileRepository;
@Repository
public class MobileDao {
@Autowired 
MobileRepository mr;

public String postMobile(List<Mobile> a) {
	mr.saveAll(a);
	return "posted Succesfully";
	
}
public List<Mobile> getMobile(){
	return mr.findAll();
}
public List<Mobile> getbyPrice( int a){
	return mr.getbyPrice(a);
}
public List<String> getAsc(){
	return mr.getAsc();
}
public List<Object> getTwo(){
	return mr.getTwo();
}

public List<Mobile> getPrice(int a){
	return mr.getPrice(a);
}
public List<Mobile> getFourthMax(){
	return mr.getFourthMax();
}

}
