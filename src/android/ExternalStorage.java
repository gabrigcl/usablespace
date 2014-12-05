package org.unasus.usablespace;

import android.os.Environment;

public class ExternalStorage {
	public long getSpaceFreeByte() throws Exception {
		long spaceFreeByte = 0;

		this.checkMounted();

		spaceFreeByte = Environment.getExternalStorageDirectory()
				.getFreeSpace();

		return spaceFreeByte;
	}

	private boolean checkMounted() throws Exception {
		String state = "";

		try {
			state = Environment.getExternalStorageState();
			if (!Environment.MEDIA_MOUNTED.equals(state)) {
				throw new Exception("Media Unmounted!");
			}
		} catch (Exception e) {
			throw e;
		}

		return true;
	}
}
