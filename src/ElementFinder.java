public class ElementFinder {

	private int[] array;

	public ElementFinder() {
	}

	public ElementFinder(int[] array) {
		this.array = array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	public int findElement(int k) {
		if (array == null) {
			return -1;
		}
		int lo = 0;
		int hi = array.length - 1;
		while (hi >= lo) {
			int mid = lo + (hi - lo) / 2;
			if (array[mid] == k) {
				return mid;
			}
			// Either half is sorted anyway

			// the left half is sorted
			if (array[lo] <= array[mid]) {
				// k is in the left half
				// We don't include k == array[mid] to the condition here
				// because it was handled at the beginning of the looped, and we
				// returned mid
				if (k >= array[lo] && k < array[mid]) { // Condition 1
					hi = mid - 1;
				} else {
					lo = mid + 1;
				}
			} else {
				// k is in the right half
				// We don't include k == array[mid] to the condition here
				// because it was
				// handled at the beginning of the looped, and we returned mid
				if (k > array[mid] && k <= array[hi]) {
					lo = mid + 1;
				} else {
					hi = mid - 1;
				}
			}
		}
		return -1;
	}
}
