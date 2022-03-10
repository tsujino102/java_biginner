package java_biginner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class java02 {

	public static void main(String[] args) {
		System.out.println("検索したい人の名前を入力してください。");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		ArrayList<String> nameList = new ArrayList<>(Arrays.asList("ボンバー岡田", "西山 利一", "橋本 名人"));
		ArrayList<String> telList = new ArrayList<>(Arrays.asList("090-0123-0321", "090-1100-0011", "090-1325-5231"));

		String result = select(name,nameList,telList);
		
		if(result != null) {
			System.out.println(result);
		}else {
			System.out.println("データに登録がありません");			
		}
	}
	public static String select(String name,List<String> nameList,List<String> telList) {
		for (String n : nameList) {
			if (n.indexOf(name) != -1) {
				int number = nameList.indexOf(n);
				return n + "\n" + telList.get(number);
			}
		}
		return null;
	}
}
