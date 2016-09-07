package ehcache;

import static org.junit.Assert.*;
import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

import org.junit.Test;

public class TestEhcache {

	@Test
	public void test() {
		CacheManager cacheManager = CacheManager.create("ehcache.xml");
		Cache sample = cacheManager.getCache("default");
		
		Element element = new Element("key", "val");
		sample.put(element);
		
		Element result = sample.get("key");
		System.out.println(result.getObjectValue());
	}

}
