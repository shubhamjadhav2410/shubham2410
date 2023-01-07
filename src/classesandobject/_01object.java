package classesandobject;
class box{
	int length;
	int width;
	int height;
	
	public void area() {
		System.out.println("area of a box");
	}
}

public class _01object {
	public static void main(String[]args) {
		box squareBox =new box();
		squareBox.length=100;
		squareBox.width=150;
		squareBox.height=159;
		
	System.out.println(squareBox.length);
		
		
	}

}
