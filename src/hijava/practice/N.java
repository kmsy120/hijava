package hijava.practice;

public class N {
	int x = 10;
	int y = 20;
	
	public void swap() {
		int temp = x;
		x = y;
		y = temp;
		y=x;
	}
	public static void main(String[] args) {
		N n = new N();
		System.out.println(n.x+"/"+n.y);
		n.swap();
		System.out.println(n.x+"/"+n.y);
	}
}
