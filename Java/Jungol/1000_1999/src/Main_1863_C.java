//�ٸ� �̻����� �����̶� �ϸ� ����...
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class Main_1863_C {
	public static int[] student = null;
	public static BufferedReader br;
	public static BufferedWriter bw;
	public static int count = 0;
	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken()); //�л���
		int m = Integer.parseInt(st.nextToken()); //����� ���� �л� ����.
		student = new int[n+1];
		count = 0;
		for (int i = 1; i <= n; i++) {
			student[i]=i;
		}
		for (int i = 1; i <= m; i++) {
			st = new StringTokenizer(br.readLine()," ");
			int first = Integer.parseInt(st.nextToken());
			int second = Integer.parseInt(st.nextToken());
			union(first, second);
			union(second, first);
		}
		for (int i = 1; i < n+1; i++) {
			if(student[i]==i)count++;
		}
		System.out.println(count);
	}
	public static void union(int x, int y) {
		x = find(x);
		y = find(y);
		if(x==y)return;
		student[y]=x;
	}
	public static int find(int x) {
		if(student[x]==x)return x;
		int idx = find(student[x]);
		student[x]=idx;
		return idx; 
	}
}