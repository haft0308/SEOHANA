package study0502;

public class ex_class_0502 {

	public static void main(String[] args) {
		
		Rectangel s1=new Square(3,7,6,8,10);
		//�����ڷ� �ٷ� ���־ ���� 
		Square s2=(Square)s1;//s1�� ����� �ִ� ���������� ĳ����!
		System.out.print("s1 "); s1.area();
		System.out.print("s1 "); s2.vol();
		
		System.out.println();
		Square s3=new Square();
		s3.x1=3;
		s3.x2=6;
		s3.y1=7;
		s3.y2=5;
//		s3.z//������Ʈ�� ������ ���Ұ�! 
		s3.h=6;
		s3.area();
		s3.vol();
		
		
//		<�簢�� �ϵ��ڵ�>
//		int x1=6; int y1=6;
//		int x2=3; int y2=3; int z;
//		//���� ���μ��θ� �˰������� �Ǵϱ� 
//		int x=Math.abs(x1-x2);//���̴� �׻� ����� ���밪 ���
//		int y=Math.abs(y1-y2); 
//		z=x*y; System.out.println("�簢�� ����"+z);
	}//m
}//c

class Rectangel{
	int x1;
	int y1;
	int x2;
	int y2;
	protected int z;
	//����ڰ� ���̰��� �������� ���ϰ� Ŭ������������ ��밡���� ������Ƽ��� ����  
	Rectangel(){}
	
	void area() {
		int x=Math.abs(x1-x2);
		int y=Math.abs(y1-y2);
		z = x*y;
		System.out.println("�簢���� ������ ��: "+z);
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
	void vol(){//�Ű������� �־��� ���� ���� ���̸� ���ؾ� ���Ǹ� ���� �� ��������
		//�Ű����� �ȳְ� ���� ���� �����ڷ� ���̱��� �־��� ���¶�� ������
		int a=z*h;
		System.out.println("�簢�� ����: "+a);
	}
}//c ������Ʈ 5_03 ����Ȯ��* 
//���� ����ϰ� ����� �;�����, ������� �Ѱ�
//������ �κ�: math�޼���, protected ���������� Ŭ���������� ��밡��, 
			//ĳ�������� �������� �Ұ�(���� ã�ƺ��߰���)
//������ �κ�: 2���� �迭�� ��� �;����� �Ұ���!! �ʹ� ��ƴ�!!�Ф� 
			//���� ���ϴ� �޼��带 ����Ŭ���� �޼��� ȣ���ؼ� ���� �;��µ� ���� �Ф� 
	