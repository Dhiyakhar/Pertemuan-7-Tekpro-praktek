public class Cat extends Animal {
//Override
public void sound() {
	System.out.println("Meow");				//Mencetak suara kucing
}

public static void main(String args[]) {
	Animal obj = new Cat();					//Membuat objek (instance) baru bernama obj untuk class Cat
	obj.sound();							//Menjalankan method versi Class Cat
}
}
