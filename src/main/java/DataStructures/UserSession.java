package DataStructures;

public class UserSession {
    private static String UserID;

    //   method returns the current value of the UserID field.
    public static String getUserID() {

        return UserID;

    }

    //  method that sets the value of the UserID field
    public static void setUserID(String _UserID) {
        UserID = _UserID;
    }

    //method sets the UserID field to null
    public static void clearUserID() {
        UserID = null;
    }
}
