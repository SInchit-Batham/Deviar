public Class CompTest
{
public static void main(String args[]);
{
    List<Integerr>list=new ArrayList<Integerr>();
    System.out.println("Enter any Five three digits value");
    Scanner sc=new Scanner(System.in);
    for(int i=1;i<=5;i++)
    {
       int tmp= sc.nextInt();
       list.add(tmp);
       
    }
    Comparator<Integer>com=new Comp();
    Collections.sort(list,com);
    
    for(int i :list)
    {
        System.out.println(i);
    }
}
}

public class Comp implements Comparator<Integer>
{
    public int compare(Integer a, Integer b)
    {
        if(a%100>b%100)
        return 1;
        return -1;
    }
}
