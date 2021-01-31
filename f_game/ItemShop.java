package f_game;

public class ItemShop {

	String name;	//이름
	int hp;			//체력
	int mp;			//마나
	int att;		//공격력
	int def;		//방어력
	
	ItemShop[] shop;

	
	ItemShop(String name, int hp, int mp, int att, int def){
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		this.att = att;
		this.def = def;
	}
	
	String shopInfo(){
		String info = name + " :";
		if(0 < hp) info += " 체력+" + hp;
		if(0 < mp) info += " 마나+" + mp;
		if(0 < att) info += " 공격+" + att;
		if(0 < def) info += " 방어+" + def;
		return info;
	}
	
	ItemShop(){
		shop = new ItemShop[5];
		shop[0] = new ItemShop("불꽃 늑대의 이빨", 0, 0, 30, 0);
		shop[1] = new ItemShop("기사도 갑옷", 0, 0, 0, 30);
		shop[2] = new ItemShop("빨간 포션", 50, 0, 0, 0);
		shop[3] = new ItemShop("파란 포션", 0, 50, 0, 0);
		shop[4] = new ItemShop("신체 강화 물약", 20, 20, 20, 20);
		
		
	}

	/*
	void itemShop(){
		System.out.println("==========================");
		System.out.println("구매하고자 하는 아이템을 골라주세요");
		System.out.println("1. 크라켄의 빨판 (att +30)");
		System.out.println("2. 기사도 갑옷 (def +30)");
		System.out.println("3. 빨간 포션 (hp +50)");
		System.out.println("4. 파란 포션 (mp +50)");
		System.out.println("5. 신체 강화 물약 (전체 스탯 +20)");
		System.out.println("6. 뒤로 가기");
		System.out.println("==========================");
	}
	*/
	
	void buyItem(){
		int sell = 0;
		System.out.println("==========================");
		System.out.println("구매하고자 하는 아이템을 골라주세요");
		System.out.println("1. 불꽃 늑대의 이빨 (att +30)");
		System.out.println("2. 기사도 갑옷 (def +30)");
		System.out.println("3. 빨간 포션 (hp +50)");
		System.out.println("4. 파란 포션 (mp +50)");
		System.out.println("5. 신체 강화 물약 (전체 스탯 +20)");
		System.out.println("6. 뒤로 가기");
		System.out.println("==========================");
		
		switch (sell) {
		case 1:
			System.out.println("불꽃 늑대의 이빨을 구매하였습니다.");
			
			break;

		default:
			break;
		};
	}
	
	
}
