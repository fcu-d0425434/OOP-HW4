package fcu.iecs.oop.password;

public class PasswordEncorder {
		private String password;
		public void setpass(String str1){
			str1=str1.replace("a","4");
			str1=str1.replace("A","4");
			str1=str1.replace("e","3");
			str1=str1.replace("E","3");
			str1=str1.replace("i","1");
			str1=str1.replace("I","1");
			str1=str1.replace("o","0");
			str1=str1.replace("O","0");
			str1=str1.replace("t","7");
			str1=str1.replace("T","7");
		password = str1;
		}
		public String getpass(){
		return password;
		}

	}

