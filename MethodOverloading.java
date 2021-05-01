class MethodOverloading {
	public static void main (String args[])
	{
		Overload Obj = new Overload();	//membuat objek (instance)
		double result;				//Atribut result bertipe double
		Obj .demo(10);				//Menjalankan Method Overloading 1 dengan parameter input integer
		Obj .demo(10, 20);			//Menjalankan Method Overloading 2 dengan 2 parameter input integer
		result = Obj .demo(5.5);	//Menjalankan Method Overloading 3 dengan parameter input double
		System.out.println("O/P : " + result);
	}
}

