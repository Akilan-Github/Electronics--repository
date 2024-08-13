package com.example.electronics.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.electronics.entity.Mobile;

public interface MobileRepository extends JpaRepository<Mobile, Integer> {
	//CUSTOM QUERY
	@Query(value="select * from mobile where price >?",nativeQuery=true)
	public List<Mobile> getbyPrice( int a);
	@Query(value="select brand from mobile order by brand",nativeQuery=true)	
	public List<String> getAsc();
	@Query(value="select brand,price from mobile",nativeQuery=true)
	public List<Object> getTwo();

	//JQuery
	//we must add after : is equal to parameter inside the @Param 
	@Query(value = "select m from Mobile m where m.price>:price")
	public List<Mobile> getPrice(@Param( "price") int a);
	//task1
    @Query(value= " select * from mobile order by price limit 3 , 1",nativeQuery=true)
	public List<Mobile> getFourthMax();
}
