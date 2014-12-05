package org.unasus.usablespace;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

public class UsableSpace extends CordovaPlugin {

	@Override
	public boolean execute(String action, JSONArray args,
			CallbackContext callbackContext) throws JSONException {
		if (action.equals("getUsableSpace")) {
			this.getByteFreeExternalPath(callbackContext);
			return true;
		} 

		return false;
	}


	private void getByteFreeExternalPath(CallbackContext callBackContext) {
		ExternalStorage externalstorage = new ExternalStorage();

		try {
			callBackContext.success(String.valueOf(externalstorage
					.getSpaceFreeByte()));
		} catch (Exception e) {
			e.printStackTrace();
			callBackContext.error(e.getMessage());
		}
	}


}// end class