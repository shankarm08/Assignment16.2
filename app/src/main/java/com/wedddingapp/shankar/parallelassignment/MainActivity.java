package com.wedddingapp.shankar.parallelassignment;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button startBtn;
    ProgressBar firstBar,secondBar,thirdBar,fourthBar;
    Handler handler = new Handler();   //creating object of Handler class.

    @Override
    //onCreate method.
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);   //Setting content view.

        //Setting references with their IDs.
        startBtn = (Button) findViewById(R.id.download_btn);
        firstBar = (ProgressBar) findViewById(R.id.progressBar_first);
        secondBar = (ProgressBar)findViewById(R.id.progressBar_second);
        thirdBar=(ProgressBar)findViewById(R.id.progressBar_third);
        fourthBar=(ProgressBar)findViewById(R.id.progressBar_fourth);

        //Setting onClick listener to the Button.
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            //Handling onClick event of the Button.
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Download Starting....",Toast.LENGTH_SHORT).show();


                //Creating Thread using Runnable interface. and starting Thread.
                new Thread(new Runnable() {

                    int i = 0;
                    int progressStatus = 0;

                    //run() method which is overridden.
                    public void run() {
                        //while loop to set the progress to ProgressBar at each instant.
                        while (progressStatus < 100) {
                            progressStatus += doWork();
                            try {
                                Thread.sleep(500);  //Thread sleeping
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }

                            // Update the progress bar
                            handler.post(new Runnable() {
                                public void run() {
                                    firstBar.setProgress(progressStatus);
                                    i++;
                                }
                            });

                        }
                    }
                    //Updating the parameter which is changing progress on the ProgressBar.
                    private int doWork() {

                        return i * 10;
                    }

                }).start();


                //Creating Thread using Runnable interface. and starting Thread.
                new Thread(new Runnable() {

                    int i = 0;
                    int progressStatus = 0;

                    //run() method which is overridden.
                    public void run() {
                        //while loop to set the progress to ProgressBar at each instant.
                        while (progressStatus < 100) {
                            progressStatus += doWork();
                            try {
                                Thread.sleep(500);  //Thread sleeping
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }

                            // Update the progress bar
                            handler.post(new Runnable() {
                                public void run() {
                                    secondBar.setProgress(progressStatus);
                                    i++;
                                }
                            });

                        }
                    }
                    //Updating the parameter which is changing progress on the ProgressBar.
                    private int doWork() {

                        return i * 10;
                    }

                }).start();

                //Creating Thread using Runnable interface. and starting Thread.
                new Thread(new Runnable() {

                    int i = 0;
                    int progressStatus = 0;

                    //run() method which is overridden.
                    public void run() {
                        //while loop to set the progress to ProgressBar at each instant.
                        while (progressStatus < 100) {
                            progressStatus += doWork();
                            try {
                                Thread.sleep(500);  //Thread sleeping
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }

                            // Update the progress bar
                            handler.post(new Runnable() {
                                public void run() {
                                    thirdBar.setProgress(progressStatus);
                                    i++;
                                }
                            });

                        }
                    }
                    //Updating the parameter which is changing progress on the ProgressBar.
                    private int doWork() {

                        return i * 10;
                    }

                }).start();

                //Creating Thread using Runnable interface. and starting Thread.
                new Thread(new Runnable() {

                    int i = 0;
                    int progressStatus = 0;

                    //run() method which is overridden.
                    public void run() {
                        //while loop to set the progress to ProgressBar at each instant.
                        while (progressStatus < 100) {
                            progressStatus += doWork();
                            try {
                                Thread.sleep(500);  //Thread sleeping
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }

                            // Update the progress bar
                            handler.post(new Runnable() {
                                public void run() {
                                    fourthBar.setProgress(progressStatus);
                                    i++;
                                }
                            });

                        }
                    }
                    //Updating the parameter which is changing progress on the ProgressBar.
                    private int doWork() {

                        return i * 10;
                    }

                }).start();

                Toast.makeText(getApplicationContext(),"Download Complete",Toast.LENGTH_SHORT).show();

            }
        });

    }
}   //End of MainActivity.