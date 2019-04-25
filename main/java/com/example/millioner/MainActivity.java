package com.example.millioner;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button rightButton, button1, button2, button3;
    TextView textView, counterTextView;
    int a = 1;
    Random placement = new Random();
    int counterOfRight = 0;
    int counterOfTask = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        rightButton = (Button) findViewById(R.id.rightButton);
        button1 = (Button) findViewById(R.id.falseButton1);
        button2 = (Button) findViewById(R.id.falseButton2);
        button3 = (Button) findViewById(R.id.falseButton3);
        textView = (TextView) findViewById(R.id.textView);
        counterTextView = (TextView) findViewById(R.id.num);
        counterTextView.setText(textSetter(counterOfTask));

        final String[] tasks = {getText(R.string.taskFor1).toString(), getText(R.string.taskFor2).toString(),
                getText(R.string.taskFor3).toString(), getText(R.string.taskFor4).toString(),
                getText(R.string.taskFor5).toString(), getText(R.string.taskFor6).toString(),
                getText(R.string.taskFor7).toString()};
        final String[] varsFor1 = {getText(R.string.var1For1).toString(), getText(R.string.var1For2).toString(),
                getText(R.string.var1For3).toString(), getText(R.string.var1For4).toString(),
                getText(R.string.var1For5).toString(), getText(R.string.var1For6).toString(),
                getText(R.string.var1For7).toString()};
        final String[] varsFor2 = {getText(R.string.var2For1).toString(), getText(R.string.var2For2).toString(),
                getText(R.string.var2For3).toString(), getText(R.string.var2For4).toString(),
                getText(R.string.var2For5).toString(), getText(R.string.var2For6).toString(),
                getText(R.string.var2For7).toString()};
        final String[] varsFor3 = {getText(R.string.var3For1).toString(), getText(R.string.var3For2).toString(),
                getText(R.string.var3For3).toString(), getText(R.string.var3For4).toString(),
                getText(R.string.var3For5).toString(), getText(R.string.var3For6).toString(),
                getText(R.string.var3For7).toString()};
        final String[] varsFor4 = {getText(R.string.var4For1).toString(), getText(R.string.var4For2).toString(),
                getText(R.string.var4For3).toString(), getText(R.string.var4For4).toString(),
                getText(R.string.var4For5).toString(), getText(R.string.var4For6).toString(), getText(R.string.var4For7).toString()};

        int[] images = {R.drawable.millioner, R.drawable.millioner2};

        rightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<Button> buttons = new ArrayList<>();
                buttons.add(rightButton);
                buttons.add(button1);
                buttons.add(button2);
                buttons.add(button3);
                List XforButtons = new ArrayList();
                XforButtons.add((float)200);
                XforButtons.add((float)600);
                List YforButtons = new ArrayList();
                YforButtons.add((float)1140);
                YforButtons.add((float)1350);
                if (a == 7) {
                    counterOfRight += 1;
                    Toast.makeText(MainActivity.this, "CONGRATULATIONS!!!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, FinalActivity.class);
                    intent.putExtra("numOfRight", counterOfRight);
                    startActivity(intent);
                    finish();
                }
                if (a < 7) {
                Toast.makeText(MainActivity.this, "well done, you've answered true!", Toast.LENGTH_SHORT).show();
                counterOfRight += 1;
                counterOfTask += 1;
                counterTextView.setText(textSetter(counterOfTask));
                textView.setText(tasks[a]);
                rightButton.setText(varsFor1[a]);
                button1.setText(varsFor2[a]);
                button2.setText(varsFor3[a]);
                button3.setText(varsFor4[a]);

                int index1 = placement.nextInt(buttons.size());
                buttons.get(index1).setX((float)XforButtons.get(0));
                buttons.get(index1).setY((float)YforButtons.get(0));
                buttons.remove(index1);

                int index2 = placement.nextInt(buttons.size());
                buttons.get(index2).setX((float)XforButtons.get(0));
                buttons.get(index2).setY((float)YforButtons.get(1));
                buttons.remove(index2);

                int index3 = placement.nextInt(buttons.size());
                buttons.get(index3).setX((float)XforButtons.get(1));
                buttons.get(index3).setY((float)YforButtons.get(0));
                buttons.remove(index3);

                int index4 = placement.nextInt(buttons.size());
                buttons.get(index4).setX((float)XforButtons.get(1));
                buttons.get(index4).setY((float)YforButtons.get(1));
                buttons.remove(index4);

                a += 1;
                }
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<Button> buttons = new ArrayList<>();
                buttons.add(rightButton);
                buttons.add(button1);
                buttons.add(button2);
                buttons.add(button3);
                List XforButtons = new ArrayList();
                XforButtons.add((float)200);
                XforButtons.add((float)600);
                List YforButtons = new ArrayList();
                YforButtons.add((float)1140);
                YforButtons.add((float)1350);
                if (a == 7) {
                    Toast.makeText(MainActivity.this, "CONGRATULATIONS!!!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, FinalActivity.class);
                    intent.putExtra("numOfRight", counterOfRight);
                    startActivity(intent);
                    finish();
                }
                if (a < 7) {
                    counterOfTask += 1;
                    counterTextView.setText(textSetter(counterOfTask));
                    textView.setText(tasks[a]);
                    rightButton.setText(varsFor1[a]);
                    button1.setText(varsFor2[a]);
                    button2.setText(varsFor3[a]);
                    button3.setText(varsFor4[a]);

                    int index1 = placement.nextInt(buttons.size());
                    buttons.get(index1).setX((float)XforButtons.get(0));
                    buttons.get(index1).setY((float)YforButtons.get(0));
                    buttons.remove(index1);

                    int index2 = placement.nextInt(buttons.size());
                    buttons.get(index2).setX((float)XforButtons.get(0));
                    buttons.get(index2).setY((float)YforButtons.get(1));
                    buttons.remove(index2);

                    int index3 = placement.nextInt(buttons.size());
                    buttons.get(index3).setX((float)XforButtons.get(1));
                    buttons.get(index3).setY((float)YforButtons.get(0));
                    buttons.remove(index3);

                    int index4 = placement.nextInt(buttons.size());
                    buttons.get(index4).setX((float)XforButtons.get(1));
                    buttons.get(index4).setY((float)YforButtons.get(1));
                    buttons.remove(index4);

                    a += 1;
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<Button> buttons = new ArrayList<>();
                buttons.add(rightButton);
                buttons.add(button1);
                buttons.add(button2);
                buttons.add(button3);
                List XforButtons = new ArrayList();
                XforButtons.add((float)200);
                XforButtons.add((float)600);
                List YforButtons = new ArrayList();
                YforButtons.add((float)1140);
                YforButtons.add((float)1350);
                if (a == 7) {
                    Toast.makeText(MainActivity.this, "CONGRATULATIONS!!!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, FinalActivity.class);
                    intent.putExtra("numOfRight", counterOfRight);
                    startActivity(intent);
                    finish();
                }
                if (a < 7) {
                    counterOfTask += 1;
                    counterTextView.setText(textSetter(counterOfTask));
                    textView.setText(tasks[a]);
                    rightButton.setText(varsFor1[a]);
                    button1.setText(varsFor2[a]);
                    button2.setText(varsFor3[a]);
                    button3.setText(varsFor4[a]);

                    int index1 = placement.nextInt(buttons.size());
                    buttons.get(index1).setX((float)XforButtons.get(0));
                    buttons.get(index1).setY((float)YforButtons.get(0));
                    buttons.remove(index1);

                    int index2 = placement.nextInt(buttons.size());
                    buttons.get(index2).setX((float)XforButtons.get(0));
                    buttons.get(index2).setY((float)YforButtons.get(1));
                    buttons.remove(index2);

                    int index3 = placement.nextInt(buttons.size());
                    buttons.get(index3).setX((float)XforButtons.get(1));
                    buttons.get(index3).setY((float)YforButtons.get(0));
                    buttons.remove(index3);

                    int index4 = placement.nextInt(buttons.size());
                    buttons.get(index4).setX((float)XforButtons.get(1));
                    buttons.get(index4).setY((float)YforButtons.get(1));
                    buttons.remove(index4);

                    a += 1;
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<Button> buttons = new ArrayList<>();
                buttons.add(rightButton);
                buttons.add(button1);
                buttons.add(button2);
                buttons.add(button3);
                List XforButtons = new ArrayList();
                XforButtons.add((float)200);
                XforButtons.add((float)600);
                List YforButtons = new ArrayList();
                YforButtons.add((float)1140);
                YforButtons.add((float)1350);
                if (a == 7) {
                    Toast.makeText(MainActivity.this, "CONGRATULATIONS!!!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, FinalActivity.class);
                    intent.putExtra("numOfRight", counterOfRight);
                    startActivity(intent);
                    finish();
                }
                if (a < 7) {
                    counterOfTask += 1;
                    counterTextView.setText(textSetter(counterOfTask));
                    textView.setText(tasks[a]);
                    rightButton.setText(varsFor1[a]);
                    button1.setText(varsFor2[a]);
                    button2.setText(varsFor3[a]);
                    button3.setText(varsFor4[a]);

                    int index1 = placement.nextInt(buttons.size());
                    buttons.get(index1).setX((float)XforButtons.get(0));
                    buttons.get(index1).setY((float)YforButtons.get(0));
                    buttons.remove(index1);

                    int index2 = placement.nextInt(buttons.size());
                    buttons.get(index2).setX((float)XforButtons.get(0));
                    buttons.get(index2).setY((float)YforButtons.get(1));
                    buttons.remove(index2);

                    int index3 = placement.nextInt(buttons.size());
                    buttons.get(index3).setX((float)XforButtons.get(1));
                    buttons.get(index3).setY((float)YforButtons.get(0));
                    buttons.remove(index3);

                    int index4 = placement.nextInt(buttons.size());
                    buttons.get(index4).setX((float)XforButtons.get(1));
                    buttons.get(index4).setY((float)YforButtons.get(1));
                    buttons.remove(index4);

                    a += 1;
                }
            }
        });

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public String textSetter(int counter) {
        String txt;
        txt = Integer.toString(counter);
        return txt;
    }
}
