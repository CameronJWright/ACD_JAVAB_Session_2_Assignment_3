package Assignments;

public class XPattern {

	public static void main(String[] args) {

		int n = 5;
		int count = 0;
		for (int row = 0; row < n; row++) {
			count = 0;
			for (int col = 0; col < n; col++) {

				if (row == col || row + col == n - 1) {
					System.out.print("*");
					count++;
					if(row == col && row + col == n - 1)
						count++;
				} else {
					if(count<2)
					System.out.print("_");
				}
				if(count<2)
				System.out.print("_");
			}

			System.out.println();
		}

	}
}
