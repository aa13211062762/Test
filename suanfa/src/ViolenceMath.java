public class ViolenceMath {

    public static void main(String[] args) {
        int index = violenceMath("我就是个小弟弟", "小弟弟");
        System.out.println(index);

    }

    public static int violenceMath(String s1,String s2){
        char[] char1 = s1.toCharArray();
        char[] char2 = s2.toCharArray();
        int i=0;
        int j=0;
        while(i<s1.length()&&j<char2.length){
            if(char1[i]==char2[j]){
                i++;
                j++;
            }else{
                i=i-(j-1);
                j=0;
            }
        }
        if(j==char2.length){
            return i-j;
        }
        return -1;
    }
}
