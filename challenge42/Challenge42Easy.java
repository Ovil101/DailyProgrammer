package Challenge42;

public class Challenge42Easy {
    public static void main(String[] args){
        String[] animals = {"cow","chicken","turkey","kangaroo","t-rex","dog"};
        String[] sounds = {"moo","cluck","gobble","G'Day, mate","GAAAARGH","woof"};
        for (int i = 0; i < animals.length; i++){
            System.out.println("Old McDonald had a farm");
            System.out.println("E-I-E-I-O");
            System.out.println("And on his farm he had a "+animals[i]);
            System.out.println("E-I-E-O");
            System.out.println("With a "+sounds[i]+" "+sounds[i]+" here");
            System.out.println("And a "+sounds[i]+" "+sounds[i]+" there");
            System.out.println("Here a "+sounds[i]+", there a "+sounds[i]);
            System.out.println("Everywhere a "+sounds[i]+" "+sounds[i]);
            System.out.println("Old McDonald had a farm");
            System.out.println("E-I-E-I-O");
            System.out.println();
        }
    }
}