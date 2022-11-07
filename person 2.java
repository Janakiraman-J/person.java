class Test {
	public static void main(String raj[]){
		Person p=new Person("mani",163.5,75.28,"Non-Veg");
		Person p1=new Person("Muthu",153.5,60.28,"Veg");
		Person p2=new Person("malai",168.5,75,"Non-Veg");
		Person p3=new Person("ajith",140.25,62.50,"Non-Veg");
		Person p4=new Person("baskar",170,75.28,"Both Non-Veg");
		System.out.println(p2);
		p2.sleep();	
		System.out.println(p4);
		p2.eat();
		}
        }