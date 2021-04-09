package by.airline.util;

public class PlaneUtil {
    public static void startTheEngine() {
        //...
    }

    public static boolean getPermission(){
        boolean permission = false;
        //...
        permission = true;
        return permission;
    }

    public static boolean takeOff(boolean permission) {
        //...
        boolean planeTakeOff = false;
        if (permission){
            //...
            planeTakeOff = true;
        }
        return planeTakeOff;
    }

    public static void chassisUp() {
        //...
    }

    public static void chassisDown() {
        //...
    }

    public static int useTheNavigator(int firstCoordinate, int secondCoordinate) {
        //...
        int finalParameter = 0;
        //...
        return finalParameter = firstCoordinate + secondCoordinate;
    }

    public static void TurnOffTheEngine() {
        //...
    }
}
