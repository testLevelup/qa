public class sample {
    public static void main(String[] args) {
        
        int a=12;
        int b=3;
        int c=a+b;
        System.out.println("c = "+ c);

        if(b>a){
           int temp=a;
             a=b;
             b=temp;
             System.out.println("ascending order \n" + b +"\n"+ a);   
        } 
        else{
            System.out.println("ascending order \n" + a +"\n"+ b);  
        }
        
    }
}
