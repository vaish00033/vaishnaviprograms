class test{
	StringBuffer sb = new StringBuffer();
	public void ensureCapacityTest(){

		System.out.println(sb.capacity());
 
		sb.append("Hello ");

		System.out.println(sb.capacity());
 
		sb.append("www.w3spoint.com");
		//current capacity (16*2)+2=34 i.e (oldcapacity*2)+2.  
		System.out.println(sb.capacity());
 
		sb.ensureCapacity(10);
		//now no change in capacity because 
                //minimum is already set to 34. 
		System.out.println(sb.capacity());  
 
		sb.ensureCapacity(50);
		//now (34*2)+2 = 70 as 50 is greater than 34.
		System.out.println(sb.capacity());
	}
}
class super1 {
	public static void main(String args[]){
		//creating TestStringBuffer object
		test obj = new test();
 
		//method call
		obj.ensureCapacityTest();
	}
}

