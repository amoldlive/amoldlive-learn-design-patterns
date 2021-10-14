package singletone;

import java.util.Collections;
import java.util.List;

class TestSingleTone {

	private String name;

	public TestSingleTone(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "TestSingleTone [name=" + name + "]";
	}

}

public class SingletoneUsingCollectionMain {
	public static void main(String[] args) {
		
		TestSingleTone singleTone=new TestSingleTone("Singletone Test");
		 List<TestSingleTone> singleToneLIst= Collections.singletonList(singleTone);
		 System.out.println(singleToneLIst);
	}
}
