package exception;

public class Test_04 {
	public boolean Login(String u,String p) throws UserNotFoundException, UserMissMatchException{
		if(u.equals("root") && p.equals("root")){
			return true;
		}else if(u.equals("root")==true && p.equals("root")==false){
			throw new UserMissMatchException();
		}else if(u.equals("root")==false){
			throw new UserNotFoundException();
		}
		else return false;
	}
 public static void main(String[] args) {
	Test_04 t = new Test_04();
	try {
		boolean isok = t.Login("root", "tiger");
	} catch (UserNotFoundException e) {
		System.out.println("用户未找到");
	} catch (UserMissMatchException e) {
		System.out.println("用户名和密码不匹配");
	}
}
}
class UserNotFoundException extends Exception{
	  
}
class UserMissMatchException extends Exception{
	  
}
