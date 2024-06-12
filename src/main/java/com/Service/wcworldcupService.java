package com.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.Dao.wcworldcupdao;
import com.Entity.Crickstaff;

@Service
public class wcworldcupService {
	@Autowired
	wcworldcupdao dao;

	public int crickstaffcount() {

		List<Crickstaff> allstaff = dao.allcrickstaff();

		return allstaff.size();

	}

	public List<Crickstaff> allstaffinfo() {

		List<Crickstaff> allinfo = dao.allcrickstaff();

		return allinfo;
	}

	public ArrayList<Crickstaff> medicalstafcount() {
		List<Crickstaff> allinfo = dao.allcrickstaff();
		ArrayList<Crickstaff> mediacal = new ArrayList<>();
		for (Crickstaff info : allinfo) {

			if (info.getDepartment().equals("medical")) {
				mediacal.add(info);

			}
		}
		return mediacal;

	}

	public HashMap<String, Integer> nameandage() {
		List<Crickstaff> allinfo = dao.allcrickstaff();
		HashMap<String, Integer> nameandage = new HashMap<>();
		for (Crickstaff data : allinfo) {

			nameandage.put(data.getName(), data.getAge());

		}

		return nameandage;

	}

	// names whose exprience is greter than 10 years
	public ArrayList<String> expmorethan10() {
		List<Crickstaff> allinfo = dao.allcrickstaff();
		ArrayList<String> names = new ArrayList<>();
		for (Crickstaff data : allinfo) {

			if (data.getWorkexperience() > 10) {
				names.add(data.getName());

			}

		}

		return names;

	}

	// names start with s
	public ArrayList<Crickstaff> namewithS() {
		List<Crickstaff> allinfo = dao.allcrickstaff();
		ArrayList<Crickstaff> players = new ArrayList<>();

		for (Crickstaff data : allinfo) {
			if (data.getName().startsWith("s")) {
				players.add(data);

			}
		}
		return players;
	}

	// players names only in capital letter
	public ArrayList<String> playersnamesinCapital() {
		List<Crickstaff> allinfo = dao.allcrickstaff();
		ArrayList<String> names = new ArrayList<>();
		for (Crickstaff data : allinfo) {
			names.add(data.getName().toUpperCase());

		}
		return names;
	}
//names of below age 30
	public ArrayList<String> below30age() {
		List<Crickstaff> allinfo = dao.allcrickstaff();
		ArrayList<String> names = new ArrayList<>();
		for (Crickstaff data : allinfo) {

			if (data.getAge() < 30) {
				names.add(data.getName());

			}
		}

		return names;
	}
//all medical department names
	public ArrayList<String> allmedicaldeps() {
		List<Crickstaff> allinfo = dao.allcrickstaff();
		ArrayList<String> names = new ArrayList<>();
		for (Crickstaff data : allinfo) {
			if (data.getDepartment().equals("medical")) {

				names.add(data.getName());
			}
		}
		return names;
	}
//addition of all medical department experience 
	public ArrayList<Integer> medexpadd() {
		int a = 0;
		List<Crickstaff> allinfo = dao.allcrickstaff();
		ArrayList<Integer> medyr = new ArrayList<>();
		ArrayList<Integer> addition = new ArrayList<>();

		for (Crickstaff data : allinfo) {
			if (data.getDepartment().equals("medical")) {

				medyr.add(data.getWorkexperience());

			}
		}

		for (int yers : medyr) {
			a = a + yers;

		}
		addition.add(a);
		return addition;

	}
	//addition of all staff experience
	public ArrayList<Integer> allexpadd() {
		int a = 0;
		List<Crickstaff> allinfo = dao.allcrickstaff();
		ArrayList<Integer> expyr = new ArrayList<>();
		ArrayList<Integer> addition = new ArrayList<>();

		for (Crickstaff data : allinfo) {

			expyr.add(data.getWorkexperience());

			}
		

		for (int yers : expyr) {
			a = a + yers;

		}
		addition.add(a);
		return addition;
}}