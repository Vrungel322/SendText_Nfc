package com.nanddgroup.sendtext_nfc;

import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.NfcEvent;

/**
 * Created by Nikita on 27.02.2016.
 */
public class Sender {

    public NdefMessage createNdefMessage2(byte[] bytesOut, NfcEvent event ){

        NdefRecord ndefRecordOut = new NdefRecord(
                NdefRecord.TNF_MIME_MEDIA,
                "text/plain".getBytes(),
                new byte[] {},
                bytesOut);

        NdefMessage ndefMessageout = new NdefMessage(ndefRecordOut);
        return ndefMessageout;
    }
}
