package ch06;

public class Person {

	String name;
	int age;

	// art + shift + s
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	//문제1. toString 재정의 해주세요
	@Override
	public String toString() {
		return "[" + this.name + "]";
	}
	//문제2. 이름과 나이가 같으면 true를 리턴하게 equals 메서드를 재정의 해주세요.
	@Override
	public boolean equals(Object obj) {
		//방어적 코드
		if(obj instanceof Person) {
		Person person = (Person)obj;
		if(this.name.equals(person.name)&&this.age==person.age) {
			return true;
		}else {
		return false;
		}
	}
	return false;
		}
	}
