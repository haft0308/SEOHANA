package study0427;

import java.util.Scanner;

public class interface_ex_0427 {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		
		Stu s1=new Stu("IoT",1111);
		s1.name="ȫ�浿";
		s1.age="20";
		s1.add="����� �����";
		
		s1.print();
		s1.inputAvg();
		s1.maxScore();
		s1.minScore();
		
		//4.27 ������Ʈ �����ڿ����ε� �ϱ�
		Stu s2=new Stu("�Ѹ�","1000","����� ������","����", 2222);
		s2.print();
		
		//4.27 ������Ʈ ��������� ��ĳ����(��ĳ���� �򰥸���)
		school s3=new school();
		s3.show(s2);
		s3.show(s1);
		//��ĳ���� �Ǿ(������ �޽�Ÿ���� �޾���)
//		����Ÿ���� s3�� school�� �ִ� �޼����̿� �Ͽ� ��Ӱ��谡 ���� Stu��ü�� ����� �� �ְ� ��   
		
		



	}//main
}//class


class Person{
	String add;
	String name;
	String age;
	Person(){}//�⺻������
	
}//class


class Stu extends Person{
	String major;
	int no;
	double[] score=new double[8];

	Stu(){}//�⺻������
	Stu(String m, int _no){
		//m�а� no�й�
		major=m;
		no=_no;
	}
//	4.27 ������Ʈ �����ڷ� �ٷ� ��ü �����  
	Stu(String name, String age, String add, String major, int no){		
		this.name=name; this.age=age; this.add=add; 
		this.major=major; this.no=no;
	}

	double inputAvg(){
		//������ get,set���� �޾ƾ� �ϳ�?? 
		System.out.println("8�б� ������ ������� �Է��ϼ���");

		Scanner sc=new Scanner(System.in);
		double total=0;	
		
		for (int i= 0; i <score.length; i++) {
			double rel=sc.nextDouble();
			System.out.print((i+1)+"�б� ���� �� "+rel);

			score[i]=rel;
			total=total+rel;
//			System.out.println(total);
			
		}
//		System.out.println("���ھ� 3�� ���尪: "+score[3]); �迭���尪 Ȯ�� 
		System.out.println("\n\n"+score.length+"�б� �� ��������� "+total+"���Դϴ�");

		return total;
	}//avg�޼��� ����

	void print() {
		System.out.println("�̸�: "+name);
		System.out.println("����: "+age);
		System.out.println("�ּ�: "+add);
		System.out.println("�а�: "+major);
		System.out.println("�й�: "+no);
		System.out.println("----------------------------------");
	}
	
	//4.27 ������Ʈ �迭�� max, min��� 
	double maxScore(){
		double max=score[0];
		
		for (int i = 0; i < score.length; i++) {
			if (max<score[i]) {
				max=score[i];}

		}System.out.println("\n�ְ�����: "+max); 
		return max;
	}
	
	double minScore(){
		double min=score[0];
		for (int i = 0; i < score.length; i++) {
			if (min>score[i]) {
				min=score[i];}

		}System.out.println("�������� : "+min+"\n"); 
		return min;
	}
	
	
}//class

class school {
	void show(Person p) {
			System.out.println("1. �̸�: "+p.name);
			System.out.println("2. ����: "+p.age);
			System.out.println("3. �ּ�: "+p.add);
//			System.out.println("�а�: "+p.major);
//			System.out.println("�й�: "+p.no);
			System.out.println("----------------------------------");
		}
	}











