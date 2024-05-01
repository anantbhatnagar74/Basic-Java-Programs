class PrimeSeries 
{
	 static void primeSeries(int N)
	{
		int x, y, f;
		System.out.println(
			"All the Prime numbers within 1 and " + N
			+ " are:");
		for (x = 1; x <= N; x++) {
			if (x == 1 || x == 0)
				continue;
			f = 1;
			for (y = 2; y <= x / 2; y++) {
				if (x % y == 0) {
					f = 0;
					break;
				}
			}
			if (f == 1)
				System.out.print(x + " ");
		}
	}
	public static void main(String[] args)
	{
		int N = 50;
		primeSeries(N);
	}
}
