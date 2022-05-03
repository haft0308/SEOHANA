package study0502;

public class ex_class_0502 {

	public static void main(String[] args) {
		
		Rectangel s1=new Square(3,7,6,8,10);
		//생성자로 바로 값넣어서 실행 
		Square s2=(Square)s1;//s1을 스퀘어에 있는 볼륨쓰려고 캐스팅!
		System.out.print("s1 "); s1.area();
		System.out.print("s1 "); s2.vol();
		
		System.out.println();
		Square s3=new Square();
		s3.x1=3;
		s3.x2=6;
		s3.y1=7;
		s3.y2=5;
//		s3.z//프로텍트드 변수라 사용불가! 
		s3.h=6;
		s3.area();
		s3.vol();
		
		
//		<사각형 하드코딩>
//		int x1=6; int y1=6;
//		int x2=3; int y2=3; int z;
//		//나는 가로세로만 알고있으면 되니까 
//		int x=Math.abs(x1-x2);//길이는 항상 양수라서 절대값 사용
//		int y=Math.abs(y1-y2); 
//		z=x*y; System.out.println("사각형 넓이"+z);
	}//m
}//c

class Rectangel{
	int x1;
	int y1;
	int x2;
	int y2;
	protected int z;
	//사용자가 넓이값을 지정하지 못하게 클래스내에서만 사용가능한 프로텍티드로 설정  
	Rectangel(){}
	
	void area() {
		int x=Math.abs(x1-x2);
		int y=Math.abs(y1-y2);
		z = x*y;
		System.out.println("사각형의 넓이의 값: "+z);
	}
}//c

class Square extends Rectangel{
	int h;
	Square(){}
	Square(int x1, int y1, int x2, int y2, int h){
	this.x1=x1;
	this.y1=y1;
	this.x2=x2;
	this.y2=y2;
	this.h=h;
	}
//	Rectangel t
	void vol(){//매개변수로 넣어준 것은 위의 넓이를 구해야 부피를 구할 수 있음으로
		//매개변수 안넣고도 쓸수 있음 생성자로 높이까지 넣어준 상태라면 가능함
		int a=z*h;
		System.out.println("사각형 부피: "+a);
	}
}//c 업데이트 5_03 실행확인* 
//좀더 깔끔하게 만들고 싶었으나, 여기까지 한계
//공부한 부분: math메서드, protected 접근제어자 클래스에서만 사용가능, 
			//캐스팅으로 변수선언 불가(좀더 찾아봐야겠음)
//부족한 부분: 2차원 배열로 담고 싶었지만 불가능!! 너무 어렵다!!ㅠㅠ 
			//부피 구하는 메서드를 조상클래스 메서드 호출해서 쓰고 싶었는데 실패 ㅠㅠ 
	