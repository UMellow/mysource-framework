package mysource.core.security;

import org.springframework.util.Base64Utils;

/**
 * Base64 编码和解码。
 */
public class Base64 {
 
    public static void main(String[] args) {
		
    	System.out.println(Base64Utils.encodeToString("boss".getBytes()));
    	System.out.println(new String(Base64Utils.decodeFromString("Ym9zcw==")));
	}
}
