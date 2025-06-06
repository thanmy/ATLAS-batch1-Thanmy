class Add{
    public static int add(int a, int b){
        return a+b;
    }
}

class Sub{
    public static int sub(int a, int b){
        return a-b;
    }
}

class Mul{
    public static int mul(int a, int b){
        return a*b;
    }
}

class Div{
    public static float div(int a, int b){
        return a/b;
    }
}


public class Task004 {
    public static void main(String[] args) {
        int  temp,temp1;
        temp=1;temp1=2;
        System.out.println("adding the two numbers : " + Add.add(temp, temp1));
        System.out.println("subtract the two numbers : " + Sub.sub(temp, temp1));
        System.out.println("Multi the two numbers : " + Mul.mul(temp, temp1));
        System.out.println("Divide the two numbers : " + Div.div(temp, temp1));
        
    }
    
}
