package kadai.kadai_018;

public class KatoExec_Chapter18 {
	
	public static void main(String[]args) {
		
		//Taro作成
		Kato_Chapter18 Taro = new KatoTaro_Chapter18();
		//Ichiro作成
		Kato_Chapter18 Ichiro = new KatoIchiro_Chapter18();
		//Hanako作成
		Kato_Chapter18 Hanako = new KatoHanako_Chapter18();
		
		
		//Taro自己紹介実行
		Taro.setGivenName();
		Taro.execIntroduce();
		
		//Ichiro自己紹介実行
		Ichiro.setGivenName();
		Ichiro.execIntroduce();
		
		//Hanako自己紹介実行
		Hanako.setGivenName();
		Hanako.execIntroduce();
	}

}
