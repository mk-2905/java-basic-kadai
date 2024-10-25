package kadai.kadai_021;
import java.util.ArrayList;

public class DictionaryExec_Chapter21 {
	
	
	public static void main(String[]args) {
		
		//辞書インスタンス作成
		Dictionary_Chapter21 dictionary= new Dictionary_Chapter21();
		
		//調べる英単語のセット
		ArrayList<String>wordlist=new ArrayList<String>();
		wordlist.add("apple");
		wordlist.add("banana");
		wordlist.add("grape");
		wordlist.add("orange");

		//辞書を調べる
		dictionary.search(wordlist);

	}

}
