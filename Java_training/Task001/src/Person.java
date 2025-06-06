public class Person {
    public String name; // need to try private
    
    public String getName(){
        return name;
    }

    public void setName(String newName){
        this.name= newName;
    }

    public static void main(String[] args) {

        String name="thanmy";
        System.out.println(name);        
    }
    
}
