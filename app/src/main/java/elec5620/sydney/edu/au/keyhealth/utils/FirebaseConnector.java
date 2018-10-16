package elec5620.sydney.edu.au.keyhealth.utils;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FirebaseConnector<T> {

    public static DatabaseReference getReference(){
        return FirebaseDatabase.getInstance().getReference();
    }

    public static T singleValueQuery(String val){

    }
}
