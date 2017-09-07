/*+-------------+
  |   Person    |
  +-------------+
  |String name  |
  |int age      |
  |String gender|
  +-------------+
*/


class Person(String name, int age, String gender){
	String name;
	int age;
	String gender;

	Person(String name, int age, String gender){
		this.name = name;
		this.age = age;
		this.gender;
	}
}

class ExamplesPerson(){
	ExamplesPerson(){}

	Person = new Person("Tim", 20, "M");
	Person = new Person("Pat", 19, "F");
	Person = new Person("Kim", 17, "F");
	Person = new Person("Dan", 22, "M");
}