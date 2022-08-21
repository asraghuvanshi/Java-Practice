class ThreadImplementation extends Thread{
    public void run(){
        System.out.println("Thread ");
    }

    public static void main(String args[]){
        ThreadImplementation thread = new ThreadImplementation();
        thread.start();
    }
}