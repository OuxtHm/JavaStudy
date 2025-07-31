
/*
	일일 박스오피스 : searchMainDailyBoxOffice.do
	실시간 예매율 : searchMainRealTicket.do
	좌석 점유율 : searchMainDailySeatTicket.do

	메인 주소 : https://www.kobis.or.kr/kobis/business/main/
*/
import java.util.Scanner;

import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.jsoup.Jsoup;
import javax.swing.text.Document;
public class 제어문_5 {

	public static void main(String[] args) throws Exception{
		
		String url = "https://www.kobis.or.kr/kobis/business/main/";
		
		
		
		Scanner scan = new Scanner(System.in);
		while(true)
		{
			System.out.println("=========MENU=========");
			System.out.println("1. 박스오피스 순위");
			System.out.println("2. 실시간 예매율 순위");
			System.out.println("3. 좌석 점유율 순위");
			System.out.println("4. 종료");
			
			System.out.println("메뉴 선택");
			int menu = scan.nextInt();
			
			if(menu > 4 || menu < 1)
			{
				System.err.println("잘못된 메뉴선택입니다. 다시 선택하세요");
				continue;
			}
			
			if(menu == 4)
			{
				System.err.println("프로그램 종료");
				break;
			}
			else if(menu == 1)
			{
				url += "searchMainDailyBoxOffice.do";
				org.jsoup.nodes.Document doc = Jsoup.connect(url).get();
				System.out.println(doc.toString());
				String movie = doc.toString();
				movie = movie.substring(movie.indexOf("["), movie.lastIndexOf("]")+1);
				//System.out.println(movie);
				JSONParser jp = new JSONParser();
				JSONArray arr = (JSONArray)jp.parse(movie);
				//System.out.println(arr);
				for(int i = 0; i < arr.size(); i++)
				{
					JSONObject obj = (JSONObject)arr.get(i);
					System.out.println((i+1)+"."+obj.get("movieNm"));
				}
			}
			else if(menu == 2)
			{
				url += "searchMainRealTicket.do";
				org.jsoup.nodes.Document doc = Jsoup.connect(url).get();
				//System.out.println(doc.toString());
				String movie = doc.toString();
				movie = movie.substring(movie.indexOf("["), movie.lastIndexOf("]")+1);
				//System.out.println(movie);
				JSONParser jp = new JSONParser();
				JSONArray arr = (JSONArray)jp.parse(movie);
				//System.out.println(arr);
				for(int i = 0; i < arr.size(); i++)
				{
					JSONObject obj = (JSONObject)arr.get(i);
					System.out.println((i+1)+"."+obj.get("movieNm"));
				}
			}
			else if(menu == 3)
			{
				url += "searchMainDailySeatTicket.do";
				org.jsoup.nodes.Document doc = Jsoup.connect(url).get();
				System.out.println(doc.toString());
				String movie = doc.toString();
				movie = movie.substring(movie.indexOf("["), movie.lastIndexOf("]")+1);
				//System.out.println(movie);
				JSONParser jp = new JSONParser();
				JSONArray arr = (JSONArray)jp.parse(movie);
				//System.out.println(arr);
				for(int i = 0; i < arr.size(); i++)
				{
					JSONObject obj = (JSONObject)arr.get(i);
					System.out.println((i+1)+"."+obj.get("movieNm"));
				}
			}
			
			
		}

	}

}
