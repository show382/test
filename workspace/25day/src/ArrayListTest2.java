import java.util.ArrayList;

public class ArrayListTest2 {

	public static void main(String[] args) {
		
//		Person person1 = new Person();
//		System.out.println(person1);
//		Person person2 = new Person("홍길동",20);
//		System.out.println(person2);
		
		ArrayList<Person> list = new ArrayList<>();
		
		list.add(new Person("홍길동", 20)); 				//add(value):ArrayList에 value를 맨 뒤에 추가한다.
		list.add(new Person("임꺽정", 40)); 				
		list.add(new Person("장길산", 31)); 				
		list.add(new Person("일지매", 16)); 				
		list.add(new Person("임꺽정", 40)); 				//중복되는 데이터도 입력된다.
		System.out.println(list.size() + ":"+list); 	//size():ArrayList에 저장된 데이터의 개수를 얻어온다.
		
		list.add(0,new Person("포청천", 48)); 				
		System.out.println(list.size() + ":"+list); 	//add(index,value):ArrayList의 index번째 위치에 value를 삽입한다.
		
		System.err.println(list.get(1));	 			//get(index):ArrayList의 index번째 위치에 value를 얻어온다.
		
		list.set(2, new Person("성춘향", 16));
		System.out.println(list.size() + ":"+list); 	//set(index,value):ArrayList의 index번째 위치에 value를 수정한다.
		
		list.remove(2);
		System.out.println(list.size() + ":"+list); 	//remove(index):ArrayList의 index번째 위치에 value를 제거한다.
		
		list.clear();
		System.out.println(list.size() + ":"+list); 	//clear():ArrayList의 모든 데이터를 제거한다.
		
	}
}
