package ifirst.com.lession5singlefragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Configuration config = getResources().getConfiguration();

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        /**
         * Check the device orientation and act accordingly
         */

        if (config.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            /**
             * Landscape mode of the device
             */
            LM_Fragement ls_fragment = new LM_Fragement();
            fragmentTransaction.replace(android.R.id.content, ls_fragment);
        }else{
            /**
             * Portrait mode of the device
             */
            PM_Fragement pm_fragment = new PM_Fragement();
            fragmentTransaction.replace(android.R.id.content, pm_fragment);
        }
        fragmentTransaction.commit();
    }

}
