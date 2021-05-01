public class Horse extends Animal {
//Override
public void sound() {
	System.out.println("Neigh");			//Mencetak suara kuda
}

public static void main(String args[]) {
	Animal obj = new Horse();				//Membuat objek (instance) baru bernama obj untuk class Cat
	obj.sound();							//Menjalankan method versi Class Horse
}
}