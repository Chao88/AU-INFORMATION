import java.util.*;

/**
 * Created by genius_chao on 24/09/2016.
 */
class RowSumOddNumbers {
    public static int rowSumOddNumbers(int n) {

        if(n==1){return 1;}
        else{
            int f =1;
            int fi=first(n,f,n);
            System.out.println(fi);
            int last = fi+(n-1)*2;
            System.out.println(last);
            int sum =(fi+last)*n/2;
            return sum;
        }
    }

    public static int first(int n,int f,int n0){
        if(n ==1){
            return f;
        }else{
            f=f+2*(n0-n+1);
            //System.out.println(f);
            n--;
            return first(n,f,n0);
        }
    }

    public static String order(String words) {
        // ...
        String a[] = new String[10];
        for(int i=0;i<a.length;i++){
            a[i]="";
        }
        String s[] = words.split(" ");
        String o="";
        for (int i = 0; i < s.length; i++) {
            for (int j = 1; j < a.length; j++) {
                if (s[i].contains((j+""))) {
                    a[j]=s[i];
                }
            }
        }
        for(int i=1;i<a.length;i++){

            if(a[i]!=""){
                if(o.equals(" ")){
                    o=a[i];
                }else
                o=o+" "+a[i];
            }
        }
        return o;
    }

    public static long digPow(int n, int p) {
        // your code
        String[] s =(n+"").split("");
        int num=0;
        for(int i=0;i<s.length;i++){
            num=num+(int)Math.pow((Integer.parseInt(s[i])),(p+i));



        }
        if(num%n==0){
            return num%n;
        }
        return -1;
    }

    public static String print(int n) {
        // TODO your code here
        if(n%2==0 ||n<=0)
            return null;
        String s="";
        for(int i=1;i<=n;i++){
            if(i<=(n/2)+1) {
                for (int j = n/2; j>=i; j--) {
                    s = s + " ";
                    System.out.print(" ");
                }
                for (int k = 1; k < 2 * i; k++) {
                    s = s + "*";
                    System.out.print("*");
                }
                s = s + "\n";
                System.out.println();
            }else{
                for(int j=i;j>n/2+1;j--){
                    s = s+" ";
                    System.out.print(" ");
                }
                for(int k=2*i-n;k<n+1;k++){
                    s = s+"*";
                    System.out.print("*");
                }
                s = s + "\n";
                System.out.println();
            }
        }
        return s;

    }

//    static String encode(String word){
//        String s[]=word.toLowerCase().split("");
//        for(int i=0;i<s.length;i++){
//            String word0=word.replaceFirst(s[i],"(");
//            if(word0.contains(s[i])){
//                word=word.replaceAll(s[i],")");
//            }else
//                word=word0;
//        }
//        System.out.println(word);
//        return word;
//    }

//    static String encode(String word){
//        String s[]=word.toLowerCase().split("");
//        String news[]= new String[s.length];
//        for(int i=0;i<s.length;i++){
//            news[i]="";
//        }
//        for(int i=0;i<s.length;i++){
//            String temp=s[i];
//
//            for(int j=i+1;j<s.length;j++){
//                if(temp.equals(s[j])){
//                    news[i]=")";
//                    news[j]=")";
//                }
//            }
//        }
//        word="";
//        for(int i=0;i<s.length;i++){
//            if(!news[i].equals(""))
//                word=word+news[i];
//            else
//                word=word+"(";
//        }
//        System.out.println(word);
//        return word;
//    }

    static String encode(String word){
        word = word.toLowerCase();
        String result = "";
        for (int i = 0; i < word.length(); ++i) {
            char c = word.charAt(i);
            result += word.lastIndexOf(c) == word.indexOf(c) ? "(" : ")";
        }
        return result;
    }
    public static int presses(String phrase) {
        String s1="1ADGJMPTW* #";
        String s2="BEHKNQUX0";
        String s3="CFILORVY";
        String s4="23456S8Z";
        String s5="79";
        int n=0;
        phrase=phrase.toUpperCase();
        for(int i=0;i<phrase.length();i++){
            if(s1.indexOf(phrase.charAt(i))!=-1)
                n=n+1;
            if(s2.indexOf(phrase.charAt(i))!=-1)
                n=n+2;
            if(s3.indexOf(phrase.charAt(i))!=-1)
                n=n+3;
            if(s4.indexOf(phrase.charAt(i))!=-1)
                n=n+4;
            if(s5.indexOf(phrase.charAt(i))!=-1)
                n=n+5;
        }
        return n;
    }

    public static int digital_root(int n) {
        // ...
        if(n<10)
            return n;
        else {
            int num=0;
            String s[]=(n+"").split("");
            for(int i=0;i<s.length;i++){
                num=num+Integer.parseInt(s[i]);
            }
            return digital_root(num);
        }

    }

    public static String SongDecoder (String song)
    {
        // Your code is here...
        String s=song.replaceAll("WUB"," ").trim();
        System.out.println(s);
        String news=s.charAt(0)+"";
        boolean flag=true;
        if(s.length()==1){
            flag=false;
        }
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++) {
                if (s.charAt(i) != ' '&&s.charAt(j)!=' ') {
                    if(j-i>=2){
                        news=news+" "+s.charAt(j);
                    }else
                        news=news+s.charAt(j);
                    i=j-1;
                    if(j==s.length()-1)
                        flag=false;
                    break;
                }
            }
        }
        if(flag)
            news=news+s.charAt(s.length()-1);
        return news;
    }

    public static int TripleDouble(long num1, long num2)
    {
        //code me ^^
        String s1=num1+"";
        String s2=num2+"";
        char t='x';
        for(int i=0;i<s1.length()-2;i++){
           char temp=s1.charAt(i);
            if(s1.charAt(i+1)==temp && s1.charAt(i+2)==temp){
                String te=s2;
                while(te.indexOf(temp)!=-1){
                    if(temp==te.charAt(te.indexOf(temp)+1)){
                        return 1;
                    }else {
                        te=te.substring(te.indexOf(temp)+1);
                    }
                }
            }

        }

        return 0;
    }

    public int factorial(int n) {
        // Happy coding :-)
        int k=1;
        if(n<0)
            throw new IllegalArgumentException();
        if(n==0){
            return k;
        }

        for(int i=1;i<=n/2;i++){
            k=k*i*(n-i+1);
        }
        if(n%2!=0){
            return k*(n/2+1);
        }
        return k;
    }

    public static boolean isValid(char[] walk) {
        // Insert brilliant code here
        if(walk.length!=10)
            return false;
        String s="";
        int n1=0;
        int n2=0;
        int n3=0;
        int n4=0;
        for(int i=0;i<walk.length;i++){
            if(walk[i]=='n') {
                n1++;
            }else if(walk[i]=='s'){
                n2++;
            }else if(walk[i]=='e'){
                n3++;
            }else if(walk[i]=='w'){
                n4++;
            }
        }
        if(n1==n2&&n3==n4)
            return true;
        return false;
    }
    public static int findIt(int[] A) {

        for(int i=0;i<A.length;i++){
            int temp=0;
            for(int j=i;j<A.length;j++){
                if(A[i]==A[j])
                    temp++;
            }
            if(temp%2!=0)
                return A[i];
        }

        return 0;
    }

    public static String mix(String s1, String s2) {
        // your code
        s1=s1.toLowerCase().replaceAll("[^a-z]","");
        s2=s2.toLowerCase().replaceAll("[^a-z]","");
//        HashMap<String,Integer> h1=new HashMap<>();
//        HashMap<String,Integer> h2=new HashMap<>();
//        for(int i=0;i<s1.length();i++){
//            String t=s1.charAt(i)+"";
//            if(h1.containsKey(t))
//                h1.put(t,h1.get(t)+1);
//            else
//                h1.put(t,1);
//        }
//        for(int i=0;i<s2.length();i++){
//            String t=s2.charAt(i)+"";
//            if(h2.containsKey(t))
//                h2.put(t,h2.get(t)+1);
//            else
//                h2.put(t,1);
//        }
//        ArrayList<String> arrayList=new ArrayList<>();
//
//        Set<String> set1 =h1.keySet();
//        Set<String> set2=h2.keySet();
//        Iterator<String> iterator1=set1.iterator();
//        Iterator<String> iterator2=set2.iterator();
//
//        while(iterator1.hasNext()){
//            String temp=iterator1.next();
//            int n1=h1.get(temp);
//            if(h2.containsKey(temp)){
//                int n2=h2.get(temp);
//                int n=Math.max(n1,n2);
//                String o="";
//                if(n1>n2)
//                    o="1";
//                else if(n1==n2)
//                    o="=:";
//                else
//                    o="2:";
//                arrayList.add(o+to(temp,n));
//
//            }else {
//                if(n1>1)
//                    arrayList.add("1:"+to(temp,n1));
//            }
//        }
//        while(iterator2.hasNext()){
//            String temp=iterator2.next();
//            int n2=h2.get(temp);
//            if(!h1.containsKey(temp)&&n2>1){
//                arrayList.add("2:"+to(temp,n2));
//            }
//        }
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        //char c1[] =()s1.toCharArray();
        //char c2[] =s2.toCharArray();
        for(int i=0;i<s1.length();i++){
            l1.add((int)(s1.charAt(i)));
        }
        for(int i=0;i<s2.length();i++){
            l2.add((int)(s2.charAt(i)));
        }
        Collections.sort(l1);
        Collections.sort(l2);
        String s="";
        for(int i=0;i<l1.size();i++) {
            for(int j=0;j<l2.size();j++){
                int n1=1;
                int n2=1;
                int cc1=l1.get(i);
                int cc2=l2.get(j);
                if(cc1<cc2){
                    for(int k=i+1;k<l1.size();k++){
                        if(cc1==l1.get(k))
                            n1++;
                        else break;
                    }
                    i=i+n1;
                    if(n1>1){
                        if(s.equals(""))
                            s=s+"1:"+to(cc1,n1);
                        else
                            s=s+"/1:"+to(cc1,n1);
                    }
                }else if(cc1==cc2){
                    for(int k=i+1;k<l1.size();k++){
                        if(cc1==l1.get(k))
                            n1++;
                        else break;
                    }
                    i=i+n1;
                    for(int k=j+1;k<l2.size();k++){
                        if(cc2==l2.get(k))
                            n2++;
                        else break;
                    }
                    j=j+n2;
                    if(n1>n2&&n1>1){
                        if(s.equals(""))
                            s=s+"1:"+to(cc1,n1);
                        else
                            s=s+"/1:"+to(cc1,n1);
                    }else if(n1<n2&&n2>1){
                        if(s.equals(""))
                            s=s+"2:"+to(cc2,n2);
                        else
                            s=s+"/2:"+to(cc2,n2);
                    }else if(n1==n2&&n1>1){
                        if(s.equals(""))
                            s=s+"=:"+to(cc1,n1);
                        else
                            s=s+"/=:"+to(cc1,n1);
                    }
                }else if(cc1>cc2){
                    for(int k=j+1;k<l2.size();k++){
                        if(cc2==l2.get(k))
                            n2++;
                        else break;
                    }
                    j=j+n2;
                    if(n2>1){
                        if(s.equals(""))
                            s=s+"2:"+to(cc2,n2);
                        else
                            s=s+"/2:"+to(cc2,n2);
                    }
                }
                j=j-1;
            }

        }



        return s;
    }
    public static String to(int s,int n){
        String temp="";
        String d=(char)(s)+"";
        for(int i=0;i<n;i++){
            temp=temp+d;
        }
        return temp;
    }


    public static void main(String[] args) {
        //rowSumOddNumbers(3);
        String s=order("is2 Thi1s T4est 3a");
        //System.out.println(s);
       // s=print(9);
        //System.out.println(s);
        //System.out.println(9/2);
        //s=encode("Prespecialized");
        //System.out.println(s);
        //System.out.println(")()())()(()()(");
       // System.out.println(presses("HOW R U"));
       // System.out.println(digital_root(942));
       // System.out.println(SongDecoder("U"));
       // System.out.println(TripleDouble(22233343545l,224l));
        String s1 = "myfriend&Paul has heavy hats! &";
        String s2 = "my friend John has many many friends &";
        System.out.println(mix(s1,s2));

//        s1=s1.toLowerCase().replaceAll("[^a-z]","");
//        char c[]=s1.toCharArray();
//        for(char o:c){
//            System.out.print(" "+(char)((int)(o)));
//        }

    }


}
