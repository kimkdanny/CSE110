package group11.cse110.com.serviceforservice;

import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;

/**
 * Created by Kim on 1/18/16.
 */
public class SellFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.sell, container, false);
        /*
        RadioButton food = (RadioButton) rootView.findViewById(R.id.radioButton);
        RadioButton housing = (RadioButton) rootView.findViewById(R.id.radioButton2);
        RadioButton transportation = (RadioButton) rootView.findViewById(R.id.radioButton3);
        RadioButton entertainment = (RadioButton) rootView.findViewById(R.id.radioButton4);
        RadioButton money = (RadioButton) rootView.findViewById(R.id.radioButton5);
        RadioButton other = (RadioButton) rootView.findViewById(R.id.radioButton6);

*/

        return rootView;
    }
}
