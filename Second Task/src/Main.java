import java.lang.IllegalArgumentException;

class Main{
	
	public static void main(String[] args) {
		MyIntArrayList list1 = new MyIntArrayList();
		MyIntArrayList list2 = new MyIntArrayList();
		MyIntArrayList list3 = new MyIntArrayList();

		list1.add(10);
		list1.add(20);
		list2.add(10);
		list2.add(20);
		list3.add(100);
		list3.add(200);

		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);

		System.out.println("Сравнение равных и неравных листов");
		System.out.println(list1.equals(list2));
		System.out.println(list1.equals(list3));

		list1.add(100500);
		list2.add(10);
		list2.add(20);
		list3.add(2000);
		try {
			list3.remove(1);
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		

		System.out.println("Три листа:");
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);

		System.out.println("Приращаю третий лист к первому");
		list1.addAll(list3);
		System.out.println(list1);

		System.out.println("Очищаем второй лист");
		System.out.println("Был такой размер: " + list2.size());
		list2.clear();
		System.out.println("А стал такой: " + list2.size());

		System.out.println("Устанавливаем значиние на нулевую позицию");
		System.out.println(list3);
		try {
			list3.set(100500, 0);
		} catch(IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

		try {
			list3.set(100500, 1000);
		} catch(IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

		System.out.println(list3);

		list2.add(228);
		try {
			System.out.println(list2.get(0));
		} catch(IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

		try {
			System.out.println(list2.get(1000));
		} catch(IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}
}