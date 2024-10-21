package kadai.kadai_015;

public class Car_Chapter15 {
	//フィールド
	private int gear =1; //ギア
	private int speed=10; //ギアチェンジ後の速度
	
	
	//ギアチェンジメソッド
	public void gearChange(int afterGear) {
		this.gear=afterGear;
	}
	//ギアチェンジ後の速度を表示する
	public void run() {
		switch(gear) {
			case 1	-> speed=10;
			case 2	-> speed=20;
			case 3	-> speed=30;
			case 4	-> speed=40;
			case 5	-> speed=50;
			default -> speed=10;
		}
		System.out.println("時速"+speed+"km");
	}
}
