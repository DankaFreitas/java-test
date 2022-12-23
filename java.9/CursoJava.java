public class CursoJava{
    public static void main(String[] args){
        int r;

        msg("Curso Java", 1);
        r=soma2(10, 12);
        System.out.println(r);
        
        System.out.println(soma2(50,60));
        System.out.println(soma(1,5,10,3));
        System.out.println(soma(1.5,1.0,5.6));
    
    }

    public static int soma(int... numeros){
        int res=0;
        for(int n:numeros){
            res+=n;
        }
        return res;
    }

    public static Double soma(Double... numeros){
        Double res=0.0;
        for(Double n:numeros){
            res+=n;
        }
        return res;
    }

    public static int soma2(int n1, int n2){
        int res=n1+n2;
        return res;

    }

    public static void msg(String m, int l){
        for(int i=0;i<l;i++)
        System.out.println(m);
    }
}