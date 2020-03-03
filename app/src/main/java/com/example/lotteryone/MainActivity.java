package com.example.lotteryone;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    /* Essentials for programming
    Android APK creation process: https://www.quora.com/What-exactly-happens-during-an-Android-APK-creation-build-process
    Build options in Android Studio: https://developer.android.com/studio/run
    Git and Github integration in Android Studio: https://www.youtube.com/watch?v=bcduIvadmPo
    Debugging with Android Studio: https://www.youtube.com/watch?v=nBaL78HC0ls
    Essentials:
    Step Over command: This command lets the application execute the next action. If the action involves a call to an operation, it does not step into its implementation (it steps over it instead).
    Step Into command: This command lets the application execute the next action. If the action involves a call to an operation, it steps into its implementation and breaks the execution on the first action of that implementation.
    Step Out command: This command lets the application execute until the currently executed operation implementation is returned.
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
