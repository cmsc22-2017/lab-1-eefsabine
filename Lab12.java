/*+----------------+
  |     Person     |
  +----------------+
  |String name     |
  |int age         |
  |String gender   |
  |Address address +-------+
  +----------------+       |
                           |
                           v
                     +-----+------+
                     |  Address   |
                     +------------+
                     |String city |
                     |String state|
                     +------------+
*/

class Person(){
	String name;
	int age;
	String gender;
	Address address;

	Person(String name, int age, String gender, Address address){
		this.name = name;
		this.age = age;
		this.gender;
		this.address;
	}
}

class Address(){
	String city;
	String state;

	Address(String city, String state){
		this.city = city;
		this.state = state;
	}
}

class ExamplesPerson(){
	ExamplesPerson(){}

	Address a = new Address("MA","Boston");
	Person Kim = new Person("Kim",18,'F',a);
	Address b = new Address("MA","Boston");
	Person Pat = new Person("Pat",22,'M',b);
	Address c = new Address("RI","Warwick");
	Person Tim = new Person("Tim",25,'F',c);
	Address d = new Address("NH","Nashua");
	Person Dan = new Person("Dan",15,'M',d);
	Address e = new Address("SE","Digidigidum");
	Person Lux = new Person("Lux",19,'F',e);
	Address f = new Address("IL","Samgyeopsal");
	Person Zed = new Person("Zed",30,'M',f);
}