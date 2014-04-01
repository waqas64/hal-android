package net.nordness.homeautomation.hal;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class LightsFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_lights, container, false);

        final Button onButton = (Button) rootView.findViewById(R.id.on_button);
        onButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                new SendRequest().execute(
                        getString(R.string.server_host) + getString(R.string.url_lights_on)
                );
            }
        });

        final Button offButton = (Button) rootView.findViewById(R.id.off_button);
        offButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                new SendRequest().execute(
                        getString(R.string.server_host) + getString(R.string.url_lights_off)
                );
            }
        });

        return rootView;
    }
}
