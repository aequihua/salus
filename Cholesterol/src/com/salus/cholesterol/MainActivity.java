package com.salus.cholesterol;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources.Theme;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("MyApp","Estoy en Oncreate");
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


	/* (non-Javadoc)
	 * @see android.app.Activity#onActivityResult(int, int, android.content.Intent)
	 */
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
	}


	/* (non-Javadoc)
	 * @see android.app.Activity#onApplyThemeResource(android.content.res.Resources.Theme, int, boolean)
	 */
	@Override
	protected void onApplyThemeResource(Theme theme, int resid, boolean first) {
		// TODO Auto-generated method stub
		super.onApplyThemeResource(theme, resid, first);
	}


	/* (non-Javadoc)
	 * @see android.app.Activity#onDestroy()
	 */
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
        Log.i("MyApp","Estoy en OnDestroy");		
		super.onDestroy();
	}


	/* (non-Javadoc)
	 * @see android.app.Activity#onNewIntent(android.content.Intent)
	 */
	@Override
	protected void onNewIntent(Intent intent) {
		// TODO Auto-generated method stub
        Log.i("MyApp","Estoy en OnnewIntent");		
		super.onNewIntent(intent);
	}


	/* (non-Javadoc)
	 * @see android.app.Activity#onPause()
	 */
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}


	/* (non-Javadoc)
	 * @see android.app.Activity#onPostCreate(android.os.Bundle)
	 */
	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onPostCreate(savedInstanceState);
	}


	/* (non-Javadoc)
	 * @see android.app.Activity#onPostResume()
	 */
	@Override
	protected void onPostResume() {
		// TODO Auto-generated method stub
		super.onPostResume();
	}


	/* (non-Javadoc)
	 * @see android.app.Activity#onRestart()
	 */
	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
	}


	/* (non-Javadoc)
	 * @see android.app.Activity#onRestoreInstanceState(android.os.Bundle)
	 */
	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onRestoreInstanceState(savedInstanceState);
	}


	/* (non-Javadoc)
	 * @see android.app.Activity#onResume()
	 */
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
        Log.i("MyApp","Estoy en OnResume");		
		super.onResume();
	}


	/* (non-Javadoc)
	 * @see android.app.Activity#onSaveInstanceState(android.os.Bundle)
	 */
	@Override
	protected void onSaveInstanceState(Bundle outState) {
		// TODO Auto-generated method stub
		super.onSaveInstanceState(outState);
	}


	/* (non-Javadoc)
	 * @see android.app.Activity#onStart()
	 */
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
        Log.i("MyApp","Estoy en OnStart");
		super.onStart();
	}


	/* (non-Javadoc)
	 * @see android.app.Activity#onStop()
	 */
	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
        Log.i("MyApp","Estoy en OnStop");		
		super.onStop();
	}


	/* (non-Javadoc)
	 * @see android.app.Activity#onUserLeaveHint()
	 */
	@Override
	protected void onUserLeaveHint() {
		// TODO Auto-generated method stub
		super.onUserLeaveHint();
	}
    
}
