package mysource.classloader;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DiskClassLoader extends ClassLoader {

	private String myExtPath;
	
	public DiskClassLoader(String path) {
		this.myExtPath = path;
	}
	
	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException {
		
		String fileName = getFileName(name);
		File file = new File(myExtPath, fileName);
		
		try {
			FileInputStream in = new FileInputStream(file);
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			
			int len = 0;
			while((len = in.read()) != -1) {
				bos.write(len);
			}
			
			byte[] data = bos.toByteArray();
			
			in.close();
			bos.close();
			
			return defineClass(name, data, 0, data.length);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return super.findClass(name);
	}
	
    private String getFileName(String name) {
    	
        int index = name.lastIndexOf('.');
        
        if(index == -1){ 
            return name+".class";
        }else{
            return name.substring(index + 1)+".class";
        }
    }
}
