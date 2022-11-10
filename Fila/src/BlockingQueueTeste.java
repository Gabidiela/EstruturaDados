import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class BlockingQueueTeste {
    public static void main(String [] args) throws InterruptedException{
    	//Declarando e instanciando uma fila do tipo BlockingQueue com espaço para apenas um elemento.
        BlockingQueue<String> bq = new ArrayBlockingQueue<>(1); 
        //Declarando e instanciando uma nova thread passando como parâmetro o método de remoção do elemento da fila.
        Thread t1 = new Thread(new RemoveFromQueue(bq));
        //Adicionando um elemento na fila
        bq.put("Valor1"); 
        System.out.println(bq.peek());
        System.out.println("Tentando colocar outro valor");
        /* Como a fila só tem espaço para um elemento a thread main ficará bloqueada, ou seja, impedida de adicionar um novo elemento
         * até que uma outra thread venha e remova o elemento que está na fila, liberando o espaço. */
        t1.start();
        bq.put("Valor2");
        System.out.println("Último valor inserido");
        //Após a execução da thread t1 que remove o elemento da fila, a thread principal é desbloqueada e segue sua execução normal.
        System.out.println(bq.peek());
        
    }
    static class RemoveFromQueue implements Runnable{ //Método que retorna o elemento que deverá ser removido da fila.
        private BlockingQueue<String> bq;
        public RemoveFromQueue(BlockingQueue<String> bq){
            this.bq = bq;
        }
        @Override
        public void run(){
            System.out.println(Thread.currentThread().getName() + " entrando em espera por 2s");
            try{
                TimeUnit.SECONDS.sleep(2); //Colocando a thread em espera por 2 segundos.
                System.out.println("Removendo o valor " +bq.take()); // Removendo o valor retornado pelo método RemoveFromQueue.
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    
