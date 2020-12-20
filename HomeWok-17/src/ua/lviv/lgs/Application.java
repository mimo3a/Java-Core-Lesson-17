package ua.lviv.lgs;

public class Application {

	public static void main(String[] args) {
		Number [] array = {2,34,-67,54,567,33,7,-65,44,33,1,7,3,243,354,-4};
		Collection myCollection = new Collection(array);
		
		System.out.println("����� � �������� ������� ����� ����");
		Iterator iteratorBackward = myCollection.createBackward();
		while(iteratorBackward.hasNext()) {
			System.out.println(iteratorBackward.next());
		}
		
		
		
		System.out.println();
		System.out.println("������� ����� ��� ��������");
		
		Iterator iteratorAnon = myCollection.createAnonim();		
		iteratorAnon.next();
		
		System.out.println();
		System.out.println("������ ����� ����.  �� ������ �������� 100");
		Iterator linusHundert = myCollection.createLinusHundert();
		linusHundert.next();
		
		System.out.println();
		System.out.println("������ ������ ������ ���������� � ��������");
		Iterator doubleToNotDouble = myCollection.createDuleToNotDouble();
		doubleToNotDouble.next();
			
		System.out.println();
		System.out.println("������ �������� ����");
		Iterator iteratorForward = myCollection.creareForward();
		
		while(iteratorForward.hasNext()) {
			System.out.println(iteratorForward.next());
		}
		
	}

}
