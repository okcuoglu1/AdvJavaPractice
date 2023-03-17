package multithreads.creation;

public class ThreadCreation2 {

    public static void main(String[] args) {

        //!!!Task2:Runnable interfaceni implement eden Counter isminde sınıf oluşturup
        // bu sınıfta harfleri a dan z ye kadar yazdıran iki tane thread oluşturunuz.


        Counter counter1 = new Counter("A");
        Counter counter2 = new Counter("B");

        Thread thread1 = new Thread(counter1);
        Thread thread2 = new Thread(counter2);

        thread1.start();
        thread2.start();


    }




}
