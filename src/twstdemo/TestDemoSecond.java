package twstdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestDemoSecond {

	private String referProductOfferingId ="1";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer a = 12312;
		long l = (long)1048576;
		long o = 1048576L;
		List<String> list = Arrays.asList("ff","aw");
		if(list != null && !list.isEmpty()) {
			System.out.println(1);
		}
		System.out.println(a+l+o);
		
		String name = Thread.currentThread().getName();
		System.out.println(name);
    	//获得当前线程所属的线程组
    	ThreadGroup tg = Thread.currentThread().getThreadGroup();
    	//tg.activeCount()  获取线程组中
    	for (int i = 0; i < tg.activeCount(); i++) {
			System.out.println(tg.getName());
		}
    	
    	TestDemoSecond test = new TestDemoSecond();
    	String t = test.getT();
    	if(t != null && t.length()>0) {
    		System.out.println("shuai!");
    	}else {
    		System.out.println("chou");
    	}
    	
    	Map<String,Integer> mapTest = new HashMap<>();
    	List<String> listTest = new ArrayList<>();
    	mapTest.put("a", 1);
    	mapTest.put("b", 2);
    	mapTest.put("c", 3);
    	for(String key : mapTest.keySet()) {
    		
    	}
    	for(String key : listTest) {
    		
    	}
	}
	public String getT() {
		return referProductOfferingId;
	}

}
