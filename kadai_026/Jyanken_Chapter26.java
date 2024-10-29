package kadai.kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	
    private String phands;
    private String bhands;
    
	public  void getMyChoice() {
		//tryを使いScannerをCloseさせる
		try (Scanner scanner=new Scanner(System.in)){
			//rspのいずれかを取得するまでループを発生させる
			while(true) {
				//入力した内容を取得する
				System.out.println("r,s,pのいずれかを入力して下さい。(r=グー、s=チョキ、p=パー)");
				String input = scanner.next();

				//入力された内容が指定されたものか判別する
				if(input.equals("r") || input.equals("s") || input.equals("p")) {
					//プレイヤー側の手を取得
					phands=input;
					//rspが取得出来たのでループを抜ける
					break;
				}
				else{
					System.out.println("無効な入力です");
				}
			}
		}
	}


	//Bot側の手をランダムに抽出する
	public void getRandom(){
		//String型の配列0~2に各手をそれぞれ代入
		String[] hands={"r","s","p"};
		//0~2のランダム生成
		int randhands=(int)Math.floor(Math.random() * 3);
		//ランダム生成に応じた手を取得
		bhands=hands[randhands];
	}
	
	public void playGame() {
		
		//HashMap作成。それぞれの手を略称から直す
		HashMap<String,String> handsMap = new HashMap<String,String>();
		
		handsMap.put("r", "グー");
		handsMap.put("s", "チョキ");
		handsMap.put("p", "パー");
		
		//HashMap作成。それぞれの手を数字に直す
		HashMap<String, Integer> mathMap = new HashMap<String, Integer>();
		mathMap.put("r", 2);//グー=2
		mathMap.put("s", 1);//チョキ=1
		mathMap.put("p", 0);//パー=0
		
		//HashMapを参照し、グー、チョキ、パーの言葉になおしてそれぞれの手を出力
		System.out.println("あなたが選んだのは"+handsMap.get(phands)+"です");
		System.out.println("対戦相手が選んだのは"+handsMap.get(bhands)+"です");
		
		//勝敗を計算する
		//勝利
		if((mathMap.get(phands) - mathMap.get(bhands) +3) %3 ==1) {
			System.out.println("自分の勝ちです");
		}
		//引き分け
		else if(mathMap.get(phands) == mathMap.get(bhands)){
			System.out.println("あいこです");
		}
		//負け
		else {
			System.out.println("自分の負けです");
		}
	}
}