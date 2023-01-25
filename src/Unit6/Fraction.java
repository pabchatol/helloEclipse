package Unit6;

public class Fraction {
	private int num;
	private int den;
	private int counter;
	private int min;
	
	//constructors
	public Fraction(int num, int den) {
		this.num=num;
		this.den=den;
	}
	public Fraction(double dec) {
		do
		{
			dec=dec*10;
			counter++;
		}
		while(!(dec==(int)dec));
		this.num=(int) dec;
		this.den=(int)Math.pow(10, counter);
		simplify();
	}
	//getters
	public int getNum() {
		return num;
	}
	public int getDen() {
		return den;
	}
	@Override
	public String toString() {
		return num +"/"+ den;
	}
	//setters
	public void setNum(int num) {
		this.num = num;
	}
	public void setDen(int den) {
		this.den = den;
	}
	//methods
	public Fraction simplify() {
		Fraction res = new Fraction(0,0);
		if (den<num) {
			min=den;
		}
		else {
			min=num;
		}
		for (int i = 2; i < min; i++) {
			while(num%i==0 && den%i==0) {
				num=num/i;
				den=den/i;
			}

		}
		res.num=this.num;
		res.den=this.den;
		return res;
		}
	
	public Fraction add(Fraction a) {
		Fraction res = new Fraction(0,0);
		if (this.den==a.den) {
			res.num=this.num+a.num;
			res.den=this.den;
		}
		else {
			res.num=(this.num*a.den)+(this.den*a.num);
			res.den=this.den*a.den;
			res.simplify();
		}
		return res;
	}
	
	public Fraction sub(Fraction a) {
		Fraction res = new Fraction(0,0);
		if (this.den==a.den) {
			res.num=this.num+a.num;
			res.den=this.den;
		}
		else {
			res.num=(this.num*a.den)-(this.den*a.num);
			res.den=this.den*a.den;
			res.simplify();
		}
				
		return res;
	}
	public Fraction mul(Fraction a) {
		Fraction res= new Fraction(0,0);
		res.num=this.num*a.num;
		res.den=this.den*a.den;
		res.simplify();
		return res;
	}
	public Fraction div(Fraction a) {
		Fraction res=new Fraction(0,0);
		res.num=this.num*a.den;
		res.den=this.den*a.num;
		res.simplify();
		return res;
	}
}
