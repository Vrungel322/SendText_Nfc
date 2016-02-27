package com.nanddgroup.sendtext_nfc;

import android.content.Intent;
import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.NfcAdapter;
import android.os.Parcelable;

/**
 * Created by Nikita on 27.02.2016.
 */
public class Receiver {
    String inMsg;

    public void onResume2(Intent intent) {
        String action = intent.getAction();
        if (action.equals(NfcAdapter.ACTION_NDEF_DISCOVERED)) {
            Parcelable[] parcelables =
                    intent.getParcelableArrayExtra(
                            NfcAdapter.EXTRA_NDEF_MESSAGES);
            NdefMessage inNdefMessage = (NdefMessage) parcelables[0];
            NdefRecord[] inNdefRecords = inNdefMessage.getRecords();
            NdefRecord NdefRecord_0 = inNdefRecords[0];
            inMsg = new String(NdefRecord_0.getPayload());
        }
    }

    public String getInMsg() {
        return inMsg;
    }
}