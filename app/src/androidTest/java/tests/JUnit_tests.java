package tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.cse110.testprojectlab3.MainActivity;
import com.cse110.testprojectlab3.R;

/**
 * Created by Aaron on 4/19/2016.
 */
public class JUnit_tests extends ActivityInstrumentationTestCase2<MainActivity> {

    MainActivity mainActivity;
    public JUnit_tests()
    {
        super(MainActivity.class);
    }

    public void test_first()
    {
        mainActivity = getActivity();

        TextView textView = (TextView) mainActivity.findViewById(R.id.tv1);
        String tester = textView.getText().toString();

        assertEquals("Hello World", tester);
    }
}
