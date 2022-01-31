
import java.util.LinkedList;


public class Tag {
    public String word;
    public Tag left;
    public Tag right;
    
    protected LinkedList<Integer> Ayats;
    
    public Tag(String word){
        this.word = word;
        Ayats = new LinkedList<>();
    }
    
    public void insertAyat(int AyatNo){
        Ayats.add(AyatNo);
    }
    
    public LinkedList<Integer> getAyats(){
        return Ayats;
    }
    
    @Override
    public String toString(){
        return "[" + word + " - " + Ayats + "]";
    }
}
