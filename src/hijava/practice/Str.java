package hijava.practice;

public class Str {

	public static void main(String[] args) {
		char c = '가'; // cf. char c = 65; or char c = '\uD55C';
		byte b = 'A';
		System.out.println(c);
		System.out.println((int) c); // cf. (char)c or (char)b
		System.out.println(b);
		
		String str = "AB";
		System.out.println(str);
		System.out.println("AB".getBytes().length);
		System.out.println("가".getBytes().length);
		
		System.out.println("0.1+0.2 = "+(0.1+0.2));
//	한글은 2Byte로도 표현되지만 유니코드로 취급해서 getBytres()로 확인하면 3Byte를 차지함.
//	컴퓨터의 소수점 계산은 정확하지 않아 반올림을 해줘야함.		
	}

}
