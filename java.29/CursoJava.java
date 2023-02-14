public class CursoJava{
    public static void main(String[] args) {
        int n1,n2,n3;
        n1=2;
        n2=5;
        n3=100;
        int res=soma(n1,n2,n3);

        System.out.printf("%d", res);
    }

    public static int soma(int... n){
        int res=0;
        for(int v:n){
            res+=v;
        }
        return res;
    }
}