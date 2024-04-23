package UserInterface.Notes;

import Controllers.Dialogues;
import DataStructures.DataStructures;
// Initialize class variables
public class NotesController {
   // Constant variable for title
    public static final String TITLE = "Notes";
    public static Note note; // Note object
    public static Dialogues dialogues; // dialogues object
    int[] indices = null ;  // array of indices for all notes
    // Variables for title, date, and body of a note
    public String title;
    public String date;
    public String body;
    private String content;
    public NotesController(String title, String date, String body) {
        this.title = title;
        this.date = date;
        this.body = body;
         note = new Note(title, date, body);
    }
    
    // Constructor for the dialogues to be used anywhere in the project
    public NotesController() {
    }

    // In a static initializer block

  /*static {
    dialogues = new Dialogues();
  } */
    //displays all notes in the NotesList
    public static void displayAllNotes(Notes notes, java.awt.List NotesList) {
        NotesList.removeAll();// Remove all existing items in the list
        
        for (int i = 0; i < NotesList.getItemCount(); i++) {
            String title;
        // Get the title of the note
            title = NotesList.getItem(i);
        NotesList.add(title); // Add the title to the list
        }
    }

    //display a selected note
    public static void displayNote(Notes notes, int index) {
        String display = NotesList.getItem(index);
       Controllers.Dialogues.showMessage(display);
    }

    // deletes a selected note
    public static void deleteNote(Notes notes, int index) {
        if (Controllers.Dialogues.yesNoMessage("Are you sure you want to delete this note")) {
            NotesList.remove(index);
            NotesList.remove(index);
        }
    }
// Method to add a note to the Noteslist
    public static void add(Note note, java.awt.List NotesList) {
    NotesList.add(note.toString()); // Add the note as a string to the list
    }
// Method to sort the  NotesList by title or date
    public static void sort(java.awt.List NotesList) {
         final String[] Options = {"sort by title", "sort by date"};
    String Choices = Controllers.Dialogues.showOptions(
        "How would you like to sort your notes?",
        Options
    );

    if (Choices == null || Choices.equals("")) {
        return; // Return if no choice is made
    } 
    // If choice is to sort by title
    else if (Choices.equalsIgnoreCase(Options[0])) {
        String title = Controllers.Dialogues.InputMessage(
            "Enter title to search for"
        );
        DataStructures.type = DataStructures.type_title;
    }
    // If choice is to sort by date
    else if (Choices.equalsIgnoreCase(Options[1])) {
        DataStructures.type = DataStructures.type_date;

        // Create a sort method (selection sort)
        NotesList.removeAll();
        for (int i = 0; i < NotesList.getItemCount() - 1; i++) {
            // Find the minimum element in unsorted array
            int minIndex = i;
            for (int j = i + 1; j < NotesList.getItemCount(); j++) {
                if (NotesList.getItem(j).compareTo(NotesList.getItem(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            String temp = NotesList.getItem(i);
            NotesList.replaceItem(NotesList.getItem(minIndex), i);
            NotesList.replaceItem(temp, minIndex);
        }
    }
    NotesList.add(note.toString());
    }

    //accessor method for the encapsulated title
    public String getTitle() {
        return title;
    }

    //accessor method for the encapsulated date
    public String getDate() {
        return date;
    }

    //accessor method for the encapsulated body
    public String GetBody() {
        return body;
    }

    /**
     * String representation of this object
     * <p>
     * return statement returns the object represented as a String
     */
    @Override
    public String toString() {
        return title + " " + date;
    }

    public boolean isEmpty() {
        if (NotesList.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
// Check if this Note object is equal to the input object
    public boolean equals(Object object) {
        // cast the input object to Note type
        Note note = (Note) object;
        // check if the DataStructures type is set to title
        if (DataStructures.type == DataStructures.type_title) {
                       // compare the title of this Note and the input Note and ignore case
            return this.getTitle().equalsIgnoreCase(this.getTitle());
            // check if the DataStructures type is set to date
        } else if (DataStructures.type == DataStructures.type_date) {
           // compare the date of this Note and the input Note and ignore case
           
         return this.getDate().equalsIgnoreCase(this.getDate());
        } 
        // check if the DataStructures type is set to body
        else if (DataStructures.type == DataStructures.type_body) {
            // compare the body of this Note and the input Note
            String Body1 = this.content;
            String Body2 = this.content;
            // check if Body1 contains Body2
            Body1.contains(Body2);
            return Body1.contains(Body2);

        }
        // if none of the conditions is met, return false
        return false;

    }
//The allIndices method returns an array of all the indices of the Note object passed as a parameter
  
/*The compareTo method compares two Notes based on either their title, date, or body
This is determined by the type set in the DataStructures class
The method returns an int value representing the result of the comparison */
    public int compareTo(Note note) {
        if (DataStructures.type == DataStructures.type_title) {
            return this.getTitle().compareTo(this.getTitle());
        } else if (DataStructures.type == DataStructures.type_date) {
            return this.getDate().compareTo(this.getDate());
        }
        return 0;
    }
    public void initialize() {
        Note note = new Note(title, date, body);
        return;
    }

//The search method allows the user to search for a specific note in the NotesList
    public void search(java.awt.List NotesList) {
        //array containing the search options to be utilizied by the user
        final String[] Options = {"Search by title",
                "Search by date",
                "Search by body"};
//The user inputs their choice and the corresponding search is performed
        String Choices = Controllers.Dialogues.showOptions(
                "which type of seach do you wish to perform?",
                Options);
        if (Choices.equals(null) || Choices.equals("")) {
            return;
        } else if (Choices.equalsIgnoreCase(Options[0])) {
            String title = Controllers.Dialogues.InputMessage(
                    "Enter title to search for");
            DataStructures.type = DataStructures.type_title;
            Note note = new Note(title, null, null);

            if (indices == null) {
                //If no notes are found with the specified criteria, a message is displayed to the user
                Controllers.Dialogues.showMessage(
                        "No notes are present with the title: " + title);
            } else {
                for (int i = 0; i < indices.length; i++) {
                    Note newNote = (note);
                    NotesList.getItem(indices[i]);
                    NotesList.add(newNote.toString());
                }
            }
        } else if (Choices.equalsIgnoreCase(Options[1])) {
            String date = Controllers.Dialogues.InputMessage(
                    "Enter date to search for");
            DataStructures.type = DataStructures.type_date;
            Note note = new Note(null, date, null);

            if (indices == null) {
                Controllers.Dialogues.showMessage(
                        "No notes are present with the date: " + date);

            }
        } else if (Choices.equalsIgnoreCase(Options[2])) {
            String body = Controllers.Dialogues.InputMessage(
                    "Enter a keyword to search for");
            DataStructures.type = DataStructures.type_body;
            Note note = new Note(null, null, body);
        }
        if (indices == null) {
            Controllers.Dialogues.showMessage(
                    "No notes are present with the text: " + title);

        } else {
            // the indices of the matching notes are retrieved and added to the NotesList to be displayed to the user.
            for (int i = 0; i < indices.length; i++) {
                Note newNote = (note);
                NotesList.getItem(indices[i]);
                NotesList.add(newNote.toString());
            }
        }

    }
   
}

