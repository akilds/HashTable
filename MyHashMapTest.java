import org.junit.Test;
import org.junit.Assert;

public class MyHashMapTest {

   //TEST CASE !
	@Test
	public void hashmaptest()
	{
		String sentence = "To be or not to be";
		MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for(String word : words)
		{
			Integer value = myHashMap.get(word);
			if(value==null) value = 1;
			else value = value + 1;
			myHashMap.add(word,value);
		}
		int frequency = myHashMap.get("to");
		System.out.println("MyHashMap");
		Assert.assertEquals(2, frequency);
    }
}
