class Main{
    public static void main(String[] args) {
        int listItem[] = {0 ,5, 4, 2, 0 , 1};
        int j = 0;
        for(int i = 0; i < listItem.length; i++){
            if(listItem[i]!=0 && listItem[j] == 0){
                int temp = listItem[i];
                listItem[i] = listItem[j];
                listItem[j] = temp;
            }
            if(listItem[j]!=0){
                j++;
            }
        }

        for (int i : listItem) {
            System.out.println(i);
        }
    }
}
