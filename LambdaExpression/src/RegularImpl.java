
public class RegularImpl implements Square{

	@Override
	public int cal(int w) {
		// TODO Auto-generated method stub
		return w*w;
	}
	
	public static void main(String [] args) {
		RegularImpl r=new RegularImpl();
		System.out.println(r.cal(200));
		
	}
}

