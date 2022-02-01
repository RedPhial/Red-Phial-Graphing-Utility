
public class RK5tst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
RK5 r = new RK5("s(x*1)",0,25);
r.changeStep(0.25);
r.RUNge();
System.out.println(r.getLambda());
	}

}
