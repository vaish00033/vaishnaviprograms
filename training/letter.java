class LetterCount {
public static void main(String[] args)
{
String s = "aaabbcd";
int[] counts = new int[(int) Character.MAX_VALUE];

for (int i = 0; i < s.length(); i++) {
char charAt = s.charAt(i);
counts[(int) charAt]++;
}
for (int i = 0; i < counts.length; i++) {
if (counts[i] > 0)
System.out.print(""+ counts[i] + (char) i + "");
}
}
}    