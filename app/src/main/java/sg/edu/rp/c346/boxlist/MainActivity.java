package sg.edu.rp.c346.boxlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Step 4a
        ListView lvBoxArrangement;
        ArrayList<Colour> boxList;
        CustomAdapter caBoxArrangement;


            //Step 4b
            lvBoxArrangement = (ListView) findViewById(R.id.ListViewBox);
            boxList = new ArrayList<Colour>();

            caBoxArrangement = new CustomAdapter(this, R.layout.box_row, boxList);
            lvBoxArrangement.setAdapter(caBoxArrangement);

            //Step 4c, Create your data Object
            Colour item1 = new Colour("blue");
            boxList.add(item1);

            Colour item2 = new Colour("orange");
            boxList.add(item2);

            Colour item3 = new Colour("");
            boxList.add(item3);
        }
    }

