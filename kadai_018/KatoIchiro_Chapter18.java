package kadai.kadai_018;

public class KatoIchiro_Chapter18 extends Kato_Chapter18 {
	
	//コンストラクタ
	public KatoIchiro_Chapter18() {
		setGivenName();
		setaddress();
	}
	
	//名前をセット
	public void setGivenName() {
		this.givenName="一郎"; 
	}
	
	//住所をセット
	public void setaddress() {
		this.address="東京都中野区◯×";
	}
	
	//抽象メソッドの部分　個別の紹介を出力
	public void eachIntroduce() {
		System.out.println("好きな食べ物はリンゴです");
		System.out.println();
	}
	
}
