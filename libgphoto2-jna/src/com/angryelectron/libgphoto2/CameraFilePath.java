/**
 * Copyright 2012 Andrew Bythell, abythell@ieee.org
 *
 * This file is part of libgphoto2-jna.
 *
 * libgphoto2-jna is free software: you can redistribute it and/or modify it under the
 * terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 *
 * libgphoto2-jna is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * libphoto2-jna. If not, see <http://www.gnu.org/licenses/>.
 */
package com.angryelectron.libgphoto2;
import com.sun.jna.Structure;
/**
 * <i>native declaration : /usr/include/gphoto2/gphoto2-camera.h:1100</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CameraFilePath extends Structure {
	/**
	 * < \brief Name of the captured file.<br>
	 * C type : char[128]
	 */
	public byte[] name = new byte[128];
	/**
	 * < \brief Name of the folder of the captured file.<br>
	 * C type : char[1024]
	 */
	public byte[] folder = new byte[1024];
	public CameraFilePath() {
		super();
		initFieldOrder();
	}
	protected void initFieldOrder() {
		setFieldOrder(new String[]{"name", "folder"});
	}
	/**
	 * @param name < \brief Name of the captured file.<br>
	 * C type : char[128]<br>
	 * @param folder < \brief Name of the folder of the captured file.<br>
	 * C type : char[1024]
	 */
	public CameraFilePath(byte name[], byte folder[]) {
		super();
		if (name.length != this.name.length) 
			throw new IllegalArgumentException("Wrong array size !");
		this.name = name;
		if (folder.length != this.folder.length) 
			throw new IllegalArgumentException("Wrong array size !");
		this.folder = folder;
		initFieldOrder();
	}
	public static class ByReference extends CameraFilePath implements Structure.ByReference {
		
	};
	public static class ByValue extends CameraFilePath implements Structure.ByValue {
		
	};
}
