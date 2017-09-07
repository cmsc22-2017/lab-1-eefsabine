interface IAT {}

class Unknown(){
	Unknown(){}
}

class Person implements IAT{
	String name;
	IAT mom;
	IAT dad;

	Person(String name, IAT mom, IAT dad){
		this.name = name;
		this.mom = mom;
		this.dad = dad;
	}
}

class ExamplesTree{
	ExamplesTree(){}

	IAT who = new Unknown();
	IAT Meriam = new Person("Meriam", this.unknown, this.unknown);
	IAT Joselito = new Person("Joselito", this.unknown, this.unknown);
	IAT Procopia = new Person("Procopia", this.unknown, this.unknown);
	IAT Rafael = new Person("Rafael", this.unknown, this.unknown);
	IAT Mercilyn = new Person("Mercilyn", this.Meriam, this.Joselito);
	IAT Rainero = new Person("Rainero", this.Procopia, this.Rafael);
	IAT Eef = new Person("Eef", this.Mercilyn, this.Rainero); 
}