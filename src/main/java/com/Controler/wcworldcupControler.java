package com.Controler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Entity.Crickstaff;
import com.Service.wcworldcupService;

@RestController
public class wcworldcupControler {
	@Autowired
	wcworldcupService wc;

	@GetMapping("allstafcount")
	public int allstaffcount() {

		return wc.crickstaffcount();

	}

	@GetMapping("allstafinfo")
	public List<Crickstaff> allstaffinfo() {

		List<Crickstaff> allinfo = wc.allstaffinfo();

		return allinfo;

	}

	@GetMapping("medicalcount")
	public ArrayList<Crickstaff> medicalstafcount() {

		return wc.medicalstafcount();

	}

	@GetMapping("Nameandage")
	public HashMap<String, Integer> nameandage() {

		return wc.nameandage();

	}

	@GetMapping("expmore10")
	public ArrayList<String> expmorethan10() {
		return wc.expmorethan10();

	}

	@GetMapping("allnamesstartwiths")
	public ArrayList<Crickstaff> namewithS() {

		return wc.namewithS();
	}

	@GetMapping("capitalnames")
	public ArrayList<String> playersnamesinCapitals() {
		return wc.playersnamesinCapital();
	}

	@GetMapping("belowage30")
	public ArrayList<String> below30age() {

		return wc.below30age();
	}

	@GetMapping("medicaldep")
	public ArrayList<String> allmedicaldep() {
        return wc.allmedicaldeps();
	}
	@GetMapping("medexpadd")
	public ArrayList<Integer> medexpadd() {
		
	return	wc.medexpadd();
		
	}
	
	@GetMapping("allexp")
	public ArrayList<Integer> allexpadd() {
		
	return	wc.allexpadd();
	}

}