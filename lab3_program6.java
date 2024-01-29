class Test{
    void mark(float r){
        System.out.println("the argument is promoted to float:"+r);
    }
    void mark(int a,int b){
        System.out.println("the argument is demoted:"+a+" "+b);
    }
}
public class lab3_program6 {
    public static void main(String []args){
        Test t = new Test();
        t.mark(5);
        //t.mark(5.5f,6.7f);
        t.mark(5,6);
        System.out.println("type demotion is not possible");
    }
}
