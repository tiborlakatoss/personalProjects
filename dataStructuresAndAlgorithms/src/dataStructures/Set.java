package dataStructures;

public class Set {

	public int[] values = new int[10];

	/**
	 * method is used to add elements in list
	 * 
	 * @param value - value inside
	 * @param pos   - position to add
	 */
	public void add(int value, int pos) {
		int checkDuplicate;
		if (!checkDuplicate(value)) {
			checkSize(pos);
			values[pos] = value;
		}

	}

	public boolean isDuplicate(int value) {

	}

	public int get(int position) {
		return values[position];

	}

	public int size() {
		return values.length;
	}

	public void checkSize(int position) {
		if (position > values.length - 1) {
			int[] valuesDoubleSize = new int[values.length * 2];
			for (int i = 0; i < valuesDoubleSize.length; i++) {
				valuesDoubleSize[i] = values[i];
			}
			values = valuesDoubleSize;
		}

	}

}
