package work;

import java.util.ArrayList;

public class Onlie_Story {
	
	 String name;
	 goods good;
	 
	 
	
	
	 public void isMe(String name) {
		 System.out.println("歡迎您的來到!此商場是:"+ name + "，提供良好商品及優惠的價格!");
		 System.out.println("期望您可在此購物愉快");
	 }
	 
	 
	 public void advertise() {
		 System.out.print("廣告1:");
		 System.out.println("慶中秋，買好禮，送中秋月餅\n");
		 
		 System.out.print("廣告2:");
		 System.out.println("2022周年慶~消費滿5000元送500元折價卷!");
		 System.out.println("超值折扣!!! 心動不如馬上行動~\n");
		 
		 System.out.print("廣告3:");
		 System.out.println("好消息!好消息! 現在不只買越多送越多，還能抽獎");
		 System.out.println("汽車、冰箱、電視 等許多獎品好禮，消費滿1000元就可以有抽獎卷");
		 System.out.println("還不趕快去買~\n");
	 }
	 
	 public void callPhone() {
		 System.out.print("若出現問題!? 請撥打給可服人員洽詢:");
		 System.out.println("0800-921-768");
		 System.out.println("郵遞信箱: " + "xxx05s123@gamil.com");
	 }
	 
	 public void totalMoney() {
		 System.out.println("抱歉，尚未設定商店品牌!無法計算金額");
	 }
		

}
