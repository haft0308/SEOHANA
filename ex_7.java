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
		//System.out.println("�ִ�ӵ�: "+maxS+" ����ӵ�");
	}
	void speedUp() {
		speed=speed+5;
		System.out.println("�ִ�ӵ�: "+maxS+" ����ӵ�: "+speed);
	}

	void speedUp(int s_up) {

		if (s_up<0) {
	
			System.out.print("speedUp("+s_up+") ����: �ӵ��� �����̹Ƿ� 0���� ���� \t");
			System.out.println("�ִ�ӵ�: "+maxS+" ����ӵ�: "+speed);
		}else if(s_up>=300) {
			//���ǵ尪���� �Է°��� ó������ ���͸� �������
			//���ǵ尪�� �տ� �ް� ������� �ʾƼ� ���ǿ� �� �� ����! 
			speed=300;
			System.out.print("�ִ�ӵ����� ���� �ִ� �ӵ��� ���� \t");
			System.out.println("�ִ�ӵ�: "+maxS+" ����ӵ�: "+speed);
			
		}else{
			speed=speed+s_up;
			System.out.println("speedUp("+s_up+") �ִ�ӵ�: "+maxS+" ����ӵ�: "+speed);
		}
	}
	
	void speedDown() {
		speed=speed-5;
		System.out.println("�ִ�ӵ�: "+maxS+" ����ӵ�: "+speed);
	}

	void speedDown(int s_down) {
		
		if(speed==0) {
			System.out.print("speedUp("+s_down+") �ӵ��� 0���� �۾��� 0���� ���� \t");
			speed=0;
			System.out.println("�ִ�ӵ�: "+maxS+" ����ӵ�: "+speed);
		
		}else if(s_down>0){
			speed=speed-s_down;
			System.out.println("speedUp("+s_down+") �ִ�ӵ�: "+maxS+" ����ӵ�: "+speed);

		}else if (s_down<0) {
			System.out.print("speedUp("+s_down+") ����: �ӵ��� �����̹Ƿ� 0���� ���� \t");
			System.out.println("�ִ�ӵ�: "+maxS+" ����ӵ�: "+speed);

		}
		
	}


	
}//class