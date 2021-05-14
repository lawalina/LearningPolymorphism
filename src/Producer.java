public class Producer {
    public static void main(String[] args) {
        Cat ayka = new Cat(0.30,5,90,true);
        Dog sipsik = new Dog(0.35,7,200,true);
        Duck strangeDuck = new Duck(0.5,1,1000,true);

        ayka.printInfo();
        sipsik.printInfo();
        strangeDuck.printInfo();
    }
}
