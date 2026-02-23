public class _44_inheritance {

    public static void main(String[] args){

        // inheritance:- one class inherits the attributes and methods from another class
        // child <- parent <- grandparent

        // use of extend keyword then the parent class

        // family tree

//        Organism
//        ▲     ▲
//      ▲         ▲
//    Plant      Animal
//                 ▲
//             ▲       ▲
//        Dog       Cat

        _44_dog dog = new _44_dog();
        _44_cat cat = new _44_cat();
        _44_plant plant = new _44_plant();

        System.out.println(dog.isalive);
        System.out.println(cat.isalive);

        dog.eat();
        cat.eat();
        System.out.println(dog.lives);
        System.out.println(cat.lives);
        dog.speak();
        cat.speak();
        System.out.println(plant.isalive);
        plant.photosynthesis();
        // code testing
}

}
