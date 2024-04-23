package UserInterface.Notes;

import java.io.Serializable;

public class Note implements Serializable, Comparable<Note> {

    public Note(String title, String date, String body) {
    }
// method that searches for a note in the given NotesList with the target string
  public static String search(java.awt.List NotesList, String target) {
        // loop through all items in the NotesList
      for (int i = 0; i < NotesList.getItemCount(); i++) {
         // check if the current item in the list is equal to the target string
          if (NotesList.getItem(i).equals(target)) {
              // return the found item
              return NotesList.getItem(i);
            }
        }
      // if the target item was not found, return null
        return null;
    }    

    public String Note(String title, String date, String body) {
        return null;
    }

    @Override
    public int compareTo(Note o) {
            Controllers.Dialogues.showMessage("Error occured while comparing");
        return 0;
    }



}


