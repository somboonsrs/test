package com.em.loadder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.annotation.PostConstruct;

import org.aspectj.lang.annotation.After;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.stereotype.Component;

import com.em.repository.DropdownRepository;
import com.em.repository.ProvinceRepository;
import com.em.repository.UsersRepository;
import com.em.entity.Dropdown;
import com.em.entity.Province;
import com.em.entity.Users;

@Component
public class LoadderData {
		

	@Autowired
	private UsersRepository usersRepository;
	
	@Autowired
	private DropdownRepository dropdownRepository;
	
	@Autowired
	private ProvinceRepository provinceRepository;
	

	
	@PostConstruct
	public void loadder() throws InterruptedException {
		System.out.println("\n----------------- Start Loadding data ----------------------------");
		List<Users> userList= getList();
		usersRepository.saveAll(userList);

		 List<Province> provinceList= getProvince();
		 provinceRepository.saveAll(provinceList);

		List<Dropdown> dropdowneList= getDropdown();
		dropdownRepository.saveAll(dropdowneList);
		
	}
	
	public List<Users> getList(){
		System.out.println("\n----------------- Users Data ----------------------------");
			List<Users> userList= new ArrayList<>();
			userList.add(new Users("somboon", "1000"));
			userList.add(new Users("si1rikan", "2000"));
			userList.add(new Users("sirikan", "2000"));
			userList.add(new Users("si3rikan", "2000"));
			userList.add(new Users("si12rikan", "2000"));
			userList.add(new Users("sirikan", "2000"));
			userList.add(new Users("sir11ikan", "2000"));
			userList.add(new Users("ss", "2000"));
			userList.add(new Users("siri3skan", "2000"));
			userList.add(new Users("sierikan", "2000"));
			userList.add(new Users("sir3ikan", "2000"));
			userList.add(new Users("sirikan", "2000"));
			userList.add(new Users("siresikan", "2000"));
			userList.add(new Users("wsirikan", "2000"));
			userList.add(new Users("sirikan", "2000"));
			userList.add(new Users("sirxikan", "2000"));
			userList.add(new Users("sirikan", "2000"));
			userList.add(new Users("siwrikan", "2000"));
			userList.add(new Users("sirickan", "2000"));
			userList.add(new Users("siwrikan", "2000"));
			return userList;
	}
	
	public List<Province> getProvince(){
		List<Province> provinceList= new ArrayList<>();
		System.out.println("\n----------------- Province Data ----------------------------");
		provinceList.add(new Province ("1","นครราชสีมา","1"));
		provinceList.add(new Province ("2","เชียงใหม่","1"));
		provinceList.add(new Province ("3","กาญจนบุรี","1"));
		provinceList.add(new Province ("4","ตาก","1"));
		provinceList.add(new Province ("5","อุบลราชธานี","1"));
		provinceList.add(new Province ("6","สุราษฎร์ธานี","1"));
		provinceList.add(new Province ("7","ชัยภูมิ","1"));
		provinceList.add(new Province ("8","แม่ฮ่องสอน","1"));
		provinceList.add(new Province ("9","เพชรบูรณ์","1"));
		provinceList.add(new Province ("10","ลำปาง","1"));
		provinceList.add(new Province ("11","อุดรธานี","1"));
		provinceList.add(new Province ("12","เชียงราย","1"));
		provinceList.add(new Province ("13","น่าน","1"));
		provinceList.add(new Province ("14","เลย","1"));
		provinceList.add(new Province ("15","ขอนแก่น","1"));
		provinceList.add(new Province ("16","พิษณุโลก","1"));
		provinceList.add(new Province ("17","บุรีรัมย์","1"));
		provinceList.add(new Province ("18","นครศรีธรรมราช","1"));
		provinceList.add(new Province ("19","สกลนคร","1"));
		provinceList.add(new Province ("20","นครสวรรค์","1"));
		provinceList.add(new Province ("21","ศรีสะเกษ","1"));
		provinceList.add(new Province ("22","กำแพงเพชร","1"));
		provinceList.add(new Province ("23","ร้อยเอ็ด","1"));
		provinceList.add(new Province ("24","สุรินทร์","1"));
		provinceList.add(new Province ("25","อุตรดิตถ์","1"));
		provinceList.add(new Province ("26","สงขลา","1"));
		provinceList.add(new Province ("27","สระแก้ว","1"));
		provinceList.add(new Province ("28","กาฬสินธุ์","1"));
		provinceList.add(new Province ("29","อุทัยธานี","1"));
		provinceList.add(new Province ("30","สุโขทัย","1"));
		provinceList.add(new Province ("31","แพร่","1"));
		provinceList.add(new Province ("32","ประจวบคีรีขันธ์","1"));
		provinceList.add(new Province ("33","จันทบุรี","1"));
		provinceList.add(new Province ("34","พะเยา","1"));
		provinceList.add(new Province ("35","เพชรบุรี","1"));
		provinceList.add(new Province ("36","ลพบุรี","1"));
		provinceList.add(new Province ("37","ชุมพร","1"));
		provinceList.add(new Province ("38","นครพนม","1"));
		provinceList.add(new Province ("39","สุพรรณบุรี","1"));
		provinceList.add(new Province ("40","ฉะเชิงเทรา","1"));
		provinceList.add(new Province ("41","มหาสารคาม","1"));
		provinceList.add(new Province ("42","ราชบุรี","1"));
		provinceList.add(new Province ("43","ตรัง","1"));
		provinceList.add(new Province ("44","ปราจีนบุรี","1"));
		provinceList.add(new Province ("45","กระบี่","1"));
		provinceList.add(new Province ("46","พิจิตร","1"));
		provinceList.add(new Province ("47","ยะลา","1"));
		provinceList.add(new Province ("48","ลำพูน","1"));
		provinceList.add(new Province ("49","นราธิวาส","1"));
		provinceList.add(new Province ("50","ชลบุรี","1"));
		provinceList.add(new Province ("51","มุกดาหาร","1"));
		provinceList.add(new Province ("52","บึงกาฬ","1"));
		provinceList.add(new Province ("53","พังงา","1"));
		provinceList.add(new Province ("54","ยโสธร","1"));
		provinceList.add(new Province ("55","หนองบัวลำภู","1"));
		provinceList.add(new Province ("56","สระบุรี","1"));
		provinceList.add(new Province ("57","ระยอง","1"));
		provinceList.add(new Province ("58","พัทลุง","1"));
		provinceList.add(new Province ("59","ระนอง","1"));
		provinceList.add(new Province ("60","อำนาจเจริญ","1"));
		provinceList.add(new Province ("61","หนองคาย","1"));
		provinceList.add(new Province ("62","ตราด","1"));
		provinceList.add(new Province ("63","พระนครศรีอยุธยา","1"));
		provinceList.add(new Province ("64","สตูล","1"));
		provinceList.add(new Province ("65","ชัยนาท","1"));
		provinceList.add(new Province ("66","นครปฐม","1"));
		provinceList.add(new Province ("67","นครนายก","1"));
		provinceList.add(new Province ("68","ปัตตานี","1"));
		provinceList.add(new Province ("69","กรุงเทพฯ","1"));
		provinceList.add(new Province ("70","ปทุมธานี","1"));
		provinceList.add(new Province ("71","สมุทรปราการ","1"));
		provinceList.add(new Province ("72","อ่างทอง","1"));
		provinceList.add(new Province ("73","สมุทรสาคร","1"));
		provinceList.add(new Province ("74","สิงห์บุรี","1"));
		provinceList.add(new Province ("75","นนทบุรี","1"));
		provinceList.add(new Province ("76","ภูเก็ต","1"));
		provinceList.add(new Province ("77","สมุทรสงคราม","1"));
		return provinceList;
	}
	
	public List<Dropdown> getDropdown(){
		List<Dropdown> dropdowneList= new ArrayList<>();
		System.out.println("\n----------------- Dropdown Data ----------------------------");
		dropdowneList.add(new Dropdown("1","Province"));
		return dropdowneList;
	}
	

}
