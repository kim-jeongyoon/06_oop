package edu.kh.practice.snack.model.vo;

public class Snack {
	
	// 필드
	private String kind;
	private String name;
	private String flavor;
	private int numOf;
	private int price;
	
	//생성자 
	//기본생성자: 반환형이 없고, 클래스 이름과 동일 
	
	public Snack() {}
	
	//매개변수 생성자
	public Snack(String kind, String name, String flavor, 
			int numOf, int price) {
		
		this.kind = kind;
		this.name = name;
		this.flavor = flavor;
		this.numOf = numOf;
		this.price = price;
		
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public int getNumOf() {
		return numOf;
	}

	public void setNumOf(int numOf) {
		this.numOf = numOf;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String information() {
		
		return kind + "(" + name +" - " + flavor + ")" + numOf +"개 " + price + "원 " ;
	}
		
}
	
	




