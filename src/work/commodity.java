package work;

/*
 * 請利用商品做出集合
 * 
 * 1.請自行建立一個 goods類別，裡面有商品名稱、價格、廠商
 * 2.可以讓消費者自行建立商品名稱、價格、廠商 後 ，放入集合
 * 3.使用者可以快速搜尋到商品名稱，並顯示其價格
 * 4.消費者可以依照目前索存在的商品放入購物遮中
 *   當消費者選結帳時，系統要出現每一個商品名稱、價格
 *   最後顯示及帳總額
 */
import java.util.*;
public class commodity {
	
	public static void main(String[] args) {
		int money = 0;
		Onlie_Story on = new Onlie_Story(); 
		Scanner scan = new Scanner(System.in);
		// 新增產品
		goods list = new goods("運動用品",198,"GUMD");
		goods list1 = new goods("食品",88,"統一工作彷");
		goods list2 = new goods("珠寶",120000,"MDVOES");
		goods list3 = new goods("電子產品",7000,"SAMSUNG");
		goods list4 = new goods("家具",15000,"大同");
		// 查找產品的集合 
		ArrayList<goods> news = new ArrayList<>();
		news.add(list);
		news.add(list1);
		news.add(list2);
		news.add(list3);
		news.add(list4);
		
		// 顧客選擇商品放到集合 
		ArrayList<goods> item = new ArrayList<>();
		
		System.out.println("看廣告可以輸入2022");
		System.out.println("查詢商品內容輸入1");
		System.out.println("購買明商品請輸入2");
		System.out.println("====================");
		
			try {
				int person  = scan.nextInt();
				switch(person) {
					case 2022: // 廣告
						on.isMe("冬森購物");
						on.advertise();						
						
						break;
					case 1 : // 查找商品並印出
						for(int i = 0 ; i < news.size(); i++) { // 商品內容
//							System.out.println(news.get(i).getCommodit());
							String name = news.get(i).getCommodit();
							int price = news.get(i).getPrice();
							String Manuf = news.get(i).getManufacturer();
							System.out.println("商品名稱:"+name);
							System.out.println("價格:" + price);
							System.out.println("廠商:"+ Manuf+"\n");	
						}
					break;
					case 2 :
						System.out.println("購買商品輸入該商品的號碼");
						System.out.println("1:運動用品、2:食品、");
						System.out.println("3:珠寶、4:電子產品、5:家具");
						System.out.println("結算商品輸入9");
						System.out.println("===========================");
						while(list != null){ // 顧客選擇商品並結算金額
							int lol = scan.nextInt();
								if (lol == 1)
									item.add(list);
								if (lol == 2)
									item.add(list1);
								if (lol == 3)
									item.add(list2);
								if (lol == 4)
									item.add(list3);
								if (lol == 5)
									item.add(list4);
								if (lol == 9)
									list = null;
								
						}
						System.out.println("印出購買明細:\n");
						for(int i = 0 ; i < item.size(); i++) { // 印出購買明細
							String name = item.get(i).getCommodit();
							int price = item.get(i).getPrice();
							String Manuf = item.get(i).getManufacturer();
							System.out.println("商品名稱:"+name+"， 價格:" + price+"， 廠商:"+ Manuf+"\n");
							money += price; 	 
						}
						System.out.println("金額總共: " + money);
						break;
						
					}
				
			}catch(Exception e) {	/*System.out.println(e.getMessage());*/ 
				System.out.println("程式已終止! 請重新啟動....");
				on.callPhone();
				
			}

	}	

}	
	
	
		


