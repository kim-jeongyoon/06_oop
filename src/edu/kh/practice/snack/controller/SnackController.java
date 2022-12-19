package edu.kh.practice.snack.controller;

import edu.kh.practice.snack.model.vo.Snack;

public class SnackController {
	
	private Snack s = new Snack();
		
	public SnackController() {} //기본생성자
	

	// saveData - 데이터를 setter를 이용해 저장하고 저장완료되었다는 결과를 반환
	public String saveData(String kind, String name, String flavol, int numOf, int price) {
		
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavol);
		s.setNumOf(numOf);
		s.setPrice(price);
		
		return "저장이 완료되었습니다." + "\n저장한 정보를 확인하겠습니까? y/n";
		
	}
	
	public String confirmData() {
		
		return s.information();
		
	}
	
	
	
	

	
	

	
	// confirmData
	

		

}
