package d_array;

public class Test {

	public static void main(String[] args) {
		String[] names = { "1번", "2번", "3번", "4번", "5번", "6번" };
		String[] subjects = { "국어", "영어", "수학", "사회", "과학", "Oracle", "Java" };
		int[][] score = new int[names.length][subjects.length];
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				score[i][j] = (int) (Math.random() * 101);
			}
		}
		int[] nameSum = new int[names.length];
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				nameSum[i] += score[i][j];
			}
		}
		double[] nameAvg = new double[names.length];
		for (int i = 0; i < nameAvg.length; i++) {
			nameAvg[i] = Math.round((double) nameSum[i] / subjects.length * 100) / 100.0;
		}
		int[] subSum = new int[subjects.length];
		for (int i = 0; i < subjects.length; i++) {
			for (int j = 0; j < names.length; j++) {
				subSum[i] += score[j][i];
			}
		}
		double[] subAvg = new double[subjects.length];
		for (int i = 0; i < subAvg.length; i++) {
			subAvg[i] = Math.round((double) subSum[i] / names.length * 100) / 100.0;
		}

		int[] rank = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			rank[i]++;
			for (int j = 0; j < names.length; j++) {
				if (nameSum[i] < nameSum[j]) {
					rank[i]++;
				}
			}
		}

		for (int i = 0; i < subjects.length; i++) {
			System.out.print("\t" + subjects[i]);
		}
		System.out.println("\t합계\t평균\t석차");
		for (int i = 0; i < score.length; i++) {
			System.out.print(names[i] + "\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println(nameSum[i] + "\t" + nameAvg[i] + "\t" + rank[i]);
		}
		System.out.print("과목합계\t");
		for (int i = 0; i < subSum.length; i++) {
			System.out.print(subSum[i] + "\t");
		}
		System.out.println();
		System.out.print("과목평균\t");
		for (int i = 0; i < subAvg.length; i++) {
			System.out.print(subAvg[i] + "\t");
		}
		System.out.println();
	}

}
