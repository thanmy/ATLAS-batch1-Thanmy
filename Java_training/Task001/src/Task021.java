public class Task021 {
    public static void main(String[] args) {
        Task020 mname= new Task020();
        System.out.println(mname.name);
        System.out.println("There are "+ mname.i + " letter in name");
        for(int n=0 ; n<mname.i ; n++){
            System.out.println(mname.name[n]);
        }


    }
    
}
