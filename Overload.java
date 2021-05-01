	
class Overload {
	
	//Method overloading terjadi pada sebuah class yang memiliki nama method 
	//yang sama tapi memiliki parameter dan tipe data yang berbeda.
	
	void demo (int a) {					// Method Overloading 1 dengan parameter input integer
		System.out.println("a : " + a);
	}
	
	void demo (int a, int b) {			// Method Overloading 2 dengan 2 parameter input integer
		System.out.println("a and b : " + a + "," + b);
	}
	
	double demo (double a) {			// Method Overloading 3 dengan parameter input double
		System.out.println("double a : " + a);
		return a*a;						//menghasilkan nilai kuadrat variabel a
	}
}
