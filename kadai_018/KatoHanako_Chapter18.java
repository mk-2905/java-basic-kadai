package kadai.kadai_018;

public class KatoHanako_Chapter18 extends Kato_Chapter18 {
	
	//コンストラクタ
	public KatoHanako_Chapter18() {
		setGivenName();
		setaddress();
	}
	
	//名前をセット
	public void setGivenName() {
		this.givenName="花子"; 
	}
	
	//住所をセット
	public void setaddress() {
		this.address="東京都中野区◯×";
	}
	
	//抽象メソッドの部分　個別の紹介を出力
	public void eachIntroduce() {
		System.out.println("趣味は読書です");
		System.out.println();
	}
	
}
