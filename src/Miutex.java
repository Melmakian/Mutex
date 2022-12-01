import java.util.ArrayList;
import java.util.List;

public class Miutex {
    public static class Note{
        public final List<String> notes = new ArrayList<>();
        public void addNote(int index, String note){
            System.out.println("Right now will be add note["+ note+ "] on position "+ index);
            synchronized (note){
                notes.add(index, note);
            }
            System.out.println("already added note ["+ note+"]");
        }
        public void removeNote(int index){
            System.out.println("Right now  note will be deleted from the position "+ index);
            String note;
            synchronized (notes){
                note = notes.remove(index);
            }
            System.out.println("The note has already been deleted ["+ note+"] from the position"+index);
        }
    }
}
