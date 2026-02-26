public class _46_methodoverriding {
    public static void main(String[] args) {
        // method overriding -> when a subclass provides its own implementation
        //                      of a method that is already defines
        //                      ALLOWS FOR CODE  REUSABILIY AND GIVE SPECIFIC IMPLEMENTATIONS


        _46_dog dog = new _46_dog();
        _47_cat cat = new _47_cat();
        _48_fish fish = new _48_fish();


        dog.move();
        cat.move();
        fish.move(); // the problem is the fish doen't run it swims now to we write the new method in fish java
        // file which is ultimately gonna make it method override not use the running animal one

    }
}