package Unit6;

public class WrapperPrueba {

	public static void main(String[] args) {
		int n =2;
		Integer nObj;
		String str;
		int a =5;
		Integer aObj;
		String astr;
		
		double m =2.3;
		Double mObj;
		String mstr;
		double b =5.7;
		Double bObj;
		String bstr;
		
		//from int to Integer
		nObj=Integer.valueOf(n);
		System.out.println("Integer: "+nObj);
		
		//from Integer to String
		str= nObj.toString();
		System.out.println("String: "+str);
		
		//from String to int
		n=Integer.parseInt(str);
		System.out.println("int: "+n);
		
		//from int to String
		astr=Integer.toString(a);
		System.out.println("String: "+astr);
		
		//from String to Integer
		aObj=Integer.valueOf(astr);
		System.out.println("Integer: "+aObj);
		
		//from Integer to int
		a=aObj.intValue();
		System.out.println("int: "+a);
		/////////////////////////////////////////
		// from double to Double
		mObj=Double.valueOf(m);
		System.out.println("Double: "+mObj);
		
		//from Double to String
		mstr=mObj.toString();
		System.out.println("String: "+mstr);
		
		//from String to double
		m=Double.parseDouble(mstr);
		System.out.println("double: "+m);
		
		//from double to String
		bstr=Double.toString(b);
		System.out.println("String: "+bstr);
		
		//from String to Double
		bObj=Double.valueOf(bstr);
		System.out.println("Double: "+bObj);
		
		//from Double to double
		b=bObj.doubleValue();
		System.out.println("double: "+b);
	}
}
