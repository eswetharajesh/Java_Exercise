public class Main {
    public static void main(String[] args) {
        char charvalue = 'G';
        switch (charvalue){
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'c': case 'D': case 'E':
                System.out.println(charvalue + "was found");
                break;
            default:
                System.out.println("Nothing was found");
                break;
        }
    }
}