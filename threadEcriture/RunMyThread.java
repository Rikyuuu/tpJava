package threadhigefiles;

public class RunMyThread {
    public static void main(String a[]){
        System.out.println("Starting Main Thread...");
        Thread th1 = new  Thread(new MyRunnableThread("file1"));
        Thread th2 = new  Thread(new MyRunnableThread("file2"));
     
        th1.start();
        th2.start();
        
    }
}