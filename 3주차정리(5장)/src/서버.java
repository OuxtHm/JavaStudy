import java.lang.reflect.Method;
import java.util.Scanner;

class User
{
	@RequestMapping("login.jsp")
	String login()
	{
		System.out.println("login처리");
		return "login.jsp";
	}
	
	@RequestMapping("member.jsp")
	String member()
	{
		System.out.println("회원가입 처리");
		return "Member.jsp";
	}
	
	@RequestMapping("board.jsp")
	String board()
	{
		System.out.println("게시판 요청 -> 처리");
		return "list.jsp";
	}
	@RequestMapping("aaa.jsp")
	String aaaaaaa()
	{
		System.out.println("요청 -> 처리");
		return "aaa.jsp";
	}
}


public class 서버 {

	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		System.out.println("URL 주소 입력: ");
		String url = scan.nextLine();
		// http://localhost:8080/member/login.jsp?id=aaa
		
		String cmd = url.substring(url.lastIndexOf("/")+1, url.indexOf("?"));
		System.out.println(cmd);
		
		Class clsName = Class.forName("User");
		Object obj = clsName.getDeclaredConstructor().newInstance();
		Method[] methods = clsName.getDeclaredMethods();
		
		for(Method m : methods)
		{
			RequestMapping rm = m.getAnnotation(RequestMapping.class);
			if(rm.value().equals(cmd))
			{
				m.invoke(obj, null);
				break;
			}
		}
		
	}

}
