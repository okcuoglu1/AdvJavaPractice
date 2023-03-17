package multithreads.creation;

public class Sayac extends Thread {

    private String name;


   public Sayac(String name){
       this.name=name;
   }

    @Override
    public void run() {
        System.out.println(this.name + " Başladı!");
        for (int i = 1; i<=100; i++){

            System.out.println(this.name + " - " + i);

        }

        System.out.println(this.name + " Bitirdi!");

    }
}
