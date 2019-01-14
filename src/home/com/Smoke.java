package home.com;

import org.junit.Test;

public class Smoke extends Base{
  
	@Test
	public void test() throws InterruptedException {
	  Shared s =new Shared(dr);
	  s.blueFly();
	  
	  
  }
}
