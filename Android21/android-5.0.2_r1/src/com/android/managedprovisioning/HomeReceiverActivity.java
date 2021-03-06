/*
 * Copyright 2014, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.managedprovisioning;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;

/*
 * This class is used to make sure that we start the mdm after we shut the Setup wizard down.
 * The shut down of the Setup wizard is initiated in the DeviceOwnerProvisioningActivity by setting
 * Global.DEVICE_PROVISIONED. This will cause the Setup wizard to shut down and send a HOME intent.
 * Instead of opening the home screen we want to open the mdm, so the HOME intent is caught by this
 * activity instead, which notifies the DeviceOwnerProvisioningService to send the
 * ACTION_PROFILE_PROVISIONING_COMPLETE to the mdm, which will then open up.
 */

public class HomeReceiverActivity extends Activity {
    @Override
   public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent indirectIntent = new Intent(DeviceOwnerProvisioningService.ACTION_HOME_INDIRECT);
        LocalBroadcastManager.getInstance(this).sendBroadcast(indirectIntent);
        finish();
    }
}