package ua.lviv.lgs;

public class Application {

	public static void main(String[] args) {
		Number [] array = {2,34,-67,54,567,33,7,-65,44,33,1,7,3,243,354,-4};
		Collection myCollection = new Collection(array);
		
		System.out.println("числа в обратном порядке через одно");
		Iterator iteratorBackward = myCollection.createBackward();
		while(iteratorBackward.hasNext()) {
			System.out.println(iteratorBackward.next());
		}
		
		
		
		System.out.println();
		System.out.println("Обратно через три непарные");
		
		Iterator iteratorAnon = myCollection.createAnonim();		
		iteratorAnon.next();
		
		System.out.println();
		System.out.println("Вперед через пять.  От парных отнимаем 100");
		Iterator linusHundert = myCollection.createLinusHundert();
		linusHundert.next();
		
		System.out.println();
		System.out.println("Каждый второй парный превращаем в непарный");
		Iterator doubleToNotDouble = myCollection.createDuleToNotDouble();
		doubleToNotDouble.next();
			
		System.out.println();
		System.out.println("вместо непарных нули");
		Iterator iteratorForward = myCollection.creareForward();
		
		while(iteratorForward.hasNext()) {
			System.out.println(iteratorForward.next());
		}
		
	}

}
