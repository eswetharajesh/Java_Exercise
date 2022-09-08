public class Main {
    public static void main(String[] args) {
        int num = 4;
        int lastnum = 20;
        int Evennumfound = 0;
        while (num <= lastnum) {
            num++;
            if (!isEvennumber(num)) {
                continue;
            }
            System.out.println("even number" + num);
            Evennumfound ++;
            if(Evennumfound >= 5){
                break;
            }

        }
        System.out.println("Evennumfound =" + Evennumfound);
    }


        public static boolean isEvennumber(int num ) {
             if((num % 2) == 0){
                 return true;
            }
             else{
                 return false;
             }
        }

}