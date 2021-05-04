public class Die {

    int value, sides;

    public Die(){
        value= 1;
        sides = 6;
    }

    public void roll(){

        value = (int)(Math.random()*sides) + 1;
    }

    public void setSides(int sides){

        this.sides = sides;
    }

    public int getValue(){
        return value;
    }
}
