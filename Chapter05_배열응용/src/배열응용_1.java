import java.io.*;	// file 입출력
import java.util.*;	// 검색 -> 검색어 

public class 배열응용_1 {

	public static void main(String[] args) throws Exception{
		String movie = "";
		File file = new File("c:\\JavaDev\\movie.txt");
		
		int i = 0; 	// 파일 읽어서 저장하는 변수
		// 한글자 읽기 -> 정수형으로 읽는다.
		FileReader fr = new FileReader(file);
		StringBuffer sb = new StringBuffer();
		while((i = fr.read()) != -1)
		{
			// -1 : EOF (End Of File)
			sb.append((char)i);
		}
		fr.close();
		movie = sb.toString();
		//System.out.println(movie);
		
		String[] mnos = new String[1938];
		String[] titles = new String[1938];
		String[] genres = new String[1938];
		String[] posters = new String[1938];
		String[] actors = new String[1938];
		String[] regdates = new String[1938];
		String[] grades = new String[1938];
		String[] directors = new String[1938];
		
		i = 0;
		
		String[] movies = movie.split("\n");
		for(String m : movies)
		{
			String[] info = m.split("\\|");
			mnos[i] = info[0];
			titles[i] = info[1];
			genres[i] = info[2];
			actors[i] = info[4];
			grades[i] = info[6];
			i++;
		}
		// 1. 출연진을 입력받아 출연한 영화 출력
		Scanner scan = new Scanner(System.in);
		System.out.print("출연진 이름을 입력하세요 >> ");
		String name = scan.next();
		System.out.print("=====" + name + "님의 출연작 =====");
		int count = 0;
		for(i = 0; i < actors.length; i++)
		{
			if(actors[i].contains(name))
			{
				count++;
				System.out.println(titles[i]);
				
			}
		}
		System.out.printf("촐 출연작품은 %d편입니다.\n", count);
		// 12세 관란과 영화 출력
		for(i = 0; i < grades.length; i++)
		{
			if(grades[i].contains("12"))
			{
				System.out.println(titles[i]);
			}
		}
		
	}

}
