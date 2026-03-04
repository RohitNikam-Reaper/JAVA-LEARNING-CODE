public class _49_fish implements _49_predator,_49_prey {

    // it eat smaller fish so predator and flee larger fish so prey
    @Override
    public void flee(){
        System.out.println("*fish is swimming away*");

    }

    @Override
    public void hunt(){
        System.out.println("*fish is hunting *");
    }

}
