public class test{
    String lan1;
    String lan2;

    test(String lan1, String lan2){
        this.lan1 = lan1;
        this.lan2 = lan2;
    }
    public static void main(String[] args){
        test t = new test("English", "Kannada");
        System.out.println(t.lan1);
        System.out.println(t.lan2);

    }
}
