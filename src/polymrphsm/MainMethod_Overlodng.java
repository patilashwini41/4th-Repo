package polymrphsm;

public class MainMethod_Overlodng {

	

		// we can overload main method..but compiler will look for string array type main n execute it

		public static void m1() {

			System.out.println("m1 method no argument");
		}

		public static void m1(int a) {
			System.out.println("m1 with int type argument");
		}

		public static void m1(String s) {
			System.out.println("m1 with string type argument");
		}
		public static void main(String[] args) {

			MainMethod_Overlodng ref = new MainMethod_Overlodng();

			m1(10);

		}

		public static void main(int args) {

			MainMethod_Overlodng	 ref = new MainMethod_Overlodng();
			m1(10);
			System.out.println("Inside main with int arg");

		}

	

	}