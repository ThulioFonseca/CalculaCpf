import java.util.Scanner;

public class App {
        public static void main(String[] args) throws Exception {
            long startTime = System.currentTimeMillis();

            for(int i = 0; i < 64; i++) {

                ThreadWork threadWork = new ThreadWork();
                threadWork.setName("t"+i);
                threadWork.start();
                threadWork.join();
            }
            
            System.out.println("Tempo de execução: " + (System.currentTimeMillis() - startTime)/1000 + " s");




    }
}
