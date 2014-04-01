package net.nordness.homeautomation.hal;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class DoorFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_door, container, false);

        final Button openButton = (Button) rootView.findViewById(R.id.open_button);
        openButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                new SendRequest().execute(
                        getString(R.string.server_host) + getString(R.string.url_door_open)
                );
            }
        });

        final Button unlockButton = (Button) rootView.findViewById(R.id.unlock_button);
        unlockButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                new SendRequest().execute(
                        getString(R.string.server_host) + getString(R.string.url_door_unlock)
                );
            }
        });

        final Button lockButton = (Button) rootView.findViewById(R.id.lock_button);
        lockButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                new SendRequest().execute(
                        getString(R.string.server_host) + getString(R.string.url_door_lock)
                );
            }
        });

        return rootView;
    }

}