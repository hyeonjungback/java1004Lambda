package ex06;

interface Printable2 {
	void print(String msg);
}

public class Lambda2 {
	public static void main(String[] args) {
		Printable2 prn = new Printable2() {//익명의 (구현)객체

			@Override
			public void print(String msg) {
				System.out.println(msg);
			}
		};
		prn.print("msg print2");
	}
}
