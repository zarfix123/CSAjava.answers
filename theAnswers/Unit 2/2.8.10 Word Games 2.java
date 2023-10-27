public class WordGames
{
    private String word;
    
    public WordGames(String text)
    {
        word = text;
    }
    
    public String scramble()
    {
        // switch first half
        // and second half
        int length = word.length();
        String half = word.substring(0, length / 2);
        String shalf = word.substring(length/2);
        
        return(shalf + half);
        
      
    }
    
    
    public String bananaSplit(int insertIdx, String insertText)
    {
        
        String half = word.substring(0, insertIdx);
        String shalf = word.substring(insertIdx);
        
        
        return(half + insertText + shalf);
       
    }
    
    
    public String bananaSplit(String insertChar, String insertText)
    {
        // Insert insertText after the first
        int indexuser = word.indexOf(insertChar);
        String half = word.substring(0, indexuser);
        String shalf = word.substring(indexuser);
        
        
        
        
        // occurence of the insertChar
        return(half+insertText+shalf);
    }
    
    
    public String toString()
    {
       return("[" + word + "]");
    }
    
    
}
