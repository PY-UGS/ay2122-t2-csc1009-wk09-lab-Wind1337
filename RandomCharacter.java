import java.util.ArrayList;
import java.util.Random;

public class RandomCharacter {
    private ArrayList<String> randomCharacterList;

    public RandomCharacter(int length){
        this.randomCharacterList = new ArrayList<String>();
        generateRandomCharacters(length);
    }

    public ArrayList<String> getRandomCharacterList() {
        return randomCharacterList;
    }

    public String getLowerCaseCharacter(){
        Random r = new Random();
        char c = (char)(r.nextInt(26) + 'a');
        return Character.toString(c);
    }

    public String getUpperCaseCharacter(){
        Random r = new Random();
        int c = (char)(r.nextInt(26) + 'A');
        return Character.toString(c);
    }

    public String getRandomDigitCharacter(){
        Random r = new Random();
        int i = r.nextInt(10);
        return Integer.toString(i);
    }

    public String getRandomCharacter(){
        Random r = new Random();
        int i = r.nextInt(4);
        switch (i) {
            case 1:
                return getLowerCaseCharacter();
            case 2:
                return getUpperCaseCharacter();
            default:
                return getRandomDigitCharacter();
        }
    }

    public void generateRandomCharacters(int length){
        for(int i = 0; i < length; i++) {
            this.randomCharacterList.add(getRandomCharacter());
        }
    }

    public static void main(String[] args){
        RandomCharacter randomCharacter = new RandomCharacter(15);
        ArrayList<String> randomCharacters = randomCharacter.getRandomCharacterList();
        for(int i = 0; i < randomCharacters.size(); i++){
            System.out.print(randomCharacters.get(i));
        }
    }
}
