package study0425;

import java.util.Scanner;

public class game_ex_0425 {
	public static void main(String []args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("┌=======================┐");
		System.out.println("│	▶포켓몬 키우기◀	│");
		System.out.println("└=======================┘");
		Cha Cha=null;
		//캐릭터 생성
		playGame pg=null;
		//전체변수
		//게임을 하는 객체 생성
		//여기는 스캐너로 받아서 null값을 해줌! 

		// 선생님의 경우 바로 생성자로 객체 생성 
		//		playGame pg1= new playGame(new pica());
		//		playGame pg2= new playGame(new gobook());
		//		playGame pg3= new playGame(new pairi());


		//게임을 할 수 있는 피카츄(각 캐릭터 생성) 객체 생성 
		int x;
		//System.out.println("캐릭터 선택\n ① 피카츄 ②꼬부기 ③파이리" );
		//x=sc.nextInt();

		//4.25 업데이트 캐릭터 생성 무한루프(while(true))
		while(true) {
			System.out.println("캐릭터 선택\n ① 피카츄 ②꼬부기 ③파이리 ④랜덤생성" );
			x=sc.nextInt();
			//4.26업데이트 랜덤생성 추가
			int random=(int)(Math.random()*3+1); 
			
			switch(x) {
			case 1: Cha=new pica(); break;
			//스캐너로 받은 x숫자를 통해 캐릭터 타입 Cha에 캐릭터 생성
			//캐릭터1은 업캐스팅 된 상태 
			case 2: Cha=new gobook(); break;
			//스위치문에 위에 객체를 넣어줬다고 생각! 
			case 3: Cha=new pairi(); break;
			//4.26업데이트 랜덤생성 추가
			case 4:	{if (random==1) { 
					Cha=new pica(); break;
				} else if(random==2) {
					Cha=new gobook(); break;
				}else {
					Cha=new pairi(); break;}}//case4 scope
			
			default: System.out.println("★★★★잘못 선택★★★ 생성캐릭터를 1~3번에서 다시 골라주세요\n");
			System.out.println("┌=======================┐");
			System.out.println("│	▶포켓몬 키우기◀	│");
			System.out.println("└=======================┘");

			continue;
			}

			//					
			//					
			if(Cha==null) {
				//System.out.println("게임 종료");
				//return;
			}else {
				pg=new playGame(Cha);//이건 정상정으로 게임할 경우 대비 
			}
			//					무한루프로 게임을 계속 실행될 수 있게 함

			while(true) { //트루부분을 변수로 변경 가능 
				pg.showMenu(sc);
				if(pg.isExit()) {
					//선생님의 게임을 무한루프때문에 pg.play();을 적어줌 
					//isexit는 세터로 받아온 값 case문에 넣어주었음 
					//pg.isExit()==true 이렇게 if 조건값에 넣어주었음 언제라 ture여야 해서 
					System.out.println("게임종료"); break;
				}//if
			}//while
		}//1 while

		//수업시 예제 
		//		System.out.println("캐릭터 선택\n ① 피카츄 ②꼬부기 ③파이리" );
		//		int x=sc.nextInt();
		//		switch(x) {
		//		case 1: Cha=new pica(); break;
		//		//스캐너로 받은 x숫자를 통해 캐릭터 타입 Cha에 캐릭터 생성
		//		//캐릭터1은 업캐스팅 된 상태 
		//		case 2: Cha=new gobook(); break;
		//		//스위치문에 위에 객체를 넣어줬다고 생각! 
		//		case 3: Cha=new pairi(); break;
		//		
		//		default: System.out.println("잘못 선택, 다시 고르시오");
		//		while(x<0 && x>4) {
		//		System.out.println("잘못 선택, 캐릭터를 1~3번에서 다시 고르시오");
		//		return;}



		//				if(Cha==null) {
		//					//System.out.println("게임 종료");
		//					//return;
		//				}else {
		//					pg=new playGame(Cha);//이건 정상정으로 게임할 경우 대비 
		//				}
		//				//무한루프로 게임을 계속 실행될 수 있게 함
		//
		//				while(true) { //트루부분을 변수로 변경 가능 
		//					pg.showMenu(sc);
		//					if(pg.isExit()) {
		//						//선생님의 게임을 무한루프때문에 pg.play();을 적어줌 
		//						//isexit는 세터로 받아온 값 case문에 넣어주었음 
		//						//pg.isExit()==true 이렇게 if 조건값에 넣어주었음 언제라 ture여야 해서 
		//						System.out.println("게임종료"); break;
		//					}
		//				}

	}//main
}//class

abstract class Cha{
	protected int hp;
	protected int lev=0;
	protected int energy;

	public abstract void eat();
	public abstract void sleep();
	public abstract boolean paly();
	public abstract boolean train();
	public abstract void levUP();

	public boolean chcEnergy() {

		boolean ret =false;
		if(energy<=0) {
			ret=true;// 에너지가 0이 되어 게임이 종료 될수 있도로 flag변수를 둠
			//여기가 위에 와일문인듯! 
		}else {
			ret=false;
		}
		return ret;
	}
	//
	public void printInfo() {// 정보출력
		System.out.println("\n현재 캐릭터 정보");
		System.out.println("hp: "+hp+"/ energy: "+energy+"/ 레벨: "+lev+"\n");
		//		System.out.println("energy: "+energy);
		//		System.out.println("레벨: "+lev);
	}
}//캐릭터 class


class pica extends Cha{
	pica(){
		hp=30;
		energy=50;
		System.out.println("피카츄 생성");
		printInfo();
	}
	//추상화메서드를 pica객체가 사용 
	public void eat() {
		energy=energy+10;
	}
	public void sleep() {
		energy=energy+5;
	}

	public boolean paly() {
		energy= energy-20;
		hp=hp+5;
		levUP();
		return chcEnergy();
	}

	public boolean train() {
		energy= energy-15;
		hp=hp+20;
		levUP();
		return chcEnergy();
	}

	public void levUP() {
		if(hp>=40) {
			lev++;
			hp=hp-40;
		}//4.25 업데이트 레벨업 멘트 추가
		System.out.println("\n★★★★★축하합니다★★★★★레벨업"
				+ "\n★★★★★축하합니다★★★★★레벨업\n");
	}

}//피카츄 class

class gobook extends Cha{
	gobook(){
		hp=40;
		energy=50;
		System.out.println("꼬부기 생성");
		printInfo();
	}

	public void eat() {
		energy=energy+15;
	}
	public void sleep() {
		energy=energy+10;
	}
	public boolean paly() {
		energy= energy-30;
		hp=hp+15;
		levUP();
		return chcEnergy();
	}
	public boolean train() {
		energy= energy-20;
		hp=hp+30;
		levUP();
		return chcEnergy();
	}
	public void levUP() {
		if(hp>=50) {
			lev++;
			hp=hp-50;
		}
		System.out.println("\n★★★★★축하합니다★★★★★레벨업"
				+ "\n★★★★★축하합니다★★★★★레벨업\n");
	}
}//꼬부기 클래스

//4.25 업데이트 클래스명 변경 및 수치변화
class pairi extends Cha{
	pairi(){
		hp=20;
		energy=30;
		System.out.println("파이리 생성");
		printInfo();
	}

	public void eat() {
		energy=energy+5;
	}
	public void sleep() {
		energy=energy+20;
	}
	public boolean paly() {
		energy= energy-10;
		hp=hp+15;
		levUP();
		return chcEnergy();
	}
	public boolean train() {
		energy= energy-10;
		hp=hp+20;
		levUP();
		return chcEnergy();
	}
	public void levUP() {
		if(hp>=35) {
			lev++;
			hp=hp-35;
		}
		System.out.println("\n★★★★★축하합니다★★★★★레벨업"
				+ "\n★★★★★축하합니다★★★★★레벨업\n");
	}
}//파이리 class


class playGame{
	//필드
	private Cha cha;//캐릭터타입의 cha 변수
	private int menu;
	private boolean exit;

	//생성자
	playGame(){}
	public playGame(Cha _cha) {
		cha=_cha;
	} //생성자에서 캐릭터값을 꼭 받아와야함

	//메서드
	public void showMenu(Scanner sc) {//파라미터를 스캐너의 sc로 받음 
		System.out.println("①밥 ②잠 ③놀기 ④훈련 ⑤종료");
		//클래스에는 스캐너가 없어서 전달해서 메뉴에 넣어주었음(메서드 동작에 바로 넣어서 시작)

		menu=sc.nextInt();
		play();
	}

	public void play() {
		//스위치의 값은 위의 필드값 메뉴에서 가져오고 메뉴는 스캐너에서 사용자 에게 받음 
		switch(menu) {
		case 1: cha.eat(); break;
		//밥먹는 객체는 위에서 받는 cha를 사용 
		//잇,슬맆,플레이,트레이닝은 위에 추상클래스에서 받아서 각 객체별로 만든 함수를 사용 
		case 2: cha.sleep(); break;
		case 3: exit=cha.paly(); break;
		case 4: exit=cha.train(); break;
		case 5: exit=true; break;//위에 와일문의 조건을 넣어준거 exit가 참이 되면 종료와 맞물려서 프로그램 종료 
		}
		cha.printInfo();
		//놀기를 다 끝낸 다음에는 정보값을 프린트하는 함수를 가져다 씀 


	}

	//set,get부분 
	public Cha getCha() {
		return cha;
	}
	public void setCha(Cha cha) {
		this.cha = cha;
	}
	public int getMenu() {
		return menu;
	}
	public void setMenu(int menu) {
		this.menu = menu;
	}
	public boolean isExit() {
		return exit;//왜 셋을 안쓰고?→블리언타입이라!
	}
	public void setExit(boolean exit) {
		this.exit = exit;
	}

}//게임하는 class
