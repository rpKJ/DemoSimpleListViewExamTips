package sg.edu.rp.c346.id20037535.demosimplelistviewexamtips;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvExamTips;
    ArrayList<String> tips = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvExamTips = findViewById(R.id.listViewExamTips);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, tips);

        lvExamTips.setAdapter((adapter));

        tips.add("Don't just read the code, code it as much as possible during each practical session");
        tips.add("Seek help from the lecturer ASAP, don't wait till you lost in the jungle");
        tips.add("Prepare your template source code for each topic");
        tips.add("Create a few empty Android projects to speed up your coding during the exam");
        tips.add("Ensure that your Android Studio is up and running before the exam");
    }
}