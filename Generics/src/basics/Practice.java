package basics;

import java.util.ArrayList;
import java.util.List;

public class Practice {     
    
    private class Fruit {
	
	private String name;

	public Fruit(String name) {	    
	    this.name = name;
	}

	public String getName() {
	    return name;
	}	
		
    }
    
    private class Banana extends Fruit {

	public Banana(String name) {
	    super(name);	   
	}
	
    }
    
    
    public void printAll(List<? extends Fruit> list) {
	
	if (list == null || list.isEmpty()) {
	    System.out.println("empty list");
	}
	else {
	
	    for (Fruit item : list) {	    
		System.out.println(item.getName());	    
	    }	
	}
    }
    
    public <T> List<T> mixItUp(List<? extends T> one, List<? extends T> two) {
	
	List<T> mixed = new ArrayList<>();
	
	if (one == null || two == null) {
	    System.out.println("list cannot be null");
	    return mixed;
	}	
	
	mixed.addAll(one);
	mixed.addAll(two);
	
	return mixed;
	
    }    

    public static void main(String[] args) {	
	
	Practice p = new Practice();
	
	Banana f1 = p.new Banana("SmallOne");
	Banana b1 = p.new Banana("BigOne");	
	
	List<Banana> bananas = new ArrayList<>();
	
	bananas.add(f1);
	bananas.add(b1);	
	
	Fruit apple = p.new Fruit("green apple");
	Fruit apple2 = p.new Fruit("red apple");
	
	List<Fruit> apples = new ArrayList<>();
	apples.add(apple);
	apples.add(apple2);	
	
	List<Fruit> mixedFruit = p.mixItUp(bananas, apples);
	
	p.printAll(mixedFruit);	
	
	
    }

}
