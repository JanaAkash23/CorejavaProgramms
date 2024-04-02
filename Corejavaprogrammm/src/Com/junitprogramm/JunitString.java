package Com.junitprogramm;

public class JunitString {
		String strOne,strTwo;
		public JunitString(String strOne, String strTwo){
			this.strOne=strOne;
			this.strTwo=strTwo;
		}
		public String display(){
			if(strOne.equals(strTwo))
				return"Both strings are eqqual";
			return"Both strings are not eqqual";
		}

}
