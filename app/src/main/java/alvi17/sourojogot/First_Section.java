package alvi17.sourojogot;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

/**
 * Created by Alvi17 on 8/28/2015.
 */
public class First_Section extends Activity{

    FrameLayout fm;
    AdView adView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_section);
        fm=(FrameLayout)findViewById(R.id.first_Fragment);
        adView = new AdView(this);
        adView.setAdUnitId("ca-app-pub-6508526601344465/7531247239");
        adView.setAdSize(AdSize.BANNER);
        LinearLayout layout = new LinearLayout(this);
        layout.setGravity(Gravity.BOTTOM|Gravity.CENTER_HORIZONTAL);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
        layout.addView(adView);
        fm.addView(layout);
    }

}
