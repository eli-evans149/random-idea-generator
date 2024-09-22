public class RandomIdeasDisplayer
{
    public static void main(String[] args)
    {
        System.out.println("Now displaying the ideas from https://rosettacode.org/wiki/Category:Programming_Tasks in a random order.");
        RandomIdeasGenerator generator = new RandomIdeasGenerator();
        generator.displayRandomIdeas();
    }
}