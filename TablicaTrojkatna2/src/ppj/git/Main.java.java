package ppj.git;

public class Main {

	public static void main(String[] args) {
		int n = 5;
		int[][] tablica = new int[n][];
		
		for (int i = 0; i < n; i++) {
			tablica[i] = new int[i + 1];
			for (int j = 0; j < i; j++) {
				tablica[i][j] = j;
			}
		}

for (int k = 0; k < tablica.length; k++) {
	for (int l = 0; l <= tablica[k].length; l++)
		System.out.print(l + ", ");
	System.out.println(" ");
}
		
	}

}
