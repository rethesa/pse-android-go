package com.example.androidgoapp.androidgoapp.Model;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;

import com.example.androidgoapp.androidgoapp.Model.keineAhnungWieIchDasNennenSoll.Group;

/**
 * Created by Tarek on 13.01.17.
 */

public class GoIntentService extends IntentService {
    private Group group;

    public GoIntentService(Group group) {
        super(GoIntentService.class.getSimpleName());
        this.group = group;
    }

    public void activate(Context context) {
        // send messages to the server in periodic intervals
        Intent intent = new Intent(context, GoIntentService.class);
        context.startService(intent);

        // TODO:
    }

    public void deactivate() {
        // Stop polling
    }

    @Override
    protected void onHandleIntent(Intent intent) {

    }
}
