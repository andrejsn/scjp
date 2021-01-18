package de.naumovs.page87.primitives;

public class Primitives {
	
	byte b; // 2^(8 - sign) -> 2^7
	short s; // 2bytes -> 16bits -> 2^(16bit-sign) > 2^15
	int i; // 4bytes -> 32bits -> 2^(32bit-sign) > 2^31
	long l; // 8bytes -> 64bits -> 2^(64bit-sign) > 2^63
	
	float f; // 4 bytes -> 32bits
	double d; // 8 bytes -> 64bits
	
	
	boolean myBoolenPrimitive; // true | false
	int x,y,z;
	
	char c; // 16-bit 2^16 unicode
	
	String string1, string2;
	
	Object object;

	
	
}
