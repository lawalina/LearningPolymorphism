public class Producer {
    public static void main(String[] args) {

        Animal ayka = new Cat(0.30,5,90,true);
        Animal sipsik = new Dog(0.35,7,200,true);
        Animal strangeDuck = new Duck(0.5,1,1000,true);

        printInfo(ayka);
        printInfo(sipsik);
        printInfo(strangeDuck);

        Animal dagon =  new Cat(0.5, 7);
        String additionalInformationAboutDagon = "This cat isn't afraid of water and loves to make a mess.";
        printInfo(dagon, additionalInformationAboutDagon);

    }

    static void printInfo(Animal animal){

        animal.printInfo();
    }

    static void printInfo(Animal animal, String info){
        animal.printInfo(info);
    }
}
