import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class RandomIdeasGenerator {
    
    private ArrayList<String> ideas;
    
    public RandomIdeasGenerator() {
        this.ideas = new ArrayList<String>();
        //TODO: Make this better than just these two ideas.
        this.ideas.add("idea 1");
        this.ideas.add("idea 2");
        Collections.shuffle(this.ideas);
    }
    
    public void displayRandomIdeas() {
        Iterator<String> ideaIterator = ideas.iterator();
        while (ideaIterator.hasNext()) {
            System.out.println(ideaIterator.next());
        }
    }
}