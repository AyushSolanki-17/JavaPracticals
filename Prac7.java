import java.util.Random;
class Prac7
{
	public static void main(String[] args)
	{
		Random r = new Random();
		StringBuilder sb = new StringBuilder();
		sb.append((char)(r.nextInt(26) + 'A'));
		sb.append((char)(r.nextInt(26) + 'A'));
		sb.append((char)(r.nextInt(26) + 'A'));
		sb.append(r.nextInt(10000));
		System.out.println(sb);	
	}
}