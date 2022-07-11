package pac1;

public class LeftDownMirrorPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 10;
		for (int i = 1; i <= row; i++) {
			for (int j = row; j >= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
