package gr.aueb.cf.ch15;

public class SpeakingSchool {

    private final Cat cat = new Cat();  //composition

    public SpeakingSchool() {

    }

    public void learnToSpeak() {
        cat.speak();
    }
}
