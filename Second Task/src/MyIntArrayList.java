public class MyIntArrayList implements MyIntList {
	
	private int size = 0;
	private int capacity = 1000;
	private int[] storage = new int[capacity];

	@Override
	public void remove(int id) throws IllegalArgumentException{
		if ((id >= 0) && id < size) {
			for (int i = id; i < (size - 1); i++) {
				storage[i] = storage[i + 1];
			}
			size--;
		} else {
			throw new IllegalArgumentException("Попытка удаления элемента" +
			  "по несуществующему индексу!");
		}
	}

	// удаляет первое вхождение элемента
	@Override
	public void delete(int x) {
		int idOfDeleteElement = -1;
		for(int i = 0; i < size; i++) {
			if (storage[i] == x) {
				idOfDeleteElement = i;
				break;
			}
		}
		if (idOfDeleteElement != -1) {
			for (int i = idOfDeleteElement; i < (size - 1); i++) {
				storage[i] = storage[i + 1];
			}
			size--;
		}
	}

	@Override
	public void set(int value, int pos) throws IllegalArgumentException{
		if ((pos >= 0) && (pos < size)) {
			storage[pos] = value;	
		} else {
			throw new IllegalArgumentException("Попытка установки значения" +
				 " по несуществующему индексу!");
		}
	}

	@Override
	public void clear() {
		size = 0;
	}

	@Override
	public boolean equals(MyIntList otherList) {
		boolean result = true;
		if (size != otherList.size()) {
			return false;
		} 
		for(int i = 0; i < size; i++) {
			if (storage[i] != otherList.get(i)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public int size() {
		return size;
	}

	@Override 
	public int get(int id) throws IllegalArgumentException{
		if ((id >= 0) && (id < size)) {
			return storage[id];	
		} throw new IllegalArgumentException("Обращение по " + 
			 "несуществующему индексу!");
	}

	private int[] updateCapasityStorage() {
		capacity += 100;
		int[] tempArray = new int[capacity];
		for(int i = 0; i < storage.length; i++) {
			tempArray[i] = storage[i];
		}
		return tempArray;
	}

	@Override 
	public void add(int x) {
		if (size == (capacity - 10)) {
			storage = updateCapasityStorage();
		}
		storage[size++] = x;
		// check capacity??
	}

	@Override
	public void addAll(MyIntList otherList) {
		for(int i = 0; i < otherList.size(); i++) {
			add(otherList.get(i));
		}
	}

	// 
	// @Override
	// public String toString() {
	// 	char[] numbers = new char[size];
		
	// 	for(int i = 0; i < size; i++) {
	// 		numbers[i] = (char)(storage[i]);
	// 	}
	// 	return new String(numbers);
	// }

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < size; i++) {
			sb.append(storage[i]);
			sb.append(" ");
		}
		return sb.toString();
	}	
}