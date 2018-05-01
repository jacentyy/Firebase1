package info.thingsy.thingsy;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

/**
 * Created by PLJAPOL1 on 2018-05-01.
 */

public class FirebaseUtil {
    public static FirebaseDatabase mFirebaseDatabase;
    public static DatabaseReference mDatabaseReference;
    private static FirebaseUtil firebaseUtil;
    public static ArrayList<TravelDeal> mDeals;

    private FirebaseUtil() {}

    public static void openFbReference(String ref) {
        if (firebaseUtil == null) {
            firebaseUtil = new FirebaseUtil();
            mFirebaseDatabase = FirebaseDatabase.getInstance();
            mDeals = new ArrayList<TravelDeal>();
        }
        mDatabaseReference = mFirebaseDatabase.getReference().child(ref);
    }
}
