package study0427;

import java.util.Scanner;

public class interface_ex_0427 {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		
		Stu s1=new Stu("IoT",1111);
		s1.name="홍길동";
		s1.age="20";
		s1.add="서울시 노원구";
		
		s1.print();
		s1.inputAvg();
		s1.maxScore();
		s1.minScore();
		
		//4.27 업데이트 생성자오버로딩 하기
		Stu s2=new Stu("둘리","1000","서울시 도봉구","마술", 2222);
		s2.print();
		
		//4.27 업데이트 멤버변수로 업캐스팅(업캐스팅 헷갈린다)
		school s3=new school();
		s3.show(s2);
		s3.show(s1);
		//업캐스팅 되어서(스쿨은 펄슨타입을 받았음)
//		스쿨타입의 s3가 school에 있는 메서드이용 하여 상속관계가 없는 Stu객체에 사용할 수 있게 됨   
		
		



	}//main
}//class


class Person{
	String add;
	String name;
	String age;
	Person(){}//기본생성자
	
}//class


class Stu extends Person{
	String major;
	int no;
	double[] score=new double[8];

	Stu(){}//기본생성자
	Stu(String m, int _no){
		//m학과 no학번
		major=m;
		no=_no;
	}
//	4.27 업데이트 생성자로 바로 객체 만들기  
	Stu(String name, String age, String add, String major, int no){		
		this.name=name; this.age=age; this.add=add; 
		this.major=major; this.no=no;
	}

	double inputAvg(){
		//점수를 get,set으로 받아야 하나?? 
		System.out.println("8학기 학점을 순서대로 입력하세요");

		Scanner sc=new Scanner(System.in);
		double total=0;	
		
		for (int i= 0; i <score.length; i++) {
			double rel=sc.nextDouble();
			System.out.print((i+1)+"학기 학점 → "+rel);

			score[i]=rel;
			total=total+rel;
//			System.out.println(total);
			
		}
//		System.out.println("스코어 3번 저장값: "+score[3]); 배열저장값 확인 
		System.out.println("\n\n"+score.length+"학기 총 평균평점은 "+total+"점입니다");

		return total;
	}//avg메서드 종료

	void print() {
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
		System.out.println("주소: "+add);
		System.out.println("학과: "+major);
		System.out.println("학번: "+no);
		System.out.println("----------------------------------");
	}
	
	//4.27 업데이트 배열의 max, min출력 
	double maxScore(){
		double max=score[0];
		
		for (int i = 0; i < score.length; i++) {
			if (max<score[i]) {
				max=score[i];}

		}System.out.println("\n최고학점: "+max); 
		return max;
	}
	
	double minScore(){
		double min=score[0];
		for (int i = 0; i < score.length; i++) {
			if (min>score[i]) {
				min=score[i];}

		}System.out.println("최저학점 : "+min+"\n"); 
		return min;
	}
	
	
}//class

class school {
	void show(Person p) {
			System.out.println("1. 이름: "+p.name);
			System.out.println("2. 나이: "+p.age);
			System.out.println("3. 주소: "+p.add);
//			System.out.println("학과: "+p.major);
//			System.out.println("학번: "+p.no);
			System.out.println("----------------------------------");
		}
	}











