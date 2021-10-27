
public class Test {
	public static void main(String[] args) {
		int data[] = { 10, 20, 30, 40, 50, 60 };
		char cond[] = { 'a', 's' };
		char cond2[] = { 's', 'a' };

		printtSolution(data, cond);
		 printtSolution(data, cond2);
	}

	public static void printtSolution(int data[], char cond[]) {
		int substractionOne = 0;
		int substractionTwo = 0;
		int additionOne = 0;
		int additionTwo = 0;

		boolean substractOneFlag = true;
		boolean substractTwoFlag = true;

		try {
			char condOne = cond[0];
			char condTwo = cond[1];

			int dataLen = data.length;

			if (dataLen <= 0) {
				return;
			}

			if (condOne == 'a' && condTwo == 's') {
				// substract -> even
				// add -> odd
				// System.out.println("in block 1");
				for (int i = 0; i < dataLen; i++) {
					if (i % 2 != 0) {
						// System.out.println(data[i]);
						if (substractOneFlag) {
							substractionOne = data[i];
							substractOneFlag = false;
						} else {
							substractionOne -= data[i];
						}
						// System.out.println("substractionOne - > " + substractionOne);
					} else {
						additionOne += data[i];
					}

				}

			} else if (condOne == 's' && condTwo == 'a') {
				// substract -> odd
				// add -> even

				for (int i = 0; i < dataLen; i++) {
					if (i % 2 != 0)
						additionTwo += data[i];
					else {
						if (substractTwoFlag) {
							substractionTwo = data[i];
							substractTwoFlag = false;
						} else {
							substractionTwo -= data[i];
						}

					}
				}

			} else {
				System.out.println("invalid Condition !");
			}

			System.out.println("substractionOne - > " + substractionOne);
			System.out.println("additionOne - > " + additionOne);
			System.out.println("substractionTwo  - > " + substractionTwo);
			System.out.println("additionTwo - > " + additionTwo);

		} catch (Exception e) {
			System.out.println("Exception Occured : " + e);
		}
	}
}
