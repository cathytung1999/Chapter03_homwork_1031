package test_p45;

public class test_p45 {
	public static void main(String[]args) {
		System.out.println("�ŧicar1");
		Car car1;
		car1 = new Car();
		
		car1.SetCar1(1234, 20.5);
		
		System.out.println("�ŧicar2");
		Car car2;
		
		System.out.println("�Ncar1���w��car2");
		car2 = car1;
		System.out.print("car1��");
		car1.show();
		System.out.print("car2��");
		car2.show();
		
		System.out.println("����car1���������");
		car1.SetCar1(2345, 30.5);
		System.out.print("car1��");
		car1.show();
		System.out.print("car2��");
		car2.show();
		
	}

}
class Car{
	private int num;
	private double gas;
	public Car(){
		System.out.println("�ͦ��F���l");
	}
	public void SetCar1(int n,double g ){
		num=n;
		gas=g;
		System.out.println("�N�����]��"+num+",�T�o�q�]��"+gas);
	}
	public void show(){
		System.out.println("�N�����]��"+num);
		System.out.println("�T�o�q�]��"+gas);
	}
}