package Animals;

import Breeds.BreedsOfDucks;
import Exceptions.NoBreedException;
import Exceptions.NullEqualsException;

public class Duck extends Animal {

    private BreedsOfDucks breed;

    public Duck (){
        super();
        this.height=0.3;
        this.weight=3;
        this.voiceVolume=70;
        this.haveWool=false;
        this.breed=BreedsOfDucks.UNBREEDED;
    }

    public Duck (double Height, double Weight){
        this();
        this.height=Height;
        this.weight=Weight;
        try {
            this.breed=breed;
            if (breed == BreedsOfDucks.UNBREEDED){
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

    public Duck (double Height, double Weight, int VoiceVolume){
        this(Height, Weight);
        this.voiceVolume=VoiceVolume;
        try {
            this.breed=breed;
            if (breed == BreedsOfDucks.UNBREEDED){
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

    public Duck (double Height, double Weight, boolean haveWool){
        this(Height, Weight);
        this.haveWool=haveWool;
        try {
            this.breed=breed;
            if (breed == BreedsOfDucks.UNBREEDED){
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

    public Duck (double Height, double Weight, int VoiceVolume, boolean haveWool){
        this(Height, Weight);
        this.voiceVolume=VoiceVolume;
        this.haveWool=haveWool;
        try {
            this.breed=breed;
            if (breed == BreedsOfDucks.UNBREEDED){
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


    public Duck (double Height, double Weight, int VoiceVolume, boolean haveWool, BreedsOfDucks breed){
        this(Height, Weight, VoiceVolume, haveWool);
        try {
            this.breed=breed;
            if (breed == BreedsOfDucks.UNBREEDED){
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

        System.out.println("This is a duck.");
        System.out.println();
        System.out.println("Duck height is " + getHeight() + ".");
        System.out.println("Duck weight is " + getWeight() + ".");

        if(isHaveWool())
            System.out.println("This is a hairy duck.");
        else
            System.out.println("The duck has no wool.");

        System.out.println("Duck volume is " + getVoiceVolume() + ".");
        System.out.println("This duck is a " + breed.getNameToPrint() + ".");
        System.out.println();

    }

    @Override
    public void printInfo(String additionalInformation){
        printInfo();
        System.out.println("Additional information: " + additionalInformation);
        System.out.println();
    }

}