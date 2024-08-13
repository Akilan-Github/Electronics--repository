package com.example.electronics.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.electronics.entity.Mobile;
import com.example.electronics.service.MobileService;

@RestController
public class MobileController {
	@Autowired
	MobileService ms;

	@PostMapping(value = "/post")
	public String postMobile(@RequestBody List<Mobile> a) {
		return ms.postMobile(a);

	}

	@GetMapping("/getmobile")
	public List<Mobile> getMobile() {
		return ms.getMobile();
	}

	@GetMapping(value = "/getbyprice/{a}")
	public List<Mobile> getbyPrice(@PathVariable int a) {
		return ms.getbyPrice(a);
	}

	@GetMapping(value = "/getbrandasc")
	public List<String> getAsc() {
		return ms.getAsc();
	}

	@GetMapping(value = "/gettwo")
	public List<Object> getTwo() {
		return ms.getTwo();
	}

	@GetMapping(value = "/getprice/{a}")
	public List<Mobile> getPrice(@PathVariable int a) {
		return ms.getPrice(a);
	}

	@GetMapping(value = "/getfourthmax")
	public List<Mobile> getFourthMax() {
		return ms.getFourthMax();
	}

}
