package space.elvensong.preferencefragmentexample;

import android.os.Bundle;
import android.preference.PreferenceFragment;

public class Fragment1 extends PreferenceFragment{
    @Override
    public void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        // load the preferences from and XML file
        addPreferencesFromResource(R.xml.preferences);
    }
}
