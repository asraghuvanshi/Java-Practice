class Main{
    /**
     * @param args
     */
    public static void main(String[] args) {
        int []array = {5, 3, 4, 1, 6, 7, 8 ,9};
        System.out.println("Array Data");

        Main obj = new Main();
        obj.removEvenInt(array);

    }

    private void removEvenInt(int[] array) {
        int oddCount = 0;
        for(int i = 0 ; i<array.length; i++){
            if(array[i]%2!= 0){
                oddCount++;
            }
        }
        int oddElement[] = new int[oddCount];
        for(int i = 0; i<=oddElement.length ; i++){
            if(array[i]%2!= 0){
                oddElement[i] = array[i];
            }
        }
    }
}
