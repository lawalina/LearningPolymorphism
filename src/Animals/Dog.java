package Animals;

import Breeds.BreedsOfDogs;
import Exceptions.NoBreedException;
import Exceptions.NullEqualsException;

public class Dog extends Animal {

    private BreedsOfDogs breed;

    public Dog (){
        super();
        this.height=0.5;
        this.weight=7;
        this.voiceVolume=70;
        this.haveWool=true;
        this.breed=BreedsOfDogs.UNBREEDED;
    }

    public Dog (double Height, double Weight){
        this();
        this.height=Height;
        this.weight=Weight;
        try {
            this.breed=breed;
            if (breed == BreedsOfDogs.UNBREEDED){
                throw new NoBreedException("Exception: WARNING! This animal has no breed.");
            }
        }catch (NoBreedException excp){
            System.out.println(excp.getMessage());
        }
        try {
            if (this.voiceVolume == 0){
                throw new NullEqualsException("Exception: zero values of voice volume.");
            }
        }catch (NullEqualsException excp){
            System.out.println(excp.getMessage());
        }
    }

    public Dog (double Height, double Weight, int VoiceVolume){
        this(Height, Weight);
        this.voiceVolume=VoiceVolume;
        try {
            this.breed=breed;
            if (breed == BreedsOfDogs.UNBREEDED){
                throw new NoBreedException("Exception: WARNING! This animal has no breed.");
            }
        }catch (NoBreedException excp){
            System.out.println(excp.getMessage());
        }
        try {
            if (this.voiceVolume == 0){
                throw new NullEqualsException("Exception: zero values of voice volume.");
            }
        }catch (NullEqualsException excp){
            System.out.println(excp.getMessage());
        }
    }

    public Dog (double Height, double Weight, boolean haveWool){
        this(Height, Weight);
        this.haveWool=haveWool;
        try {
            this.breed=breed;
            if (breed == BreedsOfDogs.UNBREEDED){
                throw new NoBreedException("Exception: WARNING! This animal has no breed.");
            }
        }catch (NoBreedException excp){
            System.out.println(excp.getMessage());
        }
        try {
            if (this.voiceVolume == 0){
                throw new NullEqualsException("Exception: zero values of voice volume.");
            }
        }catch (NullEqualsException excp){
            System.out.println(excp.getMessage());
        }
    }

    public Dog (double Height, double Weight, int VoiceVolume, boolean haveWool){
        this(Height, Weight);
        this.voiceVolume=VoiceVolume;
        this.haveWool=haveWool;
        try {
            this.breed=breed;
            if (breed == BreedsOfDogs.UNBREEDED){
                throw new NoBreedException("Exception: WARNING! This animal has no breed.");
            }
        }catch (NoBreedException excp){
            System.out.println(excp.getMessage());
        }
        try {
            if (this.voiceVolume == 0){
                throw new NullEqualsException("Exception: zero values of voice volume.");
            }
        }catch (NullEqualsException excp){
            System.out.println(excp.getMessage());
        }
    }


    public Dog(double Height, double Weight, int VoiceVolume, boolean haveWool, BreedsOfDogs breed){
        this(Height, Weight, VoiceVolume, haveWool);
        try {
            this.breed=breed;
            if (breed == BreedsOfDogs.UNBREEDED){
                throw new NoBreedException("Exception: WARNING! This animal has no breed.");
            }
        }catch (NoBreedException excp){
            System.out.println(excp.getMessage());
        }
        try {
            if (this.voiceVolume == 0){
                throw new NullEqualsException("Exception: zero values of voice volume.");
            }
        }catch (NullEqualsException excp){
            System.out.println(excp.getMessage());
        }
    }

    @Override
    public void printInfo() {

        System.out.println("This is a Animals.Dog.");
        System.out.println();
        System.out.println("Dog height is " + getHeight() + ".");
        System.out.println("Dog weight is " + getWeight() + ".");

        if(isHaveWool())
            System.out.println("This is a hairy dog.");
        else
            System.out.println("The dog has no wool.");

        System.out.println("Dog volume is " + getVoiceVolume() + ".");
        System.out.println("This dog is a " + breed.getNameToPrint() + ".");
        System.out.println();

    }

    @Override
    public void printInfo(String additionalInformation){
        printInfo();
        System.out.println("Additional information: " + additionalInformation);
        System.out.println();
    }

}