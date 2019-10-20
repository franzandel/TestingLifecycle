package com.example.testinglifecycle

import android.app.Activity
import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

const val TAG_TESTLIFECYCLE = "TEST_LIFECYCLE"

//  First Launch
//  1. onCreate
//  2. onStart
//  3. onResume
//
//  Press Home Button / Active Apps Button
//  1. onPause
//  2. onStop
//
//  Get back to apps from Home / Active Apps Button
//  1. onStart
//  2. onResume

//  P.s. :
//  ——-
//  - Use onPause / onStop / onSaveInstanceState(Bundle) to Save Data not onDestroy
//  - The only way to only Trigger onResume without onStart & onPause without onStop is calling a new Activity that is not Full Screen (AlertDialog is not included)
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG_TESTLIFECYCLE, "onCreate")

        btnHalfActivity.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
//            val dialogSource = "2"
//            val btnPositive = "Keluar"
//            val btnNegative = "Batal"
//            showPopupDialog(this,
//                            "Konfirmasi",
//                            "Apakah Anda ingin keluar dari Aplikasi ?",
//                            dialogSource,
//                            btnPositive,
//                            btnNegative)
        }

        btnFullActivity.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG_TESTLIFECYCLE, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG_TESTLIFECYCLE, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG_TESTLIFECYCLE, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG_TESTLIFECYCLE, "onStop")
    }

    // Some Condition might not onDestroy like rotating Device
    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG_TESTLIFECYCLE, "onDestroy")
    }

//    onRestart is called when onStop is triggered,
//    Also onRestart is called before onStart & onResume,
//    which means when User navigates back to previous Activity
    override fun onRestart() {
        super.onRestart()
        Log.d(TAG_TESTLIFECYCLE, "onRestart")
    }

    fun showPopupDialog(activity: Activity,
                        title: String,
                        msg: String,
                        dialogSource: String,
                        btnPositive: String,
                        btnNegative: String) {

//        val alertDialog: AlertDialog? = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
//            AlertDialog.Builder(activity, R.style.Dialog_Alert_Theme).create()
//        } else {
//            AlertDialog.Builder(activity).create()
//        }
        val alertDialog: AlertDialog? = AlertDialog.Builder(activity).create()

        alertDialog?.setTitle(title)
        alertDialog?.setMessage(msg)
//        alertDialog!!.setCancelable(false)

        alertDialog!!.show()
    }
}
