package stduy0420;

public class ex_7 {
	public static void main(String []args) {
		Car myCar=new Car(300);
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp(-50);
		myCar.speedUp(50);
		myCar.speedDown(-30);
		myCar.speedDown(30);
		myCar.speedDown(30);
		myCar.speedDown(30);
		myCar.speedUp(100);
		myCar.speedUp(300);


	}//main
}//class

class Car{
	int maxS;
	int speed;

	Car(){	}
	Car(int maxS){
		this.maxS=maxS;
		//System.out.println("최대속도: "+maxS+" 현재속도");
	}
	void speedUp() {
		speed=speed+5;
		System.out.println("최대속도: "+maxS+" 현재속도: "+speed);
	}

	void speedUp(int s_up) {

		if (s_up<0) {
	
			System.out.print("speedUp("+s_up+") 오류: 속도가 음수이므로 0으로 지정 \t");
			System.out.println("최대속도: "+maxS+" 현재속도: "+speed);
		}else if(s_up>=300) {
			//스피드값말고 입력값을 처음으로 필터링 해줘야함
			//스피드값은 앞에 받고 변경되지 않아서 조건에 들어갈 수 없음! 
			speed=300;
			System.out.print("최대속도보다 높아 최대 속도로 지정 \t");
			System.out.println("최대속도: "+maxS+" 현재속도: "+speed);
			
		}else{
			speed=speed+s_up;
			System.out.println("speedUp("+s_up+") 최대속도: "+maxS+" 현재속도: "+speed);
		}
	}
	
	void speedDown() {
		speed=speed-5;
		System.out.println("최대속도: "+maxS+" 현재속도: "+speed);
	}

	void speedDown(int s_down) {
		
		if(speed==0) {
			System.out.print("speedUp("+s_down+") 속도가 0보다 작아져 0으로 지정 \t");
			speed=0;
			System.out.println("최대속도: "+maxS+" 현재속도: "+speed);
		
		}else if(s_down>0){
			speed=speed-s_down;
			System.out.println("speedUp("+s_down+") 최대속도: "+maxS+" 현재속도: "+speed);

		}else if (s_down<0) {
			System.out.print("speedUp("+s_down+") 오류: 속도가 음수이므로 0으로 지정 \t");
			System.out.println("최대속도: "+maxS+" 현재속도: "+speed);

		}
		
	}


	
}//class