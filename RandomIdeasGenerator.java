import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.net.URL;
import java.io.File;
import java.util.Scanner;

public class RandomIdeasGenerator
{
    private ArrayList<String> ideas;
    
    public RandomIdeasGenerator()
    {
        this.ideas = new ArrayList<String>();
        
        System.getProperty("user.dir");
        File file = new File(System.getProperty("user.dir") + "//programming_tasks.txt");
        try
        {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine())
            {
                String currentLine = (scanner.nextLine());
                
                this.ideas.add(currentLine);
            }

            Collections.shuffle(this.ideas);
        }
        catch (Exception e) {
            System.out.println("oops");
            System.out.println("File name: " + file.getPath());
            System.out.println(e.getMessage());
        }
    }
    
    public void displayRandomIdeas()
    {
        Iterator<String> ideaIterator = ideas.iterator();
        while (ideaIterator.hasNext())
        {
            System.out.println(ideaIterator.next());
        }
    }
}