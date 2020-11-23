<pre>
/**
 * 0b를 붙이면 바이너리라는 표시.
 * 0x는 16진수라는 표시.
 */
/*int a = 0b00001010;
System.out.println(a); // 10*/

/**
 * int가 양수로 저장할 수 있는 최대값 2147483647. 양수이기 떄문에 맨앞의 부호값이 0. (음수이면 1)
 * 최대값이기 때문에 맨앞의 부호인 0 빼고 다 1로 채워져 있다.
 */
int d = 2147483647;
System.out.println(String.format("%32s", Integer.toBinaryString(d & 0xFFFFFFFF)).replace(' ', '0'));
// 0111_1111_1111_1111_1111_1111_1111_1111

/**
 * 음수이기 때문에 맨앞의 부호값이 1이 되고, int가 저장할 수 있는 최대값의 끝에서 앞으로 다시 돌아가서 세기 시작한다.
 */
int b = -1;
System.out.println(Integer.toBinaryString(b)); // 1111_1111_1111_1111_1111_1111_1111_1111
System.out.println(Integer.toHexString(b)); // ffffffff

int c = -4;
System.out.println(Integer.toBinaryString(c)); // 1111_1111_1111_1111_1111_1111_1111_1100
System.out.println(Integer.toHexString(c)); // fffffffc
</pre>