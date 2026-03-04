public class _49_interface {
    public static void main(String[] args){

        // INTERFACE:- it is a blue print for class that specify a set of abstraction methods
        // that any implemented classes must define.
        // supports multiple inheritance like behavior.

        _49_rabbit rabbit = new _49_rabbit();
        _49_hawk hawk = new _49_hawk();
        _49_fish fish = new _49_fish();

        rabbit.flee();
        hawk.hunt();
        fish.hunt();
        fish.flee();
        // from fish we know we can use muptiple interface


    }
}
