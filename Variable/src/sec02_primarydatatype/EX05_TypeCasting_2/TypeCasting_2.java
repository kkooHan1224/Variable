package sec02_primarydatatype.EX05_TypeCasting_2;

public class TypeCasting_2 {
	public static void main(String[] args) {
		// �ڵ� Ÿ�� ��ȯ
		float value1 = 3;		// int -> float(��ĳ����)          
		long value2 = 5;		// int -> long(��ĳ����)
		double value3 = 7;		// int -> double(��ĳ����)
		byte value4 = 9;		// int -> byte
		short value5 = 11;		// int -> short
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(value5);
		System.out.println();
		
		// ���� Ÿ�� ��ȯ
		byte value6 = (byte)128;	// int -> byte(�ٿ�ĳ����)
		int value7 = (int)3.5;		// double -> int(�ٿ�ĳ����)
		float value8 = (float)7.5;	// double -> float(�ٿ�ĳ����)
		
		System.out.println(value6);
		System.out.println(value7);
		System.out.println(value8);
	}
}
