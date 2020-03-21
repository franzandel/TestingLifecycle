package com.example.testinglifecycle

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ActivityWithFragment : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_with_fragment)

        supportActionBar?.title = "Activity With Fragment"
        loadFragment()
    }

    private fun loadFragment() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, LifecycleFragment(), "4321")
            .commit()
    }
}
