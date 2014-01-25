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
import com.sun.jna.NativeLong;
import com.sun.jna.Structure;
/**
 * <i>native declaration : /usr/include/gphoto2/gphoto2-filesys.h:880</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CameraFileInfoPreview extends Structure {
	/**
	 * @see CameraFileInfoFields<br>
	 * < \brief Bitmask containing the set members.<br>
	 * C type : CameraFileInfoFields
	 */
	public int fields;
	/**
	 * @see CameraFileStatus<br>
	 * < \brief Status of the preview.<br>
	 * C type : CameraFileStatus
	 */
	public int status;
	/// < \brief Size of the preview.
	public NativeLong size;
	/**
	 * < \brief MIME type of the preview.<br>
	 * C type : char[64]
	 */
	public byte[] type = new byte[64];
	/// < \brief Width of the preview.
	public int width;
	/// < \brief Height of the preview.
	public int height;
	public CameraFileInfoPreview() {
		super();
		initFieldOrder();
	}
	protected void initFieldOrder() {
		setFieldOrder(new String[]{"fields", "status", "size", "type", "width", "height"});
	}
	/**
	 * @param fields @see CameraFileInfoFields<br>
	 * < \brief Bitmask containing the set members.<br>
	 * C type : CameraFileInfoFields<br>
	 * @param status @see CameraFileStatus<br>
	 * < \brief Status of the preview.<br>
	 * C type : CameraFileStatus<br>
	 * @param size < \brief Size of the preview.<br>
	 * @param type < \brief MIME type of the preview.<br>
	 * C type : char[64]<br>
	 * @param width < \brief Width of the preview.<br>
	 * @param height < \brief Height of the preview.
	 */
	public CameraFileInfoPreview(int fields, int status, NativeLong size, byte type[], int width, int height) {
		super();
		this.fields = fields;
		this.status = status;
		this.size = size;
		if (type.length != this.type.length) 
			throw new IllegalArgumentException("Wrong array size !");
		this.type = type;
		this.width = width;
		this.height = height;
		initFieldOrder();
	}
	public static class ByReference extends CameraFileInfoPreview implements Structure.ByReference {
		
	};
	public static class ByValue extends CameraFileInfoPreview implements Structure.ByValue {
		
	};
}
