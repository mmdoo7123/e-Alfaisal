package Controllers;

import AdminInterface.AssignmentsUI;

public class AdminController {
    /*The displayAllAssignments method removes all items from the 
    AssignmentsPostedList and then adds all items from the
    AssignmentsPostedList to itself.  */
    public static void displayAllAssignments(AssignmentsUI Assignment, java.awt.List AssignmentsPostedList) {
        AssignmentsPostedList.removeAll();
        for (int i = 0; i < AssignmentsPostedList.getItemCount(); i++) {
            String title;

            title = AssignmentsPostedList.getItem(i);
            AssignmentsPostedList.add(title);
        }
    }

 /*The search method searches for an item in the AssignmentsPostedList that 
    matches the target string and returns the item if found, or returns null
    if not found.   */
    /*
public static String search(java.awt.List AssignmentsPostedList, String target) {
AdminInterface.AssignmentsUI assignmentsUI = new AdminInterface.AssignmentsUI();

if(!assignmentsUI.AssignmentSearchTextField.getText().isEmpty()){    
    for (int i = 0; i < AssignmentsPostedList.getItemCount(); i++) {
            if (AssignmentsPostedList.getItem(i).equals(target)) {
                return AssignmentsPostedList.getItem(i);
            }
        }
    }
        return null;
    }
*/
}

