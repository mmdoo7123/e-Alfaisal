package Controllers;

public class LibraryController {
     /*The search method searches for an item in the BooksList that 
    matches the target string (ignoring case) and returns the item if found, or returns null
    if not found.   */

    public static String search(java.awt.List BooksList, String target) {
        for (int i = 0; i < BooksList.getItemCount(); i++) {
            if (BooksList.getItem(i).toLowerCase().contains(target.toLowerCase())) {
                return BooksList.getItem(i);
            }
        }
        return null;
    }
}
