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
 * <i>native declaration : /usr/include/gphoto2/gphoto2-port.h:101</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class GPPortSettingsUsbScsi extends Structure {
	/**
	 * < /brief The ports device node path (/dev/sg#)<br>
	 * C type : char[128]
	 */
	public byte[] path = new byte[128];
	public GPPortSettingsUsbScsi() {
		super();
		initFieldOrder();
	}
	protected void initFieldOrder() {
		setFieldOrder(new String[]{"path"});
	}
	/**
	 * @param path < /brief The ports device node path (/dev/sg#)<br>
	 * C type : char[128]
	 */
	public GPPortSettingsUsbScsi(byte path[]) {
		super();
		if (path.length != this.path.length) 
			throw new IllegalArgumentException("Wrong array size !");
		this.path = path;
		initFieldOrder();
	}
	public static class ByReference extends GPPortSettingsUsbScsi implements Structure.ByReference {
		
	};
	public static class ByValue extends GPPortSettingsUsbScsi implements Structure.ByValue {
		
	};
}
