
package JavaAlula35;

public class Somatorio {
    
    public static int somatoria(int num){
        if(num<0){
            return 0;
        }
        return somatoria(num-1)+num*num;

    }
}
