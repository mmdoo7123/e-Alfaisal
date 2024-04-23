package DataStructures;

import UserInterface.Notes.Notes;

import java.io.File;

/*This class holds static variables and objects related to the data structure
of the program, including a NotesFrame object, a file, a Sort object, and a 
FileHandler object. The constructor initializes these objects and opens the 
data file.   */
public class DataStructures {
    public static final int type_title = 1;
    public static final int type_date = 2;
    public static final int type_body = 3;
    public static final int type_Latest = 4;
    public static final int type_Oldest = 5;
    public static final int type_Alphabetical = 6;
    private static final String Path = "/media/";
    private static final String fileName = Path + "data.txt";
    public static Notes notes;
    public static File dataFile;
    public static int type;


}