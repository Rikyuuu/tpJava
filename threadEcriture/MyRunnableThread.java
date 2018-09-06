package threadhigefiles;

import java.io.FileOutputStream;
import java.io.IOException;

class MyRunnableThread implements Runnable{
	 
    public String fileName;
    public MyRunnableThread(String fileName){
    	this.fileName=fileName;
         
    }
    public void run() {
    	System.out.println("Starting " + Thread.currentThread().getName());
    	try {
    	      FileOutputStream file = new FileOutputStream(this.fileName);
    	      for (int i = 0; i < 999999999; i++)
    	        file.write(i);
    	      file.close();
    	      System.out.println("stopping  " + Thread.currentThread().getName());
    	    } catch (IOException e) {
    	      System.out.println("Error - " + e.toString());
    	    }
    } 
}
