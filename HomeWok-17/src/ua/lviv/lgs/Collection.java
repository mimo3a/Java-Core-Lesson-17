package ua.lviv.lgs;

// <>
public class Collection {

	private static Number[] arr;

	Collection(Number[] array) {
		this.arr = array;
	}

	class Forward implements Iterator {
		int count = 0;

		public boolean hasNext() {
			return count < arr.length;
		}

		public Object next() {
			if (!((Integer) arr[count] % 2 == 0)) {
				arr[count] = 0;
			}
			return arr[count++];
		}
	}

	public Forward creareForward() {
		return new Forward();
	}

	class Backward implements Iterator {
		int count = arr.length + 1;

		public boolean hasNext() {

			return count >= 2;
		}

		public Object next() {

			return arr[count -= 2];
		}

	}

	public Backward createBackward() {
		return new Backward();
	}

	public Iterator createAnonim() {
		return new Iterator() {

			public Object next() {

				int count = arr.length - 1;
				while (count >= 0) {
					if (!(((Integer) arr[count] % 2) == 0)) {
						System.out.println(arr[count]);
					}
					count -= 3;
				}
				return count;
			}

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return false;
			}
		};
	}

	public Iterator createLinusHundert() {
		class LinusHundert implements Iterator {

			public boolean hasNext() {
				return false;
			}

			public Object next() {
				int count = 0;
				while (count <= arr.length - 1) {
					if ((Integer) arr[count] % 2 == 0) {
						System.out.println((Integer) arr[count] - 100);
					}
					count += 5;
				}
				return null;
			}
		}

		return new LinusHundert();

	}

	private static class DuleToNotDouble implements Iterator {

		public boolean hasNext() {
			return false;
		}

		public Object next() {
			int count = 0;
			while (count <= arr.length - 1) {
				if ((Integer) arr[count] % 2 == 0) {
					System.out.println((Integer) arr[count] + 1);
				}
				count += 2;
			}
			return null;
		}

	}

	public static DuleToNotDouble createDuleToNotDouble() {
		return new DuleToNotDouble();
	}
}
