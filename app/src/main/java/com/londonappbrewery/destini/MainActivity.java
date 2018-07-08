package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mStory;
    private Button mFirstOp;
    private Button mSecondOp;
    private int mindex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStory = (TextView) findViewById(R.id.storyTextView);
        mFirstOp = (Button) findViewById(R.id.buttonTop);
        mSecondOp = (Button) findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mFirstOp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mindex == 1 || mindex == 2) {
                    mStory.setText(R.string.T3_Story);
                    mFirstOp.setText(R.string.T3_Ans1);
                    mSecondOp.setText(R.string.T3_Ans2);
                    mindex = 3;
                } else if(mindex == 3) {
                    mStory.setText(R.string.T6_End);
                    mFirstOp.setVisibility(View.GONE);
                    mSecondOp.setVisibility(View.GONE);
                }


            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mSecondOp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mindex == 1) {
                    mStory.setText(R.string.T2_Story);
                    mFirstOp.setText(R.string.T2_Ans1);
                    mSecondOp.setText(R.string.T2_Ans2);
                    mindex = 2;
                } else if(mindex == 2) {
                    mStory.setText(R.string.T4_End);
                    mFirstOp.setVisibility(View.GONE);
                    mSecondOp.setVisibility(View.GONE);
                } else if(mindex == 3) {
                    mStory.setText(R.string.T5_End);
                    mFirstOp.setVisibility(View.GONE);
                    mSecondOp.setVisibility(View.GONE);
                }

            }
        });



    }
}
