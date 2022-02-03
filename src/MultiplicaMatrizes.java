public class MultiplicaMatrizes {
	public static void main(String[] args) throws Exception {

		int a[][] = { { 4, 2 }, { 6, 8 } };
		int b[][] = { { 6, 6 }, { 7, 7 } };
		int c[][] = multiplica(a, b);

		int total = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				total += c[i][j];
			}
		}

		System.out.println("Total: " + total);
	}

	public static int[][] multiplica(int a[][], int b[][]) throws Exception {
		int valor = 0;
		int valor2 = 0;
		int linha = 0;
		int coluna = 0;
		int colunasA = numColunasA(a);
		int linhasB = numLinhasB(b);
		int c[][] = new int[colunasA][numLinhasB(b)];

		if (colunasA > linhasB || colunasA < linhasB) {
			throw new Exception("O número de colunas de A tem que ser igual ao número de linhas de B");
		} else {
			for (int i = 0; i < a.length; i++) {
				for (int x = 0; x < b.length; x++) {
					for (int j = 0; j < b.length; j++) {
						c[i][j] += a[i][x] * b[j][i];

					}
				}
			}
		}
		return c;
	}

	public static int tamanhoArray(int matriz[][]) {
		int tamanho = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				tamanho++;

			}
		}

		return tamanho;

	}

	public static int numColunasA(int a[][]) {
		int contador = 0;
		for (int i = 0; i < a.length; i++) {
			contador++;

		}

		return contador;
	}

	public static int numLinhasB(int b[][]) {
		int contador = 0;
		int j = 0;

		for (int i = 0; i < b[j].length; i++) {

			contador++;
		}
		return contador;
	}
}