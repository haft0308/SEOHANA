package study0425;

import java.util.Scanner;

public class game_ex_0425 {
	public static void main(String []args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("��=======================��");
		System.out.println("��	�����ϸ� Ű��⢸	��");
		System.out.println("��=======================��");
		Cha Cha=null;
		//ĳ���� ����
		playGame pg=null;
		//��ü����
		//������ �ϴ� ��ü ����
		//����� ��ĳ�ʷ� �޾Ƽ� null���� ����! 

		// �������� ��� �ٷ� �����ڷ� ��ü ���� 
		//		playGame pg1= new playGame(new pica());
		//		playGame pg2= new playGame(new gobook());
		//		playGame pg3= new playGame(new pairi());


		//������ �� �� �ִ� ��ī��(�� ĳ���� ����) ��ü ���� 
		int x;
		//System.out.println("ĳ���� ����\n �� ��ī�� �貿�α� �����̸�" );
		//x=sc.nextInt();

		//4.25 ������Ʈ ĳ���� ���� ���ѷ���(while(true))
		while(true) {
			System.out.println("ĳ���� ����\n �� ��ī�� �貿�α� �����̸� �귣������" );
			x=sc.nextInt();
			//4.26������Ʈ �������� �߰�
			int random=(int)(Math.random()*3+1); 
			
			switch(x) {
			case 1: Cha=new pica(); break;
			//��ĳ�ʷ� ���� x���ڸ� ���� ĳ���� Ÿ�� Cha�� ĳ���� ����
			//ĳ����1�� ��ĳ���� �� ���� 
			case 2: Cha=new gobook(); break;
			//����ġ���� ���� ��ü�� �־���ٰ� ����! 
			case 3: Cha=new pairi(); break;
			//4.26������Ʈ �������� �߰�
			case 4:	{if (random==1) { 
					Cha=new pica(); break;
				} else if(random==2) {
					Cha=new gobook(); break;
				}else {
					Cha=new pairi(); break;}}//case4 scope
			
			default: System.out.println("�ڡڡڡ��߸� ���áڡڡ� ����ĳ���͸� 1~3������ �ٽ� ����ּ���\n");
			System.out.println("��=======================��");
			System.out.println("��	�����ϸ� Ű��⢸	��");
			System.out.println("��=======================��");

			continue;
			}

			//					
			//					
			if(Cha==null) {
				//System.out.println("���� ����");
				//return;
			}else {
				pg=new playGame(Cha);//�̰� ���������� ������ ��� ��� 
			}
			//					���ѷ����� ������ ��� ����� �� �ְ� ��

			while(true) { //Ʈ��κ��� ������ ���� ���� 
				pg.showMenu(sc);
				if(pg.isExit()) {
					//�������� ������ ���ѷ��������� pg.play();�� ������ 
					//isexit�� ���ͷ� �޾ƿ� �� case���� �־��־��� 
					//pg.isExit()==true �̷��� if ���ǰ��� �־��־��� ������ ture���� �ؼ� 
					System.out.println("��������"); break;
				}//if
			}//while
		}//1 while

		//������ ���� 
		//		System.out.println("ĳ���� ����\n �� ��ī�� �貿�α� �����̸�" );
		//		int x=sc.nextInt();
		//		switch(x) {
		//		case 1: Cha=new pica(); break;
		//		//��ĳ�ʷ� ���� x���ڸ� ���� ĳ���� Ÿ�� Cha�� ĳ���� ����
		//		//ĳ����1�� ��ĳ���� �� ���� 
		//		case 2: Cha=new gobook(); break;
		//		//����ġ���� ���� ��ü�� �־���ٰ� ����! 
		//		case 3: Cha=new pairi(); break;
		//		
		//		default: System.out.println("�߸� ����, �ٽ� ���ÿ�");
		//		while(x<0 && x>4) {
		//		System.out.println("�߸� ����, ĳ���͸� 1~3������ �ٽ� ���ÿ�");
		//		return;}



		//				if(Cha==null) {
		//					//System.out.println("���� ����");
		//					//return;
		//				}else {
		//					pg=new playGame(Cha);//�̰� ���������� ������ ��� ��� 
		//				}
		//				//���ѷ����� ������ ��� ����� �� �ְ� ��
		//
		//				while(true) { //Ʈ��κ��� ������ ���� ���� 
		//					pg.showMenu(sc);
		//					if(pg.isExit()) {
		//						//�������� ������ ���ѷ��������� pg.play();�� ������ 
		//						//isexit�� ���ͷ� �޾ƿ� �� case���� �־��־��� 
		//						//pg.isExit()==true �̷��� if ���ǰ��� �־��־��� ������ ture���� �ؼ� 
		//						System.out.println("��������"); break;
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
			ret=true;// �������� 0�� �Ǿ� ������ ���� �ɼ� �ֵ��� flag������ ��
			//���Ⱑ ���� ���Ϲ��ε�! 
		}else {
			ret=false;
		}
		return ret;
	}
	//
	public void printInfo() {// �������
		System.out.println("\n���� ĳ���� ����");
		System.out.println("hp: "+hp+"/ energy: "+energy+"/ ����: "+lev+"\n");
		//		System.out.println("energy: "+energy);
		//		System.out.println("����: "+lev);
	}
}//ĳ���� class


class pica extends Cha{
	pica(){
		hp=30;
		energy=50;
		System.out.println("��ī�� ����");
		printInfo();
	}
	//�߻�ȭ�޼��带 pica��ü�� ��� 
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
		}//4.25 ������Ʈ ������ ��Ʈ �߰�
		System.out.println("\n�ڡڡڡڡ������մϴ١ڡڡڡڡڷ�����"
				+ "\n�ڡڡڡڡ������մϴ١ڡڡڡڡڷ�����\n");
	}

}//��ī�� class

class gobook extends Cha{
	gobook(){
		hp=40;
		energy=50;
		System.out.println("���α� ����");
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
		System.out.println("\n�ڡڡڡڡ������մϴ١ڡڡڡڡڷ�����"
				+ "\n�ڡڡڡڡ������մϴ١ڡڡڡڡڷ�����\n");
	}
}//���α� Ŭ����

//4.25 ������Ʈ Ŭ������ ���� �� ��ġ��ȭ
class pairi extends Cha{
	pairi(){
		hp=20;
		energy=30;
		System.out.println("���̸� ����");
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
		System.out.println("\n�ڡڡڡڡ������մϴ١ڡڡڡڡڷ�����"
				+ "\n�ڡڡڡڡ������մϴ١ڡڡڡڡڷ�����\n");
	}
}//���̸� class


class playGame{
	//�ʵ�
	private Cha cha;//ĳ����Ÿ���� cha ����
	private int menu;
	private boolean exit;

	//������
	playGame(){}
	public playGame(Cha _cha) {
		cha=_cha;
	} //�����ڿ��� ĳ���Ͱ��� �� �޾ƿ;���

	//�޼���
	public void showMenu(Scanner sc) {//�Ķ���͸� ��ĳ���� sc�� ���� 
		System.out.println("��� ���� ���� ���Ʒ� ������");
		//Ŭ�������� ��ĳ�ʰ� ��� �����ؼ� �޴��� �־��־���(�޼��� ���ۿ� �ٷ� �־ ����)

		menu=sc.nextInt();
		play();
	}

	public void play() {
		//����ġ�� ���� ���� �ʵ尪 �޴����� �������� �޴��� ��ĳ�ʿ��� ����� ���� ���� 
		switch(menu) {
		case 1: cha.eat(); break;
		//��Դ� ��ü�� ������ �޴� cha�� ��� 
		//��,����,�÷���,Ʈ���̴��� ���� �߻�Ŭ�������� �޾Ƽ� �� ��ü���� ���� �Լ��� ��� 
		case 2: cha.sleep(); break;
		case 3: exit=cha.paly(); break;
		case 4: exit=cha.train(); break;
		case 5: exit=true; break;//���� ���Ϲ��� ������ �־��ذ� exit�� ���� �Ǹ� ����� �¹����� ���α׷� ���� 
		}
		cha.printInfo();
		//��⸦ �� ���� �������� �������� ����Ʈ�ϴ� �Լ��� ������ �� 


	}

	//set,get�κ� 
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
		return exit;//�� ���� �Ⱦ���?�����Ÿ���̶�!
	}
	public void setExit(boolean exit) {
		this.exit = exit;
	}

}//�����ϴ� class
