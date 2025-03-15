public interface MyIntList {
	
	int get(int id);
	void add(int x);
	void remove(int id);
	void delete(int x);
	int size();
	void set(int value, int pos);
	boolean equals(MyIntList otherList);
	void clear();
	void addAll(MyIntList otherList); 
}