public class Task014 {
    public static void main(String[] args) {
        char[]arr = {'q','w','e','r','t'};
        System.out.println(arr);
        String[] names = {"Reena","Tina","Veena","Heena"};
        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }
        System.out.println(names[0]);
        names[1]="Reena";
        System.out.println(names[1]);
        System.out.println(names.length);
        System.err.println(names[4]);        
    }
    
}
