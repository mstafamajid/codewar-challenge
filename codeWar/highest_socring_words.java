package codeWar;

public class highest_socring_words {

	public static void main(String[] args) {

		System.out.println(high("mustafa majid saaed"));
	}

	public static String high(String s) {

		String arrayWord[] = s.split(" ");
		int score[] = new int[arrayWord.length];

		for (int i = 0; i < arrayWord.length; i++) {

			for (int j = 0; j < arrayWord[i].length(); j++) {
				score[i] += arrayWord[i].charAt(j) - 96;
			}

		}
		for (int i = 0; i < score.length; i++) {
			for (int j = i + 1; j < score.length; j++) {
				if (score[j] > score[i]) {
					int temp = score[i];
					score[i] = score[j];
					score[j] = temp;
					String temp2 = arrayWord[i];
					arrayWord[i] = arrayWord[j];
					arrayWord[j] = temp2;

				}
			}
		}

		return arrayWord[0];

	}

}
