class AllPattern {
	public static void main(String[] args) {
		
		int n = 5;

		for (int i = 1; i <= n; i++) /* A */
		{

			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
D:\Programming>java AllPattern
*
* *
* * *
* * * *
* * * * *
* * * * * *
* * * * * * *
* * * * * * * *
* * * * * * * * *
System.out.println();
		
		for (int i = 1; i <= n; i++) /* B */
		{
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		*
              * *
            * * *
          * * * *
        * * * * *
      * * * * * *
    * * * * * * *
  * * * * * * * *
* * * * * * * * *
System.out.println("");

		for (int i = n; i >= 1; i--) /* C */
		{
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
* * * * * * * * *
* * * * * * * *
* * * * * * *
* * * * * *
* * * * *
* * * *
* * *
* *
*

System.out.println();
		
		for (int i = n; i >= 1; i--) /* D */
		{
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
System.out.println();
* * * * * * * * *
  * * * * * * * *
    * * * * * * *
      * * * * * *
        * * * * *
          * * * *
            * * *
              * *
                *
		for (int i = 0; i <= n; i++) /* AB */
		{
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			for (int j = 2; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		*
              * * *
            * * * * *
          * * * * * * *
        * * * * * * * * *
      * * * * * * * * * * *
    * * * * * * * * * * * * *
  * * * * * * * * * * * * * * *
* * * * * * * * * * * * * * * * *
System.out.println();

		for (int i = n; i >= 1; i--) /* CD */
		{
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			for (int j = 2; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
* * * * * * * * * * * * * * * * *
  * * * * * * * * * * * * * * *
    * * * * * * * * * * * * *
      * * * * * * * * * * *
        * * * * * * * * *
          * * * * * * *
            * * * * *
              * * *
                *

System.out.println();

		for (int i = 1; i <= n; i++) /* AC */
		{
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = n; i >= 1; i--) {
			for (int j = 2; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
*
* *
* * *
* * * *
* * * * *
* * * * * *
* * * * * * *
* * * * * * * *
* * * * * * * * *
* * * * * * * *
* * * * * * *
* * * * * *
* * * * *
* * * *
* * *
* *
*
System.out.println();

		/* BD */

		for (int i = 1; i < n; i++) /* B */
		{
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = n; i >= 1; i--) /* D */
		{
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		*
              * *
            * * *
          * * * *
        * * * * *
      * * * * * *
    * * * * * * *
  * * * * * * * *
* * * * * * * * *
  * * * * * * * *
    * * * * * * *
      * * * * * *
        * * * * *
          * * * *
            * * *
              * *
                *
	}
}
