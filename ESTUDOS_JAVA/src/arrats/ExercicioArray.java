package arrats;

import java.util.Arrays;

public class ExercicioArray {

	public static void main(String[] args) {
		double[] notasAlunoA = new double[4];
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 9;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.9;

		System.out.println(Arrays.toString(notasAlunoA));

		System.out.println(" ");

		double total = 0;
		for (int i = 0; i < notasAlunoA.length; i++) {
			total += notasAlunoA[i];
		}
		System.out.println(total / notasAlunoA.length);

	}
}
